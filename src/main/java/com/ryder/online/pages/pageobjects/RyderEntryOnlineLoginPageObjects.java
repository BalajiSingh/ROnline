package com.ryder.online.pages.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RyderEntryOnlineLoginPageObjects extends PageBase{

	public RyderEntryOnlineLoginPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/** Web Elements */
	//login button on home page
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	public WebElement INP_LoginUName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	public WebElement INP_LoginPwd;
	
	@FindBy(how = How.XPATH, using = "//input[@id='login_btn']")
	public WebElement BTN_Login;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	public WebElement BTN_Logout;
	
	public By ROL_Landing_CustomerLoginText = By.xpath("//span[text()='Customer Login']");
	public By ROL_Login_Landing = By.xpath("//td/font[text()='Load Search']");

	@FindBy(how=How.XPATH, using="//button[@id='details-button' and contains(text(),'Advanced')]")
	public WebElement Advanced_Button;

	@FindBy(how=How.XPATH, using="//a[contains(text(),'Proceed to')]")
	public WebElement ProceedTo_Link;

	@FindBy(how=How.LINK_TEXT, using="More information")
	public WebElement More_Information;
	
	@FindBy(how=How.LINK_TEXT, using="Go on to the webpage (not recommended)")
	public WebElement Not_Recommended;

}
