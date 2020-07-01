package com.ryder.online.pages.pageactions;


import com.ryder.online.RyderEntry.Element;
import com.ryder.online.createshipment.DateHelper;
import com.ryder.online.helper.DropDown.DropDownHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageobjects.RyderControlTowerHomePageObjects;
import com.ryder.online.pages.pageobjects.RyderControlTowerLoginPageObjects;
import com.ryder.online.pages.pageobjects.RyderEntryOnlineLoginPageObjects;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.settings.ObjectRepo;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RyderControlTowerHomePageActions extends RyderControlTowerHomePageObjects{

	private final Logger log = LoggerHelper.getLogger(RyderEntryOnlineLoginPageObjects.class);
	WaitHelper waitHelp = new WaitHelper(driver, ObjectRepo.reader);
	GenericActions action=new GenericActions(driver);
	Element ele = new Element(driver);
	Actions act = new Actions(driver);
	DropDownHelper dropHelp= new DropDownHelper(driver);
	RyderControlTowerLoginPageObjects login= new RyderControlTowerLoginPageObjects(driver);
//	DateHelper dateHelp = new DateHelper();
	public RyderControlTowerHomePageActions(WebDriver driver) {
		super(driver);
		
	}

	public String verify_SelectedClient(String customer) {
		String currentClient =ele.getElementvalue(text_client_Selection, "ui-bg-img");
		if (customer.equalsIgnoreCase(currentClient)) {
			System.out.println("customer to be selected equals selected customer" + currentClient);
			return currentClient;
		} else {
			System.out.println("both selected customer and TO BE selected customers are not equal"+customer);
			return customer;
		}
	}

	public void selectACustomer(String selectThisCustomer) throws InterruptedException {
		
		By dynCustomerElement = By.xpath("//div[contains(text(),'"+selectThisCustomer+"')]/preceding::div[1]");
		//waitHelp.waitForElement(text_client_Selection);
		Thread.sleep(2000);
		action.Click(text_client_Selection);
		//text_client_Selection.click();
		waitHelp.waitForElement(show_Customer_SelectDropdown);
		waitHelp.waitForElement(BTN_Apply);
		deselectAllCustomersAndSlectedOneCustomer();
		waitHelp.waitForLocator(dynCustomerElement);
		ele.Actions_Click(dynCustomerElement);
		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.setImplicitWait(10, TimeUnit.SECONDS);
		if(one_Selected_Customers.isEnabled()) {
			ele.Actions_Click(BTN_Apply);
			//action.Click(BTN_Apply);
		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.setImplicitWait(10, TimeUnit.SECONDS);
		waitHelp.waitForCountIsZero(ajax_spinners);
//		waitHelp.fluentWaitForElement(NotVisible_Spinner);
		//waitHelp.waitForElement(static_pickUPForcartTile);
		ngWebDriver.waitForAngularRequestsToFinish();
		}
	}

	private void deselectAllCustomersAndSlectedOneCustomer() {

		List<WebElement> elements = Total_Selected_Customers;
		for (WebElement element:elements)
		{
		element.click();
		}
		}

	public void navigateToShippingPage() throws InterruptedException {
		//ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.waitForInvisibleElement(Visible_Spinner);
		action.Click(click_Banner_Shipping);
		waitHelp.waitForElement(click_Create_Shipment);
		action.Click(click_Create_Shipment);
	}

	public void click_Manual_Shipment() {
		try {
		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.waitForElement(Manual);
		action.Click(Manual);
//		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.waitForElement(static_PageHeaderTitle);
		waitHelp.waitForElement(text_Origin_LoactionID);
		ngWebDriver.waitForAngularRequestsToFinish();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("the manual tile is not available");
		}

	}

	public void enterOrignLocationID(String originLocationID) throws InterruptedException {

		ngWebDriver.waitForAngularRequestsToFinish();
		System.out.println("Enter Origin ID:" + text_Origin_LoactionID);
//		waitHelp.waitForElement(text_Origin_LoactionID);
//		waitHelp.waitForInvisibleElement(NotVisible_Spinner);
//		waitHelp.waitForSpinnerToDisappear(Ajax_Spinner);
		waitHelp.waitForInvisibleElement(Visible_Spinner);
		action.enterTextInTextBox(text_Origin_LoactionID, originLocationID);
		waitHelp.waitForElement(hover_repeat_selection);
		action.Click(hover_repeat_selection);
		ngWebDriver.waitForAngularRequestsToFinish();
	}

	public void enterDestinationLocationID(String destinationLocationID) {
		By selectLocId = By.xpath("//span[contains(text(),'"+destinationLocationID+"')]");
		ngWebDriver.waitForAngularRequestsToFinish();
		System.out.println("Enter Destination ID:" + text_Destination_LoactionID);
		waitHelp.waitForElement(text_Destination_LoactionID);
		action.enterTextInTextBox(text_Destination_LoactionID, destinationLocationID);
		waitHelp.waitForLocator(selectLocId);
		action.ClickLocator(selectLocId);
	//	waitHelp.waitForSpinnerToDisappear(Ajax_Spinner);
		ngWebDriver.waitForAngularRequestsToFinish();
	}

	public void enterPickUpDate(String pickUpDate, WebElement element) {
		String date = null;
		switch(pickUpDate.toLowerCase()) {
		case "1":
			date = DateHelper.getDateOfThisWeek(1);

			break;

		case "2":
			date=DateHelper.getDateOfThisWeek(2);
			break;

		case "3":
			date=DateHelper.getDateOfThisWeek(3);
			break;
		case "4":
			date=DateHelper.getDateOfThisWeek(4);
			break;
		case "5":
			date=DateHelper.getDateOfThisWeek(5);
			break;
		case "6":
			date=DateHelper.getDateOfThisWeek(6);
			break;
		case "7":
			date=DateHelper.getDateOfThisWeek(7);
			break;

		}
		if(date != null && !date.isEmpty()) {
			action.enterTextInTextBox(element, date);
		}

	}



	public void enterDeliveryDate(String deliveryDate, WebElement element) {
		String date = null;
		switch(deliveryDate.toLowerCase()) {
		case "0":
			date =DateHelper.getAnyNoOftWeekStartingFromThisWeek(0);
			break;
		case "1":
			date = DateHelper.getAnyNoOftWeekStartingFromThisWeek(1);

			break;

		case "2":
			date=DateHelper.getAnyNoOftWeekStartingFromThisWeek(2);
			break;

		case "3":
			date=DateHelper.getAnyNoOftWeekStartingFromThisWeek(3);
			break;


		}
		action.enterTextInTextBox(element, date);
		//text_DeliveryDate.sendKeys(Keys.RETURN);
//		action.Click(click_Active_Element);
	}



	public void enterCustomerOrderNumber() {
		action.enterTextInTextBox(text_CustomerOrderNumber, "12345");
	}

	public void enterAlsPoNumber() {
		action.enterTextInTextBox(text_Alstom_PoNumber, "12345");
	}

//	public void selectInboundOrderType(String oderType) {
//		action.Click(select_OderType);
//		waitHelp.waitForElement(select_InBound_OrderType);
//		action.Click(select_InBound_OrderType);
//	}
//
//	public void selectOutboundOrderType() {
//		action.Click(select_OderType);
//		waitHelp.waitForElement(select_OutBound_OrderType);
//		action.Click(select_OutBound_OrderType);
//	}


	public void selectEquipmentType(String EquipmentType) {

		By selectEquipmentType = By.xpath("//span[text()='"+EquipmentType+"']");

		ele.Actions_Click(click_EquipmentType);
		waitHelp.waitForLocator(selectEquipmentType);
		ele.clickElementJsvar(selectEquipmentType);

	}

	public void selectHazmat_AsYes() {

		ele.Actions_Click(click_Hazmat);
		waitHelp.waitForElement(click_HazmatValue_Y);
		ele.clickElementJsvar(click_HazmatValue_Y);

	}

public void selectHazmat_AsNo() {

		ele.Actions_Click(click_Hazmat);
		waitHelp.waitForElement(click_HazmatValue_N);
		ele.clickElementJsvar(click_HazmatValue_N);

	}

	public void selectBillingTypeFreightTerms(String freightTerms) {

		By selectBillingTypeLocator = By.xpath("(//ui-field-select[@label='Freight Terms']//following::div)//span[text()='"+freightTerms+"']");
		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.setImplicitWait(20, TimeUnit.MILLISECONDS);
		waitHelp.waitForElement(click_FreightTerms);
		action.Click(click_FreightTerms);
		waitHelp.setImplicitWait(5, TimeUnit.SECONDS);
		waitHelp.waitForLocator(selectBillingTypeLocator);

		ele.clickElementJsvar(selectBillingTypeLocator);

	}



	public void selectContainerType(String data) {
		By selectContainerTypeLocator = By.xpath("//ui-field-select[@ng-model='handlingUnits[selectedIndex].quantityUom']//span[text()='"+data+"']");
		ngWebDriver.waitForAngularRequestsToFinish();
		action.Click(click_ContainerType);
		waitHelp.waitForLocator(selectContainerTypeLocator);
		action.ClickLocator(selectContainerTypeLocator);

	}



	public void selectFreightClass(String freightClass) {
		By selectFreightClassLocator = By.xpath("//ui-field-select[@ng-model='handlingUnits[selectedIndex].freightClass']//span[text()='"+freightClass+"']");
		action.Click(click_FreightClass);
		waitHelp.waitForLocator(selectFreightClassLocator);
		action.ClickLocator(selectFreightClassLocator);
	}



	public void enterWeightInDimensionsField(String weight) {

		action.enterTextInTextBox(text_HandlingUnitWeight, weight);
	}



	public void clikSubmitForShipment() throws InterruptedException {
		System.out.println(System.currentTimeMillis());
		ngWebDriver.waitForAngularRequestsToFinish();
		System.out.println(System.currentTimeMillis());
		waitHelp.waitForElement(BTN_Submit);
		System.out.println(System.currentTimeMillis());
		Thread.sleep(3000);
		System.out.println(System.currentTimeMillis());
		action.Click(BTN_Submit);
		System.out.println(System.currentTimeMillis());

//		waitHelp.waitForSpinnerToDisappear(Ajax_Spinner);
		waitHelp.waitForSpinnerToDisappear(Visible_Spinner);
		System.out.println(System.currentTimeMillis());
		//ngWebDriver.waitForAngularRequestsToFinish();
	}

	public void addressValidation() throws InterruptedException {

		try {
			try {
				if(when_spinner_clocking.isDisplayed()) {
					waitHelp.waitForInvisibleElement(Visible_Spinner);
				}
				else {
					System.out.println("spinner was not shown this time");
				}
			}catch(Exception e) {
				waitHelp.setImplicitWait(5, TimeUnit.MILLISECONDS);
			}
			System.out.println(System.currentTimeMillis());
			boolean result = (BTN_Accept1.isDisplayed());
			System.out.println(System.currentTimeMillis());
			if(result==true) {
				System.out.println("first accept button");
				waitHelp.waitForElement(BTN_Accept);
				ele.Actions_Click(BTN_Accept1);
				System.out.println("second accept button");
				try {
					waitHelp.waitForInvisibleElement(Visible_Spinner);
					boolean result1 = (BTN_Accept1.isDisplayed());

					if(result1==true) {
						Thread.sleep(1000);
						ele.Actions_Click(BTN_Accept1);
						System.out.println("trying in try block");
					}
				}catch(Exception e) {
					System.out.println("trying in exception block");
					ele.Actions_Click(BTN_Accept1);
					System.out.println("clicked successfully");
				}
			}
		}catch(Exception e) {
			System.out.println(System.currentTimeMillis());
			System.out.println("before visibility of visible spinner");
			ngWebDriver.waitForAngularRequestsToFinish();
			System.out.println("after visibility of visible spinner");
			Thread.sleep(3000);
		}
	}



//	private void clickAcceptButtons() {

//		List<WebElement>element =BTN_Accept;
//		for (WebElement e :element)
//		{
//
//			waitHelp.waitForElement(staticText_AddressValidation);
//		//	action.Click(staticText_AddressValidation);
//		//	waitHelp.waitForElement(BTN_Accept);
//			try {
//				WebElement e1 =driver.findElement((By) e);
//				waitHelp.waitForElement(e);
//			ele.Actions_Click(e1);
//			}
//			catch(StaleElementReferenceException ess){
//				System.out.println(ess.getMessage());
//				ele.Actions_Click(e);
//			}
//			//ele.clickelementJs(e);
//		}
//	}



	public String navigatedToshipmentSubmittedPage() {
	try {
	//	waitHelp.waitForSpinnerToDisappear(Ajax_Spinner);
		waitHelp.waitForElement(title_ShipmentSubmitted);
		ngWebDriver.waitForAngularRequestsToFinish();
		try {
		if (static_error_Processing_Shipement.isDisplayed()) {
			action.Click(click_Warning_Ok);
		}
		else {
			System.out.println("no Error Processing Shipment pop up was shown");
		}}
		catch(Exception e) {
			System.out.println("if and else did not work for static erro processing shipment");
		}
	}catch(Exception e ) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

		String shipmentID = ele.getWebElementText(staticText_ShipmentNumber);
		System.out.println(shipmentID);

		String [] getcustLogo =shipmentID.split("#");
        for (String sw :getcustLogo){
            System.out.println(sw.trim());
        }
		 String shipmentNumber = getcustLogo[1];
		 System.out.println("shipment number is : "+shipmentNumber);
		return shipmentNumber;

	}



	public void navigateToTrackShipmentPage(String shipmentID) throws InterruptedException {

		ngWebDriver.waitForAngularRequestsToFinish();
		action.Click(click_Banner_Tracking);
		waitHelp.waitForElement(click_Shipment_Tracking);
		action.Click(click_Shipment_Tracking);
		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.waitForElement(text_ShipmentNumber);
		action.enterTextInTextBox(text_ShipmentNumber, shipmentID);
		//action.enterTextInTextBox(text_ShipmentNumber, "2023287937");
				//"209973222");
		waitHelp.waitForElement(click_Apply_Button);
		//action.Click(click_Apply_Button);
		click_Apply_Button.submit();
		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.waitForElement(Shipment_Listed);
		Thread.sleep(2000	);
		if(Shipment_Listed.getText().contains(shipmentID)){
//		if(Shipment_Listed.getText().contains("2023287937")){
			Assert.assertTrue(true,"Shipment should be displayed.");
//			Actions Action = new Actions(ObjectRepo.driver);
//			Action.moveToElement(Shipment_Listed).click().perform();
		}else{
			Assert.fail("Shipment not found.");
		}

//		waitHelp.waitForElement(Loads_Tracking);
	}



	public String verify_LoadInformation() throws InterruptedException {
		Actions Action = new Actions(ObjectRepo.driver);
		Action.moveToElement(Shipment_Listed).click().perform();
		Thread.sleep(3000);
		action.Click(Loads_Tracking);
		waitHelp.waitForElement(read_LoadStatus);
		String status = ele.getWebElementText(read_LoadStatus);
		return status;

	}

	public String get_LoadNumber() {

		waitHelp.waitForElement(read_LoadNumber);
		String LoadNumber = ele.getWebElementText(read_LoadNumber);
		return LoadNumber;

	}

	public void navigateToHandlingUnits() {

		action.Click(HandlingUnits_Tracking);
		waitHelp.waitForElement(static_HandlingUnitText);

	}



	public void validateHanlingUnitAttributeAreNotNull() {

		waitHelp.waitForElement(read_Quantity);
		waitHelp.waitForElement(read_Lenght);
		waitHelp.waitForElement(read_Width);
		waitHelp.waitForElement(read_Height);
		waitHelp.waitForElement(read_Weight);
		waitHelp.waitForElement(read_FreightClass);

	}



	public void logoff_RCT() {
		action.Click(click_User_ICON);
		waitHelp.waitForElement(click_Sign_Out);
		action.Click(click_Sign_Out);
		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.waitForElement(login.RCT_Login_LandingPage);
	}



	public void select_OrderType(String orderType) {
		By ordterTypeValue = By.xpath("//div[contains(@policy,'manual.shipment.reference.OTY')]//span[contains(text(),'"+orderType+"')]");
		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.setImplicitWait(30, TimeUnit.SECONDS);
		ele.Actions_Click(select_OderType);
		waitHelp.waitForLocator(ordterTypeValue);
		action.ClickLocator(ordterTypeValue);
	}

	public void select_MovementType(String MovementType) {
		By MovementTypeValue = By.xpath("//div[@policy='manual.shipment.reference.STYP']//span[text()='"+MovementType+"']");
		//ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.setImplicitWait(30, TimeUnit.SECONDS);
		ele.Actions_Click(select_MovementType);
		waitHelp.waitForLocator(MovementTypeValue);
		action.ClickLocator(MovementTypeValue);
	}

	public void enter_Po_Number() {
		action.enterTextInTextBox(text_Alstom_PoNumber, "124532");
	}



	public void select_equipmentType(String equipmentType) {
		By equipmentTypeValue = By.xpath("//ui-field-select[@label='Equipment Types']//div[@policy='manual.shipment.attribute.EQPT']//span[text()='"+equipmentType+"']");

//		action.Click(click_EquipmentType);
		ele.Actions_Click(click_EquipmentType);
		waitHelp.waitForLocator(equipmentTypeValue);
		waitHelp.setImplicitWait(30, TimeUnit.SECONDS);
		action.ClickLocator(equipmentTypeValue);

	}



	public void select_Hazmat_Yes() {
		action.Click(click_Hazmat);
		waitHelp.waitForElement(click_HazmatValue_Y);
		waitHelp.setImplicitWait(30, TimeUnit.SECONDS);
		action.Click(click_HazmatValue_Y);
	}



	public void naviageToShippingAndHandlingPage() {
	//	action.Click(BTN_Submit);
		ele.Actions_Click(BTN_Submit);
		ngWebDriver.waitForAngularRequestsToFinish();
		waitHelp.waitForInvisibleElement(Visible_Spinner);
		waitHelp.waitForElement(click_ContainerType);

	}



	public void select_Hazmat_No(String str) {

		action.Click(click_Hazmat);
		if(str.equalsIgnoreCase("Y")){
			waitHelp.waitForElement(click_HazmatValue_Y);
			action.Click(click_HazmatValue_Y);
		}else{
			waitHelp.waitForElement(click_HazmatValue_N);
			action.Click(click_HazmatValue_N);
		}

	}



	public void enter_Customer_OrderNumber() {
		action.enterTextInTextBox(text_Customer_OrderNumber, "456789");

	}



	public void select_moveType(String moveType) {
		By selectMoveTypeLocator = By.xpath("//ui-field-select[@policy='manual.shipment.reference.MTYP']//span[text()='"+moveType+"']");
		waitHelp.setImplicitWait(150, TimeUnit.MILLISECONDS);
		ele.Actions_Click(click_moveType);
		waitHelp.waitForLocator(selectMoveTypeLocator);
		action.ClickLocator(selectMoveTypeLocator);
	}



	public void enter_ProjectNumber(String str) {
		action.enterTextInTextBox(text_ProjectNumber, "12345");
	}

	public void select_glCode(String glCode) {
		By selectGLCode = By.xpath("//div[@policy='manual.shipment.reference.GL']//div//span[text()='"+glCode+"']");
		waitHelp.setImplicitWait(150, TimeUnit.MILLISECONDS);
		//click_GlCode.click();
		action.Click(click_GlCode);
		waitHelp.waitForLocator(selectGLCode);
		action.ClickLocator(selectGLCode);
	}

	public void select_productLine(String productLine) {
		By selectProductLine = By.xpath("//div[@policy='manual.shipment.reference.PT']//div//span[text()='"+productLine+"']");
		action.Click(click_ProdutLine);
		waitHelp.waitForLocator(selectProductLine);
		action.ClickLocator(selectProductLine);

	}

	public void enter_pallet_weight_volume(String pallet, String weight, String volume) {
		action.enterTextInTextBox(text_Attribute_Totalpallets, pallet);
		action.enterTextInTextBox(text_Attribute_weight, weight);
		action.enterTextInTextBox(text_Attribute_volume, volume);
	}

	public void expand_AddEdit_LinItem() {
		
		action.Click(click_AddItem);
		waitHelp.waitForElement(text_ItemCode);
		
		
	}



	public void enterItemCode_ItemDescription(String itemCode, String itemDescription) {
		
		By description_searchResult = By.xpath("//span[text()='"+itemDescription+"']");
		remove_ItemCode(list_OfLineItems);
		
			action.enterTextInTextBox(text_ItemCode, itemCode);
			action.enterTextInTextBox_JS(text_ItemCode_Description, itemDescription);
			waitHelp.waitForLocator(description_searchResult);
			action.ClickLocator(description_searchResult);
			waitHelp.waitForElement(editable_notEmpty_Weight);
	
		
	}

	
	public void remove_ItemCode(List<WebElement> elements) {
		
		try {
			Iterator<WebElement> iter = elements.iterator();
			while(iter.hasNext()) {
			    WebElement we = iter.next();

			int eleSize = elements.size();
System.out.println(eleSize);			
			try {

			if (eleSize>1) {
				action.Click(ItemCode_RemoveItem);
			}
		}
			catch(Exception e) {
			e.getMessage();
			System.out.println(e.toString());
		}

		}}
			catch(Exception e) {
				e.getMessage();
				System.out.println(e.toString());
			}
			}

	public void update_ItemCode_Quantity(String quantity) {
		action.enterTextInTextBox(text_ItemCode_Quantity,quantity );
//		try {
//			if(ItemCode_RemoveItem.isDisplayed()) {
//				action.Click(ItemCode_RemoveItem);
//			}
//		}catch(Exception e)
//		{
//			e.getMessage();
//			System.out.println(e.toString());
//		}
	}

	public void click_Must_Pick_Up_On() {
		try {
			act.click(btn_MustPickUp).perform();
		}
		catch(Exception e) {

			System.out.println(e.getMessage());
			System.out.println("the Must be PickUp On is not available");
		}

	}
	public void click_Must_deliver_By() {
		try {
			act.click(btn_MustDeliveredBy).perform();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("the Must be Delivered By tile is not available");
		}

	}

	public void select_BUNDLECODE(String BUNDLECODE) {
		By selectBUNDLECODELocator = By.xpath("//ui-field-select[@policy='manual.shipment.reference.MTYP']//span[text()='"+BUNDLECODE+"']");
		waitHelp.setImplicitWait(150, TimeUnit.MILLISECONDS);
		ele.Actions_Click(click_BUNDLECODE);
		waitHelp.waitForLocator(selectBUNDLECODELocator);
		action.ClickLocator(selectBUNDLECODELocator);
	}

	public void select_COMPANYCODE(String COMPANYCODE) {
		By selectCOMPANYCODELocator = By.xpath("//ui-field-select[@policy='manual.shipment.reference.MTYP']//span[text()='"+COMPANYCODE+"']");
		waitHelp.setImplicitWait(150, TimeUnit.MILLISECONDS);
		ele.Actions_Click(click_COMPANYCODE);
		waitHelp.waitForLocator(selectCOMPANYCODELocator);
		action.ClickLocator(selectCOMPANYCODELocator);
	}

	public void select_SALES_PURCHASING_ORGANIZATION(String SALES_PURCHASING_ORGANIZATION) {
		By selectSALES_PURCHASING_ORGANIZATIONLocator = By.xpath("//ui-field-select[@policy='manual.shipment.reference.MTYP']//span[text()='"+SALES_PURCHASING_ORGANIZATION+"']");
		waitHelp.setImplicitWait(150, TimeUnit.MILLISECONDS);
		ele.Actions_Click(click_SALES_PURCHASING_ORGANIZATION);
		waitHelp.waitForLocator(selectSALES_PURCHASING_ORGANIZATIONLocator);
		action.ClickLocator(selectSALES_PURCHASING_ORGANIZATIONLocator);
	}

	public void select_SHIPPING_CONDITION(String SHIPPING_CONDITION) {
		By selectSHIPPING_CONDITIONLocator = By.xpath("//ui-field-select[@policy='manual.shipment.reference.MTYP']//span[text()='"+SHIPPING_CONDITION+"']");
		waitHelp.setImplicitWait(150, TimeUnit.MILLISECONDS);
		ele.Actions_Click(click_SHIPPING_CONDITION);
		waitHelp.waitForLocator(selectSHIPPING_CONDITIONLocator);
		action.ClickLocator(selectSHIPPING_CONDITIONLocator);
	}

	public void select_EQUIPMENT_CODE_SAP(String EQUIPMENT_CODE_SAP) {
		By selectEQUIPMENT_CODE_SAPLocator = By.xpath("//ui-field-select[@policy='manual.shipment.reference.MTYP']//span[text()='"+EQUIPMENT_CODE_SAP+"']");
		waitHelp.setImplicitWait(150, TimeUnit.MILLISECONDS);
		ele.Actions_Click(click_EQUIPMENT_CODE_SAP);
		waitHelp.waitForLocator(selectEQUIPMENT_CODE_SAPLocator);
		action.ClickLocator(selectEQUIPMENT_CODE_SAPLocator);
	}

}
