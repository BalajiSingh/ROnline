package com.ryder.online.test.stepdefinition;

import com.ryder.online.configreader.PropertyFileReader;
import com.ryder.online.pages.pageactions.GenericActions;
import com.ryder.online.pages.pageactions.TransportationManagerHomePageActions;
import com.ryder.online.pages.pageactions.TransportationManagerLoginPageActions;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.helper.managers.ScenarioContext.Context;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.java.en.Then;
//import io.cucumber.java.en.Then;

public class TransportationManagerHomePage {
	GenericActions action=new GenericActions(ObjectRepo.driver);
	TransportationManagerLoginPageActions TM_login ;//= pageObjectManager.getTransportationManagerLoginPageActions();
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	PropertyFileReader configProperties = new PropertyFileReader();
	TestContext testContext;// = new TestContext(ObjectRepo.driver);
	TransportationManagerHomePageActions TM_homeActions ;//= pageObjectManager.getTransportationManagerHompePageActions();

	public TransportationManagerHomePage(TestContext testContext) {
		this.testContext = testContext;
		TM_homeActions =testContext.getPageObjectManager().getTransportationManagerHompePageActions();
		TM_login =testContext.getPageObjectManager().getTransportationManagerLoginPageActions();
	}
	
	@Then("^search for unique shipmentID and read the load number$")
	public void search_for_unique_shipmentID_and_read_the_load_number() throws Throwable {
	String shipmentID = (String)testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID);
	System.out.println(shipmentID);
	String LoadID = TM_homeActions.searchForShipmentID(shipmentID);
	//String LoadID = TM_homeActions.searchForShipmentID("735998");
	System.out.println(LoadID);
	}
}
