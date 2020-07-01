# @Author : Javeed Akram Mohammed
  # @Updated: Mitul Patel
@web
Feature: Flow to create shipment in Ryder Entry Online application for specific customer.

  @BHI
   Scenario Outline: Login to Ryder Online Website with Valid Username and Password positive test
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
    When user selects OrderType dropdown value as "<orderType>"
   And user enters Cost Center Number as "<costCenter>"
   Then user selects General Ledger from dropdown as "<generalLedger>"
   And user selects Service Level and Approver from dropdown as "<Service>","<Approver>"
   Then user selects Commodity from dropdown as "<commodity>" under EXTENEDED ATTRIBUTES
   When user clicks on add/edit items button to enter "<Qty>","<totalWeight>","<ItemCode>","<Description>" and select "<ContainerType>"
   Then user must be navigated to confirmation page
   And user must click submit button on confirmation page
   Then user must verify the Unique Shipment Number
   When user click on button RyderEntrySummary
   Then user select status value from dropdown as "<status>"
   Then user must click on SEARCH button to search the unique shipment number 
   Then user must logoff RyderEntry

   Examples:
   |ROLusername | ROLPassword  	|pickUpOn							|deliverbyDate			|orderType		|costCenter	                            |generalLedger  |Service    |commodity	|Qty	|totalWeight	|ContainerType 	    |ItemCode	|Description|status |TMUserID		|TMPwd		|customer|OriginAddresID|DestinationAddressID	|Approver	  |ThisCustomer|
   |mitulpatel 	| mitulpatel 	|Will be available for pickup on 	|Must be delivered by	|Completions Tools		|370010204	|500215		    |Load	    |General	|5		|5000			|Carton 			|1			|test1		|All	|mitulpatel		|mitulpatel	|BHI	 |	I3746	|I3749			    |ADRIAN SMITH |Baker Hughes Incorporated|
   |mitulpatel 	| mitulpatel 	|Will be available for pickup on 	|Must be delivered by	|Completions Tools		|370010204	|500215		    |Express	    |General	|5		|5000			|Carton 			|1			|test1		|All	|mitulpatel		|mitulpatel	|BHI	 |	I3746	|I3749			 	|ADRIAN SMITH |Baker Hughes Incorporated|
   |mitulpatel 	| mitulpatel 	|Will be available for pickup on 	|Must be delivered by	|Completions Tools		|105011000	|500200		    |Load	    |General	|5		|5000			|Carton 			|1			|test1		|All	|mitulpatel		|mitulpatel	|BHI	 |	I3746	|I3749		 		|ADRIAN SMITH |Baker Hughes Incorporated|

  @Ryd
  Scenario Outline: submit shipment for ryd customer
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
   When Ryd user to enter shipment line items "<Qty>","<totalWeight>" and select "<ContainerType>"
   Then user must be navigated to confirmation page
   And user must click submit button on confirmation page
   Then user must verify the Unique Shipment Number
   When user click on button RyderEntrySummary
   Then user select status value from dropdown as "<status>"
   Then user must click on SEARCH button to search the unique shipment number
   Then user must logoff RyderEntry  
   Examples:
   |ROLusername | ROLPassword  	|pickUpOn							|deliverbyDate			|orderType		|costCenter	|generalLedger		|Load	|commodity	|Qty	|totalWeight	|ContainerType 	    |ItemCode	|Description|status |TMUserID		|TMPwd		|customer|OriginAddresID|DestinationAddressID|Approver			 |ThisCustomer|
   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Outbound		|105011000	|500200				|1		|General	|5		|5000			|Carton 			|			|			|All	|mitulpatel		|mitulpatel	|RYD	 |	RYDGEN3		|RYDGENDC	 		 |GUSTAVO GUTIERREZ  |Ryder Test|

  @EMA
  Scenario Outline: submit shipment for EMA customer
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
   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Outbound		|105011000	|500200				|1		|General	|5		|240336803		|Eaches 			|	SPACER-HINGE (BLACK)	|All	|mitulpatel		|mitulpatel	|EMA	 |	64-RDC-UWA		|72-RDC-UWA	 		 |GUSTAVO GUTIERREZ  |Electrolux Major Appliances AMQP30|
   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Inbound		|105011000	|500200				|1		|General	|5		|240336803		|Eaches 			|	SPACER-HINGE (BLACK)	|All	|mitulpatel		|mitulpatel	|EMA	 |	64-RDC-UWA|72-RDC-UWA	 		 |GUSTAVO GUTIERREZ  |Electrolux Major Appliances AMQP30|
   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Return			|105011000	|500200				|1		|General	|5		|240336803		|Eaches 			|	SPACER-HINGE (BLACK)	|All	|mitulpatel		|mitulpatel	|EMA	 |	64-RDC-UWA		|72-RDC-UWA	 		 |GUSTAVO GUTIERREZ  |Electrolux Major Appliances AMQP30|
   |mitulpatel 	| mitulpatel 		|Will be available for pickup on 	|Must be delivered by	|Refusal		|105011000	|500200				|1		|General	|5		|240336803		|Eaches 			|	SPACER-HINGE (BLACK)	|All	|mitulpatel		|mitulpatel	|EMA	 |	64-RDC-UWA		|72-RDC-UWA	 		 |GUSTAVO GUTIERREZ  |Electrolux Major Appliances AMQP30|


  @IRM
  Scenario Outline: submit shipment for IRM customer
    Given   User is on login page of ROL website
    When 	User Enters User ID,Password in ROL as "<ROLusername>","<ROLPassword>" and clicks on the Login button
    Then 	User is on Ryder online Home page after successfull logon
    When user is navigating to create shipment page
    Then user should navigate to create shipment page successfully
    When user selects the customer from the customer drop down "<ThisCustomer>"
    Then user should be able search origin "<OriginAddresID>", destination"<DestinationAddressID>" addresses
    When user selects MoveType dropdown value as "<MoveType>"
    When user selects ProductLine dropdown value as "<ProductLine>"
    When user selects GLCode dropdown value as "<GLCode>"
    When user enters TotalPallet value as "<TotalPallet>"
    When user enters ProjectNo value as "<ProjectNo>"
    Then user must be navigated to confirmation page
    And user must click submit button on confirmation page
    Then user must verify the Unique Shipment Number
    When user click on button RyderEntrySummary
    Then user select status value from dropdown as "<status>"
    Then user must click on SEARCH button to search the unique shipment number
    Then user must logoff RyderEntry
    Examples:
      |ROLusername | ROLPassword  	|pickUpOn				|deliverbyDate			|MoveType	|ProductLine	|GLCode		|TotalPallet	|ProjectNo	|totalWeight	|status |TMUserID		|TMPwd		|customer|  OriginAddresID  |DestinationAddressID   | ThisCustomer|
      |mitulpatel 	| mitulpatel 	|Must be picked up on 	|Must be delivered by	|Blue		|Shred	        |5300070	|1		        |	        |5000			|All	|mitulpatel		|mitulpatel	|IRM	 |	IRM1234CDRIA	|IRM1234WNDCT	 		|Iron Mountain Inc|
      |mitulpatel 	| mitulpatel 	|Must be picked up on 	|Must be delivered by	|Return		|Mixed	        |5300070	|1		        |	        |5000			|All	|mitulpatel		|mitulpatel	|IRM	 |	IRM1234CDRIA	|IRM1234WNDCT	 		|Iron Mountain Inc|
      |mitulpatel 	| mitulpatel 	|Must be picked up on 	|Must be delivered by	|Diversion	|Plastics       |5300070	|1		        |	        |5000			|All	|mitulpatel		|mitulpatel	|IRM	 |	IRM1234CDRIA	|IRM1234WNDCT	 		|Iron Mountain Inc|
      |mitulpatel 	| mitulpatel 	|Must be picked up on 	|Must be delivered by	|Project	|Shred	        |5300090	|1		        |12345	    |5000			|All	|mitulpatel		|mitulpatel	|IRM	 |	IRM1234CDRIA	|IRM1234WNDCT	 		|Iron Mountain Inc|


#   #AMQP19|


#Origin Address ID =0000100023
#Origin Address Name =B&W METALS-0000100023
#Origin Address Line1 =11503 BRITTMOORE PARK DR
#Origin Address Line 2
#City & State/Province:HOUSTON, Texas
#Country: USA
#Origin Postal Code:77041
#Origin Contact Name:CONTACT
#Origin Contact Phone:713 466 9878, 
#Time zone = CT/ET or anyother
#Save Address As Default: checkbox selected
#0000101235
#    Destination Address ID : = 123
#Destination Address Name: =QUALITY CARGO PACKING INC 10026285
#Destination Address Line : styey
#City & State/Province:Grpevine, Texas
#Country:USA
#Destination Postal Code:71623
#Destination Contact Name:mmo
#Destination Contact Phoneguiti
#Time Zone:CT
#Save Address As Default:checkbox selected