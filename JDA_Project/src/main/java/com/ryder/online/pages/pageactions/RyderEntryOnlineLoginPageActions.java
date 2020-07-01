package com.ryder.online.pages.pageactions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageobjects.RyderEntryOnlineLoginPageObjects;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.settings.ObjectRepo;

public class RyderEntryOnlineLoginPageActions extends RyderEntryOnlineLoginPageObjects{
	
	
//	RyderEntryOnlineLoginPageObjects ROL_LoginObj= new RyderEntryOnlineLoginPageObjects(driver);
	private final Logger log = LoggerHelper.getLogger(RyderEntryOnlineLoginPageObjects.class);
	WaitHelper waitHelp = new WaitHelper(driver, ObjectRepo.reader);
	GenericActions action=new GenericActions(driver);
	
	
	public RyderEntryOnlineLoginPageActions(WebDriver driver) {
		super(driver);
		
	}

	
	public void RyderEntry_Login(String userName, String pwd) {
		
		  action.enterTextInTextBox(INP_LoginUName,userName);
		  action.enterTextInTextBox(INP_LoginPwd,pwd );
		  action.Click(BTN_Login);
		  waitHelp.waitForElement(BTN_Logout);
	}
	
	public void RyderEntry_LogOut() {
		action.Click(BTN_Logout);
		waitHelp.waitForLocator(ROL_Landing_CustomerLoginText);
	}
	
	public boolean Login_success() {
		boolean success =false;
		try {
		success = waitHelp.waitForLocator(ROL_Login_Landing);
		return success;
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			log.info("No Such Element exists");
			return success;
		}
	}


	public void yourConnectionIsNotPrivate() {
		try {
		waitHelp.waitForElement(Advanced_Button);
		action.Click(Advanced_Button);
		waitHelp.waitForElement(ProceedTo_Link);
		action.Click(ProceedTo_Link);
		}catch(Exception e) {
			System.out.println("its not visible");
		}
	}


	public void unsecured_correction() {
		
		waitHelp.waitForElement(More_Information);
		action.Click(More_Information);
		waitHelp.waitForElement(Not_Recommended);
		action.Click(Not_Recommended);
		
	}
	
	
	
}
