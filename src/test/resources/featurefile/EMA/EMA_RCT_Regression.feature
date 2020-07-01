# @Author :  Mitul Patel

@Regression_EMA
Feature: Regression Test Suite - Electolux Major Appliances (EMA) customer.

  Scenario Outline: Create Shipment in RCT using lights out process and validate that it is created in TM.
    Given User was asked to create shipment in RCT channel
    When User Enters User ID,Password in RCT as "<RCTusername>","<RCTPassword>" and clicks Login button
    Then User is on Ryder Control Tower Home page after successfull logon
    When user must verify selected customer "<customer>"
    Then user selects "<ThisCustomer>" from list of options
    When user navigates to Shipping Tab and choose Create Shipment option
#    Then user is selecting manual option to navigate to Create Manual shipment
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
    Then user wait for "<WaitTime>" minutes before checking shipment status
    When User navigates to shipment Trancking to search shipment
    Then user should be able to view the shipment
    Then user go to details and by clicking on loads to verify load number
    Then Write data into Json data file "<WriteTestData>"
    Examples:
      |RCTusername | RCTPassword  	|customer	|ThisCustomer					|	OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|OrderType	|EquipmentType	|weight	|JDAusername| JDAPassword	|ItemCode  | ItemDescription      | ItemQuantity | WaitTime |WriteTestData |
      |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|64-RDC-UWA				|72-RDC-UWA 		|	1			|	0				|Prepaid		|Inbound	| Flatbed		|5000	|mpatel6	|Ryder@123!1		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 20000	      |EMA_TenderAccecpted                    |

  @Regression
  Scenario Outline: Create a Shipment in RCT and verify the shipment is created in TM for the customer EMA
    Given User was asked to create shipment in RCT channel
    When User Enters User ID,Password in RCT as "<RCTusername>","<RCTPassword>" and clicks Login button
    Then User is on Ryder Control Tower Home page after successfull logon
    When user must verify selected customer "<customer>"
    Then user selects "<ThisCustomer>" from list of options
    When user navigates to Shipping Tab and choose Create Shipment option
#    Then user is selecting manual option to navigate to Create Manual shipment
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
      |RCTusername | RCTPassword  	|customer	|ThisCustomer					|	OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|OrderType	|EquipmentType	|weight	|JDAusername| JDAPassword	|ItemCode  | ItemDescription      | ItemQuantity | PlanID| WaitTime |WriteTestData |Division|Logistic Group|
      |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|64-RDC-UWA				|72-RDC-UWA 		|	1			|	0				|Prepaid		|Inbound	| Flatbed		|5000	|mpatel6	|Ryder@123!1		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 1662 |20000	      |EMA_TenderAccecpted                    | EMA1         | EMA5             |

  @Regression
  Scenario Outline: Create a Shipment in RCT and verify User is able to assign a shipment to a new load in TM
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
    Then User clicks on load build link and navigate to work with plan to select "<PlanID>" under Plan.
    Then Navigate to shipment not attached under load build and attach to current plan
    Then User navigate to load build, work with plan, shipments then Unassigned shipment
    Then search with shipment number and select that shipment ancd click on assign to new load
#    Then Shipment 206972137 assigned to lad 4639.
#    Then go to load processing  then loads , go to load id and search for the load and select the load
#    Then click on rating then navigate to the page and hit Rate button, message should come as Load Rated Successfully
#    Then hit submit button Load 4639 rated successfully. new rating results have been saved.
#    Then navigate to Load Build then work with plan then loads
#    Then search for load number and select the load , click on operations then click on set to planned
#    Then message load 4639 set to planned and acrrier sequential tendering successfull
#    Then go to Tender Response and then Loads, search for loadid and verify the status and click on load and click on accept tender request.
#   	Then Transportation Manager:Load Tender Accept page should be displayed then click on Accept button.
#   	Then Tender Accepted for Load 4639 should be displayed
#    Then Write data into Json data file "<WriteTestData>"
    Examples:
      |RCTusername | RCTPassword  	|customer	|ThisCustomer					|	OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|OrderType	|EquipmentType	|weight	|JDAusername| JDAPassword	|ItemCode  | ItemDescription      | ItemQuantity | PlanID| WaitTime |WriteTestData |Division|Logistic Group|
      |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|41-RDC-UWA				|0070080101 		|	1			|	0				|Prepaid		|Inbound	| Flatbed		|5000	|mpatel6	|Ryder@123!1		|240336803 | SPACER-HINGE (BLACK) | 10 	         |1662 |20000     |EMA_Tendered |EMA1         | EMA5             |
      |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|41-RDC-UWA				|0070080101 		|	1			|	0				|Prepaid		|Inbound	| Flatbed		|5000	|mpatel6	|Ryder@123!1		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 1662|20000     |EMA_Canceled |EMA1         | EMA5             |
