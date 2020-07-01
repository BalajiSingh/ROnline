package com.ryder.online.database.utility;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.cucumber.uvs.ecom.database.model.DbResult;
import com.ryder.online.helper.Logger.LoggerHelper;

/**
 * @author Madhu Golla
 *
 *         03/11/2K19
 *
 */
public class DatabaseUtil {

	private final Logger log = LoggerHelper.getLogger(DatabaseUtil.class);
	private final String connectionString;
	private final String username;
	private final String password;
	private static String recordId;

	public static String getRecordId() {
		return recordId;
	}

	private Connection connection;

	public DatabaseUtil(String connectionString, String username, String password) {
		this.connectionString = connectionString;
		this.username = username;
		this.password = password;
	}

	

	private Connection getConnection() throws SQLException { 
		if (connection == null) { 
			log.debug("Connecting to {} with credentials {}:{}" +connectionString);
	 
	 connection = DriverManager.getConnection(connectionString, username, password); 
	 } 
		return connection; }

	/*private Connection getConnection2() throws SQLException {
		if (connection == null) {
			log.debug("Connecting to {} with credentials {}:{}" + connectionString);

			connection = DriverManager.getConnection(connectionString);
		}
		return connection;
	}*/

	/*
	 * public DbResult plainQuery(String sql) throws SQLException {
	 * log.debug("Creating query with sql: "+ sql);
	 * 
	 * return new DbResult(getConnection().createStatement(), sql); }
	 */

	public DbResult plainQuery(String connectionString, String sql) throws SQLException {
		log.debug("Creating query with sql: " + sql);

		return new DbResult(getConnection().createStatement(), sql);

	}

	public ResultSet Query(String connectionString, String sql) throws SQLException {
		log.debug("Creating query with sql: " + sql);
		Statement state = getConnection().createStatement();
		ResultSet rs = state.executeQuery(sql);

		while (rs.next()) {
			recordId = rs.getString(1);
		}
		return rs;

	}

	/*
	 * public void updateQuery(String sql) throws SQLException {
	 * log.debug("Creating query with sql: "+sql);
	 * 
	 * getConnection().createStatement().executeQuery(sql); }
	 */

	public void updateQuery(String connectionString, String sql) throws SQLException {
		log.debug("Creating query with sql: " + sql);

		getConnection().createStatement().executeQuery(sql);
	}

	/*
	 * public PreparedStatement preparedStatementQuery(String sql) throws
	 * SQLException { log.debug("Creating prepared statement query with sql: "
	 * +sql); return getConnection().prepareStatement(sql); }
	 */

	public PreparedStatement preparedStatementQuery(String connectionString, String sql) throws SQLException {
		log.debug("Creating prepared statement query with sql: " + sql);
		Statement state = getConnection().createStatement();
		state.executeUpdate(sql);
		return getConnection().prepareStatement(sql);
	}

	public CallableStatement preparedStatement(String connectionString, String sql) throws SQLException {
		log.debug("Creating prepared statement query with sql: " + sql);
		getConnection().setAutoCommit(false);
		CallableStatement state = getConnection().prepareCall(sql);
		System.out.println("Job Execution Started Successfully");
		state.execute();
		System.out.println("Job Completed Successfully");
		return getConnection().prepareCall(sql);
	}

	public void cleanUp() {
		try {
			if (connection != null && connection.isClosed())
				connection.close();
		} catch (SQLException e) {
			e.getMessage();
		}
	}

}
