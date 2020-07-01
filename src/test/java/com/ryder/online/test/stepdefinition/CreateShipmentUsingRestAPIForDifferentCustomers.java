package com.ryder.online.test.stepdefinition;

import com.ryder.online.configreader.FileReaderManager;
import com.ryder.online.createshipment.DateHelper;
import com.ryder.online.helper.managers.ScenarioContext;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.utility.DateTimeHelper;
import com.ryder.online.utility.JsonFileWriter;
import io.cucumber.datatable.DataTable;


//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.ryder.online.FileOperation.UpdateXMLFile.ModifyXMl;
import static com.ryder.online.api.util.SOAPAPI.SOAPAPIPostCall;
import static io.restassured.RestAssured.given;
//import io.restassured.path.xml.XmlPath;

public class CreateShipmentUsingRestAPIForDifferentCustomers {

	String pathname;

	//public static File file = new File(".//src/main/resources/exceldata/createShipmentData.json");
	public static File CASfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getCASJsonDataFileName());
	public static File NGXfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getNGXJsonDataFileName());
	public static File KBNfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getKBNJsonDataFileName());
	public static File RYDfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getRYDJsonDataFileName());
	public static File EMAfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getEMAJsonDataFileName());
	public static File EMA1fileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getEMA1JsonDataFileName());
	public static File ALSfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getALSJsonDataFileName());
	public static File IRMfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getIRMJsonDataFileName());
	public static File DIAfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getDIAJsonDataFileName());
	public static File DOMfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getJsonDataFileName("DOM"));
	public static File VZNfileJson = new File(FileReaderManager.getInstance().getConfigReader().getJsonDataFilePath()+FileReaderManager.getInstance().getConfigReader().getJsonDataFileName("VZN"));
	public static String url= FileReaderManager.getInstance().getConfigReader().getShipmentBaseURL() + ":" +FileReaderManager.getInstance().getConfigReader().getPort()+FileReaderManager.getInstance().getConfigReader().getResourceName();

	JsonFileWriter jsonFileWriter;
	TestContext testContext;
	static String dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
	
	public CreateShipmentUsingRestAPIForDifferentCustomers(TestContext testContext) {
			
			this.testContext = testContext;

		}

	@Given("^NGX Customer Rest API JSON payload provided to tester$")
	public void ngx_Customer_Rest_API_JSON_payload_provided_to_tester() {
		
	}

	@When("^NGX customer specific JSON payload with below listed parameters data$")
	public void ngx_customer_specific_JSON_payload_with_below_listed_parameters_data(DataTable dt) throws IOException  {

		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		System.out.println(list.size());
		dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
			try {
				for(int i=0; i<list.size(); i++) {
					String customerNum =list.get(i).get("customerNumber");
					System.out.println(customerNum);
					testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber","AUT"+customerNum+dateRandNum, NGXfileJson);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
		testContext.request =  given().contentType(ContentType.JSON).when().body(NGXfileJson);
	}

	@When("^Tester should submit payload as POST call to create a new shipment$")
	public void tester_should_submit_payload_as_POST_call_to_create_a_new_shipment() {
		 	testContext.response=    testContext.request.
			post(url).
			then().extract().response();
			System.out.println(testContext.response.getStatusCode());
			System.out.println(testContext.response.asString());

			int StatusCode = testContext.response.getStatusCode();
			Assert.assertEquals(StatusCode, 200);
			long time =testContext.response.getTimeIn(TimeUnit.SECONDS);
			System.out.println(time);
			System.out.println(testContext.response.getTime());
		
	}

	@Then("^Tester must check success status code, response time$")
	public void tester_must_check_success_status_code_response_time()  {
			String fullxml = testContext.response.andReturn().asString();
			String responsejsonerrorDetails =JsonPath.from(fullxml).getString("errorDetails");
			System.out.println(responsejsonerrorDetails);

			String responsejsonStatus =JsonPath.from(fullxml).getString("responseCode");
			Assert.assertEquals(responsejsonStatus, "200" ,responsejsonerrorDetails + ":");
	}

	@Then("^Tester validate external shipment in database$")
	public void tester_validate_external_shipment_in_database()  {

	}

	@Given("^CAS Customer Rest API JSON payload provided to tester$")
	public void cas_Customer_Rest_API_JSON_payload_provided_to_tester(){ }

	@When("^CAS customer specific JSON payload with below listed parameters data$")
	public void cas_customer_specific_JSON_payload_with_below_listed_parameters_data(DataTable dt) throws IOException {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
		System.out.println(list.size());
			try {
				for(int i=0; i<list.size(); i++) {
					String customerNum =list.get(i).get("customerNumber");
					testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber","AUT"+customerNum+dateRandNum, CASfileJson);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
		testContext.request =  given().contentType(ContentType.JSON).when().body(CASfileJson);
	}

	@Given("^KBN Customer Rest API JSON payload provided to tester$")
	public void kbn_Customer_Rest_API_JSON_payload_provided_to_tester() {	}

	@When("^KBN customer specific JSON payload with below listed parameters data$")
	public void kbn_customer_specific_JSON_payload_with_below_listed_parameters_data(DataTable dt) throws IOException {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
		System.out.println(list.size());
			try {
				  for(int i=0; i<list.size(); i++) {
					String customerNum =list.get(i).get("customerNumber");
					String FrmlocCode = list.get(i).get("FrmLocCode");
					testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber","AUT"+customerNum+dateRandNum, KBNfileJson);
					testContext.jsonFileWriter.updateJsonFileforKey("$.locations.location.[('locationCode')]",FrmlocCode, KBNfileJson);
				  }
			} catch (ParseException e) {
				e.printStackTrace();
			}
	    testContext.request =  given().contentType(ContentType.JSON).when().body(KBNfileJson);
	}
	
	@Given("^RYD Customer Rest API JSON payload provided to tester$")
	public void ryd_Customer_Rest_API_JSON_payload_provided_to_tester() throws Throwable {
	 
	}

	@When("^RYD customer specific JSON payload with below listed parameters data$")
	public void ryd_customer_specific_JSON_payload_with_below_listed_parameters_data(DataTable dt) throws Throwable {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
		System.out.println(list.size());
			try {
				for(int i=0; i<list.size(); i++) {
				  String customerNum =list.get(i).get("customerNumber");
				  testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber","AUT"+customerNum+dateRandNum, RYDfileJson);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
		testContext.request =  given().contentType(ContentType.JSON).when().body(RYDfileJson);
	}

	

@Given("EMA Customer Rest API JSON payload provided to tester")
public void ema_Customer_Rest_API_JSON_payload_provided_to_tester() {
  
}

@When("EMA customer specific JSON payload with below listed parameters data")
public void ema_customer_specific_JSON_payload_with_below_listed_parameters_data(DataTable dataTable) throws IOException {
	List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
	dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
	System.out.println(list.size());
		try {
			for(int i=0; i<list.size(); i++) {
			  String customerNum =list.get(i).get("customerNumber");
			  String externalShipmentNumber = "AUT"+customerNum+dateRandNum;
			  testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber",externalShipmentNumber, EMAfileJson);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    testContext.request =  given().contentType(ContentType.JSON).when().body(EMAfileJson);
}

@Given("ALS Customer Rest API JSON payload provided to tester")
public void als_Customer_Rest_API_JSON_payload_provided_to_tester() {


}

@When("ALS customer specific JSON payload with below listed parameters data")
public void als_customer_specific_JSON_payload_with_below_listed_parameters_data(DataTable dataTable) throws IOException {
	List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
	dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
	System.out.println(list.size());
		try {
			for(int i=0; i<list.size(); i++) {
				String customerNum =list.get(i).get("customerNumber");
				testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber","AUT"+customerNum+dateRandNum, ALSfileJson);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    testContext.request =  given().contentType(ContentType.JSON).when().body(ALSfileJson);
}

@Given("DIA Customer Rest API JSON payload provided to tester")
public void dia_Customer_Rest_API_JSON_payload_provided_to_tester() {
    
}

@When("DIA customer specific JSON payload with below listed parameters data")
public void dia_customer_specific_JSON_payload_with_below_listed_parameters_data(DataTable dataTable) throws IOException {
	List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
	dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
	System.out.println(list.size());
		try {
			for(int i=0; i<list.size(); i++) {
				String customerNum =list.get(i).get("customerNumber");
				testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber","AUT"+customerNum+dateRandNum, DIAfileJson);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    testContext.request =  given().contentType(ContentType.JSON).when().body(DIAfileJson);
}

@Given("IRM Customer Rest API JSON payload provided to tester")
public void irm_Customer_Rest_API_JSON_payload_provided_to_tester() {
   
}

@When("IRM customer specific JSON payload with below listed parameters data")
public void irm_customer_specific_JSON_payload_with_below_listed_parameters_data(DataTable dataTable) throws IOException {
	List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
	dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
	System.out.println(list.size());
		try {
			for(int i=0; i<list.size(); i++) {
				String customerNum =list.get(i).get("customerNumber");
				testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber","AUT"+customerNum+dateRandNum, IRMfileJson);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    testContext.request =  given().contentType(ContentType.JSON).when().body(IRMfileJson);
}
	
@Given("EMA1 Customer Rest API JSON payload provided to tester")
public void ema1_Customer_Rest_API_JSON_payload_provided_to_tester() {
 
}

@When("EMA1 customer specific JSON payload with below listed parameters data")
public void ema1_customer_specific_JSON_payload_with_below_listed_parameters_data(DataTable dataTable) throws IOException {
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
		System.out.println(list.size());
			try {
				  for(int i=0; i<list.size(); i++) {
					  String customerNum =list.get(i).get("customerNumber");
					testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber","AUT"+customerNum+dateRandNum, EMA1fileJson);
				  }
			} catch (ParseException e) {
				e.printStackTrace();
			}
	    testContext.request =  given().contentType(ContentType.JSON).when().body(EMA1fileJson);
	}


@Given("\"(.*)\" Customer Rest API JSON payload provided to tester$")
public void Customer_Rest_API_JSON_payload_provided_to_tester(String str) {

}


@When("\"(.*)\" customer specific JSON payload with below listed parameters data$")
public void customer_specific_JSON_payload_with_below_listed_parameters_data( String customerName,DataTable dataTable) throws IOException {
	List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
	dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
	System.out.println(list.size());
	File JsonFileName = null;
	try {
		for(int i=0; i<list.size(); i++) {
			String customerNum =list.get(i).get("customerNumber");
			String externalShipmentNumber = "AUT"+customerNum+dateRandNum;
			//testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber",externalShipmentNumber, EMAfileJson);
			JsonFileName=GetJSONFileName(customerNum);
			testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber",externalShipmentNumber, JsonFileName);
		}
	} catch (ParseException e) {
		e.printStackTrace();
	}
	testContext.request =  given().contentType(ContentType.JSON).when().body(JsonFileName);
}

public File GetJSONFileName(String CustomerName){
		File JSONFileName = null;

		switch (CustomerName){
			case "DOM":
				JSONFileName = DOMfileJson;
				break;
			case "VZN":
				JSONFileName = VZNfileJson;
				break;
			case "CAS":
				JSONFileName = CASfileJson;
				break;
			case "NGX":
				JSONFileName = NGXfileJson;
				break;
			case "KBN":
				JSONFileName = KBNfileJson;
				break;
			case "IRM":
				JSONFileName = IRMfileJson;
				break;
			case "DIA":
				JSONFileName = DIAfileJson;
				break;
			case "ALS":
				JSONFileName = ALSfileJson;
				break;
			case "RYD":
				JSONFileName = RYDfileJson;
				break;
			case "EMA":
				JSONFileName = EMA1fileJson;
				//JSONFileName = EMAfileJson;
				break;
		}
		return JSONFileName;
}

	@Given("User has received EMA EDI file and Updates required data to post")
	public void Use_has_received_EMA_EDI_file_and_send_SOAP_PostCall(DataTable data) throws Exception {
		String Filepath = System.getProperty("user.dir") + FileReaderManager.getInstance().getConfigReader().getEDIFilePath("EDIFilePath");
		String HostURL = FileReaderManager.getInstance().getConfigReader().getSOAPAPIRL("SOAPAPIRL");
		String NodeName = data.row(0).get(0);
		String NodeValue = data.row(1).get(0);

		System.out.println(NodeName + ":" + NodeValue);
		String dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
		NodeValue = NodeValue+dateRandNum;

		testContext.scenarioContext.setContext(ScenarioContext.Context.UNIQUE_SHIPMENT_ID, NodeValue);
		ModifyXMl(Filepath,NodeName,NodeValue);
		SOAPAPIPostCall(Filepath,HostURL);
	}

	@When("send SOAP PostCall and User received success message")
	public void User_received_success_message() {

	}

	@Then("Wait for {string} seconds to get the shipment created.")
	public void Wait_for_seconds(String str) throws InterruptedException {
		Thread.sleep(180000);
	}
}
