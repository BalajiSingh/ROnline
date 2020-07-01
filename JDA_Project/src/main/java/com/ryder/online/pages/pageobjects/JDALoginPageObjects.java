package com.ryder.online.pages.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JDALoginPageObjects extends PageBase{

	public JDALoginPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.ID, using = "okta-signin-username")
	//input[@name='loginUser'] 
	public WebElement text_TM_Login_UserName;
	
	@FindBy(how = How.ID, using = "okta-signin-password")
			//"(//input[@name='loginPassword' or @name='dspLoginPassword'])[last()]")
	public WebElement text_TM_Login_Password;
	
	@FindBy(how = How.ID, using ="okta-signin-submit")
	public WebElement click_TM_Login_Button;
	

}

