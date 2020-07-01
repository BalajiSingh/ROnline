package com.ryder.online.pages.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Location_DefaultPage_UI_Objects extends PageBase {
	
	public Location_DefaultPage_UI_Objects(WebDriver driver) {
		super(driver);

	} 
	
	//included by balaji
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Alabama')]")
	public WebElement stateFirstLinkTxt;
	
	
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Locations')]")        //  CSS: //a[href='/used-trucks/UTC-Locations']
	public WebElement locations_link;
	@FindBy(how=How.CSS, using="div[class='utc-location-header']")
	public WebElement locations_pageHeader;
	@FindBy(how=How.CSS, using="div[class='utc-location-header-info-text']")
	public WebElement headerInfoText;
	@FindBy(how=How.CSS, using="div[class='utc-location-country-info']")
	public List<WebElement>locationCountryInfo;
	@FindBy(how=How.CSS,using="div[class='utc-location-state'] a")
	public List<WebElement>location_state;
	@FindBy(how=How.XPATH,using="//*[contains(@class,'toggle-box_') and @aria-expanded='false']")
	public WebElement expandIcon;
	@FindBy(how=How.XPATH,using="//div[@class='utc-location-country-info']//following::div[contains(@class,'utc-location-container')]")
	public List<WebElement> stateLabels;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'row toggle-box__content toggle--active')]//div[@class='utc-location-city']")
	public List<WebElement> cityName;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'row toggle-box__content toggle--active')]//div[@class='utc-location-address']//span")
	public List<WebElement> streetAddress;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'row toggle-box__content toggle--active')]//div[@class='utc-get-directions']/a")
	public WebElement getDirectionsLink;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'row toggle-box__content toggle--active')]//div[@class='utc-location-phone']")
	public WebElement phoneNumber;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'row toggle-box__content toggle--active')]//div[@class='utc-location-hours']//span")
	public List<WebElement> timings;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'row toggle-box__content toggle--active')]//div[@class='utc-see-all-vehicles']/a")
	public WebElement seeAllVehiclesLink;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'row toggle-box__content toggle--active')]//div[not(@class='block')]")
	public List<WebElement>allLabelValues;
	@FindBy(how=How.CSS,using="div[class='utc-location-city-Header']")
	public WebElement statePageHeader;
	@FindBy(how=How.XPATH,using="//div[@class='utc-get-directions']/a")
	public List<WebElement>multipleDirectionLinks;
	@FindBy(how=How.XPATH,using="//input[contains(@aria-label,'Destination')]")
	public   WebElement  gMap_destination;

}
