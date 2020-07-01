package com.ryder.online.pages.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransportationManagerLoginPageObjects extends PageBase{

	public TransportationManagerLoginPageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(how = How.XPATH, using = "//input[@name='loginUser']")
	//input[@name='loginUser'] 
	public WebElement text_TM_Login_UserName;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='loginPassword' or @name='dspLoginPassword'])[last()]")
	public WebElement text_TM_Login_Password;
	
	@FindBy(how = How.XPATH, using ="//td//a[contains(text(),'Login')]")
	public WebElement click_TM_Login_Button;
	
	@FindBy(how = How.XPATH, using ="//td[@id='shellActions']//a[text()='Log Out']")
	public WebElement click_TM_LogOut_Button;
	
	@FindBy(how=How.CSS, using="frame[name='i2ui_shell_top']") 
			//using="//frame[@name='i2ui_shell_top']")
	public WebElement frame_TM_TopParentFrame;
	
	@FindBy(how=How.CSS, using="frame[name='i2ui_shell_content']")
			//using="//frame[@name='i2ui_shell_content']")
	public WebElement frame_TM_ParentFrame;
	
	@FindBy(how=How.CSS, using="#navFrame")
			//using="//frame[@id='navFrame']")
	public WebElement frame_TM_navFrame;
	
	@FindBy(how=How.CSS, using="#resultFrame")
			//using="//frame[@id='resultFrame']")
	public WebElement frame_TM_resultFrame;
	
	
	
}
