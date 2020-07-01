@web
Feature: Create Shipment for Wave1 Customers

@ALS
Scenario Outline: User should able to create shipment for ALSTOM customer
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
#   	Then user select "<BillingType>" as PRE_PAID freight Terms
   	Then Order Type must be selected "<OrderType>"
   	Then PO Number must be entered
   	Then user should select "<EquipmentType>" equipment type
   	Then user selects Hazmat value "<Hazmat>"
   	Then click on submit to enter shipping and Handling Unit details
   	Then select Container Type from dropdown on Handling Unit details page
   	|Carton|
   	Then weigth is necessary in Dimesions section of about "<weight>" pounds
   	Then click on save to navigate back to create manual shipment page
   	Then click on submit button
   	Then If Address Validation pops up then click on Accept button for origin and destination
   	Then user navigates to Shipment Submitted page with shipment number
  	When  User navigates to shipment Trancking to search shipment
	Then  user should be able to view the shipment
#	Then  user go to details and by clicking on loads to verify load number
#	Then  user basically should verify fields which should not be null
#	Then user to to handling unit qunty, length, width, height volume weight freight class
	Then user is logged off from RCT channel
#	Given   User is on login page of ROL website
#    When 	User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
#    Then 	User is on Ryder online Home page after successfull logon
#    Then user navigates to track Shipment
#    When user selects the customer from the customer drop down "<ThisCustomer>"
#    Then go to shipment detail page "<ThisCustomer>","<customer>"
Examples:
   |RCTusername | RCTPassword  	|ROLusername|ROLPassword|customer	|ThisCustomer	|	OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|OrderType	 |EquipmentType	|weight	|Hazmat|
   |mitulpatel 	| mitulpatel 		|mitulpatel 	| mitulpatel 	|Als		|Alstom			|24997					|		20208 		|	1			|	0				|	Prepaid		|Inbound Production	 | Flatbed		|5000	|N	|
   |mitulpatel 	| mitulpatel 		|mitulpatel 	| mitulpatel 	|Als		|Alstom			|24997					|		20208 		|	1			|	0				|	Prepaid		|Outbound Finished Goods	 | Flatbed		|5000	|N	|


@EMA
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
#	When  User navigates to shipment Trancking to search shipment
#	Then  user should be able to view the shipment
#	Then  user go to details and by clicking on loads to verify load number
#	Then  user basically should verify fields which should not be null
#	Then user to to handling unit qunty, length, width, height volume weight freight class

Examples:
   |RCTusername | RCTPassword  	|customer	|ThisCustomer					|	OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|OrderType	|EquipmentType	|weight	|JDAusername| JDAPassword	|ItemCode  | ItemDescription      | ItemQuantity | ItemWeight |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|0000926				|0001050519 		|	1			|	0				|Prepaid		|Inbound	| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|0070210012				|03912001 			|	1			|	0				|Prepaid		|Inbound	| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|0070210012				|03912001 			|	1			|	0				|Prepaid		|Outbound	| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|0070210012				|03912001 			|	1			|	0				|Prepaid		|Return		| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|0070210012				|03912001 			|	1			|	0				|Prepaid		|Refusal	| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|0070210012				|03912001 			|	1			|	0				|Collect		|Inbound	| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|0070210012				|03912001 			|	1			|	0				|Collect		|Outbound	| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|0070210012				|03912001 			|	1			|	0				|Collect		|Return		| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |
   |mitulpatel     | mitulpatel		|EMA		|Electrolux Major Appliances	|0070210012				|03912001 			|	1			|	0				|Collect		|Refusal	| Flatbed		|5000	|RYDADMIN	|RYDADMIN		|240336803 | SPACER-HINGE (BLACK) | 10 	         | 7500	      |



   
#   
# Scenario Outline: User should able to create shipment for IRM customer
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
#   	Then Move Type must be selected "<MoveType>" 
##   	Then Project Number must be entered
#   	Then GL Code should be selected as "<GLCode>"
#   	Then Product Line must be selected "<ProductLine>"
##   	Then Pallet Weight Volume must be entered "<TotalPallets>","<weight>","<Volume>" 
#   	Then click on submit to enter shipping and Handling Unit details
#   	Then select Container Type from dropdown on Handling Unit details page
#   	|Pallet| 
#   	Then weigth is necessary in Dimesions section of about "<weight>" pounds 
#   	Then click on save to navigate back to create manual shipment page
#   	Then click on submit button
#   	Then If Address Validation pops up then click on Accept button for origin and destination
#   	Then user navigates to Shipment Submitted page with shipment number
#   	Then user is logged off from RCT channel
##	When  User navigates to shipment Trancking to search shipment
##	Then  user should be able to view the shipment
##	Then  user go to details and by clicking on loads to verify load number
##	Then  user basically should verify fields which should not be null
##	Then user to to handling unit qunty, length, width, height volume weight freight class
#
#Examples:
#   |RCTusername | RCTPassword  	|customer	|ThisCustomer				|	OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|MoveType	 |GLCode  |ProductLine|TotalPallets |Volume	|weight	|JDAusername| JDAPassword|
#   |mitulpatel 	| mitulpatel 		|IRM		|Iron Mountain Inc			|0345501				|	0345507 		|	1			|	0				|	Prepaid		|Blue	 	 | 5300070|Shred	  |5			|50		|5000	|RYDADMIN	|RYDADMIN	 |
#     
#     
#Scenario Outline: User should able to create shipment for DIA customer
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
##   	Then user select "<BillingType>" as PRE_PAID freight Terms
#   	Then click on submit to enter shipping and Handling Unit details
#   	Then select Container Type from dropdown on Handling Unit details page
#   	|Cases| 
#   	Then weigth is necessary in Dimesions section of about "<weight>" pounds 
#   	Then click on save to navigate back to create manual shipment page
#   	Then click on submit button
#   	Then If Address Validation pops up then click on Accept button for origin and destination
#   	Then user navigates to Shipment Submitted page with shipment number
#   	Then Shipment Number must be stored in excel sheet
#   	Then user is logged off from RCT channel
##	When  User navigates to shipment Trancking to search shipment
##	Then  user should be able to view the shipment
##	Then  user go to details and by clicking on loads to verify load number
##	Then  user basically should verify fields which should not be null
##	Then user to to handling unit qunty, length, width, height volume weight freight class
#
#Examples:
#   |RCTusername | RCTPassword  	|customer	|ThisCustomer	|OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|MoveType	 |GLCode  |ProductLine|TotalPallets |Volume	|weight	|JDAusername| JDAPassword|
#   |mitulpatel 	| mitulpatel 		|DIA		|Diageo			|EC1A				|	0000246525  	|	1			|	0				|	Prepaid		|Blue	 	 | 5300070|Shred	  |5			|50		|5000	|RYDADMIN	|RYDADMIN	 |