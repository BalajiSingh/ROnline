package com.cucumber.uvs.ecom.database.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.apache.log4j.Logger;

import com.ryder.online.helper.Logger.LoggerHelper;

/**
 * @author Madhu Golla
 *
 *         03/12/2K19
 *
 */

public class DbResult {

	private final Logger log = LoggerHelper.getLogger(DbResult.class);
	private final Statement statement;
	private final ResultSet rs;
	// private final metaData;
	private final String sql;
	private List<Object> dbRows;

	DbResult(PreparedStatement statement2) throws SQLException {
		this(statement2, null);
	}

	public DbResult(Statement statement, String sql) throws SQLException {
		this.statement = statement;
		this.sql = sql;

		log.debug("Executing statement: " + sql);
		rs = statement.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString("ApiLoadStatus"));
		}
		//rs = execute();
		Object o = new Object();
		if (rs != null) {
			dbRows = map(r -> rs);
		} else {
			dbRows = null;
		}
	}

	private ResultSet execute() throws SQLException {
		if (statement instanceof PreparedStatement) {
			return ((PreparedStatement) statement).executeQuery();
		} else {
			Statement scroll = statement.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			scroll.execute(sql);
			return scroll.getResultSet();
		}
	}

	public <T> List<T> map(Function<ResultSet, T> mappingFunction) throws SQLException {
		final List<T> entities = new ArrayList<>();

		log.debug("Mapping result...");
		while (rs.next()) {
			final T mappedEntity = mappingFunction.apply(rs);
			entities.add(mappedEntity);
		}
		log.debug("Mapped {} entities " + entities.size());

		rs.close();

		return entities;
	}

	public void cleanUp() {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				log.error("There was an error while closing the db statement: ", e);
			}
		}
	}
}
