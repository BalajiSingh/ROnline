package com.ryder.online.pages.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransportationManagerHomePageObject extends PageBase{

	public TransportationManagerHomePageObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how=How.XPATH, using="(//table[@id='PAD_navigation']//td[@class='applicationPadTitle']//img[@src='/tm/images/container_collapse.gif'])")
	public WebElement Collapse_Navigation;
	
	@FindBy(how=How.XPATH, using="(//table[@id='PAD_navigation']//td[@class='applicationPadTitle']//img[@src='/tm/images/container_expand.gif'])")
	public WebElement Expand_Navigation;
	
	
	@FindBy(how=How.XPATH, using="//img[@id='TREECELLIMAGE_navigation_navigation_4' and @src='/tm/images/plus_norgie.gif']")
	public WebElement Plus_Shipment_Processing;
	
	@FindBy(how=How.XPATH, using="//img[@id='TREECELLIMAGE_navigation_navigation_8' and @src='/tm/images/plus_norgie.gif']")
	public WebElement Plus_Load_Processing;
	
	
	@FindBy(how = How.NAME, using = "//a//img[@id='TREECELLIMAGE_navigation_navigation_4' and @src='/tm/images/minus_norgie.gif']")
	public WebElement Minus_Shipment_Processing;

	@FindBy(how = How.XPATH, using="//td[@id='TREECELL_navigation_4_1']//a[text()]")
	public WebElement Shipments_Link;
	
	@FindBy(how = How.XPATH, using="//td[@id='TREECELL_navigation_4_2']//a[text()]")
	public WebElement RefNumSearch_Link;
	
	@FindBy(how=How.XPATH, using="//form[@id='ShipListForm']//following-sibling::td[contains(text(),'Search Results')]")
	public WebElement StaticTXT_Search_Results;
	
	@FindBy(how=How.XPATH, using="//img[@alt='Search']")
	public WebElement Magnify_Search;
	
	@FindBy(how=How.LINK_TEXT, using="Reset")
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
	public By read_ListOfLoadIDs = By.xpath("(//table[@id='ShipHistoryFormEVENTSTableID']//td[@title='Load ID'])");
	
	@FindBy (how=How.XPATH, using="//a[contains(text(),'Return')]")
	public WebElement button_Return;
	
	@FindBy(how=How.XPATH, using="//tr//nobr[text()='Load ID']")
	public WebElement cell_LoadID;
	
	@FindBy(how=How.XPATH, using="//td[@id='TREECELL_navigation_8_1']//a[text()]")
	public WebElement Loads_Link;
}
