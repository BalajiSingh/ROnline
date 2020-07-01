package com.ryder.online.test.stepdefinition;

import org.testng.Assert;

import com.ryder.online.api.util.SiteCoreAuthentication;
import com.ryder.online.configreader.PropertyFileReader;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TokenGeneration {
	public RequestSpecification httpRequest;
	public Response response;
	public SiteCoreAuthentication auth = SiteCoreAuthentication.getInstance();

	public TokenGeneration(PropertyFileReader reader) {
		ObjectRepo.reader = reader;
	}

	// Start of Token Generation Statements
	@Given("I should have the base url for Token generation")
	public void i_should_have_the_base_url_for_Token_generation() {
		String TokenbaseUrl = ObjectRepo.reader.getTokenGenerationBaseURL();
		auth.setBaseURL(TokenbaseUrl);
		RestAssured.baseURI = TokenbaseUrl;
		httpRequest = RestAssured.given().contentType("application/x-www-form-urlencoded");

	}

	@Given("I should have the base url for Salesforce Token generation")
	public void i_should_have_the_base_url_for_Salesforce_Token_generation() {
		String TokenbaseUrl = ObjectRepo.reader.getSalesForceTokenGenerationBaseURL();
		System.out.println("getSalesForceTokenGenerationBaseURL: "+TokenbaseUrl);
		auth.setBaseURL(TokenbaseUrl);
		RestAssured.baseURI = TokenbaseUrl;
		httpRequest = RestAssured.given();

	}

	@When("I pass the username, password and other required values as body parameters")
	public void i_pass_the_username_password_and_other_required_values_as_body_parameters() {
		httpRequest.formParam("grant_type", "password")
				.formParam("username", "rydergyde_integrationuser@ryder.com.test")
				.formParam("password", "Ryder19874I0gl5YogHzCNr6eix89WWmH")
				.formParam("client_id",
						"3MVG9Z8h6Bxz0zc4NWhTFhzYWdkL5u1etSgE4eUnWB2uIxBHGV4eUP4JWNUHppDIUy3X9uh0w5UERJzPsCVs7")
				.formParam("client_secret", "3149779834758240333");
	}

	@When("I pass the username, password and other required values as body")
	public void i_pass_the_username_password_and_other_required_values_as_body() {
		String user = ObjectRepo.reader.getUserName();
		String pass = ObjectRepo.reader.getPassword();
		httpRequest.header("Accept", "application/json").formParam("grant_type", "password").formParam("username", user)
				.formParam("password", pass).formParam("client_id", "postman-api")
				.formParam("scope", "openid EngineAPI postman_api");

	}

	@When("^I pass \"([^\"]*)\" as endpoint$")
	public void i_pass_as_endpoint(String endpoint) {
		response = httpRequest.post(endpoint);

	}

	@Then("^I should get the login access bearer token for Site Core Services$")
	public void i_should_get_the_login_access_bearer_token() {
		String token = response.jsonPath().get("access_token");
		auth.setAuth_token(token);
		Assert.assertNotNull(token);

	}

	@Given("I have the base url for Channel Advisor api")
	public void i_have_the_base_url_for_Channel_Advisor_api() {
		String TokenbaseUrl = ObjectRepo.reader.getChannelAdvisorBaseURL();
		auth.setBaseURL(TokenbaseUrl);
		RestAssured.baseURI = TokenbaseUrl;
		httpRequest = RestAssured.given().contentType("application/x-www-form-urlencoded");

	}

	@When("^I pass desired Headers and params in the POST type request along with endpoint \"([^\"]*)\"$")
	public void i_pass_desired_Headers_and_params_in_the_request_body(String endpoint) {
		httpRequest
				.header("Authorization",
						"Basic OGJmOWkxbTNnbjVsd2tzYmx5bHR5dm5sOGdqbHo2dGk6U2xKbjNsZDg0a3FCWi14Ny1DU2JPdw==")
				.formParam("grant_type", "refresh_token")
				.formParam("refresh_token", "yMI6TrxxEnn3AkWv0wohxnR1kRm6v8nwGApB97syxVA");
		response = httpRequest.post(endpoint);

	}

	@Then("^I should get the token for Channel Advisor Services$")
	public void i_should_get_the_token_for_Channel_Advisor_Services() {
		String token = response.jsonPath().get("access_token");
		Assert.assertNotNull(token);
		auth.setCa_token(token);
	}

	@Then("I should get the access bearer token for Sales Force Services")
	public void i_should_get_the_access_bearer_token_for_Sales_Force_Services() {
		System.out.println(response.body().asString());
		String token = response.jsonPath().get("access_token");
		Assert.assertNotNull(token);
		auth.setAuth_token(token);

	}
	// End of Token Generation Statements

}
