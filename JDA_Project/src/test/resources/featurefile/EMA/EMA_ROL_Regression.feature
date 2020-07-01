# @Author :  Mitul Patel

@Regression_EMA
Feature: Regression Test Suite - Electolux Major Appliances (EMA) customer.

 # @Regression1
 @UI33321
  Scenario Outline: Create Shipment in ROL using lights out process and validate that it is created in TM.
    Given   User is on login page of ROL website
    When 	User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
    Then 	User is on Ryder online Home page after successfull logon
    When user is navigating to create shipment page
    Then user should navigate to create shipment page successfully
    When user selects the customer from the customer drop down "<ThisCustomer>"
    Then user should be able search origin "<OriginAddresID>", destination"<DestinationAddressID>" addresses
    When user selects pickupConvention dropdown value "<pickUpOn>"
    And user enters future date for pickUp
    When user selects deliverConvention dropdown value "<deliverbyDate>"
    Then user enters future week date for delivery
    Then user enter customer order number
    When user selects OrderType dropdown value as "<orderType>"
    When user to enter shipment line items electrolux "<Qty>","<ItemCode>","<Description>" and select "<ContainerType>"
    Then user must be navigated to confirmation page
    And user must click submit button on confirmation page
    Then user must verify the Unique Shipment Number
    When user click on button RyderEntrySummary
    Then user select status value from dropdown as "<status>"
    Then user must click on SEARCH button to search the unique shipment number
    Then user must logoff RyderEntry
    Then user must login to new jda environment successfully using "<JDAusername>","<JDAPassword>"
    Then click on shipment processing then click on shipments link and Search shipment as per Unique Number
    Then Verify that shipment is created for '"<customer>"' customer, '"<Division>"' Division, and '"<Logistic Group>"' Logistic Group  in TM


    Examples:
      |ROLusername  | ROLPassword  	|customer| ThisCustomer                       |pickUpOn							|deliverbyDate			|orderType		|Qty	|ItemCode	|ContainerType 	    |Description|status |OriginAddresID|DestinationAddressID|JDAusername| JDAPassword	|PlanID| WaitTime |WriteTestData |Division|Logistic Group|
      |mitulpatel   | mitulpatel 	|EMA       |Electrolux Major Appliances AMQP30 |Will be available for pickup on 	|Must be delivered by	|Outbound		|5		|240336803		|Eaches 			|	SPACER-HINGE (BLACK)	|All	|	64-RDC-UWA		|72-RDC-UWA	 		 |mpatel6	|Ryder@123!1		|1662 |20000	      |EMA_TenderAccecpted                    | EMA1         | EMA5             |

  @Regression21
  Scenario Outline: Create Shipment in ROL and process the shipment load in TM.
    Given   User is on login page of ROL website
    When 	User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
    Then 	User is on Ryder online Home page after successfull logon
    When user is navigating to create shipment page
    Then user should navigate to create shipment page successfully
    When user selects the customer from the customer drop down "<ThisCustomer>"
    Then user should be able search origin "<OriginAddresID>", destination"<DestinationAddressID>" addresses
    When user selects pickupConvention dropdown value "<pickUpOn>"
    And user enters future date for pickUp
    When user selects deliverConvention dropdown value "<deliverbyDate>"
    Then user enters future week date for delivery
    Then user enter customer order number
    When user selects OrderType dropdown value as "<orderType>"
    When user to enter shipment line items electrolux "<Qty>","<ItemCode>","<Description>" and select "<ContainerType>"
    Then user must be navigated to confirmation page
    And user must click submit button on confirmation page
    Then user must verify the Unique Shipment Number
    When user click on button RyderEntrySummary
    Then user select status value from dropdown as "<status>"
    Then user must click on SEARCH button to search the unique shipment number
    Then user must logoff RyderEntry
    Then user must login to new jda environment successfully using "<JDAusername>","<JDAPassword>"
    Then click on shipment processing then click on shipments link and Search shipment as per Unique Number
    Then Verify that shipment is created for '"<customer>"' customer, '"<Division>"' Division, and '"<Logistic Group>"' Logistic Group  in TM
    Then User clicks on load build link and navigate to work with plan to select "<PlanID>" under Plan.
    Then Navigate to shipment not attached under load build and attach to current plan
    Then User navigate to load build, work with plan, shipments then Unassigned shipment
    Then search with shipment number and select that shipment ancd click on assign to new load

    Examples:
      |ROLusername  | ROLPassword  	|customer | ThisCustomer                       |pickUpOn							|deliverbyDate			|orderType		|Qty	|ItemCode	|ContainerType 	    |Description|status |OriginAddresID|DestinationAddressID|JDAusername| JDAPassword	|PlanID| WaitTime |WriteTestData |Division|Logistic Group|
      |mitulpatel   | mitulpatel 	|EMA        |Electrolux Major Appliances AMQP30 |Will be available for pickup on 	|Must be delivered by	|Outbound		|5		|240336803		|Eaches 			|	SPACER-HINGE (BLACK)	|All	|	41-RDC-UWA		|0070080101	 		 |mpatel6	|Ryder@123!1		|1662 |20000	      |EMA_TenderAccecpted                    | EMA1         | EMA5             |

  @Regression3
  Scenario Outline: 10 Web portal shipment upload
    Given   User is on login page of ROL website
    When User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
    Then User is on Ryder online Home page after successfull logon
    When user selects the customer from the customer drop down "<ThisCustomer>"
    When User navigate to SHIPMENT UPLOAD page
    Then User clicks on Choose file button and selects the file to upload for "<customer>" Customer and click Upload button
    Then User gets successful message and unique shipment number is displayed
    When User navigate to SHIPMENT SUMMARY page
    Then user select status value from dropdown as "<status>"
    Then User enters "<Unique Shipment Number>" as Unique Shipment Number
    Then user must click on SEARCH button to search the unique shipment number
    Then user must logoff RyderEntry
    Then user must login to new jda environment successfully using "<JDAusername>","<JDAPassword>"
    Then click on shipment processing then click on shipments link and Search shipment as per Unique Number
    Then Verify that shipment is created for '"<customer>"' customer, '"<Division>"' Division, and '"<Logistic Group>"' Logistic Group  in TM


    Examples:
      |ROLusername | ROLPassword  	|customer |ThisCustomer					      |status| Unique Shipment Number|JDAusername| JDAPassword	|PlanID| WaitTime |WriteTestData |Division|Logistic Group|
      |mitulpatel 	| mitulpatel 	|EMA      |Electrolux Major Appliances AMQP30 |All  |              |mpatel6	|Ryder@123!1		|1662 |20000	      |EMA_TenderAccecpted                    | EMA1         | EMA5             |

  @Regression4
  Scenario Outline: Validate general availability of the screens in ROL for the customer: Shipment Summary
    Given   User is on login page of ROL website
    When User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
    Then User is on Ryder online Home page after successfull logon
    When user selects the customer from the customer drop down "<ThisCustomer>"
    When User navigate to SHIPMENT SUMMARY page
    Then User enters "<Submitter>" as Submitter
    Then User enters "<Unique Shipment Number>" as Unique Shipment Number
    Then user select status value from dropdown as "<status>"
    Then user must click on SEARCH button to search the unique shipment number, Verify "<status>" as status and capture load number

    Examples:
      |ROLusername  | ROLPassword  	|status             |ThisCustomer					    |Submitter  |Unique Shipment Number |LoadNo|ASP Number|
      |mitulpatel   | mitulpatel 	|All	            |Electrolux Major Appliances AMQP30 |mitulpatel |                       |76889 |           |
      |mitulpatel 	| mitulpatel 	|PENDING_BOL_PRINT  |Electrolux Major Appliances AMQP30 |           |126699                 |76889 |           |
      |mitulpatel 	| mitulpatel 	|PENDING_BOL_PRINT  |Electrolux Major Appliances AMQP30 |mitulpatel |126699                 |76889 |           |


  @Regression4
  Scenario Outline: Validate general availability of the screens in ROL for the customer: Shipment search
    Given   User is on login page of ROL website
    When User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
    Then User is on Ryder online Home page after successfull logon
    When user selects the customer from the customer drop down "<ThisCustomer>"
    When User navigate to SHIPMENT page
    Then User enters Shipment Number "<ShipmentNumber>"
    Then User enters ASP or Customer OrderNumber "<ASPNo>"
    Then User clicks on search button and verify Shipment number present in result


    Examples:
      |ROLusername | ROLPassword  	|ThisCustomer					    |LoadNo|ShipmentNumber|ASPNo  |
      |mitulpatel 	| mitulpatel 	|Electrolux Major Appliances AMQP30 |76889 |2023288975    |       |
      |mitulpatel 	| mitulpatel 	|Electrolux Major Appliances AMQP30 |76889 |              |20190918 |
      |mitulpatel 	| mitulpatel 	|Electrolux Major Appliances AMQP30 |76889 |2023288975    |20190918 |

  @Regression4
  Scenario Outline: Validate general availability of the screens in ROL for the customer: Load search
    Given   User is on login page of ROL website
    When User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
    Then User is on Ryder online Home page after successfull logon
    When user selects the customer from the customer drop down "<ThisCustomer>"
    When User navigate to Load search page
    Then User enters Load number "<LoadNo>" details for search
    Then User enters ASP or Customer OrderNumber "<ASPNo>"
    Then User clicks on search button and verify load number present in result

    Examples:
      |ROLusername | ROLPassword  	|ThisCustomer					    |Unique Shipment Number |LoadNo|ShipmentNumber|ASPNo|
      |mitulpatel 	| mitulpatel 	|Electrolux Major Appliances AMQP30 |26703                  |76889 |              |20190918     |


  @Regression4
  Scenario Outline: Validate general availability of the screens in ROL for the customer: Carrier dashboard
    Given   User is on login page of ROL website
    When User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
    Then User is on Ryder online Home page after successfull logon
    When user selects the customer from the customer drop down "<ThisCustomer>"
    When User navigate to Carrier Dashboard search page
    Then User enters Load number "<LoadNo>" details for search
    Then User selects 'All Stops' checkbox
    Then User clicks on search button and verify load number present in carrier dashboard result
    When User navigate to Tender Dashboard search page


    Examples:
      |ROLusername | ROLPassword  	|status             |ThisCustomer					    |Submitter  |Unique Shipment Number |LoadNo|ShipmentNumber|ASP Number|
      |mitulpatel 	| mitulpatel 	|PENDING_BOL_PRINT  |Electrolux Major Appliances AMQP30 |mitulpatel |126703                 |76889 |   |  |

  @Regression4
  Scenario Outline: Validate general availability of the screens in ROL for the customer: Tender dashboard
    Given   User is on login page of ROL website
    When User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
    Then User is on Ryder online Home page after successfull logon
    When user selects the customer from the customer drop down "<ThisCustomer>"
    When User navigate to Tender Dashboard search page


    Examples:
      |ROLusername | ROLPassword  	|status             |ThisCustomer					    |Submitter  |Unique Shipment Number |LoadNo|ShipmentNumber|ASP Number|
      |mitulpatel 	| mitulpatel 	|PENDING_BOL_PRINT  |Electrolux Major Appliances AMQP30 |mitulpatel |126703                 |76913 |   |  |
