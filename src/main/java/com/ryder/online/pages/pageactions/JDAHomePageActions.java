package com.ryder.online.pages.pageactions;
import com.ryder.online.RyderEntry.Element;
import com.ryder.online.RyderEntry.Util;
import com.ryder.online.helper.Browser.BrowserHelper;
import com.ryder.online.helper.CheckBox.CheckBoxOrRadioButtonHelper;
import com.ryder.online.helper.DropDown.DropDownHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageobjects.JDAHomePageObjects;
import com.ryder.online.pages.pageobjects.JDALoginPageObjects;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.settings.ObjectRepo;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class JDAHomePageActions extends JDAHomePageObjects {

	
	private final Logger oLog = LoggerHelper.getLogger(TransportationManagerHomePageActions.class);
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	DropDownHelper dropDown_Help = new DropDownHelper(driver);
	BrowserHelper brHelp = new BrowserHelper(driver);
	JDALoginPageObjects jdaLoginHelp = new JDALoginPageObjects(driver);
	CheckBoxOrRadioButtonHelper chkbox = new CheckBoxOrRadioButtonHelper(driver);
	Element ele = new Element(driver);
	GenericActions action = new GenericActions(driver);
	Util utility = new Util();



	public JDAHomePageActions(WebDriver driver) {
		super(driver);
	}

	public void searchForShipmentID(String shipmentID) {
		System.out.println("before switching to frame parent");
		brHelp.switchToDefaultFrame();
		System.out.println("before switching to frame parent");
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_navFrame);
//		action.Click(Plus_Shipment_Processing);
		ele.Actions_Click(Plus_Shipment_Processing);
		waitHelp.waitForElement(Shipments_Link);
		action.Click(Shipments_Link);
		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_resultFrame);
		waitHelp.waitForElement(StaticTXT_Search_Results);
//		action.Click(Magnify_Search);
		waitHelp.waitForElement(text_ShipmentID);
		action.enterTextInTextBox(text_ShipmentID, shipmentID); // need to parameterized to enter value
		action.Click(click_refresh_ShipmentID);
		//By shipmtID = By.xpath("//table[@id='ShipmentListFormSEARCH_RESULTSTableID']//td[@title='Shipment ID']");

		Assert.assertTrue(read_shipmentID.getText().equalsIgnoreCase(shipmentID),"Shipment '" +shipmentID+ "' should be displayed in result.");
		oLog.info("shipment has been searched successfully");
//
//		String LoadID =readLoadNumber();
//
//		return LoadID;
	}

	public String searchForShipmentIDByUSN(String shipmentID) throws InterruptedException {

		Thread.sleep(4000);
		//Swith to frame til navigation panel
		brHelp.switchToDefaultFrame();
		System.out.println("before switching to frame parent");
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_navFrame);

		//Click on Shipment Procesing and Navigate to Shipment page
		ele.Actions_Click(Plus_Shipment_Processing);
		waitHelp.waitForElement(Shipments_Link);
		action.Click(Shipments_Link);

		//Switch to frame til Result panel
		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_resultFrame);
		waitHelp.waitForElement(StaticTXT_Search_Results);
		System.out.print("TEST PRINT");
		//Click on magnifying glass and click reset
		waitHelp.waitForElement(Magnify_Search);
		System.out.print("TEST PRINT");
		action.Click(Magnify_Search);
		waitHelp.waitForElement(click_Reset_Button);
		//action.Click(click_Reset_Button);

		action.enterTextInTextBox(text_Shipment_Tracking_Number, shipmentID); // need to parameterized to enter value
		action.Click(Search_Button);
		//By shipmtID = By.xpath("//table[@id='ShipmentListFormSEARCH_RESULTSTableID']//td[@title='Shipment ID']");

		String str = read_shipmentID.getText();

		Assert.assertTrue(read_Shipment_Tracking_NumberID.getText().equalsIgnoreCase(shipmentID),"Shipment '" +shipmentID+ "' should be displayed in result.");
		oLog.info("shipment has been searched successfully");

		return str;
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
	
	private String readEventReason() {
		// TODO Auto-generated method stub
		String EventReason = ele.getWebElementText(dynamic_Reason);
		return EventReason;
	}

	public void load_Processing() {
		action.Click(button_Return);
		action.Click(Plus_Load_Processing);
		action.Click(Loads_Link);
		
		
	}

	public boolean verifyVisibilityOfLogOutButton() {
		brHelp.switchToFrame(frame_TM_TopParentFrame);
		System.out.println("Verify Logout Button is displayed");
		return waitHelp.waitForElement(click_TM_LogOut_Button);

	}


	public boolean verifyVisibilityOfAboutButton() {
		brHelp.switchToFrame(frame_TM_TopParentFrame);
		System.out.println("Verify About Link is displayed");
		waitHelp.waitUntilElementDisplayed(click_TM_About_Button);
		return click_TM_About_Button.isDisplayed();
	}

	public void NavigateToLoadBuild() {

		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_navFrame);
		ele.Actions_Click(Plus_LoadBuild_Link);
	}

	public void NavigateToWorkWithPlan() {

		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_navFrame);

		waitHelp.waitForElement(Plus_WorkWithPlan);
		action.Click(Plus_WorkWithPlan);
		action.Click(click_Plans_Link);
	}

	public void SelectPlanToProcessLoad(String PlanID) {

		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_resultFrame);
		By PlanIDColumn = By.xpath("//table[@id='PlanListFormSEARCH_RESULTSTableID']//td[@title='Plan ID' and text()='"+PlanID+"']");
		By PlanIDCheckBox = By.xpath("//table[@id='PlanListFormSEARCH_RESULTSTableID']//td[@title='Plan ID' and text()='"+PlanID+"']/preceding-sibling::td/input[@type='CheckBox']");

		action.enterTextInTextBox(text_PlanID, PlanID); // need to parameterized to enter value
		action.Click(click_refresh_PlanID);

		Assert.assertTrue(ObjectRepo.driver.findElement(PlanIDColumn).isDisplayed(),"Plan ID '" +PlanID+" should be present.");
		//if(!ObjectRepo.driver.findElement(PlanIDCheckBox).isSelected()) {
			action.Click(ObjectRepo.driver.findElement(PlanIDCheckBox));

			Assert.assertTrue(ObjectRepo.driver.findElement(PlanIDCheckBox).isSelected(),"Plan ID '" +PlanID+" should be Selected.");
			action.Click(click_SelectPlan_Button);

			Assert.assertTrue(message_PopUp.isDisplayed(),"Confirmation message should be displayed.");
			action.Click(click_Yes_Button);

			Assert.assertTrue(staticTxtMessage_plan_Selected.isDisplayed(),"Confirmation message should be displayed.");
			oLog.info("Planto process the shipment for load is selected");
		//}

	}

	public void NavigateToShipmentNotAttached() {

		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_navFrame);

		action.Click(Shipment_NotAttached_Link);
	}

	public void attachShipmentToPlan(String ShipmentID) {

		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_resultFrame);
		By ShipmentIDCheckBox = By.xpath("//td[@title='Shipment ID' and text()='"+ShipmentID+"']/preceding-sibling::td/input[@type='CheckBox']");

		action.enterTextInTextBox(text_ShipmentID, ShipmentID); // need to parameterized to enter value
		action.Click(click_refresh_ShipmentID);

		Assert.assertTrue(read_shipmentID.getText().equalsIgnoreCase(ShipmentID),"Shipment '" +ShipmentID+ "' should be displayed in result.");
		//if(!ObjectRepo.driver.findElement(PlanIDCheckBox).isSelected()) {
		action.Click(ObjectRepo.driver.findElement(ShipmentIDCheckBox));

		Assert.assertTrue(ObjectRepo.driver.findElement(ShipmentIDCheckBox).isSelected(),"Shipment '" +ShipmentID+ "' should be  Selected.");
		action.Click(click_attachPlan_Button);

		Assert.assertTrue(attachCurrentPlan_Selected_msg.isDisplayed(),"Confirmation message should be displayed.");
		oLog.info("Shipment is attached to plan");
		//}

	}

	public void NavigateToUnassignedShipment() {

		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_navFrame);

		action.Click(click_Shipment_Link);
		action.Click(click_Unassinged_Link);

	}


	public String  assignShipmentToLoad(String ShipmentID) {

		brHelp.switchToDefaultFrame();
		brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_resultFrame);
		By ShipmentIDCheckBox = By.xpath("//td[@title='Shipment ID' and text()='"+ShipmentID+"']/preceding-sibling::td/input[@type='CheckBox']");

		action.enterTextInTextBox(text_ShipmentID, ShipmentID); // need to parameterized to enter value
		action.Click(click_refresh_ShipmentID);

		Assert.assertTrue(read_shipmentID.getText().equalsIgnoreCase(ShipmentID),"Shipment '" +ShipmentID+ "' should be displayed in result.");
		//if(!ObjectRepo.driver.findElement(PlanIDCheckBox).isSelected()) {
		action.Click(ObjectRepo.driver.findElement(ShipmentIDCheckBox));

		Assert.assertTrue(ObjectRepo.driver.findElement(ShipmentIDCheckBox).isSelected(),"Shipment '" +ShipmentID+ "' should be  Selected.");
		action.Click(click_AssignLoad_Button);

		String loadNostr = "Shipment "+ ShipmentID + " assigned to Load";
		System.out.print(loadNostr);
		String LoadNo = attachCurrentPlan_Selected_msg.getText().replace(loadNostr,"").trim();
		LoadNo = LoadNo.replace(".","").trim();

		Assert.assertTrue(attachCurrentPlan_Selected_msg.isDisplayed(),"Confirmation message should be displayed.");
		oLog.info("Shipment is attached to plan");
		return LoadNo;

	}

	public void ValidateShipmentDetails(String CustomeID, String Division, String LogisticGroup) {

	try {
		Assert.assertTrue(read_shipmentCustomer.getText().equalsIgnoreCase(CustomeID), "Customer '" + CustomeID + "' should be displayed as Customer ID in shipment Details.");
	}catch (Exception e){
		Assert.fail("Customer Id displayed as " +read_shipmentCustomer.getText()+ " instead of " + CustomeID);
	}

		try {
			Assert.assertTrue(read_shipmentDivision.getText().equalsIgnoreCase(Division),"Division '" +Division+ "' should be displayed in shipment Details.");
		}catch (Exception e){
			Assert.fail("Division displayed as " +read_shipmentDivision.getText()+ " instead of " + Division);
		}

		try {
			Assert.assertTrue(read_shipmentLogisticGroup.getText().equalsIgnoreCase(LogisticGroup), "Logistic Group '" + LogisticGroup + "' should be displayed in shipment Details.");
		}catch (Exception e){
			Assert.fail("Logistic Group displayed as " +read_shipmentLogisticGroup.getText()+ " instead of " + LogisticGroup);
		}


	}
}
