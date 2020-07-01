package com.ryder.online.pages.pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
 * 
 * @author javeed 
 * 
 * 01/03/2020
 * 
 * 
 */

public class RyderEntryOnlineHomePageObjects extends PageBase{
	
	public RyderEntryOnlineHomePageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/** Web Elements */
	
	/* ROL Landing page Elements*/
 
	@FindBy(how = How.XPATH, using = "//div[@id='header-primary-nav-container']//div[@id='header-primary-links']//following::a[@id='header-TRANSPORTATION']")
	public WebElement click_TranportationLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Shipment Summary']")
	public WebElement click_ShipmentSummary;

	@FindBy(how = How.XPATH, using = "//a[text()='Shipment Upload']")
	public WebElement click_ShipmentUpload;

	@FindBy(how = How.XPATH, using = "//a[text()='Load']")
	public WebElement click_LoadLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Carrier Dashboard']")
	public WebElement click_CarrierDashboardLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Shipment']")
	public WebElement click_Shipment_Link;

	@FindBy(how = How.XPATH, using = "//a[text()='Tender Dashboard']")
	public WebElement click_TenderDashboardLink;

	@FindBy(how = How.XPATH, using = "(//a[text()='Shipment'])[1]")
	public WebElement click_ShipmentLink;
	
	@FindBy(how=How.XPATH, using="(//a[text()='Shipment'])[2]")
	public WebElement click_Track_ShipmentLink;
	
	@FindBy(how=How.XPATH, using="//font[text()='Shipment Search']")
	public WebElement static_SearchShipment;
	
	public By Logo_of_customer = By.xpath("//table//tbody/tr/td/img[@src]");
	
	//<option value="BHI" selected="">Baker Hughes Incorporated</option>
	@FindBy(how = How.XPATH, using = "//select[@name='organization']")
	public WebElement select_customer_DropDown;
		
	@FindBy(how=How.XPATH, using="(//select[@name='organization']//following::td[@class='dataCell'])[1]") 
			//using="(//tr//td/label[text()='RyderEntry Number:']//following::td[@class='dataCell'])[1]")
	public WebElement copy_ryder_Entry_Number;
	
	@FindBy(how=How.XPATH, using="//input[@id='originAddrID']")
	public WebElement text_OriginAddressID;
	
	@FindBy(how=How.XPATH, using="//input[@id='destAddrID']")
	public WebElement text_DestinationAddressID;
	
	@FindBy(how=How.XPATH, using="//td//font[text()='Address Search']")
	public WebElement static_AddresSearch;
	
	@FindBy(how=How.XPATH, using="(//tr//td[text()='Address ID:']//following::td//input)[1]")
	public WebElement text_AddressID;
	
	@FindBy(how=How.XPATH, using="//a//img[@src='/ro/rydertrac/images/b_search_w.gif']")
	public WebElement click_SearchAddress_Button;
	
	@FindBy(how=How.XPATH, using="(//input[@id='originAddrID']//following::a//img[@src='/ro/rydertrac/images/b_search_w.gif'])[1]")
	public WebElement click_Search_OriginAddress_Button;
	
	@FindBy(how=How.XPATH, using="(//input[@id='destAddrID']//following::a//img[@src='/ro/rydertrac/images/b_search_w.gif'])")
	public WebElement click_Search_DestinationAddress_Button;
	
	@FindBy(how=How.XPATH, using="//input[@id='originAddrName']")
	public WebElement text_OriginAddressname;
	
	@FindBy(how=How.XPATH, using="//input[@name='originContactName']")
	public WebElement text_OriginContactname;
	
	@FindBy(how=How.XPATH, using="//input[@name='destContactName']")
	public WebElement text_DestContactname;
		
	@FindBy(how=How.XPATH, using="//input[@name='originContactPhone']")
	public WebElement  text_OriginContactPhone;
	
	@FindBy(how=How.XPATH, using="//input[@name='destContactPhone']")
	public WebElement text_DestContactPhone;
	
	@FindBy(how=How.XPATH, using="//td[@class='dataRowOdd' and text()]")
	public WebElement static_SearchResults;
	
	@FindBy(how=How.XPATH, using="//td[@class='dataRowOdd']//a//img[@src='/ro/rydertrac/images/b_details.GIF' and @alt='Select Address']")
	public WebElement select_AddressButton;
	
	@FindBy(how=How.XPATH, using="//select[@id='pickupConvention']")
	public WebElement select_pickupConvention;
		
	@FindBy(how=How.XPATH, using="//select[@id='deliveryConvention']")
	public WebElement select_deliveryConvention;
	
	@FindBy(how=How.XPATH, using="//input[@id='pickupDate']")
	public WebElement text_pickupDate;
	
	@FindBy(how=How.XPATH, using="//input[@id='deliveryDate']")
	public WebElement text_deliveryDate;
	
	@FindBy(how=How.XPATH, using="(//label[text()='Customer Order Number:']//following::input)[1]")
	public WebElement text_CustomerOrderNumber;
	
	@FindBy(how=How.XPATH, using="(//label[text()='Order Type:']//following::td//select)[1]")
	public WebElement select_OrderType;
	
	@FindBy(how=How.XPATH, using="//label[text()='Cost Center Number:']//following::select[1]")
	public WebElement Select_CostCenterNumber;

	@FindBy(how=How.XPATH, using="//label[text()='Cost Center Number:']//following::input[1]")
	public WebElement text_CostCenterNumber;

		
	@FindBy(how=How.XPATH, using="//label[text()='General Ledger:']//following::select[1]")
	public WebElement select_GeneralLedger;
	
	@FindBy(how=How.XPATH,using="//label[text()='Short Lead Time:']//following::input[contains(@id,'cb_ReferenceNum')]")
	public WebElement checkbox_shortLeadTime;
	
	@FindBy(how=How.XPATH, using="//label[text()='Short Lead Time:']//following::input[contains(@id,'ReferenceNum') and @value='NO']")
	public WebElement checkbox_waitAfter_Uncheck;
	
	@FindBy(how=How.XPATH, using="//label[text()='Service Level:']//following::select[1]")
	public WebElement select_ServiceLevel;
	
	@FindBy(how=How.XPATH, using="//label[text()='Approver:']//following::select[1]")
	public WebElement select_Approver;
	
	@FindBy(how=How.XPATH, using="//label[text()='Commodity:']//following::select[1]")
	public WebElement select_commodity;
		
	@FindBy(how=How.XPATH, using="(//td//label[contains(text(),'Customer Order Number')]//following::input)[1]")
	public WebElement text_customerOrderNumber;
	
	@FindBy(how=How.XPATH, using="//a//img[@src='/ro/rydertrac/images/b_add_edit_items.gif']")
	public WebElement click_Add_Edit_Button;
	
	@FindBy(how=How.XPATH, using="//input[@name='manualEntryCheckbox']")
	public WebElement checkbox_manualEntryCheckbox;
	
	@FindBy(how=How.XPATH, using="//input[@name='manualEntryQty']")
	public WebElement text_manualEntryQty;
	
	@FindBy(how=How.XPATH, using="//input[@name='manualEntryWeight']")
	public WebElement text_manualEntryWeight;
	
	@FindBy(how=How.XPATH, using="//input[@name='manualEntryIX']")
	public WebElement text_manualEntry_SKU;	

	@FindBy(how=How.XPATH, using="//input[@name='manualEntrySDE']")
	public WebElement text_ItemDescription;
	
	@FindBy(how=How.XPATH, using="//input[@name='manualEntryDESCRIPTION']")
	public WebElement text_Item_Description;
	
	@FindBy(how=How.XPATH, using="//input[@name='manualEntryITEM_CODE']")
	public WebElement text_ItemCode_SKU;
	
	@FindBy(how=How.XPATH, using="//select[@name='manualEntryPTYP']")
	public WebElement select_ContainerType;
	
	@FindBy(how=How.XPATH, using="//select[@name='manualEntryCTYP']")
	public WebElement select_ContainerTypeForRYD;
	
	@FindBy(how=How.XPATH, using="//select[@name='manualEntryQUOM']")
	public WebElement select_QuantityUnitOfMeasure;
	
	@FindBy(how=How.XPATH, using="//a/img[@src='/ro/rydertrac/images/add_items.gif']")
	public WebElement click_Add_Items_Button;

	@FindBy(how=How.XPATH, using="(//table[@id='selectedItemsTable']//following::tr)[2]")
	public WebElement selectedLineItemRow;
	
	@FindBy(how=How.XPATH, using="(//a/img[@src='/ro/rydertrac/images/b_submit_w.gif'])[1]")
	public WebElement click_Submit_Button;
	
	@FindBy(how=How.XPATH, using="//td[@class='dataRowOdd']//input[@type='checkbox']")
	public WebElement checkbox_SelectedLineItem;
	
	@FindBy(how=How.XPATH, using="//form[@method='POST' and @name='frmShipmentEntryLineItemSelector' ]//table//tr[2]")
	public WebElement added_shipmentLineItem;
	
	@FindBy(how=How.XPATH, using="//tr/td/font[text()='RyderEntry Confirmation']")
	public WebElement ryderEntry_ConfirmationPage;
	
	@FindBy(how=How.XPATH, using="//tr//td//font[contains(text(),'Number:')]")
	public WebElement ryderEntry_Unique_Number;
	
	@FindBy(how=How.XPATH, using="//input[@id='pShipmentID']")
	public WebElement text_RyderEntry_Unique_ShipmentId;

	@FindBy(how=How.ID, using="pSubmitter")
	public WebElement Enter_Submitter;

	@FindBy(how=How.NAME, using="loadNum")
	public WebElement Enter_LoadNo;

	@FindBy(how=How.XPATH, using="(//input[@alt='Begin Load Search'])[1]")
	public WebElement click_LoadSearch_Button;

	@FindBy(how=How.XPATH, using="(//input[@alt='Begin Shipment Search'])[1]")
	public WebElement click_ShipmentSearch_Button;


	@FindBy(how=How.XPATH, using="//img[@alt='Search']")
	public WebElement click_CarrierSearch_Button;

	@FindBy(how=How.NAME, using="allStops")
	public WebElement click_AllStopsCheckBox;

	@FindBy(how=How.XPATH, using="//td[text()='Shipment Number:']/following-sibling::td/input[@type='text']")
	public WebElement Enter_ShipemntNo;

	@FindBy(how=How.XPATH, using="//td[text()='Customer Order Number/ASP Number:']/following-sibling::td/input[@type='text']")
	public WebElement Enter_ASPorCONumber;


	@FindBy(how=How.XPATH, using="//input[@id='pSubmitter']")
	public WebElement text_manualShipment_Submitter;
	
	@FindBy(how=How.XPATH, using="//a//img[@src='/ro/rydertrac/images/ship_sum.gif']")
	public WebElement ryderEntry_Summary_Button;
	
	@FindBy(how=How.XPATH, using="//td//span[text()='RyderEntry Summary']")
	public WebElement ryderEntry_Summarypage;
	
	@FindBy(how=How.XPATH, using="//select[@id='pStatus']")
	public WebElement select_ryderEntry_Status;
	
	@FindBy(how=How.XPATH, using="//a//img[@src='/ro/rydertrac/images/b_search_w3.gif']")
	public WebElement click_Search_Button;
	
		@FindBy(how=How.XPATH, using="(//table[@class='detail']//tr//td[@class='dataRowOdd'])[3]")
	public WebElement row_having_shipment_Details;

	@FindBy(how=How.XPATH, using="(//table[@class='detail']//tr//td[@class='dataRowOdd'])[1]")
	public WebElement row_having_Load_Details;

	@FindBy(how=How.XPATH, using="(//table[@class='detail']//tr//td[@class='dataRowOdd' and contains(text(),'NEW')])")
	public WebElement check_Status_As_New;
	
	@FindBy(how=How.XPATH, using="(//table[@class='detail']//tr//td[@class='dataRowOdd' and contains(text(),'IN SHIP QUEUE')])")
	public WebElement check_Status_As_In_Ship_Queue;
	
//	@FindBy(how=How.XPATH, using="(//table[@class='detail']//tr//td[@class='dataRowOdd' and contains(text(),'PENDING_CARRIER')])")
//	public WebElement check_Status_As_Pending_Carrier;

	@FindBy(how=How.XPATH, using="(//table[@class='detail']//tr//td[@class='dataRowOdd'][9])")
	public WebElement check_Status_As_Pending_Carrier;
	
	@FindBy(how=How.XPATH, using="(//table[@class='detail']//tr//td[@class='dataRowOdd'])[2]")
	public WebElement copy_LoadNumber;
	
	@FindBy(how=How.XPATH, using="(//div[@class='header-secondary-nav-section']//ul//a[text()='Shipment'])[2]")
	public WebElement click_Track_Shipment;
	
	@FindBy(how=How.XPATH, using="(//div[@class='header-secondary-nav-section']//ul//a[text()='Load'])")
	public WebElement click_Track_Load;
	
	@FindBy(how=How.XPATH, using="(//tr//td[text()='Shipment Number:']//following::input)[1]")
	public WebElement text_Shipment_Number;
	
	
	@FindBy(how=How.XPATH, using="//select[@name='organization']")
	public WebElement select_search_Company;
	
	@FindBy(how=How.XPATH, using="(//tr//td[text()='Load Number:']//following::input)[1]")
	public WebElement text_Load_Number;
	
	@FindBy(how=How.XPATH, using="(//tr//td//font[text()='GENERAL']//following::tr//input[@src='/ro/rydertrac/images/b_search_w3.gif'])[1]")
	public WebElement click_Search_Button_ToTrackShipment;
	
	@FindBy(how=How.XPATH, using="//img[@alt='Load Detail']")
	public WebElement click_LoadDetail_Button;
	
	@FindBy(how=How.XPATH, using="//font[text()='Load Search Results']")
	public WebElement static_Load_SearchResult_Page;
	
	@FindBy(how=How.XPATH, using="//font[text()='Shipment Search Results']")
	public WebElement static_Shipment_SearchResult_Page;
	
	@FindBy(how=How.XPATH, using="//img[@alt='Shipment Detail']")
	public WebElement click_ShipmentDetail_Button;
	
	@FindBy(how=How.XPATH, using="//font[text()='Shipment Detail']")
	public WebElement static_ShipmentDetail_Page;
	
	@FindBy(how=How.XPATH, using="//font[text()='Load Detail']")
	public WebElement static_LoadDetail_Page;
	
	@FindBy(how=How.XPATH, using="//a[text()='Add/Edit Appointments']")
	public WebElement add_Edit_AppointmentsLink;
	
	@FindBy(how=How.XPATH, using="//font[text()='APPOINTMENT UPDATE']")
	public WebElement static_ApptUpdatePage;
	
	@FindBy(how=How.XPATH, using="//input[@id='statusDate_0']")
	public WebElement text_origin_AppointmateDate;
	
	@FindBy(how=How.XPATH, using="//input[@id='statusDate_1']")
	public WebElement text_destination_AppointmentDate;
	
	@FindBy(how=How.XPATH, using="//input[@name='statustimehour_0']")
	public WebElement text_origin_AppointmentHour;
	
	@FindBy(how=How.XPATH, using="//input[@name='statustimehour_1']")
	public WebElement text_destination_AppointmentHour;
	
	@FindBy(how=How.XPATH, using="//input[@name='statustimemin_0']")
	public WebElement text_origin_AppointmentMinute;
	
	@FindBy(how=How.XPATH, using="//input[@name='statustimemin_1']")
	public WebElement text_destination_AppointmentMinute;
	
	@FindBy(how=How.XPATH, using="//select[@name='statustmz_0']")
	public WebElement select_origin_AppointmentZone;
	
	@FindBy(how=How.XPATH, using="//select[@name='statustmz_1']")
	public WebElement select_destination_AppointmentZone;
	
	@FindBy(how=How.XPATH, using="//select[@id='originTmzID']")
	public WebElement select_Origin_TimeZone;
	
	@FindBy(how=How.XPATH, using="//select[@id='destTmzID']")
	public WebElement select_Destination_TimeZone;
	
	@FindBy(how=How.XPATH, using="//a[text()='Add Event']")
	public WebElement click_AddEdit_Link;
	
	@FindBy(how=How.XPATH, using="//span[text()='ADD ADDITIONAL STATUS']")
	public WebElement static_AddAditionalStatus;
	
	@FindBy(how=How.XPATH, using="//select[@name='locCitySelect']")
	public WebElement select_Location;
	
	@FindBy(how=How.XPATH,using="//select[@name='locCitySelect']//option[contains(text(),'Origin')]")
	public WebElement static_Origin_Option;
	
	@FindBy(how=How.XPATH, using="//select[@name='locCitySelect']//option[contains(text(),'Stop')]")
	public WebElement static_Destination_option;
	
	@FindBy(how=How.XPATH, using="//select[@id='status']")
	public WebElement select_Status;
		
	@FindBy(how=How.XPATH, using="//input[@id='dialogStatusDate']")
	public WebElement text_status_Date;
	
	@FindBy(how=How.XPATH, using="//input[@name='statusHour']")
	public WebElement text_status_TimeHour;
	
	@FindBy(how=How.XPATH, using="//input[@name='statusMin']")
	public WebElement text_status_TimeMinute;
	
	@FindBy(how=How.XPATH, using="//select[@name='statusTmz']")
	public WebElement select_zone;
	
	@FindBy(how=How.XPATH, using="//div[@aria-labelledby='ui-dialog-title-statusDialogPopUp']//a/img[@src='/ro/rydertrac/images/b_submit_w.gif']")
	public WebElement click_Submit_OnDialogBox;
	
	@FindBy(how=How.XPATH, using="//td[contains(text(),'Arrived at Pick-up Location')]")
	public WebElement static_Arrived_PickUpLocation;
	
	@FindBy(how=How.XPATH, using="//td[contains(text(),'Carrier Departed Pick-up Location with Shipment')]")
	public WebElement static_Carrier_Departed_PickUpLocation;
	
	@FindBy(how=How.XPATH, using=" //td[contains(text(),'Arrived at Delivery Location')]")
	public WebElement static_Arrived_DeliveryLocation;
	
	@FindBy(how=How.XPATH, using="//td[contains(text(),'Completed Unloading at Delivery Location')]")
	public WebElement static_Carrier_UnLoadingAtDeliveryLocation;
	
//	@FindBy(how=How.XPATH, using="//tr[@class='dataRowOdd']//td[contains(text(),'FBAP Extract Generated by ROL')]")
//	public WebElement static_Event_FBAP_Status_Row;
	
	//click_Submit_Button
	@FindBy(how=How.XPATH, using="//a/img[@src='/ro/rydertrac/images/ok.gif']")
	public WebElement click_OK_Button;
	
	@FindBy(how=How.XPATH, using="//a//img[@src='/ro/rydertrac/images/b_edit_w.gif' and @alt='Edit']")
	public WebElement static_Edit_Button;
	
	@FindBy(how=How.XPATH, using="//a//img[@src='/ro/rydertrac/images/ok.gif' and @alt='OK']")
	public WebElement click_Ok_Button;
	
	@FindBy(how=How.XPATH, using="//img[@alt='Print BOL']")
	public WebElement click_PringBol_Button;

	@FindBy(how=How.XPATH, using="//label[text()='Move Type:']//following::select[1]")
	public WebElement Select_MoveType;

	@FindBy(how=How.XPATH, using="//label[text()='Product Line:']//following::select[1]")
	public WebElement Select_ProductLine;

	@FindBy(how=How.XPATH, using="//label[text()='GL Code:']//following::select[1]")
	public WebElement Select_GLCode;

	@FindBy(how=How.XPATH, using="//label[text()='Total Pallets:']//following::input[1]")
	public WebElement Enter_TotalPallets;

	@FindBy(how=How.XPATH, using="//label[text()='Project Number:']//following::input[1]")
	public WebElement Enter_ProjectNo;

	@FindBy(how=How.ID, using="file")
	public WebElement ChooseFileOption;

	@FindBy(how=How.NAME, using="uploadBtn")
	public WebElement UploadButton;

	@FindBy(how=How.XPATH, using="//font[text()=' Success Results']/following::tr")
	public WebElement successResultMessage;


}
