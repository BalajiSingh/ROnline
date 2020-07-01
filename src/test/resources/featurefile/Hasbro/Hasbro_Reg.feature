# @Author :  Mitul Patel

@Regression_Hasbro
Feature: Regression Test Suite - Hasbro customer.

  Scenario Outline: Manual Entry Shipment creation
     Given User was asked to create shipment in RCT channel
    When User Enters User ID,Password in RCT as "<RCTusername>","<RCTPassword>" and clicks Login button
    Then User is on Ryder Control Tower Home page after successfull logon
    When user must verify selected customer "<customer>"
    Then user selects "<ThisCustomer>" from list of options
    When user navigates to Shipping Tab and choose Create Shipment option
    Then user should be able search origin "<OriginLocationID>"
    Then user should be able to search for destination "<DestLocationID>"
    When user selects Preferred Pick Up Date dropdown value "<pickUpDate>"
    And  user enters future Preferred delivery date for "<DeliveryDate>"
    Then user select "<BillingType>" as PRE_PAID freight Terms
    Then Customer Order  Number must be entered
    Then Order Type must be selected "<OrderType>"
    Then click on submit to enter shipping and Handling Unit details
    Then select Container Type from dropdown on Handling Unit details page
      |Eaches|
    Then weigth is necessary in Dimesions section of about "<weight>" pounds
    Then click on AddItems to add line Items
    Then user enters "<ItemCode>" and "<ItemDescription>"
    Then user updates "<ItemQuantity>"
    Then click on save to navigate back to create manual shipment page
    Then click on submit button
    Then If Address Validation pops up then click on Accept button for origin and destination
    Then user navigates to Shipment Submitted page with shipment number
    Then user is logged off from RCT channel
    Then user must login to new jda environment successfully using "<JDAusername>","<JDAPassword>"
    Then click on shipment processing then click on shipments link and Search shipment
    Then Verify that shipment is created for '"<customer>"' customer, '"<Division>"' Division, and '"<Logistic Group>"' Logistic Group  in TM


    Examples:
      |RCTusername | RCTPassword  	|customer	|ThisCustomer	|OriginLocationID	|DestLocationID	|	pickUpDate	|	DeliveryDate	|BillingType	|OrderType	        |EquipmentType	|weight	|JDAusername| JDAPassword	|ItemCode  | ItemDescription      | ItemQuantity | PlanID| WaitTime |WriteTestData |
      |mitulpatel  | mitulpatel		|HAS		|Hasbro	        |0001084861			|0001084574 	|	1			|	0				|Prepaid		|Refusal/Returns	| Flatbed		|5000	|mpatel6	|Ryder@123!1	|240336803 | SPACER-HINGE (BLACK) | 10 	         | 1662 |20000	      |EMA_TenderAccecpted                    |
      |mitulpatel  | mitulpatel		|HAS		|Hasbro         |0001084861	    	|0001084574 	|	1			|	0				|Prepaid		|Vendor Returns	    | Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | |20000     |EMA_Tendered |
      |mitulpatel  | mitulpatel		|HAS		|Hasbro         |0001084861			|0001084574 	|	1			|	0				|Prepaid		|Latin America	    | Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | |20000     |EMA_Canceled |
