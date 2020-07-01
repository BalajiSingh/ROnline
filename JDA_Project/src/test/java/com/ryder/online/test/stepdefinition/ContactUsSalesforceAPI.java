package com.ryder.online.test.stepdefinition;

import java.util.List;

import org.testng.Assert;

import com.ryder.online.api.util.SiteCoreAuthentication;
import com.ryder.online.helper.reporter.ReporterUtil;
import com.ryder.online.settings.ObjectRepo;
import com.ryder.online.test.testdata.RestTestData;
import com.ryder.online.test.testdata.RestURI;
import com.ryder.online.utility.RandomNumberGenerator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ContactUsSalesforceAPI {

	public RequestSpecification httpRequest;
	public Response response;
	public RestURI rest = new RestURI();
	public RestTestData data = new RestTestData();
	public SiteCoreAuthentication auth = SiteCoreAuthentication.getInstance();
	public RandomNumberGenerator math = new RandomNumberGenerator();
	public static String query;

	@Given("I should be having the token and the base url for SalesForce")
	public void i_should_be_having_the_token_and_the_base_url_for_SalesForce() {
		String SalesForceBase = ObjectRepo.reader.getSalesForceTokenBaseURL();
		//String SalesForceBase = "https://ryderfms--test.cs40.my.salesforce.com";
		
		System.out.println("getSalesForceTokenBaseURL: "+SalesForceBase);
		RestAssured.baseURI = SalesForceBase;
		httpRequest = RestAssured.given();
		String token = auth.getAuth_token();
		System.out.println(token);
		httpRequest.header("Authorization", token);
		httpRequest.header("Content-Type", "application/json");
	    
	}

	@When("I pass the {string} and name {string} of the contact person")
	public void i_pass_the_and_name_of_the_contact_person(String string, String string2) {
		String email = auth.getStoreValue().toLowerCase();
		query = data.getQuerySalesForces(string, email);
		System.out.println(query);
	    
	}
	
	@When("I pass the GET request with endpoint {string} to SalesForce")
	public void i_pass_the_GET_request_with_endpoint_to_SalesForce(String string) {
		httpRequest.queryParam("q", query);
		//System.out.println(httpRequest.post(string));
		response = httpRequest.get(string);
	}

	@Then("I should get the recently added contact in the response")
	public void i_should_get_the_recently_added_contact_in_the_response() {
		boolean flag = false;
		List<String> value = response.path("records.Email");
		String email = auth.getStoreValue().toLowerCase();
		if(value.contains(email)) {
			flag = true;
		}
		Assert.assertTrue(flag);
	    
	}
	
	@Then("^I should get the \"([^\"]*)\" as Status Code$")
	public void i_should_get_the_as_Status_Code(String expectedStatusCode) {
		int statusCode = response.getStatusCode();

		Assert.assertEquals(statusCode, Integer.parseInt(expectedStatusCode));
       
	}
	
	@Then("I should get First name as {string} and Last name as {string}")
	public void i_should_get_First_name_as_and_Last_name_as(String string, String string2) {
		String first = response.jsonPath().getString("FirstName");
		String last = response.jsonPath().getString("LastName");

		Assert.assertEquals(first, string);
		Assert.assertEquals(last, string2);
	}
}
