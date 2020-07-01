package com.ryder.online.helper.managers;


import com.ryder.online.pages.pageactions.CreateShipment_RestAPI_Actions;
import com.ryder.online.settings.ObjectRepo;
import com.ryder.online.utility.JsonFileWriter;

import cucumber.api.Scenario;
//import io.cucumber.core.api.Scenario;
import  io.restassured.response.Response;
import  io.restassured.response.ValidatableResponse;
import  io.restassured.specification.RequestSpecification;



public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	public ScenarioContext scenarioContext;
	public Response response;
	public ValidatableResponse json;
	public RequestSpecification request;
	public CreateShipment_RestAPI_Actions actions;
	public JsonFileWriter jsonFileWriter;
	public Scenario scenario;
	
	public TestContext(ObjectRepo driver){
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(ObjectRepo.driver);
		scenarioContext = new ScenarioContext();
		actions= new CreateShipment_RestAPI_Actions();
		jsonFileWriter= new JsonFileWriter();
		
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}

}
