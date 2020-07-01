package com.ryder.online.test.stepdefinition;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Search_Vehicle_API_Steps {
	public RequestSpecification httpRequest;
	public Response response;

	@Given("I should have the base url for search vehicle")
	public void i_should_have_the_base_url_for_search_vehicle() {
		String RyderFleetBase = "https://st-cm-usedtrucks.ryder.com";
		RestAssured.baseURI = RyderFleetBase;
		httpRequest = RestAssured.given();
		// httpRequest.header("Content-Type", "application/json");
		httpRequest.urlEncodingEnabled(false);
	}

	@When("I fetch the records with {string} endpoint")
	public void i_fetch_the_records_with_endpoint(String string) {
		response = httpRequest.get(string);
	}

	@Then("I should get status code {string} in response")
	public void i_should_get_status_code_in_response(String expectedStatusCode) {
		int statusCode = response.getStatusCode();

		Assert.assertEquals(statusCode, Integer.parseInt(expectedStatusCode));
	}

	@Then("I should get {int} vehicles records in the response")
	public void i_should_get_vehicles_records_in_the_response(int int1) {
		JsonPath jsonPathEvaluator = response.jsonPath();
		List<String> record = jsonPathEvaluator.getList("Data.Results.Results.Results");
		System.out.println("No of records in the response : "+record.size());
		//List<String> record = response.jsonPath().getList("Data.Results.Results");
		int size = record.size();
		Assert.assertEquals(size, int1);
	}

	@When("I pass items per page as {string}")
	public void i_pass_items_per_page_as(String string) {
		httpRequest.queryParam("itemsPerPage", string);
	}

	@When("I pass keyword to search the records as {string}")
	public void i_pass_keyword_to_search_the_records_as(String string) {
		httpRequest.queryParam("Keyword", string);
	}

	@Then("I should get vehicles records with searched keyword {string} in the response")
	public void i_should_get_vehicles_records_with_searched_keyword_in_the_response(String string) {
		List<Map<String, String>> records = response.jsonPath().getList("Data.Results.Results.Results");
		String name = records.get(0).get("ManufacturerName");
		Assert.assertEquals(name, string);
	}

	@When("I pass items per page as {string} and page number as {string}")
	public void i_pass_items_per_page_as_and_page_number_as(String string, String string2) {
		httpRequest.queryParam("itemsPerPage", string).queryParam("pageNumber", string2);
	}
}
