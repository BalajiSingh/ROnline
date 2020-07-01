package com.ryder.online.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SiteCoreHomePageObjects  extends PageBase {
	
	public SiteCoreHomePageObjects(WebDriver driver) {
		super(driver);
		 PageFactory.initElements(driver, this);
	}
	
	
	/** Web Elements */
	
	//Commerce link  OR Business Tools present on SiteCore Home page    //span[contains(text(),'Business Tools')]
	@FindBy(how = How.XPATH, using = "//a[@title='Business Tools']")
	public WebElement siteCore_Commerce_Link;
	
	//SiteCore link OR Content Editor  present on SiteCorre Home Page //span[contains(text(),'Content Editor')]
	@FindBy(how = How.XPATH, using = "//a[@title='Content Editor']")
	public WebElement siteCore_ContentEditor_Link;
	
	
}
