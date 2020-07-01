package com.ryder.online.pages.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JDAHomePageObjects extends PageBase{

	public JDAHomePageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using ="//td[@id='shellActions']//a[text()='Log Out']")
	public WebElement click_TM_LogOut_Button;

	@FindBy(how = How.XPATH, using ="//td[@id='shellActions']//a[text()='About']")
	public WebElement click_TM_About_Button;

	@FindBy(how=How.NAME, using="i2ui_shell_top")
	//using="//frame[@name='i2ui_shell_top']")
	public WebElement frame_TM_TopParentFrame;

	@FindBy(how=How.NAME, using="i2ui_shell_content")
	//using="//frame[@name='i2ui_shell_content']")
	public WebElement frame_TM_ParentFrame;

	@FindBy(how=How.ID, using="navFrame")
	//using="//frame[@id='navFrame']")
	public WebElement frame_TM_navFrame;

	@FindBy(how=How.ID, using="resultFrame")
	//using="//frame[@id='resultFrame']")
	public WebElement frame_TM_resultFrame;
	
	@FindBy(how=How.XPATH, using="(//table[@id='PAD_navigation']//td[@class='applicationPadTitle']//img[@src='/tm/images/container_collapse.gif'])")
	public WebElement Collapse_Navigation;
	
	@FindBy(how=How.XPATH, using="(//table[@id='PAD_navigation']//td[@class='applicationPadTitle']//img[@src='/tm/images/container_expand.gif'])")
	public WebElement Expand_Navigation;
	
	
	@FindBy(how=How.XPATH, using="(//table[@id='navigation']//text()[2])[24]/preceding-sibling::a")
	public WebElement Plus_Shipment_Processing;
	
	@FindBy(how=How.XPATH, using="(//table[@id='navigation']//text()[2])[25]/preceding-sibling::a")
	public WebElement Plus_Load_Processing;
	
	
	@FindBy(how = How.NAME, using = "(//table[@id='navigation']//text()[2])[24]/preceding-sibling::a\"")
	public WebElement Minus_Shipment_Processing;

	@FindBy(how = How.XPATH, using="(//table[@id='navigation']//text()[2])[24]/following::a[2]")
	public WebElement Shipments_Link;
	
	@FindBy(how=How.XPATH, using="//input[@id='principalID']")
	public WebElement text_ShipmentID;
	
	@FindBy(how=How.XPATH, using="//input[@id='principalID']//following::a[1]")
	public WebElement click_refresh_ShipmentID;
	
	//@FindBy(how=How.XPATH, using="//table[@id='ShipmentListFormSEARCH_RESULTSTableID']//td[@title='Shipment ID']")
	@FindBy(how=How.XPATH, using="//td[@title='Shipment ID']")
	public WebElement read_shipmentID;

	//@FindBy(how=How.XPATH, using="//table[@id='ShipmentListFormSEARCH_RESULTSTableID']//td[@title='Shipment ID']")
	@FindBy(how=How.XPATH, using="//td[@title='Shipment Tracking Number']")
	public WebElement read_Shipment_Tracking_NumberID;

	@FindBy(how=How.XPATH, using="//td[@title='Customer ID']")
	public WebElement read_shipmentCustomer;

	//@FindBy(how=How.XPATH, using="//table[@id='ShipmentListFormSEARCH_RESULTSTableID']//td[@title='Shipment ID']")
	@FindBy(how=How.XPATH, using="//td[@title='Division']")
	public WebElement read_shipmentDivision;

	//@FindBy(how=How.XPATH, using="//table[@id='ShipmentListFormSEARCH_RESULTSTableID']//td[@title='Shipment ID']")
	@FindBy(how=How.XPATH, using="//td[@title='Logistics Group']")
	public WebElement read_shipmentLogisticGroup;

		
	@FindBy(how=How.XPATH, using="(//table[@id='navigation']//text()[2])[26]/preceding-sibling::a")
	public WebElement Plus_LoadBuild_Link;

	@FindBy(how=How.XPATH, using="(//table[@id='navigation']//text()[2])[26]/following::a[1]")
	public WebElement Plus_WorkWithPlan;
	
	@FindBy(how=How.XPATH, using="(//table[@id='navigation']//text()[2])[26]/following::a[contains(text(),'Plans')]")
	public WebElement click_Plans_Link;

	@FindBy(how=How.XPATH, using="(//table[@id='navigation']//text()[2])[26]/following::a[8]")
	public WebElement click_Shipment_Link;

	@FindBy(how=How.XPATH, using="(//table[@id='navigation']//text()[2])[26]/following::a[contains(text(),'Unassigned')]")
	public WebElement click_Unassinged_Link;


	@FindBy(how=How.NAME, using="PlanID")
	public WebElement text_PlanID;

	@FindBy(how=How.XPATH, using="//input[@id='principalID']//following::a[1]")
	public WebElement click_refresh_PlanID;

	@FindBy(how=How.XPATH, using="//td[@id='buttonEmphasized']//a[contains(text(),'Select')]")
	public WebElement click_SelectPlan_Button;

	@FindBy(how=How.XPATH, using="//td[@id='buttonRegular']//a[contains(text(),'Attach to Current Plan')]")
	public WebElement click_attachPlan_Button;

	@FindBy(how=How.XPATH, using="//td[@id='buttonRegular']//a[contains(text(),'Assign to New Load')]")
	public WebElement click_AssignLoad_Button;
	
	@FindBy(how=How.XPATH, using="//span[text()='Message']")
	public WebElement message_PopUp;
	
	@FindBy(how=How.XPATH, using="//span[text()='Yes']")
	public WebElement click_Yes_Button;
	
	@FindBy(how=How.XPATH, using="//span[text()='No']")
	public WebElement click_No_Button;
	
	@FindBy(how=How.XPATH, using="//span[@class='success' and contains(text(),'selected')]")
	public WebElement staticTxtMessage_plan_Selected;

	@FindBy(how=How.XPATH, using="//a[@id='tmMessageLink']/span[@class='success']")
	public WebElement attachCurrentPlan_Selected_msg;


	@FindBy(how=How.XPATH, using="//td//a[contains(text(),'Shipments Not Attached')]")
	public WebElement Shipment_NotAttached_Link;


	@FindBy(how = How.XPATH, using="//td[@id='TREECELL_navigation_4_2']//a[text()]")
	public WebElement RefNumSearch_Link;
	
	@FindBy(how=How.XPATH, using="//span[text()='Search Results']")
	public WebElement StaticTXT_Search_Results;
	
	@FindBy(how=How.XPATH, using="//img[@alt='Search']")
	public WebElement Magnify_Search;
	
	@FindBy(how=How.XPATH, using="//td[@id='buttonRegular']//a[contains(text(),'Reset')]")
	public WebElement click_Reset_Button;
	
	@FindBy(how=How.LINK_TEXT, using="Search")
	public WebElement click_Search_Button;
	
	@FindBy(how=How.XPATH,using="//input[@name='trackingNumber']")
	public WebElement text_Shipment_Tracking_Number;
	
	@FindBy(how=How.XPATH, using="//td[@id='buttonEmphasized']//a[text()]")
	public WebElement Search_Button;
	
	@FindBy(how=How.XPATH, using="//input[@name='SelectedIndex']//following::input[@type='CheckBox']")
	public WebElement checkbox_For_Searched_ShipmentID;
	
	@FindBy(how=How.XPATH, using="//td[@id='buttonRegular']//a[contains(text(),'View History')]")
	public WebElement click_ViewHistory_Button;
	
//	@FindBy(how=How.XPATH, using="(//table[@id='ShipHistoryFormEVENTSTableID']//td[@title='Load ID'])")
//	public WebElement read_ListOfLoadIDs;
		
	@FindBy(how=How.CSS, using="tr.tableRow1")
	public WebElement dynamic_RowData;
	
	@FindBy(how=How.CSS, using="td.lt[title='Shipment ID']")
	public WebElement dynamic_ShipmentID;
	
	@FindBy(how=How.CSS, using="td.lt[title='Event Reason']")
	public WebElement dynamic_Reason;
	public By read_ListOfLoadIDs = By.xpath("(//table[@id='ShipHistoryFormEVENTSTableID']//td[@title='Load ID'])");
	
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Return')]")
	public WebElement button_Return;
	
	@FindBy(how=How.XPATH, using="//tr//nobr[text()='Load ID']")
	public WebElement cell_LoadID;
	
	@FindBy(how=How.XPATH, using="//td[@id='TREECELL_navigation_8_1']//a[text()]")
	public WebElement Loads_Link;

}
