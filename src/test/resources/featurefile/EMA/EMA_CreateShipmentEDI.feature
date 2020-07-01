# @Author :  Mitul Patel

@Regression_EMA
Feature: Regression Test Suite - Electolux Major Appliances (EMA) customer.

  @EDI
  Scenario Outline: Create Shipment using EDI file and validate that it is created in TM.
    Given User has received EMA EDI file and Updates required data to post
    |ShipmentDescription|
    |EMA         |
    When send SOAP PostCall and User received success message
    Then Wait for "<Seconds>" seconds to get the shipment created.
    Then user must login to new jda environment successfully using "<JDAusername>","<JDAPassword>"
    Then click on shipment processing then click on shipments link and Search shipment as per Unique Number
    Then Verify that shipment is created for '"<customer>"' customer, '"<Division>"' Division, and '"<Logistic Group>"' Logistic Group  in TM

    Examples:
      |customer	|Seconds|ThisCustomer					|OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|OrderType	|EquipmentType	|weight	|JDAusername| JDAPassword	|ItemCode  | ItemDescription      | ItemQuantity | PlanID| WaitTime |WriteTestData |Division|Logistic Group|
      |EMA		| 180000  |Electrolux Major Appliances	|64-RDC-UWA				|72-RDC-UWA 		|	1			|	0				|Prepaid		|Inbound	| Flatbed		|5000	|mpatel6	|Ryder@123!1		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 1662 |20000	      |EMA_TenderAccecpted                    | EMA1         | EMA5             |
