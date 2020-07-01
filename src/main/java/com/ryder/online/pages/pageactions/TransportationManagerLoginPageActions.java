package com.ryder.online.pages.pageactions;

import org.openqa.selenium.WebDriver;

import com.ryder.online.RyderEntry.Element;
import com.ryder.online.RyderEntry.Util;
import com.ryder.online.helper.Browser.BrowserHelper;
import com.ryder.online.helper.CheckBox.CheckBoxOrRadioButtonHelper;
import com.ryder.online.helper.DropDown.DropDownHelper;
import com.ryder.online.pages.pageobjects.TransportationManagerLoginPageObjects;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.settings.ObjectRepo;

public class TransportationManagerLoginPageActions extends TransportationManagerLoginPageObjects{
	
	
//	private final Logger log = LoggerHelper.getLogger(TransportationManagerLoginPageActions.class);
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	DropDownHelper dropDown_Help = new DropDownHelper(driver);
	BrowserHelper brHelp = new BrowserHelper(driver);
	CheckBoxOrRadioButtonHelper chkbox = new CheckBoxOrRadioButtonHelper(driver);
	Element ele = new Element(driver);
	GenericActions action = new GenericActions(driver);
	Util utility = new Util();
	
	public TransportationManagerLoginPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void loginToJDA(String userName, String password) {
		System.out.println("launched TM successfully");
		  brHelp.switchToFrame(frame_TM_ParentFrame);
		  System.out.println("switched to parent befroe login ");
		  brHelp.switchToFrame(frame_TM_resultFrame);
		  System.out.println("switched to resultframe before login ");
		  waitHelp.waitForElement(text_TM_Login_UserName);
		  System.out.println("before entering username");
		  action.enterTextInTextBox(text_TM_Login_UserName, "RYDADMIN");//userName);
		  waitHelp.waitForElement(text_TM_Login_Password);
		  action.enterTextInTextBox(text_TM_Login_Password,"RYDADMIN");//password );
		  action.Click(click_TM_Login_Button);
		  System.out.println("AFTER CLICKING LOGIN BUTTON");
		  brHelp.switchToDefaultFrame();
		
	}


	public boolean verifyVisibilityOfLogOutButton() {
		// TODO Auto-generated method stub
		
	//	brHelp.switchToFrame(frame_TM_ParentFrame);
		brHelp.switchToFrame(frame_TM_TopParentFrame);
		return waitHelp.waitForElement(click_TM_LogOut_Button);
	}
	
}
