package com.ryder.online.test.stepdefinition;

import com.ryder.online.pages.pageactions.RyderEntryOnlineHomePageActions;
import com.ryder.online.helper.managers.TestContext;
import io.cucumber.datatable.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class RyderEntryEventTracking {
	
	TestContext testContext;
	RyderEntryOnlineHomePageActions homeActions;
	 
	public RyderEntryEventTracking(TestContext testContext) {
			this.testContext = testContext;
			homeActions = testContext.getPageObjectManager().getRyderEntryOnlineHomePageActions();
		}

	@Given("having a load number")
	public void having_a_load_number() {

	}
	

@When("user adds shipmemt line items")
public void user_adds_shipmemt_line_items(DataTable dataTable) {
   
String qty = dataTable.row(1).get(0);
String  totalweight = dataTable.row(1).get(1);
String containerType = dataTable.row(1).get(2);
	homeActions.add_Shipment_LineItems(qty, totalweight,containerType);
}
@Then("user must enter customer order number {string}")
public void user_must_enter_customer_order_number(String customerOrderNumber) {
    homeActions.enter_CustomerOrderNumber(customerOrderNumber);
}

@When("transportation track load and search the load")
public void transportation_track_load_and_search_the_load() {
		
		homeActions.navigat_To_TrackLoad();
		
	}

	@Then("go to load detail {string},{string}")
	public void go_to_load_detail(String searchCompany, String customer) {
		homeActions.select_LoadCustomerNum(searchCompany);
	    homeActions.search_For_LoadNumber(searchCompany);
	}
	
	@Then("user navigates to track Shipment")
	public void user_navigates_to_track_Shipment() {
	   homeActions.navigate_To_TrackShipment();
	}

	@Then("go to shipment detail page {string},{string}")
	public void go_to_shipment_detail_page(String string, String string2) {

	}
	
	@Then("add Edit Appointments navigates to Dashboard\\/Appointment Update page")
	public void add_Edit_Appointments_navigates_to_Dashboard_Appointment_Update_page() {
	    homeActions.Add_EditAppointments();
	}

	@Then("add pick up and Delivery")
	public void add_pick_up_and_Delivery() {
	  
	}

	@Then("goto add events submit then goto")
	public void goto_add_events_submit_then_goto() {
	    homeActions.open_Add_PickUpEvents();
	}

	@Then("for origin x3,AF, enter time {string}")
	public void for_origin_x3_AF_enter_time(String PickUpdate) {
	    homeActions.Arrived_PickUpLocationX3(PickUpdate);
	    homeActions.open_Add_PickUpEvents();
	    homeActions.Carrier_PickUpLocationAF(PickUpdate);
	}

	@Then("for destination X1,d1 {string}")
	public void for_destination_X_d1(String DeliveryDate) {
			homeActions.open_Add_DeliveryEvents();
		 	homeActions.Arrived_DeliveryLocationX1(DeliveryDate);
		 	homeActions.open_Add_DeliveryEvents();
		    homeActions.Carrier_DepartedLocationD1(DeliveryDate);
	}

	@Then("for load verify the load events")
	public void for_load_verify_the_load_events() {
	    System.out.println("added all the events");
	    homeActions.completed_AddingEvents();
	}

	@Then("print BOL, show pdf document to view")
	public void print_BOL_show_pdf_document_to_view() {
	    homeActions.verify_Print_BOL_Pdf();
	}

	@Then("verify all STOPS in details of load")
	public void verify_all_STOPS_in_details_of_load() {
	    
	}

	@Then("VERIFY THE fbap EXTRACT IS SENT IN TRANSACTION HISOTRY")
	public void verify_THE_fbap_EXTRACT_IS_SENT_IN_TRANSACTION_HISOTRY() {
	   
	}
}
