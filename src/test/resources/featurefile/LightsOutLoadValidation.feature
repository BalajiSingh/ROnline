@web
@LightsOutEMA
Feature: Validate Load as part of Lights Out in RCT

#Scenario Outline: User must validate that the shipment is tied with the load
#	Given User was asked to create shipment in RCT channel
#    When User Enters User ID,Password in RCT as "<RCTusername>","<RCTPassword>" and clicks Login button
#    Then User is on Ryder Control Tower Home page after successfull logon
#    When user must verify selected customer "<customer>" 
#    Then user selects "<ThisCustomer>" from list of options
#    When user navigates to Shipping Tab and choose Create Shipment option
#    Then user is selecting manual option to navigate to Create Manual shipment 
#    Then user should be able search origin "<OriginLocationID>"  
#    Then user should be able to search for destination "<DestLocationID>" 
#    When user selects Preferred Pick Up Date dropdown value "<pickUpDate>" 
#   	And  user enters future Preferred delivery date for "<DeliveryDate>" 
#   	Then user select "<BillingType>" as PRE_PAID freight Terms
#   	Then References must be entered any random characters
#   	Then click on submit to enter shipping and Handling Unit details
#   	Then select Container Type from dropdown on Handling Unit details page
#   	|Carton| 
#   	And  Freigth Class value need to be "<FreightClassValue>"
#   	Then weigth is necessary in Dimesions section of about "<weight>" pounds 
#   	Then click on save to navigate back to create manual shipment page
#   	Then click on submit button
#   	Then If Address Validation pops up then click on Accept button for origin and destination
#   	Then user navigates to Shipment Submitted page with shipment number 
##	Given shipment is already existing and i have a shipment number
##	When  User navigates to shipment Trancking to search shipment
##	Then  user should be able to view the shipment
##	Then  user go to details and by clicking on loads to verify load number
##	Then  user basically should verify fields which should not be null
##	Then user to to handling unit qunty, length, width, height volume weight freight class
#
#Examples:
#   |RCTusername | RCTPassword  	|customer	|ThisCustomer	|	OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|	FreightClassValue|weight	|JDAusername| JDAPassword|
#   |mitulpatel 	| mitulpatel 		|Ryd		|Ryder Test		|RYDGEN3				|		RYDGENDC	|	1			|	0				|	PRE_PAID	| 55				 |5000		|RYDADMIN	|RYDADMIN	 |
#
#
#
#Scenario Outline: posting events
#	Given   User is on login page of ROL website
#    When 	User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
#    Then 	User is on Ryder online Home page after successfull logon
#     When user is navigating to create shipment page
#    Then user should navigate to create shipment page successfully
#    When user selects the customer from the customer drop down "<ThisCustomer>"
#    Then user should be able search origin "<OriginAddresID>", destination"<DestinationAddressID>" addresses
#    When user selects pickupConvention dropdown value "<pickUpOn>"
#   And user enters future date for pickUp
#   When user selects deliverConvention dropdown value "<deliverbyDate>"
#   Then user enters future week date for delivery
#    When user selects OrderType dropdown value as "<orderType>"
#	When user adds shipmemt line items
#	|Qty	|totalWeight	|ContainerType 	    |
#	|5		|5000			|Carton 			|
#	Then user must enter customer order number "<customerOrderNumber>"
#   Then user must be navigated to confirmation page
#   And user must click submit button on confirmation page
#   Then user must verify the Unique Shipment Number
#   When user click on button RyderEntrySummary
#   Then user select status value from dropdown as "<status>"
#   Then user must click on SEARCH button to search the unique shipment number 
##	Given having a load number 
#	When transportation track load and search the load 
#	Then go to load detail "<ThisCustomer>","<customer>" 
#	Then add Edit Appointments navigates to Dashboard/Appointment Update page
#	Then add pick up and Delivery
#	Then goto add events submit then goto 
#	Then for origin x3,AF, enter time "<pickUpDate>"
#	Then for destination X1,d1 "<DeliveryDate>"
#	Then  for load verify the load events
#	Then print BOL, show pdf document to view
#	Then verify all STOPS in details of load 
#	Then VERIFY THE fbap EXTRACT IS SENT IN TRANSACTION HISOTRY
#	Then user must logoff RyderEntry
#Examples: 
#   |ROLusername | ROLPassword  	|pickUpOn							|deliverbyDate			|orderType		|costCenter	|generalLedger		|Load	|commodity	|ItemCode	|Description|status |TMUserID		|TMPwd		|customer|OriginAddresID|DestinationAddressID|Approver			 |customerOrderNumber	|ThisCustomer	|pickUpDate	|	DeliveryDate	|
#   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Inbound		|105011000	|500200				|1		|General	|1			|test1		|All	|mitulpatel		|mitulpatel	|RYD	 |	RYDGEN3		|RYDGENDC	 		 |GUSTAVO GUTIERREZ  |12345					|Ryder Test		|1			|	1				|
#
#   
#   Scenario Outline: Create RYD shipment in RCT
#	Given User was asked to create shipment in RCT channel
#    When User Enters User ID,Password in RCT as "<RCTusername>","<RCTPassword>" and clicks Login button
#    Then User is on Ryder Control Tower Home page after successfull logon
#    When user must verify selected customer "<customer>" 
#    Then user selects "<ThisCustomer>" from list of options
#    When user navigates to Shipping Tab and choose Create Shipment option
#    Then user is selecting manual option to navigate to Create Manual shipment 
#    Then user should be able search origin "<OriginLocationID>"  
#    Then user should be able to search for destination "<DestLocationID>" 
#    When user selects Preferred Pick Up Date dropdown value "<pickUpDate>" 
#   	And  user enters future Preferred delivery date for "<DeliveryDate>" 
#   	Then user select "<BillingType>" as PRE_PAID freight Terms
#   	Then References must be entered any random characters
#   	Then click on submit to enter shipping and Handling Unit details
#   	Then select Container Type from dropdown on Handling Unit details page
#   	|Carton| 
#   	And  Freigth Class value need to be "<FreightClassValue>"
#   	Then weigth is necessary in Dimesions section of about "<weight>" pounds 
#   	Then click on save to navigate back to create manual shipment page
#   	Then click on submit button
#   	Then If Address Validation pops up then click on Accept button for origin and destination
#   	Then user navigates to Shipment Submitted page with shipment number 
#   Then user is logged off from RCT channel
#   Given   User is on login page of ROL website
#    When 	User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
#    Then 	User is on Ryder online Home page after successfull logon
#    When transportation track load and search the load
#	Then go to load detail "<ThisCustomer>","<customer>"
#	Then add Edit Appointments navigates to Dashboard/Appointment Update page
#	Then add pick up and Delivery
#	Then goto add events submit then goto 
#	Then for origin x3,AF, enter time "<pickUpDate>"
#	Then for destination X1,d1 "<DeliveryDate>"
#	Then  for load verify the load events
#	Then print BOL, show pdf document to view
#	Then verify all STOPS in details of load 
#	Then VERIFY THE fbap EXTRACT IS SENT IN TRANSACTION HISOTRY
#	Then user must logoff RyderEntry
#   Examples:
#   |RCTusername | RCTPassword  	|customer	|ThisCustomer				|OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|	FreightClassValue|weight	|JDAusername| JDAPassword|ROLusername   | ROLPassword  	|
#   |mitulpatel 	| mitulpatel 		|gmlcm		|Ryder Test					|RYDGEN3			|		RYDGENDC	|	1			|	1				|	PRE_PAID	| 55				 |5000		|RYDADMIN	|RYDADMIN	 |mitulpatel 		| mitulpatel 		|
#   |mitulpatel 	| mitulpatel 		|gmlcm		|Electrolux Major Appliances|64-RDC-UWA			|		72-RDC-UWA	|	1			|	1				|	Prepaid		| 55				 |5000		|RYDADMIN	|RYDADMIN	 |mitulpatel 		| mitulpatel 		|
   
   @ROLEMA
   Scenario Outline: Create shipment for EMA customer
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
   Examples:
   |ROLusername | ROLPassword  	|pickUpOn							|deliverbyDate			|orderType		|costCenter	|generalLedger		|Load	|commodity	|Qty	|ItemCode	|ContainerType 	    |Description|status |TMUserID		|TMPwd		|customer|OriginAddresID|DestinationAddressID|Approver			 |ThisCustomer						|
#   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Outbound		|105011000	|500200				|1		|General	|5		|5000		|Eaches 			|	ABCD	|All	|mitulpatel		|mitulpatel	|EMA	 |64-RDC-UWA	|72-RDC-UWA	 		 |GUSTAVO GUTIERREZ  |Electrolux Major Appliances|
#   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Inbound		|105011000	|500200				|1		|General	|10		|240336803		|Eaches 			|	SPACER-HINGE (BLACK)	|All	|mitulpatel		|mitulpatel	|EMA	 |64-RDC-UWA	|72-RDC-UWA	 		 |GUSTAVO GUTIERREZ  |Electrolux Major Appliances AMQP19|

#   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Outbound		|105011000	|500200				|1		|General	|5		|5000		|Eaches 			|	ABCD	|All	|mitulpatel		|mitulpatel	|EMA	 |64-RDC-UWA	|72-RDC-UWA	 		 |GUSTAVO GUTIERREZ  |Electrolux Major Appliances|
   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Inbound		|105011000	|500200				|1		|General	|10		|240336803		|Eaches 			|	SPACER-HINGE (BLACK)	|All	|mitulpatel		|mitulpatel	|EMA	 |64-RDC-UWA	|72-RDC-UWA	 		 |GUSTAVO GUTIERREZ  |Electrolux Major Appliances AMQP30|

  @RCTEMA
    Scenario Outline: User should able to create shipment for EMA customer
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
   	Examples:
   |RCTusername | RCTPassword  	|customer	|ThisCustomer					|	OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|OrderType	|EquipmentType	|weight	|JDAusername| JDAPassword	|ItemCode  | ItemDescription      | ItemQuantity | ItemWeight |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|64-RDC-UWA				|72-RDC-UWA 		|	1			|	0				|Prepaid		|Inbound	| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |
   