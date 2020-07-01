
package com.ryder.online.test.stepdefinition;


import com.ryder.online.configreader.FileReaderManager;
import com.ryder.online.createshipment.DateHelper;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.utility.DateTimeHelper;
import com.ryder.online.utility.JsonFileWriter;
import com.ryder.online.utility.OracleDataBaseHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import static io.restassured.RestAssured.given;

public class CreateShipment_RestAPI_Main {

	 File file = new File(".//src/main/resources/exceldata/createShipmentData.json");
	 String dateRandNum = DateHelper.getCurrentDateForExtShpmnt()+DateTimeHelper.randomnumber();
	 JsonPath jsonPath;	
	 String url= FileReaderManager.getInstance().getConfigReader().getShipmentBaseURL() + ":" +FileReaderManager.getInstance().getConfigReader().getPort()+FileReaderManager.getInstance().getConfigReader().getResourceName();
	 JsonFileWriter jsonFileWriter;
	 TestContext testContext;
	 OracleDataBaseHelper oracleHelp = new  OracleDataBaseHelper();
	
	 
	 public CreateShipment_RestAPI_Main(TestContext testContext) {
				this.testContext = testContext;
			}

	 
	@Given("^As a Tester I have the API URL \"([^\"]*)\"$")
	public void as_a_Tester_I_have_the_API_URL(String arg1) throws IOException {
	  
//	 testContext.response=    RestAssured.given().contentType(ContentType.JSON).body("{\r\n" + 
//			"	\"idempotencyKey\": null,\r\n" + 
//			"	\"tradingPartner\": null,\r\n" + 
//			"	\"externalTimeStamp\": null,\r\n" + 
//			"	\"customerNumber\": \"NGX\",\r\n" + 
//			"	\"shipmentNumber\": null,\r\n" + 
//			"	\"actionCode\": null,\r\n" + 
//			"	\"externalShipmentNumber\": \"AUT"+"NGX"+dateRandNum+"\",\r\n" + 
//			"	\"userId\": \"roldemo\",\r\n" + 
//			"	\"carrierAccountType\": null,\r\n" + 
//			"	\"carrierAccountNumber\": null,\r\n" + 
//			"	\"isReturn\": null,\r\n" + 
//			"	\"returnReason\": null,\r\n" + 
//			"	\"type\": \"DESKTOP\",\r\n" + 
//			"	\"logisticsGroupCode\": null,\r\n" + 
//			"	\"divisionCode\": null,\r\n" + 
//			"	\"status\": \"OPEN\",\r\n" + 
//			"	\"commodityCode\": null,\r\n" + 
//			"	\"totalAmount\": null,\r\n" + 
//			"	\"discountAmount\": null,\r\n" + 
//			"	\"chargedAmount\": null,\r\n" + 
//			"	\"fuelAmount\": null,\r\n" + 
//			"	\"mergeInTransitConsolidationCode\": null,\r\n" + 
//			"	\"mergeInTransitConsolidationNum\": null,\r\n" + 
//			"	\"memo\": null,\r\n" + 
//			"	\"dates\": {\r\n" + 
//			"		\"requestShipFrom\": \"2019-11-08T00:00:00\",\r\n" + 
//			"		\"requestShipTo\": null,\r\n" + 
//			"		\"requestDeliveryFrom\": null,\r\n" + 
//			"		\"requestDeliveryTo\": \"2019-11-09T23:59:00\",\r\n" + 
//			"		\"scheduledShipFrom\": null,\r\n" + 
//			"		\"scheduledShipTo\": null,\r\n" + 
//			"		\"scheduledDeliveryFrom\": null,\r\n" + 
//			"		\"scheduledDeliveryTo\": null,\r\n" + 
//			"		\"appointmentPickUp\": null,\r\n" + 
//			"		\"appointmentDelivery\": null,\r\n" + 
//			"		\"actualPickup\": null,\r\n" + 
//			"		\"actualDelivery\": null\r\n" + 
//			"	},\r\n" + 
//			"	\"options\": {\r\n" + 
//			"		\"isShipDirect\": null,\r\n" + 
//			"		\"isUrgent\": null,\r\n" + 
//			"		\"isHold\": null,\r\n" + 
//			"		\"carrierScac\": null,\r\n" + 
//			"		\"serviceCode\": null,\r\n" + 
//			"		\"freightTerms\": \"PRE_PAID\",\r\n" + 
//			"		\"incoTerms\": null,\r\n" + 
//			"		\"consolidationClass\": null,\r\n" + 
//			"		\"isHazmat\": null,\r\n" + 
//			"		\"isWatchDesignated\": null,\r\n" + 
//			"		\"isSpecialAttention\": null\r\n" + 
//			"	},\r\n" + 
//			"	\"measures\": {\r\n" + 
//			"		\"length\": null,\r\n" + 
//			"		\"width\": null,\r\n" + 
//			"		\"height\": null,\r\n" + 
//			"		\"dimensionUOM\": null,\r\n" + 
//			"		\"weight\": null,\r\n" + 
//			"		\"weightUOM\": null,\r\n" + 
//			"		\"volume\": null,\r\n" + 
//			"		\"volumeUOM\": null,\r\n" + 
//			"		\"nominalWeight\": null,\r\n" + 
//			"		\"tareWeight\": null,\r\n" + 
//			"		\"totalSkids\": \"1\",\r\n" + 
//			"		\"totalHandlingUnits\": null,\r\n" + 
//			"		\"orderValue\": null,\r\n" + 
//			"		\"declaredValue\": null,\r\n" + 
//			"		\"currency\": null,\r\n" + 
//			"		\"actualWeight\": null,\r\n" + 
//			"		\"actualVolume\": null,\r\n" + 
//			"		\"actualPieces\": null,\r\n" + 
//			"		\"actualHandlingUnits\": null\r\n" + 
//			"	},\r\n" + 
//			"	\"equipment\": {\r\n" + 
//			"		\"equipmentInitial\": null,\r\n" + 
//			"		\"equipmentNumber\": null,\r\n" + 
//			"		\"equipmentName\": null,\r\n" + 
//			"		\"country\": null,\r\n" + 
//			"		\"routeNumber\": null,\r\n" + 
//			"		\"equipmentDescriptionCode\": null,\r\n" + 
//			"		\"equipmentCode\": null,\r\n" + 
//			"		\"weightUOM\": null,\r\n" + 
//			"		\"weight\": null,\r\n" + 
//			"		\"volumeUOM\": null,\r\n" + 
//			"		\"volume\": null,\r\n" + 
//			"		\"temperatureUOM\": null,\r\n" + 
//			"		\"minimumTemperature\": null,\r\n" + 
//			"		\"maximumTemperature\": null,\r\n" + 
//			"		\"dimUOM\": null,\r\n" + 
//			"		\"length\": null,\r\n" + 
//			"		\"width\": null,\r\n" + 
//			"		\"height\": null\r\n" + 
//			"	},\r\n" + 
//			"	\"locations\": {\r\n" + 
//			"		\"location\": [{\r\n" + 
//			"			\"useCode\": \"19\",\r\n" + 
//			"			\"locationCode\": \"306618581\",\r\n" + 
//			"			\"locationName\": \"Northrop Grumman\",\r\n" + 
//			"			\"locationNameAddtl\": null,\r\n" + 
//			"			\"isPickupAppointmentRequired\": null,\r\n" + 
//			"			\"isDeliveryAppointmentRequired\": null,\r\n" + 
//			"			\"isResidential\": null,\r\n" + 
//			"			\"externalLocationType\": null,\r\n" + 
//			"			\"memo\": null,\r\n" + 
//			"			\"businessHours\": null,\r\n" + 
//			"			\"address\": {\r\n" + 
//			"				\"address\": \"11751 MEADOWVILLE LN\",\r\n" + 
//			"				\"address2\": \"\",\r\n" + 
//			"				\"city\": \"CHESTER\",\r\n" + 
//			"				\"sau\": \"VA\",\r\n" + 
//			"				\"country\": \"USA\",\r\n" + 
//			"				\"postalCode\": \"23836-6315\",\r\n" + 
//			"				\"latitude\": null,\r\n" + 
//			"				\"longitude\": null,\r\n" + 
//			"				\"timezone\": null\r\n" + 
//			"			},\r\n" + 
//			"			\"contacts\": {\r\n" + 
//			"				\"contact\": [{\r\n" + 
//			"					\"contactType\": null,\r\n" + 
//			"					\"primaryLanguage\": null,\r\n" + 
//			"					\"firstName\": \"test\",\r\n" + 
//			"					\"lastName\": null,\r\n" + 
//			"					\"phone\": \"2342442324\",\r\n" + 
//			"					\"alternatePhone\": null,\r\n" + 
//			"					\"faxNumber\": null,\r\n" + 
//			"					\"email\": null,\r\n" + 
//			"					\"isPrimaryContact\": null\r\n" + 
//			"				}]\r\n" + 
//			"			},\r\n" + 
//			"			\"chargeOverrides\": null\r\n" + 
//			"		}, {\r\n" + 
//			"			\"useCode\": \"20\",\r\n" + 
//			"			\"locationCode\": \"0090028125\",\r\n" + 
//			"			\"locationName\": \"JACKSON AEROSPACE INC\",\r\n" + 
//			"			\"locationNameAddtl\": null,\r\n" + 
//			"			\"isPickupAppointmentRequired\": null,\r\n" + 
//			"			\"isDeliveryAppointmentRequired\": null,\r\n" + 
//			"			\"isResidential\": null,\r\n" + 
//			"			\"externalLocationType\": null,\r\n" + 
//			"			\"memo\": null,\r\n" + 
//			"			\"businessHours\": null,\r\n" + 
//			"			\"address\": {\r\n" + 
//			"				\"address\": \"460 E ROSECRANS AVE\",\r\n" + 
//			"				\"address2\": \"\",\r\n" + 
//			"				\"city\": \"GARDENA\",\r\n" + 
//			"				\"sau\": \"CA\",\r\n" + 
//			"				\"country\": \"USA\",\r\n" + 
//			"				\"postalCode\": \"90248-2023\",\r\n" + 
//			"				\"latitude\": null,\r\n" + 
//			"				\"longitude\": null,\r\n" + 
//			"				\"timezone\": null\r\n" + 
//			"			},\r\n" + 
//			"			\"contacts\": {\r\n" + 
//			"				\"contact\": [{\r\n" + 
//			"					\"contactType\": null,\r\n" + 
//			"					\"primaryLanguage\": null,\r\n" + 
//			"					\"firstName\": \"test\",\r\n" + 
//			"					\"lastName\": null,\r\n" + 
//			"					\"phone\": \"2342423444\",\r\n" + 
//			"					\"alternatePhone\": null,\r\n" + 
//			"					\"faxNumber\": null,\r\n" + 
//			"					\"email\": null,\r\n" + 
//			"					\"isPrimaryContact\": null\r\n" + 
//			"				}]\r\n" + 
//			"			},\r\n" + 
//			"			\"chargeOverrides\": null\r\n" + 
//			"		}]\r\n" + 
//			"	},\r\n" + 
//			"	\"referenceNumbers\": {\r\n" + 
//			"		\"reference\": [{\r\n" + 
//			"			\"qualifier\": \"SID\",\r\n" + 
//			"			\"value\": \"roldemo\"\r\n" + 
//			"		}, {\r\n" + 
//			"			\"qualifier\": \"9V\",\r\n" + 
//			"			\"value\": \"PRE_PAID\"\r\n" + 
//			"		}, {\r\n" + 
//			"			\"qualifier\": \"SEC\",\r\n" + 
//			"			\"value\": \"ES\"\r\n" + 
//			"		}, {\r\n" + 
//			"			\"qualifier\": \"12\",\r\n" + 
//			"			\"value\": \"Indirect\"\r\n" + 
//			"		}, {\r\n" + 
//			"			\"qualifier\": \"GL\",\r\n" + 
//			"			\"value\": \"5300085\"\r\n" + 
//			"		}, {\r\n" + 
//			"			\"qualifier\": \"SLI\",\r\n" + 
//			"			\"value\": \"444\"\r\n" + 
//			"		}, {\r\n" + 
//			"			\"qualifier\": \"CCNM\",\r\n" + 
//			"			\"value\": \"33\"\r\n" + 
//			"		}, {\r\n" + 
//			"			\"qualifier\": \"LMFT\",\r\n" + 
//			"			\"value\": \"PDF\"\r\n" + 
//			"		}]\r\n" + 
//			"	},\r\n" + 
//			"	\"handlingUnits\": {\r\n" + 
//			"		\"handlingUnit\": [{\r\n" + 
//			"			\"handlingUnitId\": null,\r\n" + 
//			"			\"handlingUnitTypeNumber\": \"BOX\",\r\n" + 
//			"			\"isPalletOrSkid\": null,\r\n" + 
//			"			\"description\": null,\r\n" + 
//			"			\"externalHandlingUnitNumber\": \"1\",\r\n" + 
//			"			\"quantity\": \"1\",\r\n" + 
//			"			\"stackCode\": null,\r\n" + 
//			"			\"stackFactor\": null,\r\n" + 
//			"			\"stackGroup\": null,\r\n" + 
//			"			\"isHazmat\": null,\r\n" + 
//			"			\"measures\": {\r\n" + 
//			"				\"length\": \"2\",\r\n" + 
//			"				\"width\": \"2\",\r\n" + 
//			"				\"height\": \"2\",\r\n" + 
//			"				\"dimensionUOM\": \"IN\",\r\n" + 
//			"				\"weight\": \"12\",\r\n" + 
//			"				\"weightUOM\": \"LB\",\r\n" + 
//			"				\"volume\": \"0\",\r\n" + 
//			"				\"volumeUOM\": \"CU FT\",\r\n" + 
//			"				\"nominalWeight\": null,\r\n" + 
//			"				\"tareWeight\": null,\r\n" + 
//			"				\"totalSkids\": null,\r\n" + 
//			"				\"totalHandlingUnits\": null,\r\n" + 
//			"				\"orderValue\": null,\r\n" + 
//			"				\"declaredValue\": null,\r\n" + 
//			"				\"currency\": null,\r\n" + 
//			"				\"actualWeight\": null,\r\n" + 
//			"				\"actualVolume\": null,\r\n" + 
//			"				\"actualPieces\": null,\r\n" + 
//			"				\"actualHandlingUnits\": null\r\n" + 
//			"			},\r\n" + 
//			"			\"hazmatDetails\": [],\r\n" + 
//			"			\"freightClasses\": null,\r\n" + 
//			"			\"items\": {\r\n" + 
//			"				\"item\": []\r\n" + 
//			"			},\r\n" + 
//			"			\"referenceNumbers\": {\r\n" + 
//			"				\"reference\": [{\r\n" + 
//			"					\"qualifier\": \"DDSC\",\r\n" + 
//			"					\"value\": \"231\"\r\n" + 
//			"				}]\r\n" + 
//			"			},\r\n" + 
//			"			\"documentMappings\": null\r\n" + 
//			"		}]\r\n" + 
//			"	},\r\n" + 
//			"	\"throughPoints\": null,\r\n" + 
//			"	\"chargeOverrides\": null,\r\n" + 
//			"	\"legs\": null,\r\n" + 
//			"	\"events\": null,\r\n" + 
//			"	\"rates\": {\r\n" + 
//			"		\"rate\": [{\r\n" + 
//			"			\"quoteId\": null,\r\n" + 
//			"			\"carrierNum\": \"FDE\",\r\n" + 
//			"			\"rank\": 1,\r\n" + 
//			"			\"rateSource\": \"PRA\",\r\n" + 
//			"			\"transportMode\": \"PARCEL\",\r\n" + 
//			"			\"totalCharge\": \"43.7600\",\r\n" + 
//			"			\"currencyCd\": null,\r\n" + 
//			"			\"equipment\": null,\r\n" + 
//			"			\"serviceCode\": \"1AR\",\r\n" + 
//			"			\"scheduledPickupFromDate\": \"2018-09-26T00:00:00\",\r\n" + 
//			"			\"scheduledPickupToDate\": \"\",\r\n" + 
//			"			\"scheduledDeliveryFromDate\": \"\",\r\n" + 
//			"			\"scheduledDeliveryToDate\": \"2018-09-27T10:30:00\",\r\n" + 
//			"			\"accountNum\": \"510159020\",\r\n" + 
//			"			\"selected\": true,\r\n" + 
//			"			\"validForDate\": true,\r\n" + 
//			"			\"validForSelectedService\": true,\r\n" + 
//			"			\"ratePurpose\": \"EXECUTION\",\r\n" + 
//			"			\"serviceOptions\": [],\r\n" + 
//			"			\"equipmentOptions\": [],\r\n" + 
//			"			\"requestedPickupFromDate\": \"\",\r\n" + 
//			"			\"requestedPickupToDate\": \"\",\r\n" + 
//			"			\"requestedDeliveryFromDate\": \"\",\r\n" + 
//			"			\"requestedDeliveryToDate\": \"\",\r\n" + 
//			"			\"transitDays\": 1\r\n" + 
//			"		}]\r\n" + 
//			"	},\r\n" + 
//			"	\"viewConfigs\": null,\r\n" + 
//			"	\"documentMappings\": {\r\n" + 
//			"		\"documentMap\": []\r\n" + 
//			"	}\r\n" + 
//			"}")
//	    .post(url).then()
//	 .contentType(ContentType.XML).extract().response();
//
//	String externalShipmentNum = testContext.response.path("//externalShipmentNumber").toString();
//	int StatusCode = testContext.response.statusCode();
//	Assert.assertEquals(StatusCode, 200);
//	System.out.println(testContext.response.body().asString());
//	Assert.assertTrue(externalShipmentNum.contains(dateRandNum));

		try {
			testContext.jsonFileWriter.updateJsonFileforKey("externalShipmentNumber","AUTNGX"+dateRandNum, file);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    testContext.response = (Response) given().contentType(ContentType.JSON)
	    		
	    		.when().body(file).
	    	
	    		post(url).

	    		then().extract().response();
	    		System.out.println(testContext.response.getStatusCode());
	    		System.out.println(testContext.response.asString());
	}

	
	@When("^Tester must send required parameters in the POST request API  with JSON request sample as$")
	public void tester_must_send_required_parameters_in_the_POST_request_API_with_JSON_request_sample_as() {
		System.out.println("done");
	}

	@When("^Call the POST request$")
	public void call_the_POST_request() throws Throwable {

	   
	}

	@Then("^I should get \"([^\"]*)\" in the response$")
	public void i_should_get_in_the_response(String statusCode) throws SQLException  {
		String fullxml = testContext.response.andReturn().asString();
		String responsejsonStatus =JsonPath.from(fullxml).getString("responseCode");
		String responsejsonerrorDetails =JsonPath.from(fullxml).getString("errorDetails");
		System.out.println(responsejsonerrorDetails);
		Assert.assertEquals(responsejsonStatus, statusCode,responsejsonerrorDetails + ":");

	}
}
