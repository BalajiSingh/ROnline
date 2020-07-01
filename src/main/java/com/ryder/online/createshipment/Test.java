package com.ryder.online.createshipment;

import java.sql.SQLException;

//import oracle.jdbc.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Test {

	public static void main(String[] args) throws JsonProcessingException, SQLException {
		// TODO Auto-generated method stub
//		Measures measures= new Measures( "length", "width",  "height", "dimensionUOM",  "weight",  "weightUOM",  "volume",  "volumeUOM", "nominalWeight",   "tareWeight",   
//		    		 "totalSkids",  "totalHandlingUnits",   "orderValue",      "declaredValue",      "currency",      "actualWeight",     "actualVolume",      "actualPieces",      "actualHandlingUnits"   ); 
//	//	Locations locations = new Locations(List<Location> location);
//		Locations locations = new Locations(location)
//		Options opts = new Options( "isShipDirect",  "isUrgent",  "isHold",  "carrierScac",  "serviceCode",
//				 "freightTerms",  "incoTerms",  "consolidationClass",  "isHazmat",  "isWatchDesignated",  "isSpecialAttention"); 
//		Reference ref = new Reference("qualifier","value");
//		Location   (  "useCode",      "locationCode",      "locationName",      "locationNameAddtl",
//			      "isPickupAppointmentRequired",      "isDeliveryAppointmentRequired",      "isResidential",
//			      "externalLocationType",      "memo",      "businessHours",     Address address,
//			     Contacts contacts,      "chargeOverrides")
//		Rates rates= new Rates(List<Rate> rate);
//		Items items = new Items(List<String> item);
//		 HandlingUnits handlingUnits = new HandlingUnits(List<HandlingUnit> handlingUnit);
//		 HandlingUnit handlingUnit = new HandlingUnit(" handlingUnitId",     "quantity",     "stackCode",     "documentMappings",
//   		      "handlingUnitTypeNumber",      "description",      "stackFactor",    Measures measures,
//	    		      "freightClasses",     List<> hazmatDetails,     "stackGroup",      "externalHandlingUnitNumber",
//   		     ReferenceNumbers referenceNumbers,     "isHazmat",     Items items, "isPalletOrSkid"); 
//		ReferenceNumbers refnums = new ReferenceNumbers( List<Reference> reference);
//		Rate rate= new  Rate(  "currencyCd",	      "accountNum",	     boolean validForSelectedService,      "requestedDeliveryToDate",	      "serviceCode",
//			      "ratePurpose",	      "scheduledPickupToDate",	     int rank,	     boolean selected,	      "scheduledDeliveryToDate",	      "requestedPickupFromDate",
//			      "equipment",	     boolean validForDate,	     int transitDays,	     List<> serviceOptions,	      "requestedDeliveryFromDate",	      "quoteId",
//			      "rateSource",	      "totalCharge",	     List<> equipmentOptions,	      "scheduledDeliveryFromDate",	      "transportMode",	      "requestedPickupToDate",
//			      "carrierNum",	      "scheduledPickupFromDate");
//		createShipmentRootPayload csrp = new createShipmentRootPayload( "isReturn",   HandlingUnits handlingUnits,    DocumentMappings documentMappings,     "chargedAmount",   "discountAmount",    "memo",
//	     "logisticsGroupCode",    "type",    "fuelAmount",    Measures measures,     "viewConfigs",     "returnReason",     "legs",     "commodityCode",     Options options,     "actionCode",
//	     "externalShipmentNumber",     "shipmentNumber",	     "events",	     "chargeOverrides",	     "mergeInTransitConsolidationCode",	     "idempotencyKey",	     Rates rates,	  Equipment equipment,
//	     Dates dates,	     "customerNumber",	     "userId",	     "carrierAccountType",	     "externalTimeStamp",	     "divisionCode",	     "totalAmount",	     "tradingPartner",
//	     Locations locations,	     "throughPoints",	     "carrierAccountNumber",	     ReferenceNumbers referenceNumbers,	     "mergeInTransitConsolidationNum",	    "status"
//	    );
		
	//	Reference ref = new Reference("qualifier","value");
		String rates =Rates.class.toString();
		ObjectMapper objMap = new ObjectMapper();
		String mydata =objMap.writerWithDefaultPrettyPrinter().writeValueAsString(rates);
		System.out.println(mydata);
		
	//Connection conn= DriverManager.getConnection(URL, USER, PASS);
//	Connection conn = DriverManager.getConnection(URL, info);
			//getConnection(URL, USER, PASS);
//		Driver myDriver = new oracle.jdbc.driver.OracleDriver();
//		   DriverManager.registerDriver( myDriver );
}
}
