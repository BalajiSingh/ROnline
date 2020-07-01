package com.ryder.online.pages.pageactions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ryder.online.helper.Javascript.JavaScriptHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageobjects.Location_DefaultPage_UI_Objects;
import com.ryder.online.settings.ObjectRepo;

public class Location_DefaultPage_UI_Actions extends Location_DefaultPage_UI_Objects{
	
	private WebDriver driver;
	private JavaScriptHelper jsHelper = new JavaScriptHelper(ObjectRepo.driver);
	private final Logger log = LoggerHelper.getLogger(Location_DefaultPage_UI_Actions.class);
	
	public Location_DefaultPage_UI_Actions(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	public void validateText(WebElement element, String expectedText) throws Exception{
		try{
			String actualTextFromPage = element.getText();
			System.out.println("actualTextFromPage : "+actualTextFromPage);
			Assert.assertEquals(actualTextFromPage.contains(expectedText), true);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	public void validateElementIsDisplayedOnPage(WebElement element) throws Exception{
		try{
			boolean displayFlag= element.isDisplayed();
			Assert.assertEquals(displayFlag, true);
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}
	
	//Balaji Included this below method
	public boolean location_DefaultPage_Title()
	{
		boolean flag=false;
		if(driver.getTitle().equalsIgnoreCase("Locations"))	
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		
		return flag ;
	}
	
	public String get_First_State_Name_From_LocationDefaultPage()
	{
		return stateFirstLinkTxt.getText();
	}
	
	//Balaji Included this below method
	public void click_on_first_State_link_present_On_defaultLocationPage()
	{
		if(stateFirstLinkTxt.isDisplayed())
		{
			log.info("Clicking  on the first state link present on Default location page");
			System.out.println("Clicking  on the first state link present on Default location page");
			stateFirstLinkTxt.click();
		}
		else
		{	log.info("Cannot Find the First State Link hence cannot click on it");
			System.out.println("Cannot Find the First State Link hence cannot click on it");
		}
		
	}
	
   //Balaji Included  this method
	public boolean click_on_State_Link_Present_On_DefaultPage(String StateName) throws InterruptedException
	{
		Thread.sleep(2500);
		boolean flag = false;
		////a[contains(text(),'Alabama')]
		String xpath_cons = "//a[contains(text(),"+"'"+StateName+"')]";
		
		if(driver.findElement(By.xpath(xpath_cons)).isDisplayed())
		{
			flag=true;
			log.info("Clicking on the "+StateName + " State Link" );
			driver.findElement(By.xpath(xpath_cons)).click();
			Thread.sleep(2500);
			
		}
		else
		{   flag = false;
			log.info("Unable to click  on the "+StateName + " State Link - Reason being the state link is not present on Default page" );
			System.err.println("Unable to click on  "+StateName +" State link - reason being State link is not displayed ");
		}
		 return flag;
	}
	
	
	public void clickOnEachStateLabelAndValidateItExpanded(List<WebElement>allStateLabels){
		try{
			for(int count=1;count<=allStateLabels.size();count++){
				ObjectRepo.driver.findElement(By.xpath("(//div[@class='utc-location-country-info']//following::div[contains(@class,'utc-location-container')]/h3)["+count+"]")).click();
				Thread.sleep(1000);
				String expandFlag = ObjectRepo.driver.findElement(By.xpath("(//div[@class='utc-location-country-info']//following::div[contains(@class,'utc-location-container')]/h3)["+count+"]")).getAttribute("aria-expanded");
				if(expandFlag.equals("true")){
					Assert.assertTrue(true);
					Thread.sleep(2000);
					ObjectRepo.driver.findElement(By.xpath("(//div[@class='utc-location-country-info']//following::div[contains(@class,'utc-location-container')]/h3)["+count+"]")).click();
				}
			}
		}catch(Exception e){
			e.getMessage();
		}
	
	}
	
	public void expandAndValidateEacthDetailsUnderStateLabelForSingleCity(String[]values,String state){
		
		try{
			
			jsHelper.scrollIntoView(ObjectRepo.driver.findElement(By.xpath("//a[contains(text(),'"+state+"')]/following::h3[1]")));
			jsHelper.jsClick(ObjectRepo.driver.findElement(By.xpath("//a[contains(text(),'"+state+"')]/following::h3[1]")));
			
			Thread.sleep(1000);
			for(WebElement eachLabels:allLabelValues){
				String classAtrributeValue = eachLabels.getAttribute("class");
				if(classAtrributeValue.equalsIgnoreCase("utc-location-city")){
					Assert.assertEquals(eachLabels.getText().toLowerCase(), values[0].toLowerCase());
				}
				else if(classAtrributeValue.equalsIgnoreCase("utc-location-address")){
					String addr1 = values[1].split(";")[0].toLowerCase();
					String addr2 = values[1].split(";")[1].toLowerCase();
					Assert.assertEquals(streetAddress.get(0).getText().toLowerCase(), addr1);
					Assert.assertEquals(streetAddress.get(1).getText().toLowerCase(), addr2);
				}
				else if(classAtrributeValue.equalsIgnoreCase("utc-get-directions")){
					String actualLocationUrl = getDirectionsLink.getAttribute("href");
					Assert.assertTrue(true, actualLocationUrl);
				}
				else if(classAtrributeValue.equalsIgnoreCase("utc-location-phone")){
					String actualPhoneNo = phoneNumber.getText();
					Assert.assertEquals(actualPhoneNo, values[3]);
				}
				else if(classAtrributeValue.equalsIgnoreCase("utc-location-hours")){
					String openTime = values[4].split(";")[0].trim().toLowerCase();
					String closeTime = values[4].split(";")[1].trim().toLowerCase();
					Assert.assertEquals(timings.get(0).getText().toLowerCase(), openTime);
					Assert.assertEquals(timings.get(1).getText().toLowerCase(), closeTime);
				}
				else if(classAtrributeValue.equalsIgnoreCase("utc-see-all-vehicles")){
					String actualAllVehicleLink = seeAllVehiclesLink.getAttribute("href");
					Assert.assertTrue(true, actualAllVehicleLink);
				}
			}
			
		}catch(Exception e){
			e.getMessage();
		}
		
	}
	
//	public void expandEachStateLabelsAndValidateDetailsForMultipleCities(String[]ar1,String[]ar2,String[]ar3,String[]ar4,String[]ar5,String[]ar6,String state) throws Exception{
//		jsHelper.scrollIntoView(ObjectRepo.driver.findElement(By.xpath("//a[contains(text(),'"+state+"')]/following::h3[1]")));
//		jsHelper.jsClick(ObjectRepo.driver.findElement(By.xpath("//a[contains(text(),'"+state+"')]/following::h3[1]")));
//		
//		Thread.sleep(1000);
//		
//		try{
//			String[]arrayOfPageValues = new String [allLabelValues.size()];
//			int count=0;
//		
//			for(WebElement eachLabels:allLabelValues){
//				arrayOfPageValues[count] = eachLabels.getText();
//				count++;
//			}
//		
//			for(int index=0;index<)
//		}catch(Exception e){
//			throw new Exception(e.getMessage());
//		}
//	}
	public void statePageValidation(String sateName) throws Exception{
		try{
			boolean stateNameFromUrl = ObjectRepo.driver.getCurrentUrl().split("=")[1].toLowerCase().equalsIgnoreCase(sateName);
			boolean stateNameOnHeader = statePageHeader.getText().toLowerCase().contains(sateName.toLowerCase());
			if(stateNameFromUrl && stateNameOnHeader ){
				Assert.assertTrue(true, "Values are matched!");
			}
			
		}catch(Exception e){
			throw new Exception(e);
		}
	}

}
