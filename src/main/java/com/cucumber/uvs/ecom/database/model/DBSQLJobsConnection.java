package com.cucumber.uvs.ecom.database.model;

import java.sql.CallableStatement;
import java.sql.SQLException;

import com.ryder.online.database.utility.DatabaseUtil;

public class DBSQLJobsConnection {

	String url = "jdbc:sqlserver://MIAVDETEDB01:1433;;databaseName=VehicleDB;integratedSecurity=true";
	DatabaseUtil db;

	public DBSQLJobsConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.getMessage();
		}
		db = new DatabaseUtil(url, "", "");
	}

	public CallableStatement executeSQLJob() throws SQLException {

		String sql = "exec msdb.dbo.sp_start_job N'UVS_MAGAZINE_PUBLISHER_FEED_0014'";

		return db.preparedStatement("", sql);

	}

	public void connectionClose() {
		db.cleanUp();
	}
}
