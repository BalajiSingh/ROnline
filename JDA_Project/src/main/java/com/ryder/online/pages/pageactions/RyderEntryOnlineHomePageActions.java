package com.ryder.online.pages.pageactions;

import com.ryder.online.RyderEntry.Element;
import com.ryder.online.RyderEntry.Util;
import com.ryder.online.configreader.FileReaderManager;
import com.ryder.online.helper.CheckBox.CheckBoxOrRadioButtonHelper;
import com.ryder.online.helper.DropDown.DropDownHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageobjects.RyderEntryOnlineHomePageObjects;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.settings.ObjectRepo;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import com.ryder.online.helper.managers.TestContext;
/*
 * 
 * @author javeed 
 * 
 * 01/03/2020
 * 
 * 
 */
public class RyderEntryOnlineHomePageActions extends RyderEntryOnlineHomePageObjects{
	private final Logger log = LoggerHelper.getLogger(RyderEntryOnlineHomePageActions.class);
	
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	RyderEntryOnlineLoginPageActions login=new RyderEntryOnlineLoginPageActions(ObjectRepo.driver);
	RyderControlTowerHomePageActions homeActions = new RyderControlTowerHomePageActions(ObjectRepo.driver);
	DropDownHelper dropDown_Help = new DropDownHelper(driver);
	CheckBoxOrRadioButtonHelper chkbox = new CheckBoxOrRadioButtonHelper(driver);
	Element ele = new Element(driver);
	GenericActions action = new GenericActions(driver);
	Util utility = new Util();

	
	public RyderEntryOnlineHomePageActions(WebDriver driver) {
		super(driver);
		
	}
	
	public void click_TransportationLink() {
		
		waitHelp.waitForElement(click_TranportationLink);
		action.Click(click_TranportationLink);
		
		
	}

public void click_ShipmentLink() {
	waitHelp.waitForElement(click_ShipmentLink);
		action.Click(click_ShipmentLink);
		
	}


public boolean navigate_To_CreateShipment() {
	boolean navigated = false;
	try {
	click_TransportationLink();
	//navigated =waitHelp.waitForElement(ROL_HomeObj.click_ShipmentLink);
	click_ShipmentLink();
	navigated =waitHelp.waitForElement(copy_ryder_Entry_Number);
	System.out.println("navigated to ShipmentEntry page successfully");
	return navigated;
	}
	catch(Exception e){
		log.info(e.getMessage());
		log.info("navigation to create shipment page is not successfull");
		
	}
	return navigated;
	
}
	
public void select_CustomerNum(String value) {	
	
	String customer =getSelectedCustomer();
	
	verifyWhichCustomer_isSelected(value, customer);
	
		dropDown_Help.SelectUsingVisibleValue(select_customer_DropDown, value);
		
	
}

public void select_LoadCustomerNum(String value) {
	String customer =getSelectedCustomer();
	verifyWhichCustomer_isSelected(value, customer);
	dropDown_Help.SelectUsingVisibleValue(select_customer_DropDown, value);
	}
private String getSelectedCustomer() {
	
	String logovalue = ele.getvalue(Logo_of_customer, "src");
	
	int lastIndexOf = logovalue.lastIndexOf("/");
	 String endPortion = logovalue.substring( lastIndexOf + 1 );
	 
	 String lastsplit = endPortion.replace(".", "_");
	int last = lastsplit.indexOf("_");
	 String Customeractualname = endPortion.substring(0,last);
	return Customeractualname;
}

private void verifyWhichCustomer_isSelected(String valueFromFeatureFile, String CurrentcustomerFromUI) {
	
	if(valueFromFeatureFile.contains(CurrentcustomerFromUI)) {
		System.out.println("Customer in UI screen and the customer to be selected are same");
	}else {
		System.out.println("customer in UI and the customer needs to be selected are different");
		return;
	}
		
	
}

public void select_PickUp_Convention(String pickUpConvention) {	
	
	dropDown_Help.SelectUsingVisibleValue(select_pickupConvention, pickUpConvention);

}
public void select_Delivery_Convention(String deliveryConvention) {	
	
	dropDown_Help.SelectUsingVisibleValue(select_deliveryConvention, deliveryConvention);

}

public void enter_PickUp_Date() {	
String 	enterPickUpDate = utility.tomorrowsdate();
action.enterTextInTextBox(text_pickupDate, enterPickUpDate);

}
public void enter_Delivery_Date() {	
	String enterDeliveryDate = utility.getNextWeekdate();
	action.enterTextInTextBox(text_deliveryDate, enterDeliveryDate);

}


public void enterOriginationAddress(String origination) {
	
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
    String childWindow = "";
	System.out.println("Currently check box is selected as Save Address As Default");
	if (origination!=null && origination.length() !=0) {
	action.Click(click_Search_OriginAddress_Button);
	 try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	    Set<String> allWindows = driver.getWindowHandles();
	    System.out.println(allWindows.size());
	if(allWindows.size()>1) 
	{
	    for (String window : allWindows) {
	    	System.out.println(window);
	        if (!window.equals(parentWindow)) 
	        {
	            childWindow = window;
	            
	        }
	    }
	}
	
		driver.switchTo().window(childWindow);
	    driver.manage().window().maximize();
		waitHelp.waitForElement(static_AddresSearch);
	    action.enterTextInTextBox(text_AddressID, origination);
	    action.Click(click_SearchAddress_Button);
	    waitHelp.waitForElement(static_SearchResults);
	    action.Click(select_AddressButton);
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println(parentWindow);
	    driver.switchTo().window(parentWindow);
	    System.out.println("switched to parent window successfully");
	    String addressName =text_OriginAddressname.getAttribute("value");
	    String addressName1 =text_OriginAddressname.getText();
	    String addressName2 =text_OriginAddressname.toString();
	    if(addressName == "" || addressName.isEmpty()||addressName==null) {
	    	System.out.println("this address name attribute value is empty");
	    	  action.enterTextInTextBox(text_OriginAddressname, "64-rdc-uwa");
	//    	text_OriginAddressname.sendKeys("64-rdc-uwa");
	    }
//	    if(addressName1 != "" || addressName1.isEmpty()||addressName1==null) {
//	    	System.out.println("this is empty");
//	    	text_OriginAddressname.sendKeys("b");
//	    }
//	    if(addressName2 != "" || addressName2.isEmpty()||addressName2==null) {
//	    	System.out.println("this is empty");
//	    	text_OriginAddressname.sendKeys("c");
//	    }
	    action.enterTextInTextBox(text_OriginContactname, "test");
	    action.enterTextInTextBox(text_OriginContactPhone, "9491885810");
	    dropDown_Help.SelectUsingVisibleValue(select_Origin_TimeZone, "CT");
	}
	System.out.println("not selecting any origiantion address");
}

public void enterDestinationAddress(String destination) {

	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
    String childWindow = "";
	System.out.println("Currently check box is selected as Save Address As Default");
	if(destination!=null&& destination.length() !=0)
	{
	action.Click(click_Search_DestinationAddress_Button);
	 try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	    Set<String> allWindows = driver.getWindowHandles();
	    System.out.println(allWindows.size());
	if(allWindows.size()>1) 
	{
	    for (String window : allWindows) {
	    	System.out.println(window);
	        if (!window.equals(parentWindow)) 
	        {
	            childWindow = window;
	            
	        }
	    }
	}
	
		driver.switchTo().window(childWindow);
	    driver.manage().window().maximize();
		waitHelp.waitForElement(static_AddresSearch);
	    action.enterTextInTextBox(text_AddressID, destination);
	    action.Click(click_SearchAddress_Button);
	    waitHelp.waitForElement(static_SearchResults);
	    action.Click(select_AddressButton);
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println(parentWindow);
	    driver.switchTo().window(parentWindow);
	    System.out.println("switched to parent window successfully");
	    action.enterTextInTextBox(text_DestContactname, "test");
	    action.enterTextInTextBox(text_DestContactPhone, "9491885810");
	    dropDown_Help.SelectUsingVisibleValue(select_Destination_TimeZone, "CT");
	}
	System.out.println("not selecting any destination address");
}

public void select_OrderType(String orderType) {
	
	dropDown_Help.SelectUsingVisibleValue(select_OrderType,orderType);
}


public void enter_CostCenter_Number(String enterCostCenterNumber) {	
	
	action.enterTextInTextBox(text_CostCenterNumber, enterCostCenterNumber);
	//dropDown_Help.SelectUsingVisibleValue(Select_CostCenterNumber, enterCostCenterNumber);
}

public void select_General_Ledger(String selectGeneralLedger) {
	
	dropDown_Help.SelectUsingVisibleValue(select_GeneralLedger, selectGeneralLedger);

}

public void select_ServiceLevel(String selectServiceLevel) {
	System.out.println("abcd");
	
	if(chkbox.isIselected(checkbox_shortLeadTime))
	
	{
		chkbox.unSelectCheckBox(checkbox_shortLeadTime);
	}
	//waitHelp.waitForElement(checkbox_waitAfter_Uncheck);
	waitHelp.waitUntilElementDisplayed(checkbox_waitAfter_Uncheck);
//	dropDown_Help.SelectUsingValue(select_ServiceLevel, selectServiceLevel);
	dropDown_Help.SelectUsingVisibleValue(select_ServiceLevel, selectServiceLevel);
}

public void select_Commodity(String selectCommodity) {
	
	dropDown_Help.SelectUsingVisibleValue(select_commodity, selectCommodity);
}
	
public void launch_add_edit_shipmentLineItem(String qty, String weight, String item, String description, String typeOfContainer) {
	
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
    String childWindow = "";
    action.Click(click_Add_Edit_Button);
    try {
		Thread.sleep(5000);
		//String s = ele.getElements(ROL_LoginObj.ROL_Landing_CustomerLoginText).getText();
	
//		try
//		{
//			int sz = ele.getElements(ROL_LoginObj.ROL_Landing_CustomerLoginText).size();
//			if( sz>0) {
//			login.RyderEntry_Login("mjakram","mjakam");
//			}
//		}catch(NoSuchElementException d) {
//			d.getMessage();
//			d.printStackTrace();
//		}
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    Set<String> allWindows = driver.getWindowHandles();
    System.out.println(allWindows.size());
if(allWindows.size()>1) {
    for (String window : allWindows) {
    	System.out.println(window);
        if (!window.equals(parentWindow)) {
            childWindow = window;
            System.out.println(childWindow);
            System.out.println(driver.getWindowHandle());
            
        }
    }
}
	driver.switchTo().window(childWindow);
  
    driver.manage().window().maximize();
    System.out.println(childWindow);
    enterShipmentLineItemDetails(qty, weight);
    selectContainerType(typeOfContainer);
    enter_Item_Description(item, description);
    action.Click(click_Add_Items_Button);
    waitHelp.waitForElement(selectedLineItemRow);
    click_Submit_Button();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
    
    System.out.println(parentWindow);
    driver.switchTo().window(parentWindow);
    System.out.println("switched to parent window successfully");
    System.out.println(driver.getCurrentUrl());
}

public boolean verifyCurrentUrl() {
	
	String currentUrl = driver.getCurrentUrl();
	boolean urlshouldcontain = currentUrl.contains("shipmententrylineitemselector");
	
	return urlshouldcontain;
}


public void enterShipmentLineItemDetails(String Quantity, String Weight) {
	
	waitHelp.waitForElement(checkbox_manualEntryCheckbox);
	chkbox.selectCheckBox(checkbox_manualEntryCheckbox);
	action.enterTextInTextBox(text_manualEntryQty, Quantity);
	action.enterTextInTextBox(text_manualEntryWeight, Weight);
}

public void selectContainerType(String containerType) {
	
	dropDown_Help.SelectUsingVisibleValue(select_ContainerType, containerType);

}

public void enter_Item_Description(String itemCode, String description) {
	
	action.enterTextInTextBox(text_manualEntry_SKU, itemCode);

	action.enterTextInTextBox(text_ItemDescription, description);
}

public void click_Submit_Button() {
	
	chkbox.selectCheckBox(checkbox_SelectedLineItem);
	action.Click(click_Submit_Button);
	
}

public void navigate_To_ConfirmationPage() {
	
	
	action.Click(click_Submit_Button);
	waitHelp.waitForElement(ryderEntry_ConfirmationPage);
}

public String get_Unique_Shipment_Number() {
	
	//String = ele.getElementvalue(ROL_HomeObj.ryderEntry_Unique_Number, TEXT);
	String number = ele.getWebElementText(ryderEntry_Unique_Number);
	String [] twoParts = number.split(":", 2);
	 for (String a :twoParts) {
		 System.out.println(a.trim());
	 }
	
	return twoParts[1].trim();
	
	}

public void select_Shipment_Status(String all) {
	
	dropDown_Help.SelectUsingValue(select_ryderEntry_Status, all);
}

public boolean compare_RyderEntry_UniqueNumbers() {
	String REnumber = ele.getElementvalue(text_RyderEntry_Unique_ShipmentId,"value");
	String row_Data_REnumber = ele.getWebElementText(row_having_shipment_Details);
	
	boolean verified = REnumber.equals(row_Data_REnumber);

	return verified;
}

	public boolean compare_RyderEntry_LoadNumber(String loadno) {
		String REnumber = loadno;
		String row_Data_REnumber = ele.getWebElementText(row_having_Load_Details);

		boolean verified = REnumber.equals(row_Data_REnumber);

		return verified;
	}

public void select_Approver(String approver) {
	
	dropDown_Help.SelectUsingVisibleValue(select_Approver, approver);
}

public void click_LoadLink() {
	waitHelp.waitForElement(click_Track_Load);
		action.Click(click_Track_Load);
		
	}

public void navigat_To_TrackLoad() {

	
	try {
	
		click_TransportationLink();
		click_LoadLink();
		waitHelp.waitForElement(text_Load_Number);
		System.out.println("navigated to Load Search page successfully");
		
		}
		catch(Exception e){
			log.info(e.getMessage());
			log.info("navigation to Load Search page is not successfull");
			
		}
	
}

public void search_For_LoadNumber(String search_Company) {

	action.enterTextInTextBox(text_Load_Number, "10211");
	action.Click(click_Search_Button_ToTrackShipment);
	waitHelp.waitForElement(static_Load_SearchResult_Page);
	action.Click(click_LoadDetail_Button);
	waitHelp.waitForElement(static_LoadDetail_Page);
}

public void Add_EditAppointments() {
	action.Click(add_Edit_AppointmentsLink);
	waitHelp.waitForElement(static_ApptUpdatePage);
	waitHelp.waitForElement(text_origin_AppointmateDate);
	String 	enterPickUpDate = utility.tomorrowsdatePlusOne();
//	homeActions.enterPickUpDate(enterPickUpDate, text_origin_AppointmateDate);
	action.enterTextInTextBox(text_origin_AppointmateDate, enterPickUpDate);
	action.enterTextInTextBox(text_origin_AppointmentHour, "12");
	action.enterTextInTextBox(text_origin_AppointmentMinute, "12");
	dropDown_Help.SelectUsingValue(select_origin_AppointmentZone, "CT");
	String 	enterdeliveryDate = utility.getNextWeekdate();
//	homeActions.enterPickUpDate(enterdeliveryDate, text_destination_AppointmentDate);
	action.enterTextInTextBox(text_destination_AppointmentDate,enterdeliveryDate);
	action.enterTextInTextBox(text_destination_AppointmentHour, "12");
	action.enterTextInTextBox(text_destination_AppointmentMinute, "12");
	dropDown_Help.SelectUsingValue(select_destination_AppointmentZone, "CT");
}

public void open_Add_PickUpEvents() {
	action.Click(click_AddEdit_Link);
	waitHelp.waitForElement(static_AddAditionalStatus);
	action.Click(select_Location);
	waitHelp.waitForElement(static_Origin_Option);
	action.Click(static_Origin_Option);
}

public void open_Add_DeliveryEvents() {
	action.Click(click_AddEdit_Link);
	waitHelp.waitForElement(static_AddAditionalStatus);
	action.Click(select_Location);
	waitHelp.waitForElement(static_Destination_option);
	action.Click(static_Destination_option);
}

public void add_Shipment_LineItems(String qty, String totalweight, String containerType) {
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
    String childWindow = "";
    action.Click(click_Add_Edit_Button);
    try {
		Thread.sleep(5000);
	
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    Set<String> allWindows = driver.getWindowHandles();
    System.out.println(allWindows.size());
if(allWindows.size()>1) {
    for (String window : allWindows) {
    	System.out.println(window);
        if (!window.equals(parentWindow)) {
            childWindow = window;
            System.out.println(childWindow);
            System.out.println(driver.getWindowHandle());
            
        }
    }
}
	driver.switchTo().window(childWindow);
    driver.manage().window().maximize();
    System.out.println(childWindow);
    enterShipmentLineItemDetails(qty, totalweight);
    dropDown_Help.SelectUsingVisibleValue(select_ContainerTypeForRYD, containerType);
    action.Click(click_Add_Items_Button);
    waitHelp.waitForElement(selectedLineItemRow);
    click_Submit_Button();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
   
    System.out.println(parentWindow);
    driver.switchTo().window(parentWindow);
    System.out.println("switched to parent window successfully");
    System.out.println(driver.getCurrentUrl());
	
}

public void enter_CustomerOrderNumber(String customerOrderNumber) {
	action.enterTextInTextBox(text_CustomerOrderNumber,customerOrderNumber );
}

public void Arrived_PickUpLocationX3(String pickUpDate) {
	waitHelp.waitForElement(select_Status);
	dropDown_Help.SelectUsingValue(select_Status, "X3");
	String 	enterPickUpDate = utility.tomorrowsdate();
	action.enterTextInTextBox(text_status_Date, enterPickUpDate);
//	homeActions.enterPickUpDate(enterPickUpDate, text_status_Date);
	action.enterTextInTextBox(text_status_TimeHour, "12");
	action.enterTextInTextBox(text_status_TimeMinute, "12");
	dropDown_Help.SelectUsingVisibleValue(select_zone, "CT");
	action.Click(click_Submit_OnDialogBox);
	waitHelp.waitForElement(static_Arrived_PickUpLocation);
}

public void Carrier_PickUpLocationAF(String pickUpDate) {
	waitHelp.waitForElement(select_Status);
	dropDown_Help.SelectUsingValue(select_Status, "AF");
	String 	enterPickUpDate = utility.tomorrowsdate();
	action.enterTextInTextBox(text_status_Date, enterPickUpDate);
	
//	homeActions.enterPickUpDate(enterPickUpDate, text_status_Date);
	action.enterTextInTextBox(text_status_TimeHour, "12");
	action.enterTextInTextBox(text_status_TimeMinute, "13");
	dropDown_Help.SelectUsingVisibleValue(select_zone, "CT");
	action.Click(click_Submit_OnDialogBox);
	waitHelp.waitForElement(static_Carrier_Departed_PickUpLocation);
	
}

public void Arrived_DeliveryLocationX1(String deliveryDate) {
	waitHelp.waitForElement(select_Status);
	dropDown_Help.SelectUsingValue(select_Status, "X1");
	String 	enterdeliveryDate = utility.tomorrowsdatePlusOne();
	action.enterTextInTextBox(text_status_Date, enterdeliveryDate);
//	homeActions.enterPickUpDate(enterdeliveryDate, text_status_Date);
	action.enterTextInTextBox(text_status_TimeHour, "12");
	action.enterTextInTextBox(text_status_TimeMinute, "14");
	dropDown_Help.SelectUsingVisibleValue(select_zone, "CT");
	action.Click(click_Submit_OnDialogBox);
	waitHelp.waitForElement(static_Arrived_DeliveryLocation);
	
}

public void Carrier_DepartedLocationD1(String deliveryDate) {
	dropDown_Help.SelectUsingValue(select_Status, "D1");	
	waitHelp.waitForElement(select_Status);
	String 	enterdeliveryDate = utility.tomorrowsdatePlusOne();
	action.enterTextInTextBox(text_status_Date, enterdeliveryDate);
//	homeActions.enterPickUpDate(enterdeliveryDate, text_status_Date);
	action.enterTextInTextBox(text_status_TimeHour, "12");
	action.enterTextInTextBox(text_status_TimeMinute, "15");
	dropDown_Help.SelectUsingVisibleValue(select_zone, "CT");
	action.Click(click_Submit_OnDialogBox);
	waitHelp.waitForElement(static_Carrier_UnLoadingAtDeliveryLocation);
}

public void completed_AddingEvents() {
	action.Click(click_Submit_Button);
waitHelp.waitForElement(static_Edit_Button);
action.Click(click_Ok_Button);
waitHelp.waitForElement(static_Load_SearchResult_Page);
}

public void verify_Print_BOL_Pdf() {
	action.Click(click_PringBol_Button);
	
}

public boolean navigate_To_TrackShipment() {
	
	boolean navigated = false;
	try {
	click_TransportationLink();
	//navigated =waitHelp.waitForElement(ROL_HomeObj.click_ShipmentLink);
	click_TrackShipmentLink();
	navigated =waitHelp.waitForElement(static_SearchShipment);
	System.out.println("navigated to Search Shipment page successfully");
	return navigated;
	}
	catch(Exception e){
		log.info(e.getMessage());
		log.info("navigation to create shipment page is not successfull");
		
	}
	return navigated;
	
}

private void click_TrackShipmentLink() {
	waitHelp.waitForElement(click_Track_Shipment);
	action.Click(click_Track_Shipment);
}

public String read_LoadNumber() {
	waitHelp.waitForElement(copy_LoadNumber);
	//String loadNumber = ele.getElementText(copy_LoadNumber);
	return ele.getElementText(copy_LoadNumber);
}

public void enter_CustomerOrder_Number() {
	action.enterTextInTextBox(text_customerOrderNumber, "20190918");
}

public void launch_add_edit_shipmentLineItem(String qty, String weight, String containerType) {
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
    String childWindow = "";
    action.Click(click_Add_Edit_Button);
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    Set<String> allWindows = driver.getWindowHandles();
    System.out.println(allWindows.size());
if(allWindows.size()>1) {
    for (String window : allWindows) {
    	System.out.println(window);
        if (!window.equals(parentWindow)) {
            childWindow = window;
            System.out.println(childWindow);
            System.out.println(driver.getWindowHandle());

        }
    }
}
	driver.switchTo().window(childWindow);
  
    driver.manage().window().maximize();
    System.out.println(childWindow);
    enterShipmentLineItemDetails(qty, weight);
    dropDown_Help.SelectUsingVisibleValue(select_ContainerTypeForRYD, containerType);
  
    action.Click(click_Add_Items_Button);
    waitHelp.waitForElement(selectedLineItemRow);
    click_Submit_Button();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
    
    System.out.println(parentWindow);
    driver.switchTo().window(parentWindow);
    System.out.println("switched to parent window successfully");
    System.out.println(driver.getCurrentUrl());
}

public void launch_add_edit_shipmentLineItem(String qty, String itemCode, String description, String containerType) {

	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
    String childWindow = "";
    action.Click(click_Add_Edit_Button);
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
    Set<String> allWindows = driver.getWindowHandles();
    System.out.println(allWindows.size());
	if(allWindows.size()>1) {
		for (String window : allWindows) {
			System.out.println(window);
			if (!window.equals(parentWindow)) {
				childWindow = window;
				System.out.println(childWindow);
				System.out.println(driver.getWindowHandle());

			}
		}
	}
	driver.switchTo().window(childWindow);
  
    driver.manage().window().maximize();
    System.out.println(childWindow);
    action.Click(checkbox_manualEntryCheckbox);
    action.enterTextInTextBox(text_manualEntryQty, qty);
	action.enterTextInTextBox(text_ItemCode_SKU, itemCode);
	action.enterTextInTextBox(text_Item_Description, description);
    dropDown_Help.SelectUsingVisibleValue(select_ContainerTypeForRYD, containerType);
  
    action.Click(click_Add_Items_Button);
    waitHelp.waitForElement(selectedLineItemRow);
    click_Submit_Button();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
    
    System.out.println(parentWindow);
    driver.switchTo().window(parentWindow);
    System.out.println("switched to parent window successfully");
    System.out.println(driver.getCurrentUrl());
}


	public void select_MoveType(String MoveType) {
		dropDown_Help.SelectUsingVisibleValue(Select_MoveType, MoveType);
	}
	public void Select_ProductLine(String ProductLine) {
		dropDown_Help.SelectUsingVisibleValue(Select_ProductLine, ProductLine);
	}
	public void Select_GLCode(String GLCode) {
		dropDown_Help.SelectUsingVisibleValue(Select_GLCode, GLCode);
	}

	public void Enter_TotalPallets(String TotalPallets) {
		action.enterTextInTextBox(Enter_TotalPallets, TotalPallets);
	}

	public void Enter_Submitter(String Submitter) {
		try {
			Enter_Submitter.sendKeys(Submitter);
		}catch (NoSuchElementException e){
			Assert.fail("Submitter field is not found.");
		}
	}

	public void Enter_UniqueShipmentNo(String USN) {
		try {
			text_RyderEntry_Unique_ShipmentId.sendKeys(USN);
		}catch (NoSuchElementException e){
			Assert.fail("Unique Shipment Number field is not found.");
		}
	}
	public void Enter_ProjectNo(String ProjectNo) {
		action.enterTextInTextBox(Enter_ProjectNo, ProjectNo);
	}

	public void Enter_LoadNumber(String LoadNo) {
		try {
			Enter_LoadNo.sendKeys(LoadNo);
		}catch (NoSuchElementException e){
			Assert.fail("Load Number field is not found.");
		}
	}

	public void Enter_ShipmentNo(String Submitter) {
		try {
			Enter_ShipemntNo.sendKeys(Submitter);
		}catch (NoSuchElementException e){
			Assert.fail("Shipment Number field is not found.");
		}
	}

	public void Enter_ASPorCustomerOrderNo(String Submitter) {
		try {
			Enter_ASPorCONumber.sendKeys(Submitter);
		}catch (NoSuchElementException e){
			Assert.fail("APS / Customer Order Number field is not found.");
		}
	}

	public String getCustomerFileToUpload(String value) {

		String customer =value;
		String CustomerFileName = "Shipment_Upload_" + value + ".xlsx";
		String Customerfilepath = System.getProperty("user.dir") +
				FileReaderManager.getInstance().getConfigReader().getUploadCustomerFilePath("UploadCustomerFilePath") +"\\" + CustomerFileName;

		return Customerfilepath;
	}

	public ArrayList<String> VerifySuccessMessageAndGetUSN() {
		List<WebElement> ElementName = ObjectRepo.driver.findElements(By.xpath("//font[text()=' Success Results']/following::tr"));
		ArrayList<String> UniqueShipmentID = new ArrayList<String>();
		for (int i=0; i<ElementName.size();i++){
			System.out.println("Radio button text:" + ElementName.get(i).getText());
			String[] test = ElementName.get(i).getText().split(":");
			test[1] = test[1].trim();
			System.out.println(test[1]);
			UniqueShipmentID.add(test[1]);
			System.out.println(UniqueShipmentID.get(i));
		}

		Assert.assertTrue(UniqueShipmentID.size()>0, "Shipment Submitted Successfully.");
		return UniqueShipmentID;

	}
}
