package com.ryder.online.pages.pageobjects;
import com.paulhammant.ngwebdriver.ByAngularRepeater;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class RyderControlTowerHomePageObjects extends PageBase {

	public RyderControlTowerHomePageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		/** Web Elements */
		//login button on home page
		
//		@ByAngularBinding.FindBy(..)
//		@ByAngularButtonText.FindBy(..)
//		@ByAngularButtonText.FindBy(..)
//		@ByAngularCssContainingText.FindBy(..)
//		@ByAngularExactBinding.FindBy(..)
//		@ByAngularModel.FindBy(..)
//		@ByAngularOptions.FindBy(..)
//		@ByAngularPartialButtonText.FindBy(..)
//		@ByAngularRepeater.FindBy(..)
//		@ByAngularRepeaterCell.FindBy(..)
//		@ByAngularRepeaterColumn.FindBy(..)
//		@ByAngularRepeaterRow.FindBy(..)

	
	@FindBy(how=How.XPATH, using="//div[text()='Ryder Test']")
	public WebElement Select_RYD_customer;
	
	@FindBy(how=How.CSS, using="div.app-nav-client-selection-img.ng-scope.ng-isolate-scope")
	public WebElement text_client_Selection;
	
	@FindBy(how=How.XPATH,using="//div[@ui-bg-img]")
	public WebElement client_selection_attribute;
	
	
	@FindBy(how=How.CSS, using="li.dropdown.dropdown-show")
	public WebElement show_Customer_SelectDropdown;
	
	@FindBy(how=How.XPATH, using="//button//span[text()='Apply']")
	public WebElement BTN_Apply;
	
	@FindBy(how=How.XPATH, using="//span[text()='Pickup Forecast view']")
	public WebElement static_pickUPForcartTile;
	
	@FindBy(how=How.XPATH, using="//page-header-title[text()='Create Manual Shipment']")
	public WebElement static_PageHeaderTitle;
	
	//input.ng-pristine.ng-untouched.ng-valid.ng-not-empty.ng-valid-required
	//input.ng-pristine.ng-untouched.ng-valid.ng-valid-required
	//div.ui-field-checkbox-controls div:nth-of-type(2)
	//ui-section>ui-location>div>div>div>ui-field-select>div>div>input
	
	@FindAll(value = { @FindBy(how=How.CSS, using="input.ng-pristine.ng-untouched.ng-valid.ng-not-empty.ng-valid-required") })
	public List<WebElement> Total_Selected_Customers;
	
	@FindBy(how=How.CSS, using="div.ui-field-checkbox-controls>input.ng-pristine.ng-untouched.ng-valid.ng-not-empty.ng-valid-required+div")
			//"div.ui-field-checkbox-controls>input.ng-pristine.ng-untouched.ng-valid.ng-not-empty.ng-valid-required")
	public WebElement one_Selected_Customers;
	
	@FindBy(how=How.CSS, using="input.ng-pristine.ng-untouched.ng-valid.ng-not-empty.ng-valid-required")
	public WebElement Selected_Customer;
	
	@FindBy(how=How.XPATH, using="//a//span[text()='Shipping']")
	public WebElement click_Banner_Shipping;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Create Shipment')]")
	public WebElement click_Create_Shipment;
	
	@FindBy(how=How.XPATH, using="//ui-header-body[contains(text(),'Manual')]")
	public WebElement Manual;
	
//	@ByAngularModel.FindBy()
//	public WebElement Origin;
	@FindBy(how=How.XPATH, using="(//ui-location[@ng-model='shipment.origin']//input)[1]")
	public WebElement text_Origin_LoactionID;
	
	@ByAngularRepeater.FindBy(exact = false, repeater = "option in $ctrl.filteredOptions")
	public WebElement hover_repeat_selection;
	
	@FindBy(how=How.XPATH, using="(//ui-location[@ng-model='shipment.destination']//input)[1]")
	public WebElement text_Destination_LoactionID;
	
	@FindBy(how=How.XPATH, using="(//ui-field-date[@label='Pick Up Date']//following::input)[1]")
	public WebElement text_PickUpDate;
	
	@FindBy(how=How.XPATH, using="(//ui-field-date[@label='Delivery Date']//following::input)[1]")
	public WebElement text_DeliveryDate;

	@FindBy(how=How.XPATH, using="//label[text()='Must Pick Up On']/preceding-sibling::input")
	public WebElement btn_MustPickUp;

	@FindBy(how=How.XPATH, using="//label[text()='Must Deliver By']/preceding-sibling::input")
	public WebElement btn_MustDeliveredBy;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Warning')]")
	public WebElement static_popUp_Warning;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Ok')]")
	public WebElement click_Warning_Ok;
	
	@FindBy(how=How.XPATH, using="//div[@class='day ng-binding ng-scope enabled active']")
	public WebElement click_Active_Element;
	
	@FindBy(how=How.XPATH, using="(//ui-field-select[@label='Freight Terms']//following::div//input)[1]")
	public WebElement click_FreightTerms;
	
	@FindBy(how=How.XPATH, using="//div[contains(@policy,'manual.shipment.reference.OTY')]//input")
	public WebElement select_OderType;

//	@FindBy(how=How.XPATH, using="//span[text()='Inbound Production']")
//	public WebElement select_InBound_OrderType;
//	
//	@FindBy(how=How.XPATH, using="//span[text()='Outbound Finished Goods']")
//	public WebElement select_OutBound_OrderType;
	
	@FindBy(how=How.XPATH, using="(//ui-field-text[@label='Alstom PO Number']//following::input)[1]")
	public WebElement text_Alstom_PoNumber;
	
	@FindBy(how=How.XPATH, using="//ui-field-select[@label='Equipment Types']//div[@policy='manual.shipment.attribute.EQPT']")
	public WebElement click_EquipmentType;
	
	@FindBy(how=How.XPATH, using="//ui-field-select[@label='Hazmat']//div[@policy='manual.shipment.attribute.HAZ']")
	public WebElement click_Hazmat;
	
	@FindBy(how=How.XPATH, using="//ui-field-select[@label='Hazmat']//div[@policy='manual.shipment.attribute.HAZ']//span[text()='Y']")
	public WebElement click_HazmatValue_Y;
	
	@FindBy(how=How.XPATH, using="//ui-field-select[@label='Hazmat']//div[@policy='manual.shipment.attribute.HAZ']//span[text()='N']")
	public WebElement click_HazmatValue_N;
	
	@FindBy(how=How.XPATH, using="(//ui-field-text[@ng-model='shipment.references[ref.code]']//following::input)[1]")
	public WebElement text_CustomerOrderNumber;
	
	@FindBy(how=How.XPATH, using="//span[text()='Handling Units']")
	public WebElement click_HandlingUnitsLink;
	
//	@FindBy(how=How.XPATH, using="//button[@type='submit']//span[text()='Submit']")
	@FindBy(how=How.XPATH, using="//span[text()='Submit']/parent::button[@type='submit']")
	public WebElement BTN_Submit;

	@FindBy(how=How.XPATH,using="//ui-field-select[@ng-model='handlingUnits[selectedIndex].quantityUom']//input")
	public WebElement click_ContainerType;
	
	@FindBy(how=How.XPATH, using="//ui-field-select[@ng-model='handlingUnits[selectedIndex].freightClass']//input")
	public WebElement click_FreightClass;
	
	@FindBy(how=How.XPATH, using="//div[@class='loader-container']//div[@class='loader']")
			//using="//div[@class='loader-container']")
	public List<WebElement> ajax_spinners;
	
	@FindBy(how=How.XPATH, using="//div[contains(@ui-info,'Remove Item')]")
	public List<WebElement> remove_Itemcodes;
	
	@FindBy(how=How.XPATH, using="//ui-field-text[@ng-model='handlingUnits[selectedIndex].weight']//input")
	public WebElement text_HandlingUnitWeight;
	
	@FindBy(how=How.XPATH, using="//span[text()='Add Item']")
	public WebElement click_AddItem;
	
	@FindBy(how=How.XPATH, using="//ui-field-text[@label='Item Code']//input")
	public WebElement text_ItemCode;
	
	@FindBy(how=How.XPATH,using="//ui-field-select[@label='Description']//input")
	public WebElement text_ItemCode_Description;
	
	@FindBy(how=How.XPATH, using="//ui-section[@policy='manual.shipment.hu.item']//following::ui-field-text[@label='Quantity']//input")
	public WebElement text_ItemCode_Quantity;
	
	@FindBy(how=How.XPATH,using="//ui-section[@policy='manual.shipment.hu.item']//following::ui-field-text[@label='Weight']//input")
	public WebElement text_ItemCode_Weight;
	
	@FindBy(how=How.XPATH, using="//ui-section[@policy='manual.shipment.hu.item']//following::ui-field-text[@label='Weight']//input[contains(@class,'ng-not-empty')]")
	public WebElement editable_notEmpty_Weight;
	
	@FindBy(how=How.XPATH, using="//ui-header-body//span[contains(text(),'Item ')]")
	public List<WebElement> list_OfLineItems;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Item ')]//following::div[contains(@ui-info,'Remove Item')]")
	public WebElement ItemCode_RemoveItem;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']//span[text()='Save']")
	public WebElement BTN_Save;
	
	@FindBy(how=How.XPATH, using="//ui-header-body//span[contains(text(),'Address Validation')]")
	public WebElement staticText_AddressValidation;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']//span[text()='Accept']")
	public List<WebElement> BTN_Accept;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']//span[text()='Accept']")
	public WebElement BTN_Accept1;
	
	@FindBy(how=How.XPATH, using="(//button[@ui-button and @ng-click='close()'])//i")
	public WebElement close_AddressValidation;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Error Processing Shipment')]")
	public WebElement static_error_Processing_Shipement;	
	
	
	public By Ajax_Spinner = By.xpath("//div[@class='loader-container']") ;
	
	public By Login_Spinner = By.xpath("//div[@class='loader']");
	
	@FindBy(how=How.XPATH, using="//ui2-section-title[text()]")
	public WebElement staticText_ShipmentNumber;
	
	@FindBy(how=How.XPATH, using="//span[text()='Shipment Submitted']")
	public WebElement title_ShipmentSubmitted;
	
	@FindBy(how=How.XPATH, using="//span[text()='Tracking']")
	public WebElement click_Banner_Tracking;
	
	@FindBy(how=How.XPATH, using="//li//a[@ui-sref='home.tracking.shipment' and contains(text(),'Shipment Tracking')]")
	public WebElement click_Shipment_Tracking;
	
	@FindBy(how=How.XPATH, using="//div[@class='ui-tabs-scroll']//a[text()='Loads']")
	public WebElement Loads_Tracking;
	
	@FindBy(how=How.XPATH, using="//ui-field-value[@class='condensed ng-isolate-scope' and @label='Status']")
	public WebElement read_LoadStatus;

	@FindBy(how=How.XPATH, using="//ui-section[@ng-repeat='result in shipment.loads']//div[@class='title ng-binding'][1]")
	public WebElement read_LoadNumber;

	@FindBy(how=How.XPATH, using="(//ui-field-value[@label='Origin']//div[@class='ui-field-value-text ng-binding'])[2]")
	public WebElement read_OriginText;
	
	@FindBy(how=How.XPATH, using="(//ui-field-value[@label='Destination']//div[@class='ui-field-value-text ng-binding'])[2]")
	public WebElement read_DestinationText;
	
	@FindBy(how=How.XPATH, using="//div[@class='ui-tabs-scroll']//a[text()='Handling Units']")
	public WebElement HandlingUnits_Tracking;
	
	@FindBy(how=How.XPATH, using="//span[@class='title ng-binding']")
	public WebElement static_HandlingUnitText;
	
	@FindBy(how=How.XPATH, using="//ui-field-text[@ng-model='unit.quantity']//div[@class='ui-field-text ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-required condensed']")
			//"//ui-field-text[@label='Quantity']//div//input[@ng-attr-value]")
	public WebElement read_Quantity;
	
	@FindBy(how=How.XPATH, using="//ui-field-text[@ng-model='unit.length']//div[@class='ui-field-text ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-required condensed']")
	public WebElement read_Lenght;
	
	@FindBy(how=How.XPATH, using="//ui-field-text[@ng-model='unit.width']//div[@class='ui-field-text ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-required condensed']")
	public WebElement read_Width;
	
	@FindBy(how=How.XPATH, using="//ui-field-text[@ng-model='unit.height']//div[@class='ui-field-text ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-required condensed']")
	public WebElement read_Height;
	
	@FindBy(how=How.XPATH, using="//ui-field-text[@ng-model='unit.weight']//div[@class='ui-field-text ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-required condensed']")
	public WebElement read_Weight;
	
	@FindBy(how=How.XPATH, using="//ui-field-text[@ng-model='unit.freightClass']//div[@class='ui-field-text ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-required condensed']")
	public WebElement read_FreightClass;
	
	@FindBy(how=How.XPATH, using="//button//span[text()='Close']")
	public WebElement click_Close_Button;
	
	@FindBy(how=How.XPATH, using="//ui-field-text[@label='Ryder Shipment Number']//input")
	public WebElement text_ShipmentNumber;
	
	@FindBy(how=How.XPATH, using="//button[@type = 'submit' and contains(text(),'Apply')]")
	public WebElement click_Apply_Button;
	
	@FindBy(how=How.XPATH, using="//div[@class='loader-container ng-hide']//div[@class='loader']")
	public WebElement after_dissaper_spinner;
	
	@FindBy(how=How.XPATH, using="//div[@class='loader-container']//div[@class='loader']")
	public WebElement when_spinner_clocking;
	
	//@FindBy(how=How.XPATH, using="")
	public By spinner_IsClocking= By.xpath("//div[@class='loader-container']//div[@class='loader']") ;
	
	public By NotVisible_Spinner = By.xpath("//div[@class='loader-container ng-hide']//div[@class='loader']");
	public By Visible_Spinner = By.xpath("//div[@class='loader-container']//div[@class='loader']");
	
	@FindBy(how=How.XPATH, using="//div[@class ='title ng-binding' and contains(text(),'')]")
	public WebElement Shipment_Listed;
	
	@FindBy(how=How.CSS, using="a.app-nav-menu-item.dropdown-toggle>i")
	public WebElement click_User_ICON;

	@FindBy(how=How.XPATH, using="//a[contains(text(),'Sign Out')]")
	public WebElement click_Sign_Out;

	@FindBy(how=How.XPATH, using="//ui-field-text[@label='Customer Order Number/ASP Number']//input")
	public WebElement text_Customer_OrderNumber;
	
	@FindBy(how=How.XPATH, using ="//ui-field-select[@policy='manual.shipment.reference.MTYP']//input")
	public WebElement click_moveType;
	
	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.PROJ']//input")
	public WebElement text_ProjectNumber;
	
	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.GL']//input")
	public WebElement click_GlCode;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.PT']//input")
	public WebElement click_ProdutLine;
	
	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.attribute.PP']//input")
	public WebElement text_Attribute_Totalpallets;
	
	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.attribute.WGHT']//input")
	public WebElement text_Attribute_weight;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.attribute.VOL']//input")
	public WebElement text_Attribute_volume;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.SVAL']//input")
	public WebElement text_ProductValue;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.EA']//input")
	public WebElement text_EmailAddress;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.P4']//input")
	public WebElement text_PROJECT_NUMBER;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.TO']//input")
	public WebElement text_TransferNo;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.PP']//input")
	public WebElement text_TotalPalletPO;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.REQN']//input")
	public WebElement text_RequestorName;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.STYP']//input")
	public WebElement select_MovementType;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.MTYP']//input")
	public WebElement select_MoveType;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.GL']//input")
	public WebElement select_GLCode;

	@FindBy(how=How.XPATH, using="//div[@policy='manual.shipment.reference.PT']//input")
	public WebElement select_ProductLine;

	@FindBy(how=How.XPATH, using ="//ui-field-select[@policy='manual.shipment.reference.MTYP']//input")
	public WebElement click_BUNDLECODE;

	@FindBy(how=How.XPATH, using ="//ui-field-select[@policy='manual.shipment.reference.MTYP']//input")
	public WebElement click_COMPANYCODE;

	@FindBy(how=How.XPATH, using ="//ui-field-select[@policy='manual.shipment.reference.MTYP']//input")
	public WebElement click_SALES_PURCHASING_ORGANIZATION;

	@FindBy(how=How.XPATH, using ="//ui-field-select[@policy='manual.shipment.reference.MTYP']//input")
	public WebElement click_SHIPPING_CONDITION;

	@FindBy(how=How.XPATH, using ="//ui-field-select[@policy='manual.shipment.reference.MTYP']//input")
	public WebElement click_EQUIPMENT_CODE_SAP;


}

