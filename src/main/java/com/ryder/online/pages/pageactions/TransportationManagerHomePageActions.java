package com.ryder.online.pages.pageactions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ryder.online.RyderEntry.Element;
import com.ryder.online.RyderEntry.Util;
import com.ryder.online.helper.Browser.BrowserHelper;
import com.ryder.online.helper.CheckBox.CheckBoxOrRadioButtonHelper;
import com.ryder.online.helper.DropDown.DropDownHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageobjects.TransportationManagerHomePageObject;
import com.ryder.online.pages.pageobjects.TransportationManagerLoginPageObjects;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.settings.ObjectRepo;

public class TransportationManagerHomePageActions extends TransportationManagerHomePageObject{

	private final Logger oLog = LoggerHelper.getLogger(TransportationManagerHomePageActions.class);
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	DropDownHelper dropDown_Help = new DropDownHelper(driver);
	BrowserHelper brHelp = new BrowserHelper(driver);
	TransportationManagerLoginPageObjects tmLoginHelp = new TransportationManagerLoginPageObjects(driver);
	CheckBoxOrRadioButtonHelper chkbox = new CheckBoxOrRadioButtonHelper(driver);
	Element ele = new Element(driver);
	GenericActions action = new GenericActions(driver);
	Util utility = new Util();


	public TransportationManagerHomePageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public String searchForShipmentID(String shipmentID) {
		System.out.println("before switching to frame parent");
		brHelp.switchToDefaultFrame();
		System.out.println("before switching to frame parent");
		brHelp.switchToFrame(tmLoginHelp.frame_TM_ParentFrame);
		brHelp.switchToFrame(tmLoginHelp.frame_TM_navFrame);
		action.Click(Plus_Shipment_Processing);
		waitHelp.waitForElement(Shipments_Link);
		action.Click(Shipments_Link);
		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(tmLoginHelp.frame_TM_ParentFrame);
		brHelp.switchToFrame(tmLoginHelp.frame_TM_resultFrame);
		waitHelp.waitForElement(StaticTXT_Search_Results);
		action.Click(Magnify_Search);
		waitHelp.waitForElement(text_Shipment_Tracking_Number);
		action.enterTextInTextBox(text_Shipment_Tracking_Number, shipmentID); // need to parameterized to enter value
		action.Click(click_Search_Button);
		waitHelp.waitForElement(StaticTXT_Search_Results);
		waitHelp.waitForElement(dynamic_RowData);
		oLog.info("shipment has been searched successfully");
		
		String LoadID =readLoadNumber();
		
		return LoadID;
	}


	private String readLoadNumber() {
		String ShipmentID = readShipmentID(); 
		// TODO Auto-generated method stub
		System.out.println(ShipmentID);
		System.out.println("getting ready to read the load number");
		chkbox.selectCheckBox(checkbox_For_Searched_ShipmentID);
		action.Click(click_ViewHistory_Button);
		waitHelp.waitForElement(cell_LoadID);
		List<WebElement> l =ele.getElements(read_ListOfLoadIDs);
		String LoadID =pickLoadNumFromList(l);
	
		return LoadID;
	}

	public String pickLoadNumFromList(List<WebElement> l) {
		System.out.println(l.size());
		String LoadID = null;
		if (l.size() < 0 || l.size() >= l.size()+1) {
			System.out.println("Valid index range is from 0 to " + (l.size() - 1));
		}else {
			for (WebElement i:l) {
				System.out.println("Load ID Number :"+ i.getText());
				LoadID =i.getText();
				return LoadID;
			}
		}
		return LoadID;
	}

	private String readShipmentID() {
		// TODO Auto-generated method stub
		String ID = ele.getWebElementText(dynamic_ShipmentID);
		return ID;
	}

	public void load_Processing() {
		action.Click(button_Return);
		action.Click(Plus_Load_Processing);
		action.Click(Loads_Link);
		
		
	}
}
