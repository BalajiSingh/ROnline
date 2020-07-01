# @Author : Javeed Akram Mohammed
@web
Feature: Ryder Control Tower Online application 
 @RYD
 Scenario Outline: Create Shipment for RYD customer in Ryder Control Tower UI
#    Given User was asked to create shipment in RCT channel
#    When User Enters User ID,Password in RCT as "<RCTusername>","<RCTPassword>" and clicks Login button
#    Then User is on Ryder Control Tower Home page after successfull logon
#    When user must verify selected customer "<customer>"
#    Then user selects "<ThisCustomer>" from list of options
#    When user navigates to Shipping Tab and choose Create Shipment option
##    Then user is selecting manual option to navigate to Create Manual shipment
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
#   	Then user is logged off from RCT channel
#   	Then user must login to new jda environment successfully using "<JDAusername>","<JDAPassword>"
#	When user processing shipment in TM System
#	Then shipment should be processed succesfully to Tender Accept status
   	Then user must login to new jda environment successfully using "<JDAusername>","<JDAPassword>"
   	Then click on shipment processing then click on shipments link
   	Then user searches for shipment under shipment processing shipments link
   	Then inside Shipment ID text field enter shipment number to search then click on search button next to it
#   	Then shipment must be available
#   	Then go to load build click in load build then work with plan then click on plans
#   	Then plan must be selected then navigate to shipment not attached under load build
#   	Then search for shipment which needs to be attached, select the shipment to attach to current plan
#    Then Shipment legs for Shipment 206972137 attached to plan 1122. message should be displayed
#    Then go to load build then go to work with plan then shipments then UNassigned shipment
#    Then search with shipment number and select that shipment ancd click on assign to new load
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
  Examples: 
   |RCTusername | RCTPassword  	|customer	|ThisCustomer	|OriginLocationID	|DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|	FreightClassValue|weight	|JDAusername| JDAPassword|
   |mitulpatel 	| mitulpatel 	|Ryd		|Ryder Test	|RYDGENDC			|RYDGENDC1	|	1			|	0				|	PRE_PAID	| 55				 |5000		|RYDADMIN	|RYDADMIN	 |
#   |mjakram 	| mjakram 		|Ryd		|Ryder Test		|RYDGEN3				|		RYDGENDC1	|  nextWeek		|		nextWeek	|	PRE_PAID	| 55				 |5000		|RYDADMIN	|RYDADMIN	 |

@DOM
  Scenario Outline: Create Shipment for Domtar customer in Ryder Control Tower UI
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
    When user selects Must Pick up On Option
    And  user enters future Must Deliver By Option
    Then user select "<BillingType>" as PRE_PAID freight Terms
    Then References must be entered any random characters
    Then click on submit to enter shipping and Handling Unit details
    Then select Container Type from dropdown on Handling Unit details page
      |Carton|
#    And  Freigth Class value need to be "<FreightClassValue>"
    Then weigth is necessary in Dimesions section of about "<weight>" pounds
    Then click on save to navigate back to create manual shipment page
    Then click on submit button
    Then If Address Validation pops up then click on Accept button for origin and destination
    Then user navigates to Shipment Submitted page with shipment number
    Then user is logged off from RCT channel

    Examples:
      |RCTusername | RCTPassword  	|customer	|ThisCustomer	|	OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|weight	|
      |mitulpatel   |mitulpatel 	|DOM		|Domtar		    |DOM846623				|DOM840338	        |	1			|	0				|	Prepaid	|5000		|


  @VZN
  Scenario Outline: Create Shipment for Verizon customer in Ryder Control Tower UI
      Given User was asked to create shipment in RCT channel
      When User Enters User ID,Password in RCT as "<RCTusername>","<RCTPassword>" and clicks Login button
      Then User is on Ryder Control Tower Home page after successfull logon
      When user must verify selected customer "<customer>"
      Then user selects "<ThisCustomer>" from list of options
      When user navigates to Shipping Tab and choose Create Shipment option
#      Then user is selecting manual option to navigate to Create Manual shipment
      Then user should be able search origin "<OriginLocationID>"
      Then user should be able to search for destination "<DestLocationID>"
      When user selects Preferred Pick Up Date dropdown value "<pickUpDate>"
      And  user enters future Preferred delivery date for "<DeliveryDate>"
      Then user select "<BillingType>" as PRE_PAID freight Terms
      Then References must be entered any random characters
      Then user select "<ORDERTYPE>" as Order Type for Reference
      Then user select "<PRODUCT_VALUE>" as Product Value for Reference
      Then user select "<EMAIL_ADDRESS>" as Email Address for Reference
      Then user select "<PROJECT_NUMBER>" as Project Number Reference
      Then user select "<MOVEMENT_TYPE>" as Movement Type for Reference
      Then user select "<TRANSFER_NUMBER>" as Transfer Number for Reference
      Then user select "<TOTAL_PALLET_POSITIONS>" as Total Pallet Positions for Reference
      Then user select "<REQUESTER_NAME>" as Requester Name for Reference
      Then click on submit to enter shipping and Handling Unit details
      Then select Container Type from dropdown on Handling Unit details page
        |Pallet|
      And  Freigth Class value need to be "<FreightClassValue>"
      Then weigth is necessary in Dimesions section of about "<weight>" pounds
      Then click on save to navigate back to create manual shipment page
      Then click on submit button
      Then If Address Validation pops up then click on Accept button for origin and destination
      Then user navigates to Shipment Submitted page with shipment number
      Then user is logged off from RCT channel

      Examples:
      |RCTusername | RCTPassword  	|customer	|ThisCustomer	|OriginLocationID	|DestLocationID	|	pickUpDate	|	DeliveryDate	|BillingType |ORDERTYPE |PRODUCT_VALUE|EMAIL_ADDRESS          |PROJECT_NUMBER|TRANSFER_NUMBER|MOVEMENT_TYPE|TOTAL_PALLET_POSITIONS|REQUESTER_NAME|FreightClassValue|weight	|
      |mitulpatel 	| mitulpatel 	|VZN		|Verizon		|213795				|VZN255999     	|	1			|	0				|Prepaid	 |Outbound  |123   |MITUL_PATEL@RYDER.COM  |123      |               |Direct to Ship |1                  |MITUL PATEL  | 100       	|5000		|
      |mitulpatel 	| mitulpatel 	|VZN		|Verizon		|213795				|VZN255999     	|	1			|	0				|Prepaid	 |Transfer  |             |                       |              |  TR001        |               |1                  |MITUL PATEL  | 100       	|5000		|
      |mitulpatel 	| mitulpatel 	|VZN		|Verizon		|213795				|VZN255999     	|	1			|	0				|Prepaid	 |Return    |             |MITUL_PATEL@RYDER.COM  |              |               |               |1                  |MITUL PATEL  | 100       	|5000		|


@IRM
Scenario Outline: Create Shipment for IRM -Iron Mountain Inc customer in Ryder Control Tower UI
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
  Then References must be entered any random characters
  Then user select "<MOVE_TYPE>" as Move Type for Reference
  Then user select "<GLCode>" as GL Code Value for Reference
  Then user select "<ProductLine>" as Product Line for Reference
  Then Project Number "<PROJECT_NUMBER>" must be entered
  Then click on submit to enter shipping and Handling Unit details
  Then select Container Type from dropdown on Handling Unit details page
    |Pallet|
#    And  Freigth Class value need to be "<FreightClassValue>"
  Then weigth is necessary in Dimesions section of about "<weight>" pounds
  Then click on save to navigate back to create manual shipment page
  Then click on submit button
  Then If Address Validation pops up then click on Accept button for origin and destination
  Then user navigates to Shipment Submitted page with shipment number
  Then user is logged off from RCT channel

  Examples:
    |RCTusername | RCTPassword  	|customer	|ThisCustomer	    |OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|weight	|MOVE_TYPE  |GLCode       |ProductLine  |PROJECT_NUMBER|
    |mitulpatel   |mitulpatel 	    |IRM		|Iron Mountain Inc	|IRM1234CDRIA		|IRM1234WNDCT	    |	0			|	0				|	Prepaid	|5000		| Blue      | 5300070     |Shred        |         |
    |mitulpatel   |mitulpatel 	    |IRM		|Iron Mountain Inc	|IRM1234CDRIA		|IRM1234WNDCT	    |	1			|	0				|	Collect	|5000		| Return    | 5300070     |Pill Bottles |         |
    |mitulpatel   |mitulpatel 	    |IRM		|Iron Mountain Inc	|IRM1234CDRIA		|IRM1234WNDCT	    |	1			|	0				|	Prepaid	|5000		| Diversion | 5300070     |Plastics     |         |
    |mitulpatel   |mitulpatel 	    |IRM		|Iron Mountain Inc	|IRM1234CDRIA		|IRM1234WNDCT	    |	1			|	0				|	Collect	|5000		| Project   | 5300090     |E-Waste      |12345         |


  @DIA
  Scenario Outline: Create Shipment for DIA - Diageo ustomer in Ryder Control Tower UI
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
    Then References must be entered any random characters
    Then click on submit to enter shipping and Handling Unit details
    Then select Container Type from dropdown on Handling Unit details page
      |Cases|
#    And  Freigth Class value need to be "<FreightClassValue>"
    Then weigth is necessary in Dimesions section of about "<weight>" pounds
    Then click on save to navigate back to create manual shipment page
    Then click on submit button
    Then If Address Validation pops up then click on Accept button for origin and destination
    Then user navigates to Shipment Submitted page with shipment number
    Then user is logged off from RCT channel

    Examples:
      |RCTusername | RCTPassword  	|customer	|ThisCustomer	    |OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|weight	|MOVE_TYPE|GLCode|ProductLine|
      |mitulpatel   |mitulpatel 	    |DIA		|Diageo	|RY1		|FL1A	    |	1			|	0				|	Prepaid	|5000		| Blue    | 5300090     |Shred                      |

  @CASTemp
  Scenario Outline: Create Shipment for DIA - Diageo ustomer in Ryder Control Tower UI
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
    Then user select "<BUNDLE_CODE>" as BUNDLE CODE
    Then Order Type must be selected "<OrderType>"
    Then user select "<COMPANYCODE>" as COMPANY CODE
    Then user select "<SALES_PURCHASING_ORGANIZATION>" as SALES PURCHASING ORGANIZATION
    Then user select "<SHIPPING_CONDITION>" as SHIPPING CONDITION
    Then user select "<EQUIPMENT_CODE_SAP>" as EQUIPMENT CODE SAP

    Then click on submit to enter shipping and Handling Unit details
    Then select Container Type from dropdown on Handling Unit details page
      |Cases|
#    And  Freigth Class value need to be "<FreightClassValue>"
    Then weigth is necessary in Dimesions section of about "<weight>" pounds
    Then click on save to navigate back to create manual shipment page
    Then click on submit button
    Then If Address Validation pops up then click on Accept button for origin and destination
    Then user navigates to Shipment Submitted page with shipment number
    Then user is logged off from RCT channel

    Examples:
      |RCTusername | RCTPassword  	|customer	|ThisCustomer	    |OriginLocationID	|	DestLocationID	|	pickUpDate	|	DeliveryDate	|	BillingType	|weight	|BUNDLE_CODE|OrderType          |COMPANYCODE                    |SALES_PURCHASING_ORGANIZATION|SHIPPING_CONDITION|EQUIPMENT_CODE_SAP|
      |mitulpatel  |mitulpatel 	    |CAS		|Cascades	        |C9945		        |C9912	            |	1			|	0				|	Prepaid	    |5000		| 12345 | Outbound (DN)     |1000 - Cascades Groupe Tissu-CA|097 - Cascades Groupe Tissu-CA                      |02-Full Truck Load                  |DRYBOX 2 AXLES 53' - 4500002-53DV                  |
