package com.ryder.online.pages.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends PageBase {

	public HomePageObjects(WebDriver driver) {
		super(driver);
      
	}

		
	/** Web Elements */
	@FindBy(how = How.XPATH, using = "//*[@id='root']/div/div/nav/a/img")
	public WebElement TXT_ryderLogo;

	@FindBy(how = How.ID, using = "logoutlnk")
	public WebElement LNK_logout;

	@FindBy(how = How.ID, using = "back")
	public WebElement BTN_backItUp;

	@FindBy(how = How.ID, using = "logout")
	public WebElement BTN_logout;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-body']/p")
	public WebElement TXT_logoutPopUpMessage;
	
	@FindBy(how = How.XPATH, using = "//*[@class='modal-body']/p")
	public WebElement TXT_reminderMessage;

	@FindBy(how = How.ID, using = "stay")
	public WebElement BTN_stayInRyderGyder;
	
	/****WebElements of My Vehicles****/
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='sideMenu']/li)[1]")
	public WebElement LNK_myVehiclesIcon;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='vehicleList']/li")
	public List<WebElement> LIST_vehicles;

	public By LIST_vehicle = By.xpath("//ul[@class='vehicleList']/li");	
	
	@FindBy(how = How.CLASS_NAME, using = "vehiclesClose")
	public WebElement BTN_closeOnPopUp;
	
	@FindBy(how = How.XPATH, using = "//*[@class='vehicleListContainer']/div/h5")
	public WebElement TXT_myVehiclesPopUptext;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='vehicleListSorter']/div/div/label)[1]")
	public WebElement LNK_myVehiclesFilter1;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='vehicleListSorter']/div/div/label)[2]")
	public WebElement LNK_myVehiclesFilter2;
	
	@FindBy(how = How.XPATH, using = "//*[@class='vehicleListSorter']/div/ul/li")
	public List<WebElement> LIST_selectValueInFilter1;
	
	@FindBy(how = How.XPATH, using = "//*[@class='vehicleListSorter']/div/ul/li")
	public List<WebElement> LIST_selectValueInFilter2;
	
	@FindBy(how = How.XPATH, using = "(//img[@alt='DropdownIcon'])[1]")
	public WebElement BTN_clickVehicleFilter;
	
	@FindBy(how = How.XPATH, using = "(//img[@alt='DropdownIcon'])[2]")
	public WebElement BTN_clickStatusFilter;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='vehicleList']/li")
	public WebElement TXT_firstElementOfTheList;
	
	@FindBy(how = How.ID, using = "calendarIcon")
	public WebElement IMG_calenderIconInTheList;
	
	@FindBy(how = How.XPATH, using = "//div[@class='noResults']/strong")
	public WebElement TXT_noVehiclesAvailableInServiceDueDateFilter;
	
	@FindBy(how = How.ID, using = "red-triangle")
	public WebElement IMG_warningIconInServiceDueDateFilter;
	
	@FindBy(how = How.ID, using = "scheduleTitle")
	public WebElement TXT_titleOfSelectedListData;
	
	@FindBy(how = How.ID, using = "domicileHeader")
	public WebElement TXT_domicileHeader;
	
	@FindBy(how = How.ID, using = "locAddress")
	public WebElement TXT_domicileLocationDetails;
	
	@FindBy(how = How.ID, using = "locZip")
	public WebElement TXT_domicileLocationZip;
	
	@FindBy(how = How.ID, using = "locPhone")
	public WebElement TXT_domicileLocationPhone;
	
	@FindBy(how = How.CLASS_NAME, using = "selectMenu")
	public WebElement DRPDWN_filter;
	
	
	

}
