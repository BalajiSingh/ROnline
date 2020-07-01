package com.ryder.online.test.stepdefinition;

import com.ryder.online.helper.Browser.BrowserHelper;
import com.ryder.online.pages.pageactions.JDAHomePageActions;
import com.ryder.online.helper.managers.ScenarioContext.Context;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class JdaTMHomeTest {
	TestContext testContext;
	JDAHomePageActions home;
	public String ShipmentID,LoadId;
	BrowserHelper brHelp = new BrowserHelper(ObjectRepo.driver);
	public JdaTMHomeTest(TestContext testContext) {
			this.testContext = testContext;
			home =testContext.getPageObjectManager().getJDAHomePageActions();
		}
	
	@Given("user is asked to process shipment in TM system")
	public void user_is_asked_to_process_shipment_in_TM_system() {
	    System.out.println("this is a given condition and cannot be implemented");
	}

	@When("user processing shipment in TM System")
	public void user_processing_shipment_in_TM_System() {
		System.out.println("i will implement you soone");
		ShipmentID =  (String)testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID);
		System.out.println(ShipmentID);
		//String LoadID = home.searchForShipmentID(shipmentID);
		//String LoadID = TM_homeActions.searchForShipmentID("735998");
		//System.out.println(LoadID);
	}

	@Then("shipment should be processed succesfully to Tender Accept status")
	public void shipment_should_be_processed_succesfully_to_Tender_Accept_status() {
		System.out.println("i will implement you soone");
	}

	@Then("click on shipment processing then click on shipments link and Search shipment")
	public void click_on_shipment_processing_then_click_on_shipments_link()  {
		ShipmentID = (String)testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID);
//		String shipmentID = "2026502260";
		System.out.println(ShipmentID);
		home.searchForShipmentID(ShipmentID.trim());
	}

	@Then("click on shipment processing then click on shipments link and Search shipment as per Unique Number")
	public void click_on_shipment_processing_then_click_on_shipments_link_SearchbyUSN() throws InterruptedException  {
		ShipmentID = (String)testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID);
		//String ShipmentID = "174687";
		System.out.println("ShipmentID  : " +ShipmentID);
		ShipmentID = home.searchForShipmentIDByUSN(ShipmentID.trim()).toString();
		testContext.scenarioContext.setContext(Context.UNIQUE_SHIPMENT_ID,ShipmentID);

	}

	@Then("Verify that shipment is created for '{string}' customer, '{string}' Division, and '{string}' Logistic Group  in TM")
	public void Verify_ShipmentDetails_in_TM(String Customer,String Devision, String LogisticGroup) {
	
		System.out.println("ShipmentID  : " +ShipmentID);
		home.ValidateShipmentDetails(Customer,Devision,LogisticGroup);
	}

	@Then("user searches for shipment under shipment processing shipments link")
	public void user_searches_for_shipment_under_shipment_processing_shipments_link() {
		ShipmentID = (String)testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID);
		System.out.println(ShipmentID);
		home.text_ShipmentID.sendKeys();
		home.click_refresh_ShipmentID.click();

	}

	@Then("inside Shipment ID text field enter shipment number to search then click on search button next to it")
	public void inside_Shipment_ID_text_field_enter_shipment_number_to_search_then_click_on_search_button_next_to_it() {

	}

	@Then("User clicks on load build link and navigate to work with plan to select {string} under Plan.")
	public void User_click_on_load_build_link_and_navigate_to_work_with_plan_to_select(String planID)  {
		home.NavigateToLoadBuild();
		home.NavigateToWorkWithPlan();
		home.SelectPlanToProcessLoad(planID);
	}

	@Then("Navigate to shipment not attached under load build and attach to current plan")
	public void Navigate_to_shipment_not_attached_under_load_build_and_attach_the_plan()  {
		ShipmentID = (String)testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID);
		//ShipmentID = "2026502260";
		home.NavigateToShipmentNotAttached();
		home.attachShipmentToPlan(ShipmentID);
	}

	@Then("User navigate to load build, work with plan, shipments then Unassigned shipment")
	public void Navigate_to_Unassigned_Shipment_plan()  {
		home.NavigateToUnassignedShipment();
	}

	@Then("search with shipment number and select that shipment ancd click on assign to new load")
	public void Assign_Load()  {
		ShipmentID = (String)testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID);
		//ShipmentID = "2026502260";
		LoadId = home.assignShipmentToLoad(ShipmentID);
		testContext.scenarioContext.setContext(Context.LOAD_ID,LoadId);
		System.out.println("Load Id: " + testContext.scenarioContext.getContext(Context.LOAD_ID));
	}

}
