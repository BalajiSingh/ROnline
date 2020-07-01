package com.ryder.online.test.stepdefinition;

/*
 /*
 * @author javeed
 *
 * 01/03/2020
 *
 */

import com.ryder.online.configreader.PropertyFileReader;
import com.ryder.online.pages.pageactions.GenericActions;
import com.ryder.online.pages.pageactions.RyderEntryOnlineHomePageActions;
import com.ryder.online.pages.pageactions.RyderEntryOnlineLoginPageActions;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.helper.Window.WindowHandles;
import com.ryder.online.helper.managers.ScenarioContext.Context;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.testng.Assert;

import java.util.ArrayList;

import org.testng.Assert;

import static com.ryder.online.helper.managers.ScenarioContext.Context.LOAD_ID;
import static com.ryder.online.helper.managers.ScenarioContext.Context.UNIQUE_SHIPMENT_ID;

//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class RyderEntryOnlineHomePage {

	GenericActions action=new GenericActions(ObjectRepo.driver);
	RyderEntryOnlineHomePageActions homeActions;
	RyderEntryOnlineLoginPageActions login;
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	WindowHandles windowHandle=new WindowHandles(ObjectRepo.driver);
	PropertyFileReader configProperties = new PropertyFileReader();
	TestContext testContext;
	public ArrayList<String> UniqueShipmentID = null;
	public RyderEntryOnlineHomePage(TestContext testContext) {
	//	testContext = context;
		this.testContext = testContext;
		homeActions = testContext.getPageObjectManager().getRyderEntryOnlineHomePageActions();
		login =testContext.getPageObjectManager().getRyderEntryOnlineLoginPageActions();
	}
	
	@When("^user is navigating to create shipment page$")
	public void user_is_navigating_to_create_shipment_page() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_TranportationLink);
		System.out.println("currently system is on ryder entry home page");
		
	}

	@Then("^user should navigate to create shipment page successfully$")
	public void user_should_navigate_to_create_shipment_page_successfully() throws Throwable {
	    
		Assert.assertTrue(homeActions.navigate_To_CreateShipment());
	}

	@When("^user selects the customer from the customer drop down \"([^\"]*)\"$")
	public void user_selects_the_customer_from_the_customer_drop_down(String Customervalue) throws Throwable {
		
		homeActions.select_CustomerNum(Customervalue);

	}

	@Then("^user should be able search origin \"([^\"]*)\", destination\"([^\"]*)\" addresses$")
	public void user_should_be_able_view_pre_populated_origin_destination_addresses(String origination, String destination) throws Throwable {
	    
	    homeActions.enterOriginationAddress(origination);
	    homeActions.enterDestinationAddress(destination);
	}

	@When("^user selects pickupConvention dropdown value \"([^\"]*)\"$")
	public void user_selects_pickupConvention_dropdown_value(String pickUpConvention) throws Throwable {
		homeActions.select_PickUp_Convention(pickUpConvention);	    
	}

	@When("^user enters future date for pickUp$")
	public void user_enters_future_date_for_pickUp() throws Throwable {
	    
	    homeActions.enter_PickUp_Date();
	}

	@When("^user selects deliverConvention dropdown value \"([^\"]*)\"$")
	public void user_selects_deliverConvention_dropdown_value(String deliveryConvention) throws Throwable {
		homeActions.select_Delivery_Convention(deliveryConvention);	  
	    
	}

	@Then("^user enters future week date for delivery$")
	public void user_enters_future_week_date_for_delivery() throws Throwable {
	    
		   homeActions.enter_Delivery_Date();
	}

	@When("^user selects OrderType dropdown value as \"([^\"]*)\"$")
	public void user_selects_OrderType_dropdown_value_as(String orderType) throws Throwable {
	    
		homeActions.select_OrderType(orderType);
	}

	@When("^user enters Cost Center Number as \"([^\"]*)\"$")
	public void user_enters_Cost_Center_Number_as(String enterCostCenterNumber) throws Throwable {
	    homeActions.enter_CostCenter_Number(enterCostCenterNumber);
	    
	}

@Then("user enter customer order number")
public void user_enter_customer_order_number() {
   homeActions.enter_CustomerOrder_Number();
}

	@Then("^user selects General Ledger from dropdown as \"([^\"]*)\"$")
	public void user_selects_General_Ledger_from_dropdown_as(String selectGeneralLedger) throws Throwable {
	    
		homeActions.select_General_Ledger(selectGeneralLedger);
	}

	@Then("^user selects Service Level and Approver from dropdown as \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_selects_Service_Level_and_Approver_from_dropdown_as(String selectServiceLevel, String Approver) throws Throwable {
	    
		homeActions.select_ServiceLevel(selectServiceLevel);
		homeActions.select_Approver(Approver);
	}

	@Then("^user selects Commodity from dropdown as \"([^\"]*)\" under EXTENEDED ATTRIBUTES$")
	public void user_selects_Commodity_from_dropdown_as_under_EXTENEDED_ATTRIBUTES(String selectCommodity) throws Throwable {
	    
		homeActions.select_Commodity(selectCommodity);
	}

	@When("^user clicks on add/edit items button to enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and select \"([^\"]*)\"$")
	public void user_clicks_on_add_edit_items_button_to_enter_and_select(String qty, String weight, String item, String description, String typeOfContainer) {
		homeActions.launch_add_edit_shipmentLineItem(qty,weight,item,description, typeOfContainer);
	}

	@When("Ryd user to enter shipment line items {string},{string} and select {string}")
	public void ryd_user_to_enter_shipment_line_items_and_select(String qty, String weight, String containerType) {
		homeActions.launch_add_edit_shipmentLineItem(qty,weight, containerType);
	}

	@When("user to enter shipment line items electrolux {string},{string},{string} and select {string}")
	public void user_to_enter_shipment_line_items_electrolux_and_select(String qty, String itemCode, String description, String containerType) {
		homeActions.launch_add_edit_shipmentLineItem(qty,itemCode,description, containerType);
	}
	
	@Then("^user must be navigated to confirmation page$")
	public void user_must_be_navigated_to_confirmation_page() throws Throwable {
		System.out.println("expected that the execution reached this far");
		Assert.assertEquals(waitHelp.waitForElement(homeActions.click_Submit_Button), true);
		homeActions.navigate_To_ConfirmationPage();
	    
	}

	@Then("^user must click submit button on confirmation page$")
	public void user_must_click_submit_button_on_confirmation_page() throws Throwable {

		action.Click(homeActions.click_Submit_Button);
	}

	@Then("^user must verify the Unique Shipment Number$")
	public void user_must_verify_the_Unique_Shipment_Number() throws Throwable {
	    
		Assert.assertEquals(waitHelp.waitForElement(homeActions.ryderEntry_Unique_Number),true);
	    
	}
	

	@When("^user click on button RyderEntrySummary$")
	public void user_click_on_button_RyderEntrySummary() throws Throwable {
		String ShipmentID =homeActions.get_Unique_Shipment_Number();
		testContext.scenarioContext.setContext(UNIQUE_SHIPMENT_ID, ShipmentID);
		action.Click(homeActions.ryderEntry_Summary_Button);
		Assert.assertEquals(waitHelp.waitForElement(homeActions.ryderEntry_Summarypage),true);
		//action.enterTextInTextBox(homeActions.text_manualShipment_Submitter, "mjakram");
		action.enterTextInTextBox(homeActions.text_RyderEntry_Unique_ShipmentId, ShipmentID);
		
	}

	@Then("^user select status value from dropdown as \"([^\"]*)\"$")
	public void user_select_status_value_from_dropdown_as(String ALL) throws Throwable {
	    
		homeActions.select_Shipment_Status(ALL);
	}

	@Then("^user must click on SEARCH button to search the unique shipment number$")
	public void user_must_click_on_SEARCH_button_to_search_the_unieque_shipment_number() throws Throwable {

		action.Click(homeActions.click_Search_Button);

		Assert.assertEquals(waitHelp.waitForElement(homeActions.row_having_shipment_Details),true);
		Assert.assertTrue(homeActions.compare_RyderEntry_UniqueNumbers());
		int cnt = 0;
		do{

			System.out.println("Click " + cnt);
			homeActions.click_Search_Button.click();
			Thread.sleep(20000);
			if(homeActions.check_Status_As_Pending_Carrier.getText().trim().equalsIgnoreCase("error")){
				System.out.println("Status: " + homeActions.check_Status_As_Pending_Carrier.getText());
				Assert.fail("Create Shipment process has returned \"ERROR\" Status.");
				break;
			}
			cnt ++;
			System.out.println("Status: " + homeActions.check_Status_As_Pending_Carrier.getText());
		}while(!homeActions.check_Status_As_Pending_Carrier.getText().trim().equalsIgnoreCase("PENDING_CARRIER") && cnt <= 25);

		homeActions.click_Search_Button.click();
		Assert.assertTrue(homeActions.check_Status_As_Pending_Carrier.getText().trim().equalsIgnoreCase("PENDING_CARRIER"),"Shipment creation status is Pending Carrier.");
		//Assert.assertTrue(waitHelp.retryWaitTriggeredByButtonClick(homeActions.click_Search_Button,homeActions.check_Status_As_Pending_Carrier,3));
		//Assert.assertTrue(waitHelp.retryWaitTriggeredByButtonClick(homeActions.click_Search_Button,homeActions.copy_LoadNumber,5));

		String Load_Number = homeActions.read_LoadNumber();
		testContext.scenarioContext.setContext(Context.LOAD_ID, Load_Number);
	}
	
	@Then("user must logoff RyderEntry")
	public void user_must_logoff_RyderEntry() {
		login.RyderEntry_LogOut();
	}

	@When("^user selects MoveType dropdown value as \"([^\"]*)\"$")
	public void user_selects_MoveType_dropdown_value(String MoveType) throws Throwable {
		homeActions.select_MoveType(MoveType);

	}

	@When("^user selects ProductLine dropdown value as \"([^\"]*)\"$")
	public void user_selects_ProductLine_dropdown_value(String ProductLine) throws Throwable {
		homeActions.Select_ProductLine(ProductLine);

	}
	@When("^user selects GLCode dropdown value as \"([^\"]*)\"$")
	public void user_selects_GLCode_dropdown_value(String GLCode) throws Throwable {
		homeActions.Select_GLCode(GLCode);

	}

	@When("^user enters TotalPallet value as \"([^\"]*)\"$")
	public void user_enters_TotalPallet_dropdown_value_as_value(String TotalPallet) throws Throwable {
		homeActions.Enter_TotalPallets(TotalPallet);
	}

	@When("^user enters ProjectNo value as \"([^\"]*)\"$")
	public void user_enters_ProjectNo_dropdown_value_as_value(String ProjectNo) throws Throwable {
		if(ProjectNo != null && !ProjectNo.isEmpty()) {
			homeActions.Enter_ProjectNo(ProjectNo);
		}
	}

	@When("User navigate to SHIPMENT SUMMARY page")
	public void user_is_navigating_page() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_TranportationLink);
		homeActions.click_TranportationLink.click();
		homeActions.click_ShipmentSummary.click();
	}
	@When("User navigate to SHIPMENT page")
	public void user_is_navigating_SHIPMENT_page() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_TranportationLink);
		homeActions.click_TranportationLink.click();
		homeActions.click_Track_ShipmentLink.click();
	}

	@When("User navigate to SHIPMENT UPLOAD page")
	public void user_is_navigating_SHIPMENT_UPLOAD_page() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_TranportationLink);
		homeActions.click_TranportationLink.click();

		waitHelp.waitUntilElementDisplayed(homeActions.click_ShipmentUpload);
		homeActions.click_ShipmentUpload.click();
	}

	@When("User clicks on Choose file button and selects the file to upload for {string} Customer and click Upload button")
	public void ChooseFileToUpload(String customer) throws Throwable {
		String CustomerFilePath = homeActions.getCustomerFileToUpload(customer);
		homeActions.ChooseFileOption.sendKeys(CustomerFilePath);
		homeActions.UploadButton.click();
	}

	@When("User gets successful message and unique shipment number is displayed")
	public void User_get_success_message_VerifyUSN_displayed() throws Throwable {
		UniqueShipmentID = homeActions.VerifySuccessMessageAndGetUSN();
		testContext.scenarioContext.setContext(UNIQUE_SHIPMENT_ID,UniqueShipmentID.get(0));
		System.out.println("USN::::"+testContext.scenarioContext.getContext(UNIQUE_SHIPMENT_ID).toString());
	}

	@When("User navigate to Load search page")
	public void user_is_navigating_Load_page() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_TranportationLink);
		homeActions.click_TranportationLink.click();
		homeActions.click_LoadLink.click();
	}

	@When("User navigate to Carrier Dashboard search page")
	public void user_is_navigating_Carrier_Dashboard_page() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_TranportationLink);
		homeActions.click_TranportationLink.click();
		homeActions.click_CarrierDashboardLink.click();
	}

	@When("User navigate to Tender Dashboard search page")
	public void user_is_navigating_Tender_Dashboard_page() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_TranportationLink);
		homeActions.click_TranportationLink.click();
		homeActions.click_TenderDashboardLink.click();
	}

	@Then("User enters {string} as Submitter")
	public void user_enters_submitter(String Submitter) throws Throwable {
		homeActions.Enter_Submitter(Submitter);
	}

	@Then("User enters Shipment Number {string}")
	public void user_enters_ShipmentNo(String Submitter) throws Throwable {
		homeActions.Enter_ShipmentNo(Submitter);
	}

	@Then("User enters ASP or Customer OrderNumber {string}")
	public void user_enters_ASPNo(String Submitter) throws Throwable {
		homeActions.Enter_ASPorCustomerOrderNo(Submitter);
	}


	@Then("User enters {string} as Unique Shipment Number")
	public void user_enters_USN(String USN) throws Throwable {
		if (!(USN.isEmpty()) && USN != null) {
			homeActions.Enter_UniqueShipmentNo(USN);
			testContext.scenarioContext.setContext(UNIQUE_SHIPMENT_ID, USN);
		}else{

			if (testContext.scenarioContext.getContext(UNIQUE_SHIPMENT_ID).toString() != null) {
				homeActions.Enter_UniqueShipmentNo(testContext.scenarioContext.getContext(UNIQUE_SHIPMENT_ID).toString());
			}

		}
	}

	@Then("user must click on SEARCH button to search the unique shipment number, Verify {string} as status and capture load number")
	public void user_click_on_SEARCH_button_verifyUSN_Status_andCaptureLoadNumber(String status) throws Throwable {

		action.Click(homeActions.click_Search_Button);

		Assert.assertEquals(waitHelp.waitForElement(homeActions.row_having_shipment_Details),true);
		Assert.assertTrue(homeActions.compare_RyderEntry_UniqueNumbers());
		int cnt = 0;
		do{

			System.out.println("Click " + cnt);
			homeActions.click_Search_Button.click();
			Thread.sleep(20000);
			if(homeActions.check_Status_As_Pending_Carrier.getText().trim().equalsIgnoreCase("error")){
				System.out.println("Status: " + homeActions.check_Status_As_Pending_Carrier.getText());
				Assert.fail("Create Shipment process has returned \"ERROR\" Status.");
				break;
			}
			cnt ++;
			System.out.println("Status: " + homeActions.check_Status_As_Pending_Carrier.getText());
		}while(!homeActions.check_Status_As_Pending_Carrier.getText().trim().equalsIgnoreCase(status) && cnt <= 25);

		homeActions.click_Search_Button.click();
		Assert.assertTrue(homeActions.check_Status_As_Pending_Carrier.getText().trim().equalsIgnoreCase(status),"Shipment creation status is Pending Carrier.");

		String Load_Number = homeActions.read_LoadNumber();
		testContext.scenarioContext.setContext(Context.LOAD_ID, Load_Number);
	}

	@Then("User enters Load number {string} details for search")
	public void user_enters_LoadNumber(String LoadNo) throws Throwable {
		if (!LoadNo.isEmpty() && LoadNo != null) {
			homeActions.Enter_LoadNumber(LoadNo);
			testContext.scenarioContext.setContext(LOAD_ID, LoadNo);
		}else{
			homeActions.Enter_LoadNumber(testContext.scenarioContext.getContext(LOAD_ID).toString());
		}
	}

	@Then("User clicks on search button and verify load number present in result")
	public void user_click_search_and_verify_LoadNumber() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_LoadSearch_Button);
		homeActions.click_LoadSearch_Button.click();

		Assert.assertEquals(waitHelp.waitForElement(homeActions.row_having_Load_Details),true);
		//Assert.assertTrue(homeActions.compare_RyderEntry_LoadNumber(testContext.scenarioContext.getContext(LOAD_ID).toString()));

	}


	@Then("User clicks on search button and verify Shipment number present in result")
	public void user_click_search_and_verify_ShipmentNumber() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_ShipmentSearch_Button);
		homeActions.click_ShipmentSearch_Button.click();

		Assert.assertEquals(waitHelp.waitForElement(homeActions.row_having_Load_Details),true);
		Assert.assertTrue(homeActions.row_having_Load_Details.isDisplayed());

	}

	@Then("User clicks on search button and verify load number present in carrier dashboard result")
	public void user_click_search_and_verify_LoadNumber_carrierDashboard() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_CarrierSearch_Button);
		homeActions.click_CarrierSearch_Button.click();

		Assert.assertEquals(waitHelp.waitForElement(homeActions.row_having_Load_Details),true);
		Assert.assertTrue(homeActions.compare_RyderEntry_LoadNumber(testContext.scenarioContext.getContext(LOAD_ID).toString()));

	}

	@Then("User selects 'All Stops' checkbox")
	public void user_All_stops_checkbox() throws Throwable {
		waitHelp.waitUntilElementDisplayed(homeActions.click_AllStopsCheckBox);
		homeActions.click_AllStopsCheckBox.click();

		Assert.assertTrue(homeActions.click_AllStopsCheckBox.isSelected());


	}

}
