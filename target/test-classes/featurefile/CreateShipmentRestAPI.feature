# @Author : Javeed Akram Mohammed 
@Api
@CreateShipment
Feature: Create Shipment Rest API scenarios

Scenario Outline: As a user I want to validate with positive scenarios that I am getting Successful as response for customer NGX and also validate the results from Create Shipment with valid parameters
Given As a Tester I have the API URL "<url>" 
When  Tester must send required parameters in the POST request API  with JSON request sample as 
And   Call the POST request 
Then  I should get "<status>" in the response 
Examples: 
|status|   
|200 |

#Examples:
#Scenario Outline:
  @NGX
Scenario: As Business Owner my NGX customer REST API should Create Shipment with below parameters
Given NGX Customer Rest API JSON payload provided to tester 
When  NGX customer specific JSON payload with below listed parameters data
  |customerNumber	|
  |NGX			|
#|customerNumber	|userId |type  |status|freightTerms |totalskIds|FrmLocUseCode|FrmLocCode|FrmLocName		 |FrmAddrs				|FrmCity|FrmSau |FrmCntry|FrmPostlCode|FrmFstName 	|FrmPhNum	    |ToLocUseCode|ToLocCode |ToLocName            |ToAddrs				|ToCity	  |ToSau|ToCntry|ToPostlCode |ToFstName |ToPhNum	|RefQulSID	|RefQulSIDVal|RefQul9V|RefQul9VVal|RefQulSEC|RefQulSECVal|RefQul12|RefQul12Val|RefQulGL |RefQulGLVal|RefQulSLI|RefQulSLIVal|RefQulCCNM|RefQulCCNMVal|RefLMFT|RefLMFTVal|HandUnitTypNum|ExtHandUnitNum|Qty|MesureLength|MesureWidth|MesureHeight|MesureDimUOM|MesureWeight|MesureWeightUOM|MesureVolUOM|RefQulDDSC|RateCarrierNum|Rank|RateSource|TransportMode|TotalCharge	|ServiceCode|acctNum	|Selected|ValidForDate|ValidForSelectServ|RatePurpose|transitDays|
#|NGX			|mitulpatel|manual|open  |PRE_PAID		|1		   |19			 |306618581 |Northrop Grumman|11751 MEADOWVILLE LN	|CHESTER|VA		|USA	 |23836-6315  |oneVal		|1952524973		|20			 |0090028125|JACKSON AEROSPACE INC|460 E ROSECRANS AVE	|GARDENA  |CA	|USA	|90248-2023  |test	    |2342423444 |SID		|mitulpatel	 |9V	  |PRE_PAID	  |SEC		|ES	   		 |12	  |Indirect	  |GL 		|5300085 	|SLI	  |444  	   |CCNM	  |33		    |LMFT	|PDF	   |BOX			  |1			 |1	 |2			  |2		  |2		   |IN			|12			 |LB			 |CU FT		  |231		 |FDE			|1	 |PRA		|PARCEL		  |43.7600		|1AR		|510159020	|true	 |true		  |true				 |EXECUTION  |1		     |
#|NGX			|mitulpatel|manual|open  |PRE_PAID		|1		   |19			 |306618581 |Northrop Grumman|11751 MEADOWVILLE LN	|CHESTER|VA		|USA	 |23836-6315  |oneVal		|1952524973		|20			 |0090028125|JACKSON AEROSPACE INC|460 E ROSECRANS AVE	|GARDENA  |CA	|USA	|90248-2023  |test	    |2342423444 |SID		|mitulpatel	 |9V	  |PRE_PAID	  |SEC		|ES	   		 |12	  |Indirect	  |GL 		|5300085 	|SLI	  |444  	   |CCNM	  |33		    |LMFT	|PDF	   |BOX			  |1			 |1	 |2			  |2		  |2		   |IN			|12			 |LB			 |CU FT		  |231		 |FDE			|1	 |PRA		|PARCEL		  |43.7600		|1AR		|510159020	|true	 |true		  |true				 |EXECUTION  |1		     |
And   Tester should submit payload as POST call to create a new shipment  
Then  Tester must check success status code, response time
Then  Tester validate external shipment in database


#Scenario Outline:
 @CAS
Scenario:  As Business Owner my CAS customer REST API should Create Shipment with below parameters
Given CAS Customer Rest API JSON payload provided to tester 
When   CAS customer specific JSON payload with below listed parameters data
  |customerNumber	|
  |CAS			|
#  |customerNumber	|userId |type  |status|freightTerms |mvolumeUOM |totalskIds|FrmLocUseCode|FrmLocCode	|FrmLocName		 			|FrmAddrs				|FrmCity|FrmSau |FrmCntry|FrmPostlCode|FrmFstName 					|FrmPhNum		|ToLocUseCode|ToLocCode |ToLocName            		|ToAddrs				|ToCity	   |ToSau|ToCntry|ToPostlCode |ToFstName 				|ToPhNum	  	|RefQulSID	|RefQulSIDVal|RefQulTPPS|RefQulTPPSVal|RefQulSRVC	|RefQulSRVCVal  |RefQulFS|RefQulFSVal|RefQulS2 |RefQulS2Val|RefQul8X|RefQul8XVal|RefQulDP |RefQulDPVal |RefQulSM|RefQulSMVal|RefQul3M|RefQul3MVal|RefQulEQP1|RefQulEQP1Val|RefQulCNCY|RefQulCNCYVal|RefQulGSA|RefQulGSAVal|RefQul1O|RefQul1OVal|HandUnitTypNum|ExtHandUnitNum|Qty	 |MesureLength|MesureWidth|MesureHeight|MesureDimUOM|MesureWeight|MesureWeightUOM|MesureVolUOM|RefQulDDSC|RateCarrierNum|Rank|RateSource|TransportMode|TotalCharge	|ServiceCode|acctNum	|Selected|ValidForDate|ValidForSelectServ|RatePurp|transitDays|
#|CAS			|mitulpatel|manual|DRAFT |NULL		    |CUFT		|1		   |19			 |097C-61889 	|JEAN COUTU (133)-097C-61889|325 SHERBROOKE			|MAGOG  |QC		|CAN	 |J1X 2R9	  |RateQuote Test Contact		|555-555-5555	|20			 |097C-61890|JEAN COUTU (136)-097C-61890|2330 RUE FLEURY EST	|MONTREAL  |QC	 |CAN	 |H2B 1K9     |RateQuote Test Contact	|555-555-5555   |SID		|mitulpatel	 |TPPS	    |Y			  |SRVC 		|TL	   		 	|FS	     |1	         |S2 	   |SAP		   |8x	 	|OUT   	    |DP 	  |1000		   |SM 		|097        |3M	     |02		 |EQP1		|4500007  	  |CNCY		 |CAD		   |GSA		 |N			  |1O	   |	101	   |NULL 		  |NULL			 |NULL	 |NULL 		  |NULL		  |NULL	  	   |NULL		|NULL		 |NULL 	 		 |NULL		  |NULL		 |NULL		  	|NULL|NULL		|NULL 		  |NULL			|NULL		|NULL		|NULL	 |NULL		  |NULL				 |NULL	  |NULL		  |
And   Tester should submit payload as POST call to create a new shipment  
Then  Tester must check success status code, response time
Then  Tester validate external shipment in database


#Scenario Outline: 
  @KBN
Scenario: As Business Owner my KBN customer REST API should Create Shipment with below parameters
Given KBN Customer Rest API JSON payload provided to tester 
When  KBN customer specific JSON payload with below listed parameters data
  |customerNumber	|
  |KBN			|

#|customerNumber	|userId |type  |status|freightTerms |mweight |totalskIds|FrmLocUseCode|FrmLocCode	|FrmLocName		 						|FrmAddrs				|FrmCity	|FrmSau |FrmCntry|FrmPostlCode	  |FrmFstName 					|FrmPhNum		|ToLocUseCode|ToLocCode |ToLocName            	 |ToAddrs				|ToCity	   	 |ToSau	 |ToCntry|ToPostlCode |ToFstName 				|ToPhNum	  	|RefQulSID	|RefQulSIDVal|RefQulTPPS|RefQulTPPSVal|RefQul9V |RefQul9VVal|RefQulOTYP|RefQulOTYPVal|RefQulORG|RefQulORGVal|RefQulDROP|RefQulDROPVal|RefQulGSA |RefQulGSAVal |HandUnitTypNum|ExtHandUnitNum|Qty	 |MesureLength|MesureWidth|MesureHeight|MesureDimUOM|MesureWeight|MesureWeightUOM|MesureVolUOM|RefQulDDSC|RateCarrierNum|Rank|RateSource|TransportMode|TotalCharge	|ServiceCode|acctNum	|Selected|ValidForDate|ValidForSelectServ|RatePurp|transitDays|
#|KBN			|mitulpatel|manual|OPEN  |PRE_PAID	    |500	 |1		    |19			  |914231 		|914231-Pace Industries - B&C Division  |513 HIGHWAY 62 65 N	|HARRISON   |AR		|USA	 |72601-2503	  |RateQuote Test Contact		|654-999-9999	|20			 |3134PS	|3134PS-Post Sales Center|1155 E FRANKLIN ST	|HUNTINGTON  |IN	 |USA	 |46750-2571  |RateQuote Test Contact	|555-555-5555   |SID		|mitulpatel	 |TPPS	    |Y			  |9V		|PRE_PAID	|OTYP	   |Core Return	 |ORG 	   |Bendix	    |DROP	   |N   	     |GSA 	    |N		      |NULL 	     |NULL			|NULL	 |NULL 		  |NULL		  |NULL	  	   |NULL		|NULL		 |NULL 	 		 |NULL		  |NULL		 |NULL		  	|NULL|NULL		|NULL 		  |NULL			|NULL		|NULL		|NULL	 |NULL		  |NULL				 |NULL	  |NULL		  |
And   Tester should submit payload as POST call to create a new shipment  
Then  Tester must check success status code, response time
Then  Tester validate external shipment in database 

#Scenario Outline: 
Scenario: As Business Owner my KBN customer REST API should Create Shipment with below parameters
Given KBN Customer Rest API JSON payload provided to tester 
When  KBN customer specific JSON payload with below listed parameters data
  |customerNumber	|
  |KBN			|
#|customerNumber	|userId |type  |status|freightTerms |mweight |totalskIds|FrmLocUseCode|FrmLocCode	|FrmLocName		 						|FrmAddrs				|FrmCity	|FrmSau |FrmCntry|FrmPostlCode	  |FrmFstName 					|FrmPhNum		|ToLocUseCode|ToLocCode |ToLocName            	 |ToAddrs				|ToCity	   	 |ToSau	 |ToCntry|ToPostlCode |ToFstName 				|ToPhNum	  	|RefQulSID	|RefQulSIDVal|RefQulTPPS|RefQulTPPSVal|RefQul9V |RefQul9VVal|RefQulOTYP|RefQulOTYPVal|RefQulORG|RefQulORGVal|RefQulDROP|RefQulDROPVal|RefQulGSA |RefQulGSAVal |HandUnitTypNum|ExtHandUnitNum|Qty	 |MesureLength|MesureWidth|MesureHeight|MesureDimUOM|MesureWeight|MesureWeightUOM|MesureVolUOM|RefQulDDSC|RateCarrierNum|Rank|RateSource|TransportMode|TotalCharge	|ServiceCode|acctNum	|Selected|ValidForDate|ValidForSelectServ|RatePurp|transitDays|
#|KBN			|mitulpatel|manual|OPEN  |PRE_PAID	    |500	 |1		    |19			  |NULL			|914231-Pace Industries - B&C Division  |513 HIGHWAY 62 65 N	|HARRISON   |AR		|USA	 |72601-2503	  |RateQuote Test Contact		|654-999-9999	|20			 |3134PS	|3134PS-Post Sales Center|1155 E FRANKLIN ST	|HUNTINGTON  |IN	 |USA	 |46750-2571  |RateQuote Test Contact	|555-555-5555   |SID		|mitulpatel	 |TPPS	    |Y			  |9V		|PRE_PAID	|OTYP   |Core Return	 |ORG 	   |Bendix	    |DROP	   |N   	     |GSA 	    |N		      |NULL 	     |NULL			|NULL	 |NULL 		  |NULL		  |NULL	  	   |NULL		|NULL		 |NULL 	 		 |NULL		  |NULL		 |NULL		  	|NULL|NULL		|NULL 		  |NULL			|NULL		|NULL		|NULL	 |NULL		  |NULL				 |NULL	  |NULL		  |
And   Tester should submit payload as POST call to create a new shipment  
Then  Tester must check success status code, response time
Then  Tester validate external shipment in database 

Scenario: As Business Owner my RYD customer REST API should Create Shipment with below parameters
Given RYD Customer Rest API JSON payload provided to tester 
When  RYD customer specific JSON payload with below listed parameters data
  |customerNumber	|
  |RYD			|
#|customerNumber	|userId |actionCode |logisticsGroupCode|divisionCode |freightTerms|isHazmat|mweight |mweightUOM|mvolume|mvolumeUOM|totalHandlingUnits|totalskIds|FrmLocUseCode|FrmLocCode	|FrmLocName	  |FrmAddrs	|FrmCity |FrmSau |FrmCntry|FrmPostlCode|FrmFstName 	|FrmPhNum   |ToLocUseCode|ToLocCode |ToLocName  |ToAddrs	|ToCity	  |ToSau |ToCntry|ToPostlCode|ToFstName |ToPhNum   |RefQulUI	|RefQulUIVal|RefQulTPPS |RefQulTPPSVal	|RefQul9V |RefQul9VVal  |RefQulOTYP|RefQulOTYPVal|RefQulORG|RefQulORGVal|RefQulDROP|RefQulDROPVal|RefQulGSA |RefQulGSAVal |HandlUnitId|HandUnitTypNum|ExtHandUnitNum|extlHandlUnitNum	|Qty|MesureLength|MesureWidth|MesureHeight|MesureDimUOM|MesureWeight|MesureWeightUOM|MesureVolUOM|nominalWeight|freightClassesNomWeight|freightClassesCode|RateSource|TransportMode|TotalCharge	|ServiceCode|acctNum	|Selected|ValidForDate|ValidForSelectServ|RatePurp|transitDays|
#|RYD			|mitulpatel|CREATE		|RYD1			   |RYD1	     |PRE_PAID	  |FALSE   |3360 	|LB		   |9.652  |M		  |27				 |1		    |19			  |RYDGEN3 		|NULL		  |NULL		|NULL	 |NULL	 |NULL    |NULL	       |NULL		|NULL 		|20			 |RYDGENDC	|NULL		|NULL		|NULL	  |NULL	 |NULL	 |NULL	     |NULL		|NULL	   |UI			|409179	    |NULL	    |NULL			|NULL	  |NULL			|NULL	   |NULL		 |NULL 	   |NULL	    |NULL	   |NULL   	     |NULL	    |NULL	      |10597      |ROLL	 	     |NULL			|10597	 			|1	|2  		 |3		 	 |4		  	  |CM		   |120 		|LB 	 		|NULL		 |1000		   |1000		  		   |55				  |NULL		|NULL 		  |NULL			|NULL		|NULL		|NULL	 |NULL		  |NULL				 |NULL	  |NULL		  |
And   Tester should submit payload as POST call to create a new shipment  
Then  Tester must check success status code, response time
Then  Tester validate external shipment in database 

  @EMA
Scenario: As Business Owner my EMA customer REST API should Create Shipment with below parameters
Given EMA Customer Rest API JSON payload provided to tester 
When  EMA customer specific JSON payload with below listed parameters data
  |customerNumber	|
  |EMA			|
#|customerNumber	|userId |actionCode |logisticsGroupCode|divisionCode |freightTerms|isHazmat|mweight |mweightUOM|mvolume|mvolumeUOM|totalHandlingUnits|totalskIds|FrmLocUseCode|FrmLocCode	|FrmLocName	  |FrmAddrs	|FrmCity |FrmSau |FrmCntry|FrmPostlCode|FrmFstName 	|FrmPhNum   |ToLocUseCode|ToLocCode |ToLocName  |ToAddrs	|ToCity	  |ToSau |ToCntry|ToPostlCode|ToFstName |ToPhNum   |RefQulUI	|RefQulUIVal|RefQulTPPS |RefQulTPPSVal	|RefQul9V |RefQul9VVal  |RefQulOTYP|RefQulOTYPVal|RefQulORG|RefQulORGVal|RefQulDROP|RefQulDROPVal|RefQulGSA |RefQulGSAVal |HandlUnitId|HandUnitTypNum|ExtHandUnitNum|extlHandlUnitNum	|Qty|MesureLength|MesureWidth|MesureHeight|MesureDimUOM|MesureWeight|MesureWeightUOM|MesureVolUOM|nominalWeight|freightClassesNomWeight|freightClassesCode|RateSource|TransportMode|TotalCharge	|ServiceCode|acctNum	|Selected|ValidForDate|ValidForSelectServ|RatePurp|transitDays|
#|EMA			|mitulpatel|CREATE		|RYD1			   |RYD1	     |PRE_PAID	  |FALSE   |3360 	|LB		   |9.652  |M		  |27				 |1		    |19			  |RYDGEN3 		|NULL		  |NULL		|NULL	 |NULL	 |NULL    |NULL	       |NULL		|NULL 		|20			 |RYDGENDC	|NULL		|NULL		|NULL	  |NULL	 |NULL	 |NULL	     |NULL		|NULL	   |UI			|409179	    |NULL	    |NULL			|NULL	  |NULL			|NULL	   |NULL		 |NULL 	   |NULL	    |NULL	   |NULL   	     |NULL	    |NULL	      |10597      |ROLL	 	     |NULL			|10597	 			|1	|2  		 |3		 	 |4		  	  |CM		   |120 		|LB 	 		|NULL		 |1000		   |1000		  		   |55				  |NULL		|NULL 		  |NULL			|NULL		|NULL		|NULL	 |NULL		  |NULL				 |NULL	  |NULL		  |
And   Tester should submit payload as POST call to create a new shipment  
Then  Tester must check success status code, response time
Then  Tester validate external shipment in database 

#Scenario: As Business Owner my EMA1 customer REST API should Create Shipment with below parameters
#Given EMA1 Customer Rest API JSON payload provided to tester 
#When  EMA1 customer specific JSON payload with below listed parameters data
#|customerNumber	| 
#|EMA1			|
#And   Tester should submit payload as POST call to create a new shipment  
#Then  Tester must check success status code, response time
#Then  Tester validate external shipment in database 
@ALS
Scenario: As Business Owner my ALS customer REST API should Create Shipment with below parameters
Given ALS Customer Rest API JSON payload provided to tester 
When  ALS customer specific JSON payload with below listed parameters data
|customerNumber	|
|ALS			|
And   Tester should submit payload as POST call to create a new shipment  
Then  Tester must check success status code, response time
Then  Tester validate external shipment in database

  @DIA
Scenario: As Business Owner my DIA customer REST API should Create Shipment with below parameters
Given DIA Customer Rest API JSON payload provided to tester 
When  DIA customer specific JSON payload with below listed parameters data
|customerNumber	|
|DIA			|
And   Tester should submit payload as POST call to create a new shipment  
Then  Tester must check success status code, response time
Then  Tester validate external shipment in database

  @IRM
  Scenario: As Business Owner my IRM customer REST API should Create Shipment with below parameters
  Given IRM Customer Rest API JSON payload provided to tester
  When  IRM customer specific JSON payload with below listed parameters data
  |customerNumber	|
  |IRM			|
  And   Tester should submit payload as POST call to create a new shipment
  Then  Tester must check success status code, response time
  Then  Tester validate external shipment in database

  @VZN
  Scenario: As Business Owner my VZN customer REST API should Create Shipment with below parameters
    Given "<customerNumber>" Customer Rest API JSON payload provided to tester
    When  "<customerNumber>" customer specific JSON payload with below listed parameters data
    |customerNumber	|
    |VZN			|
#    |customerNumber	|userId |actionCode |logisticsGroupCode|divisionCode |freightTerms|isHazmat|mweight |mweightUOM|mvolume|mvolumeUOM|totalHandlingUnits|totalskIds|FrmLocUseCode|FrmLocCode	|FrmLocName	  |FrmAddrs	|FrmCity |FrmSau |FrmCntry|FrmPostlCode|FrmFstName 	|FrmPhNum   |ToLocUseCode|ToLocCode |ToLocName  |ToAddrs	|ToCity	  |ToSau |ToCntry|ToPostlCode|ToFstName |ToPhNum   |RefQulUI	|RefQulUIVal|RefQulTPPS |RefQulTPPSVal	|RefQul9V |RefQul9VVal  |RefQulOTYP|RefQulOTYPVal|RefQulORG|RefQulORGVal|RefQulDROP|RefQulDROPVal|RefQulGSA |RefQulGSAVal |HandlUnitId|HandUnitTypNum|ExtHandUnitNum|extlHandlUnitNum	|Qty|MesureLength|MesureWidth|MesureHeight|MesureDimUOM|MesureWeight|MesureWeightUOM|MesureVolUOM|nominalWeight|freightClassesNomWeight|freightClassesCode|RateSource|TransportMode|TotalCharge	|ServiceCode|acctNum	|Selected|ValidForDate|ValidForSelectServ|RatePurp|transitDays|
#    |VZN			|mitulpatel|CREATE		|RYD1			   |RYD1	     |PRE_PAID	  |FALSE   |3360 	|LB		   |9.652  |M		  |27				 |1		    |19			  |539168 		|NULL		  |NULL		|NULL	 |NULL	 |NULL    |NULL	       |NULL		|NULL 		|20			 |320068	|NULL		|NULL		|NULL	  |NULL	 |NULL	 |NULL	     |NULL		|NULL	   |UI			|409179	    |NULL	    |NULL			|NULL	  |NULL			|NULL	   |NULL		 |NULL 	   |NULL	    |NULL	   |NULL   	     |NULL	    |NULL	      |10597      |Pallet	 	     |NULL			|10597	 			|1	|2  		 |3		 	 |4		  	  |CM		   |120 		|LB 	 		|NULL		 |1000		   |1000		  		   |55				  |NULL		|NULL 		  |NULL			|NULL		|NULL		|NULL	 |NULL		  |NULL				 |NULL	  |NULL		  |
    And   Tester should submit payload as POST call to create a new shipment
    Then  Tester must check success status code, response time

  @DOM
  Scenario: As Business Owner my DOM customer REST API should Create Shipment with below parameters
    Given "<customerNumber>" Customer Rest API JSON payload provided to tester
    When  "<customerNumber>" customer specific JSON payload with below listed parameters data
      |customerNumber	|
      |DOM			|
#        |customerNumber	|userId |type  |status|freightTerms |mweight |totalskIds|FrmLocUseCode|FrmLocCode	|FrmLocName		 						|FrmAddrs				|FrmCity	|FrmSau |FrmCntry|FrmPostlCode	  |FrmFstName 					|FrmPhNum		|ToLocUseCode|ToLocCode |ToLocName            	 |ToAddrs				|ToCity	   	 |ToSau	 |ToCntry|ToPostlCode |ToFstName 				|ToPhNum	  	|RefQulSID	|RefQulSIDVal|RefQulCCLS|RefQulCCLSVal|RefQul9V |RefQul9VVal|RefQulOTYP|RefQulOTYPVal|RefQulCID|RefQulCIDVal|RefQulCIO|RefQulCIOVal|RefQulCO |RefQulCOVal |RefQulDIV |RefQulDIVVal |RefQulLGRP|RefQulLGRPVal |RefQulSCID|RefQulSCIDVal |HandUnitTypNum|ExtHandUnitNum|Qty	 |MesureLength|MesureWidth|MesureHeight|MesureDimUOM|MesureWeight|MesureWeightUOM|MesureVolUOM|RefQulDDSC|RateCarrierNum|Rank|RateSource|TransportMode|TotalCharge	|ServiceCode|acctNum	|Selected|ValidForDate|ValidForSelectServ|RatePurp|transitDays|
#        |DOM			|mitulpatel|manual|OPEN  |PRE_PAID	    |500	 |1		    |19			  |222300 		|INDIANAPOLIS RRC - PIPER LOGISTICS  |2900 N FRANKLIN RD	|INDIANAPOLIS   |IN		|USA	 |46219-1345	  |Rebeca/Joe		|317-803-3792	|20			 |500000	|INDIANA PACKERS CORPORATION|6755 W 100 N	|DELPHI  |IN	 |USA	 |46923-9305  |DOM APICall Test Contact	|555-555-5555   |SID		|mitulpatel	 |CCLS	    |TNDR			  |9V		|PRE_PAID	|OTYP	   |Outbound	 |CID 	   |500000-	    |CIO	   |222300   	     |CO 	    |8759668		      |DIV 	    |DOM1		      |LGRP 	    |DOM1| SCID 	    |DOM       |NULL 	     |NULL			|NULL	 |NULL 		  |NULL		  |NULL	  	   |NULL		|NULL		 |NULL 	 		 |NULL		  |NULL		 |NULL		  	|NULL|NULL		|NULL 		  |NULL			|NULL		|NULL		|NULL	 |NULL		  |NULL				 |NULL	  |NULL		  |
    And   Tester should submit payload as POST call to create a new shipment
    Then  Tester must check success status code, response time

#      Then  Tester validate external shipment in database
#external shipment number
#Request ship from 2019-11-08T00:00:00
#Request ship To 2019-11-29T00:00:00
#REquest delivery from 2019-11-29T07:00:00
#request deliver to 2019-11-09T23:59:00
#schedulepickupfromdate 2018-09-26T00:00:00
#scheduledDeliverToDate 2018-09-26T00:00:00
#1952524972#2342423444
# "<customerNumber>","<userId>","<type>","<status>","<freightTerms>","<totalskIds>","<FrmLocUseCode>","<FrmLocCode>","<FrmLocName>","<FrmAddrs>","<FrmCity>","<FrmSau>","<FrmCntry>","<FrmPostlCode>,"<FrmFstName>","<FrmPhNum>","<ToLocUseCode>","<ToLocCode>",<ToLocName>","<ToAddrs>","<ToCity>","<ToSau>","<ToCntry>","<ToPostlCode>","<ToFstName>","<ToPhNum>","<RefQulSID>","<RefQulSIDVal>","<RefQul9V>","<RefQul9VVal>","<RefQulSEC>","<RefQulSECVal>","<RefQul12>","<RefQul12Val>","<RefQulGL>","<RefQulGLVal>","<RefQulSLI>","<RefQulSLIVal>","<RefQulCCNM>","<RefQulCCNMVal>","<RefLMFT>","<RefLMFTVal>","<HandUnitTypNum>","<ExtHandUnitNum>","<Qty>","<MesureLength>","<MesureWidth>","<MesureHeight>","<MesureDimUOM>","<MesureWeight>","<MesureWeightUOM>","<MesureVolUOM>","<RefQulDDSC>","<RateCarrierNum>","<Rank>","<RateSource>","<TransportMode>","<TotalCharge>","<ServiceCode>","<acctNum>","<Selected>","<ValidForDate>","<ValidForSelectServ>","<RatePurpose>","<transitDays>"
#"<customerNumber>","<userId>","<type>","<status>","<freightTerms>","<mvolumeUOM>","<totalskIds>","<FrmLocUseCode>","<FrmLocCode>","<FrmLocName>","<FrmAddrs>","<FrmCity>","<FrmSau>","<FrmCntry>","<FrmPostlCode>","<FrmFstName>","<FrmPhNum>","<ToLocUseCode>","<ToLocCode>",<ToLocName>","<ToAddrs>","<ToCity>","<ToSau>","<ToCntry>","<ToPostlCode>","<ToFstName>","<ToPhNum>","<RefQulSID>","<RefQulSIDVal>","<RefQulTPPS>","<RefQulTPPSVal>","<RefQulSRVC>","<RefQulSRVCVal>","<RefQulFS>","<RefQulFSVal>","<RefQulS2>","<RefQulS2Val>","<RefQul8X>","<RefQul8XVal>","<RefQulDP>","<RefQulDPVal>","<RefQulSM>","<RefQulSMVal>","<RefQul3M>","<RefQul3MVal>","<RefQulEQP1>","<RefQulEQP1Val>","<RefQulCNCY>","<RefQulCNCYVal>","<RefQulGSA>","<RefQulGSAVal>","<RefQul1O>","<RefQul1OVal>,"<HandUnitTypNum>","<ExtHandUnitNum>","<Qty>","<MesureLength>","<MesureWidth>","<MesureHeight>","<MesureDimUOM>","<MesureWeight>","<MesureWeightUOM>","<MesureVolUOM>","<RefQulDDSC>","<RateCarrierNum>","<Rank>","<RateSource>","<TransportMode>","<TotalCharge>","<ServiceCode>","<acctNum>","<Selected>","<ValidForDate>","<ValidForSelectServ>","<RatePurp>","<transitDays>"
#"<customerNumber>","<userId>","<type>","<status>","<freightTerms>","<mvolumeUOM>","<totalskIds>","<FrmLocUseCode>","<FrmLocCode>","<FrmLocName>","<FrmAddrs>","<FrmCity>","<FrmSau>","<FrmCntry>","<FrmPostlCode>","<FrmFstName>","<FrmPhNum>","<ToLocUseCode>","<ToLocCode>",<ToLocName>","<ToAddrs>","<ToCity>","<ToSau>","<ToCntry>","<ToPostlCode>","<ToFstName>","<ToPhNum>","<RefQulSID>","<RefQulSIDVal>","<RefQulTPPS>","<RefQulTPPSVal>","<RefQulSRVC>","<RefQulSRVCVal>","<RefQulFS>","<RefQulFSVal>","<RefQulS2>","<RefQulS2Val>","<RefQul8X>","<RefQul8XVal>","<RefQulDP>","<RefQulDPVal>","<RefQulSM>","<RefQulSMVal>","<RefQul3M>","<RefQul3MVal>","<RefQulEQP1>","<RefQulEQP1Val>","<RefQulCNCY>","<RefQulCNCYVal>","<RefQulGSA>","<RefQulGSAVal>","<RefQul1O>","<RefQul1OVal>,"<HandUnitTypNum>","<ExtHandUnitNum>","<Qty>","<MesureLength>","<MesureWidth>","<MesureHeight>","<MesureDimUOM>","<MesureWeight>","<MesureWeightUOM>","<MesureVolUOM>","<RefQulDDSC>","<RateCarrierNum>","<Rank>","<RateSource>","<TransportMode>","<TotalCharge>","<ServiceCode>","<acctNum>","<Selected>","<ValidForDate>","<ValidForSelectServ>","<RatePurp>","<transitDays>"
#Scenario Outline: As Business Owner my Generic customer REST API should Create Shipment with below parameters
#Given Generic Customer Rest API JSON payload provided to tester 
#When  Tester send Generic customer specific JSON payload with parameters "<requestShipFromDate>","<requestShipToDate>","<requestDeliveryFromDate>","<requestDeliveryToDate>","<schedulePickUpFromDate>","<scheduleDeliveryToDate>" 
#And   Tester should submit payload as POST call to create a new shipment  
#Then  Tester must check success status code, response time
#Then  Tester validate external shipment in database 
#Examples: 
#|requestShipFromDate|requestShipToDate|requestDeliveryFromDate|requestDeliveryToDate|schedulePickUpFromDate|scheduleDeliveryToDate|
#|Today				|Tomorrow		  |						  |		         		|				 	   |				 	  |