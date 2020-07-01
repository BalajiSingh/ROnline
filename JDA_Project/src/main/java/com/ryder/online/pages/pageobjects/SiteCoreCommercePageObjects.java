package com.ryder.online.pages.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SiteCoreCommercePageObjects extends PageBase{
	
	public SiteCoreCommercePageObjects(WebDriver driver) {
		super(driver);
		 PageFactory.initElements(driver, this);
	}
	
	/** Web Elements */
	
	//Merchandising link present on SiteCore  Commerce Page
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Merchandising')]") 
	public WebElement merchandising_link;
	
	 public By merchandising_link1 = By.id("link-MerchandisingDashboard");	
	
	//UsedVehicles link as present on catalogs table in SiteCore Commerce page
	 // use this xpath  //table[@class='mb-0 table table-striped table-hover']/tbody/tr[8]/td[2]/sc-bizfx-viewproperty-byui
	@FindBy(how = How.XPATH, using = "//table[@class='mb-0 table table-striped table-hover']/tbody")
	public WebElement UsedVehicles_link;
	
     // Use the above xpath  OR below list directly
			
	@FindBy(how = How.XPATH, using = "//div[@id='property-Summary-Name']")
	 public List<WebElement> UsedVehicles_link1;
	
	 //Click on the next pagination button	
     @FindBy(how = How.XPATH, using = "//li[5]//a[1]")
     public WebElement next_pagination_button;
	
			
}
