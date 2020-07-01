package com.ryder.online.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SiteCoreLoginPageObjects extends PageBase {
	
	public SiteCoreLoginPageObjects(WebDriver driver) {
		super(driver);
		 PageFactory.initElements(driver, this);
	}
	
	/** Web Elements */
	
	//SiteCore Logo image present on SiteCore  login page
	@FindBy(how = How.XPATH, using = "	//div[@class='logo-wrap']//img")
	public WebElement siteCore_Image_Logo;
	
	//UserName TextField present on SiteCore Login page
	@FindBy(how = How.XPATH, using = "//input[@id='Username']")
	public WebElement siteCore_UserName_Txt;
		
	//Password TextField present on SiteCore Login page
	@FindBy(how = How.XPATH, using = "//input[@id='Password']")
	public WebElement siteCore_Password_Txt;
		
	//Log In Button present on SiteCore Login page
	@FindBy(how = How.XPATH, using = "//button[@value='login']")
	public WebElement siteCore_Log_In_BTN;

}
