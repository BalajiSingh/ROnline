package com.ryder.online.test.stepdefinition;

import com.ryder.online.configreader.PropertyFileReader;
import com.ryder.online.pages.pageactions.RyderControlTowerHomePageActions;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.helper.managers.ScenarioContext.Context;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.Scenario;
//import io.cucumber.core.api.Scenario;

import io.cucumber.datatable.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class RyderControlTowerHomePage {

	RyderControlTowerHomePageActions home;
	PropertyFileReader configProperties = new PropertyFileReader();
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	TestContext testContext;
	Scenario scenario;//=null;	
	
	public RyderControlTowerHomePage(TestContext testContext) {
		this.testContext = testContext;
    	System.out.println("hi RCT");
		home = testContext.getPageObjectManager().getRyderControlTowerHOmePageActions();
	}
	

@When("user must verify selected customer {string}")
public void user_must_verify_selected_customer(String customer) {
    
	String cust =home.verify_SelectedClient(customer);
	System.out.println("verified the customer:- " + cust);
	
}

@Then("user selects {string} from list of options")
public void user_selects_from_list_of_options(String selectCustomer) throws InterruptedException {
   System.out.println("customer needs to be selected");
   home.selectACustomer(selectCustomer);
}

@When("user navigates to Shipping Tab and choose Create Shipment option")
public void user_navigates_to_Shipping_Tab_and_choose_Create_Shipment_option() throws InterruptedException {
    home.navigateToShippingPage();
}

@Then("user is selecting manual option to navigate to Create Manual shipment")
public void user_is_selecting_manual_option_to_navigate_to_Create_Manual_shipment() {
    home.click_Manual_Shipment();
}

@Then("user should be able search origin {string}")
public void user_should_be_able_search_origin(String originLocationID) throws InterruptedException {
    home.enterOrignLocationID(originLocationID);
}

@Then("user should be able to search for destination {string}")
public void user_should_be_able_to_search_for_destination(String destinationLocationID) {
   home.enterDestinationLocationID(destinationLocationID);
}

@When("user selects Preferred Pick Up Date dropdown value {string}")
public void user_selects_Preferred_Pick_Up_Date_dropdown_value(String pickUpDate) {
   System.out.println(pickUpDate);
   home.enterPickUpDate(pickUpDate, home.text_PickUpDate);
}

@When("user enters future Preferred delivery date for {string}")
public void user_enters_future_Preferred_delivery_date_for(String deliveryDate) {
	 home.enterDeliveryDate(deliveryDate, home.text_DeliveryDate);
}


@When("user selects Must Pick up On Option")
public void user_selects_Must_Pick_Up_On_date_dropdown_value() {
    home.click_Must_Pick_Up_On();

}

@When("user enters future Must Deliver By Option")
public void user_enters_future_Must_deliver_By_date_for() {
    home.click_Must_deliver_By();
}

@Then("user select {string} as PRE_PAID freight Terms")
public void user_select_as_PRE_PAID_freight_Terms(String freightTerms) throws InterruptedException {
   Thread.sleep(2000);
    home.selectBillingTypeFreightTerms(freightTerms);
}

@Then("References must be entered any random characters")
public void references_must_be_entered_any_random_characters() {
  home.enterCustomerOrderNumber();
}

@Then("click on submit to enter shipping and Handling Unit details")
public void click_on_submit_to_enter_shipping_and_Handling_Unit_details() throws InterruptedException {
	    Thread.sleep(1000);
        home.naviageToShippingAndHandlingPage();
        Thread.sleep(3000);
}

@Then("select Container Type from dropdown on Handling Unit details page")
public void select_Container_Type_from_dropdown_on_Handling_Unit_details_page(DataTable dt) {
        String data = dt.row(0).get(0);
        System.out.println(data);
        home.selectContainerType(data);
	}

@Then("Freigth Class value need to be {string}")
public void freigth_Class_value_need_to_be(String freightClass) {
	
	System.out.println(freightClass);
	home.selectFreightClass(freightClass);
    
}

@Then("weigth is necessary in Dimesions section of about {string} pounds")
public void weigth_is_necessary_in_Dimesions_section_of_about_pounds(String weight) {
 home.enterWeightInDimensionsField(weight);   
}

@Then("click on AddItems to add line Items")
public void click_on_AddItems_to_add_line_Items() {
   home.expand_AddEdit_LinItem();
}

@Then("user enters {string} and {string}")
public void user_enters_and(String ItemCode, String ItemDescription) {
    home.enterItemCode_ItemDescription(ItemCode,ItemDescription);
}

@Then("user updates {string}")
public void user_updates(String quantity) {
    home.update_ItemCode_Quantity(quantity);
}


@Then("click on save to navigate back to create manual shipment page")
public void click_on_save_to_navigate_back_to_create_manual_shipment_page() {
   home.BTN_Save.click();
}

@Then("click on submit button")
public void click_on_submit_button() throws InterruptedException {
   home.clikSubmitForShipment();
}

@Then("If Address Validation pops up then click on Accept button for origin and destination")
public void if_Address_Validation_pops_up_then_click_on_Accept_button_for_origin_and_destination() throws InterruptedException {
    Thread.sleep(2000);
    home.addressValidation();
}

@Then("user navigates to Shipment Submitted page with shipment number")
public void user_navigates_to_Shipment_Submitted_page_with_shipment_number() {
	 String ShipmentID =  home.navigatedToshipmentSubmittedPage();
	 testContext.scenarioContext.setContext(Context.UNIQUE_SHIPMENT_ID, ShipmentID);
   
}

    @Then("user wait for {string} minutes before checking shipment status")
    public void WaitForSometime(String Waittime) throws InterruptedException {
        Thread.sleep(Long.parseLong(Waittime));
    }


@Then("Order Type must be selected {string}")
public void order_Type_must_be_selected(String orderType) {
   home.select_OrderType(orderType);
}

@Then("Customer Order  Number must be entered")
public void customer_Order_Number_must_be_entered() {
   home.enter_Customer_OrderNumber();
}

@Then("PO Number must be entered")
public void po_Number_must_be_entered() {
    home.enter_Po_Number();
}

@Then("user should select {string} equipment type")
public void user_should_select(String equipmentType) {
    home.select_equipmentType(equipmentType);
}

@Then("user selects Hazmat value {string}")
public void user_selects_Hazmat_value(String str) {
 //home.select_Hazmat_Yes();
	home.select_Hazmat_No(str);
}

@Then("Move Type must be selected {string}")
public void move_Type_must_be_selected(String moveType) {
   home.select_moveType(moveType);
}

@Then("Project Number {string} must be entered")
public void project_Number_must_be_entered(String projectNo) {
    if (projectNo != null && !projectNo.isEmpty()) {
        home.text_ProjectNumber.sendKeys(projectNo);
    }
//    }else{
//        home.enter_ProjectNumber(null);
//    }
}

@Then("GL Code should be selected as {string}")
public void gl_Code_should_be_selected_as(String glCode) {
    home.select_glCode(glCode);
}

@Then("Product Line must be selected {string}")
public void product_Line_must_be_selected(String productLine) {
    home.select_productLine(productLine);
}

@Then("Pallet Weight Volume must be entered {string},{string},{string}")
public void pallet_Weight_Volume_must_be_entered(String pallet, String weight, String volume) {
    home.enter_pallet_weight_volume(pallet,weight,volume);
}


@Then("user is logged off from RCT channel")
public void user_is_logged_off_from_RCT_channel() {
    home.logoff_RCT();
}

@Then("Shipment Number must be stored in excel sheet")
public void shipment_Number_must_be_stored_in_excel_sheet() {

	String Store_ExcelSheet_ShipmentID = (String) testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID);
	System.out.println(Store_ExcelSheet_ShipmentID);
//	WriteToExcel wx = new WriteToExcel();
//	wx.exportDatatoExcel("SaveShipmentNumbers.xlsx", "Sheet1", 1, Store_ExcelSheet_ShipmentID);
	//	System.out.println(scenario.getName());
	//	InitializeWebDrive drive = new InitializeWebDrive(scenario);
	//	System.out.println(drive.getScenarioName());
}

    @Then("user select {string} as Order Type for Reference")
    public void user_select_as_Order_Type_for_Reference(String orderType) {
	    System.out.println("Select Order Type");
        home.select_OrderType(orderType);
        System.out.println("Order Type Selected");
    }

    @Then("user select {string} as Product Value for Reference")
    public void user_select_as_Product_Value_for_Reference(String string) {
	    if (!string.isEmpty()) {
            System.out.println("Select Product Value");
            home.text_ProductValue.sendKeys(string);
            System.out.println("Product Value Selected");
        }
    }

    @Then("user select {string} as Email Address for Reference")
    public void user_select_as_Email_Address_for_Reference(String string) {
        if (!string.isEmpty()) {
            System.out.println("Select Email Address");
            home.text_EmailAddress.sendKeys(string);
            System.out.println("Email Address selected");
        }
    }

    @Then("user select {string} as Movement Type for Reference")
    public void user_select_as_Movement_Type_for_Reference(String string) {
        if (!string.isEmpty()) {
            System.out.println("Select MovementType");
            home.select_MovementType(string);
            System.out.println("MovementType Selected");
        }
    }

    @Then("user select {string} as Project Number Reference")
    public void user_select_as_Project_Number_Reference(String string) {
        System.out.println("Select Project Number ");
        home.text_PROJECT_NUMBER.sendKeys(string);
        System.out.println("Project Number entered:" +string );
    }



    @Then("user select {string} as Transfer Number for Reference")
    public void user_select_as_Transfer_Number_for_Reference(String string) {
        if (!string.isEmpty()) {
            System.out.println("Select Transfer Number ");
            home.text_TransferNo.sendKeys(string);
            System.out.println("Transfer Number selected" +string );
        }
    }

    @Then("user select {string} as Total Pallet Positions for Reference")
    public void user_select_as_Total_Pallet_Positions_for_Reference(String string) {
        if (!string.isEmpty()) {
            System.out.println("Select Total Pallet Positions");
            home.text_TotalPalletPO.sendKeys(string);
            System.out.println("Total Pallet Positions Entered: "+ string);
        }
    }

    @Then("user select {string} as Requester Name for Reference")
    public void user_select_as_Requester_Name_for_Reference(String string) {
        home.text_RequestorName.sendKeys(string);
    }

    @Then("user select {string} as Move Type for Reference")
    public void user_select_as_Move_Type_for_Reference(String string) throws InterruptedException {
        Thread.sleep(1000);
	    home.select_moveType(string);

    }

    @Then("user select {string} as GL Code Value for Reference")
    public void user_select_as_GL_Code_for_Reference(String string) throws InterruptedException {
        Thread.sleep(1000);
	    home.select_glCode(string);

    }

    @Then("user select {string} as Product Line for Reference")
    public void user_select_as_Product_Line_for_Reference(String string) {
        home.select_productLine(string);
    }

    @Then("user select {string} as BUNDLE CODE")
    public void user_select_as_BUNDLECODE(String BUNDLECODE) throws InterruptedException {
        Thread.sleep(2000);
        home.select_BUNDLECODE(BUNDLECODE);
    }

    @Then("user select {string} as COMPANY CODE")
    public void user_select_as_COMPANYCODE(String COMPANYCODE) throws InterruptedException {
        Thread.sleep(2000);
        home.select_COMPANYCODE(COMPANYCODE);
    }

    @Then("user select {string} as SALES PURCHASING ORGANIZATION")
    public void user_select_as_SALES_PURCHASING_ORGANIZATION(String SALES_PURCHASING_ORGANIZATION) throws InterruptedException {
        Thread.sleep(2000);
        home.select_COMPANYCODE(SALES_PURCHASING_ORGANIZATION);
    }

    @Then("user select {string} as SHIPPING CONDITION")
    public void user_select_as_SHIPPING_CONDITION(String SHIPPING_CONDITION) throws InterruptedException {
        Thread.sleep(2000);
        home.select_SHIPPING_CONDITION(SHIPPING_CONDITION);
    }

    @Then("user select {string} as EQUIPMENT CODE SAP")
    public void user_select_as_EQUIPMENT_CODE_SAP(String EQUIPMENT_CODE_SAP) throws InterruptedException {
        Thread.sleep(2000);
        home.select_EQUIPMENT_CODE_SAP(EQUIPMENT_CODE_SAP);
    }
}
