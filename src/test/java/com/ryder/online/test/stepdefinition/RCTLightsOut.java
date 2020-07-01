package com.ryder.online.test.stepdefinition;
import com.ryder.online.pages.pageactions.RyderControlTowerHomePageActions;
import com.ryder.online.helper.managers.ScenarioContext.Context;
import com.ryder.online.helper.managers.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class RCTLightsOut {
	public static JSONObject jsonObject;

	TestContext testContext;
	RyderControlTowerHomePageActions home;
	//public static File ROLTestDataFile = new File(FileReaderManager.getInstance().getConfigReader().getROLJsonDataFilePath("ROLJsonDataFilePath"));
	public static File ROLTestDataFile = new File("D:\\JDAUpgrade\\RyderTM2.0\\RyderOnlineUpgrade\\src\\main\\resources\\exceldata\\Rol_data.json");
	public RCTLightsOut(TestContext testContext) {
		this.testContext = testContext;
		home = testContext.getPageObjectManager().getRyderControlTowerHOmePageActions();
	}
	
	@When("User navigates to shipment Trancking to search shipment")
	public void user_navigates_to_shipment_Trancking_to_search_shipment() throws InterruptedException {
		String shipmentID = (String)testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID);
	    home.navigateToTrackShipmentPage(shipmentID);
	}

	@Then("user should be able to view the shipment")
	public void user_should_be_able_to_view_the_shipment() {
	   
	}

	@Then("user go to details and by clicking on loads to verify load number")
	public void user_go_to_details_and_by_clicking_on_loads_to_verify_load_number() throws InterruptedException {
	   String status = home.verify_LoadInformation();
		System.out.println("Load Number:" + home.get_LoadNumber());
		System.out.println("Status: " +status);
		testContext.scenarioContext.setContext(Context.LOAD_ID,home.get_LoadNumber());
		testContext.scenarioContext.setContext(Context.SHIPMENT_STATUS,status);
	    Assert.assertTrue(status!=null || status.length()!=0,"Load Number should be displayed with status details.");
	}

	@Then("user basically should verify fields which should not be null")
	public void user_basically_should_verify_fields_which_should_not_be_null() {
	  home.navigateToHandlingUnits();
		
	}

	@Then("user to to handling unit qunty, length, width, height volume weight freight class")
	public void user_to_to_handling_unit_qunty_length_width_height_volume_weight_freight_class() {
	   home.validateHanlingUnitAttributeAreNotNull();
	}

	@Then("Write data into Json data file {string}")
	public void Write_data_into_Json_data_file(String JSONDataIndex) throws IOException, ParseException {
		String ShipmentNo = testContext.scenarioContext.getContext(Context.UNIQUE_SHIPMENT_ID).toString();
		String LOAD_ID = testContext.scenarioContext.getContext(Context.LOAD_ID).toString();
		String SHIPMENT_STATUS = testContext.scenarioContext.getContext(Context.SHIPMENT_STATUS).toString();

//		String ShipmentNo = "2025463961";
//		String LOAD_ID = "85091";
//		String SHIPMENT_STATUS = "Tender Accepted";

//		testContext.jsonFileWriter.updateJsonFileforKey("ShipmentNumber",ShipmentNo, ROLTestDataFile);
//		testContext.jsonFileWriter.updateJsonFileforKey("LoadNumber",LOAD_ID, ROLTestDataFile);
//		testContext.jsonFileWriter.updateJsonFileforKey("LoadStatus",SHIPMENT_STATUS, ROLTestDataFile);

		JSONObject ElementObject =  getJSONNodeToUpdateValue(JSONDataIndex);
		WriteJSONData(ElementObject,"ShipmentNumber",ShipmentNo);
		WriteJSONData(ElementObject,"LoadNumber",LOAD_ID);
		WriteJSONData(ElementObject,"LoadStatus",SHIPMENT_STATUS);
		System.out.println(ElementObject);
		System.out.println(jsonObject);

		FileOutputStream outputStream = new FileOutputStream(ROLTestDataFile);
		byte[] strToBytes = jsonObject.toString().getBytes();
		outputStream.write(strToBytes);
	}


	public static JSONObject getJSONNodeToUpdateValue(String Element) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(ROLTestDataFile.getAbsolutePath());
		jsonObject = (JSONObject) jsonParser.parse(reader);
		System.out.println(jsonObject);


		JSONObject RolTurvoObj = (JSONObject) jsonObject.get("RolTurvo");
		System.out.println("RolTurvo is: " + RolTurvoObj);

		JSONObject ElementObject =(JSONObject) RolTurvoObj.get(Element);
		System.out.println("Element Object is: " + ElementObject);
		return ElementObject;
	}

	public void WriteJSONData(JSONObject ElementObject,String Field, String Value) throws IOException, ParseException {
		String FieldDT =((String) ElementObject.get(Field));
		System.out.println(FieldDT);
		ElementObject.put(Field, Value);
	}
	
}
