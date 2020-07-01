package com.ryder.online.pages.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.ByAngularRepeater;

public class RyderControlTowerLoginPageObjects extends PageBase{

	public RyderControlTowerLoginPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	/** Web Elements */
	//login button on home page
	
//	@ByAngularBinding.FindBy(..)
//	@ByAngularButtonText.FindBy(..)
//	@ByAngularButtonText.FindBy(..)
//	@ByAngularCssContainingText.FindBy(..)
//	@ByAngularExactBinding.FindBy(..)
//	@ByAngularModel.FindBy(..)
//	@ByAngularOptions.FindBy(..)
//	@ByAngularPartialButtonText.FindBy(..)
//	@ByAngularRepeater.FindBy(..)
//	@ByAngularRepeaterCell.FindBy(..)
//	@ByAngularRepeaterColumn.FindBy(..)
//	@ByAngularRepeaterRow.FindBy(..)

	
	@FindBy(how=How.XPATH, using="//img[@src='img/rydershare-logo.svg']")
	public WebElement RCT_Login_LandingPage;
	
	@FindBy(how=How.XPATH, using="//input[@type='text']")
	public WebElement RCT_Login_UserName;
	
	
	@ByAngularModel.FindBy(model = "signIn.username")
	public WebElement login_UserName;
	
	
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	public WebElement RCT_Login_Password;
	
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit' and text()='Sign In']")
	public WebElement BTN_Login;
	
	@FindBy(how = How.CSS, using = "div.app-nav-client-selection-img.ng-scope.ng-isolate-scope")
	public WebElement App_Selection_Text;
	
	@ByAngularRepeater.FindBy(exact = false, repeater = "button in menu")
	public WebElement BTN_Navbar_User;
	

}
