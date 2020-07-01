package com.ryder.online.pages.pageobjects;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CloudinaryLoginPageObjects extends PageBase {

	public CloudinaryLoginPageObjects(WebDriver driver) {
		super(driver);
		 PageFactory.initElements(driver, this);
	}
	
	/** Web Elements */
	
	//Cloudinary Logo image link present on login page
	@FindBy(how = How.XPATH, using = "//div[@class='logo']//img[@class='dark-logo']")
	public WebElement cloudinary_Logo;
	
	// Login Link present on Cloudinary login page
	@FindBy(how = How.XPATH, using = "//nav[@class='header-nav']//a[contains(text(),'Login')]")
	public WebElement Login_Link;
		
	
	// Login screen Header Test "Management Console Login"
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Management Console Login')]")
	public WebElement Management_Console_Login_Text;
	
	
	//Email Login TextField present on Cloudinary Login page
	@FindBy(how = How.XPATH, using = "//input[@id='user_session_email']")
	public WebElement UserName_Txt;
	
	//Password TextField present on Cloudinary Login page
	@FindBy(how = How.XPATH, using = "//input[@id='user_session_password']")
	public WebElement Password_Txt;
	
	//Sign In Button present on Cloudinary Login page
	@FindBy(how = How.XPATH, using = "//button[@id='sign-in']")
	public WebElement BTN_SIGN_IN;
	
	
	
	
}
