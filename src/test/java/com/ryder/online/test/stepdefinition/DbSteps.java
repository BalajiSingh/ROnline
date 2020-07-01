package com.ryder.online.test.stepdefinition;

import java.sql.SQLException;

import org.testng.Assert;

import com.cucumber.uvs.ecom.database.model.DBSQLJobsConnection;
import com.cucumber.uvs.ecom.database.model.DbConnection;
import com.ryder.online.api.util.SiteCoreAuthentication;
import com.ryder.online.utility.RandomNumberGenerator;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DbSteps {
	public DbConnection dbConn;
	public DBSQLJobsConnection jobConnect;
	public SiteCoreAuthentication auth= SiteCoreAuthentication.getInstance();
	public RandomNumberGenerator math = new RandomNumberGenerator();

	@Given("^User sould be connected to the database$")
	public void user_sould_be_connected_to_the_database() throws Throwable {
		
		
		dbConn = new DbConnection();
		jobConnect = new DBSQLJobsConnection();
		
	}

	@When("^User inserts the records into the database with following data \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_inserts_the_records_into_the_database_with_following_data_and(String name, String displayName,
			String category) throws Throwable {
		String vehicleId = math.digit6RandomNumerUsingTime();
		auth.setGeneratedId(vehicleId);

		dbConn.insertingData(vehicleId, name + vehicleId, displayName + vehicleId, category);

	}

	@Then("^record with same Vehicle Id should get inserted into the db$")
	public void record_with_same_should_get_inserted_into_the_db() throws Throwable {
		Assert.assertNotNull(dbConn.verifyRecord(auth.getGeneratedId()), "is record present in DB ?");
	}

	@When("^User executed the job$")
	public void user_executed_the_job() throws Throwable {
		jobConnect.executeSQLJob();
	}

	@Then("^the record api load status should be successfull$")
	public void the_record_api_load_status_should_be_successfull() throws Throwable {
		Assert.assertEquals(dbConn.verifyApiLoadStatus(auth.getGeneratedId()), "SUCCESSFUL");
	}
	
	
	@Given("^User should have the Id of the record$")
	public void user_should_have_the_Id_of_the_record() {
		dbConn = new DbConnection();
		jobConnect = new DBSQLJobsConnection();
	}

	@When("^User updates the record into the database with following data \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_updates_the_record_into_the_database_with_following_data_and(String name, String displayName) throws SQLException {
		String id = dbConn.verifyRecord1(auth.getGeneratedId());
		String vehicleId = auth.getGeneratedId();
		dbConn.UpdateData(name, displayName, id, vehicleId);
	}

	@After({"@ETL"})
	public void tearDownDBConnection() {
		if (dbConn != null) {
			dbConn.connectionClose();
		}
		if (jobConnect != null) {
			jobConnect.connectionClose();
		}
	}
}
