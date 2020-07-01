package com.ryder.online.pages.pageactions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.ryder.online.RyderEntry.Element;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageobjects.RyderControlTowerHomePageObjects;
import com.ryder.online.pages.pageobjects.RyderControlTowerLoginPageObjects;
import com.ryder.online.pages.pageobjects.RyderEntryOnlineLoginPageObjects;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.settings.ObjectRepo;

public class RyderControlTowerLoginPageActions extends RyderControlTowerLoginPageObjects{


	
	private final Logger log = LoggerHelper.getLogger(RyderEntryOnlineLoginPageObjects.class);
	WaitHelper waitHelp = new WaitHelper(driver, ObjectRepo.reader);
	GenericActions action=new GenericActions(driver);
//	NgWebDriver ngWebDriver = new NgWebDriver((JavascriptExecutor) driver);
	RyderControlTowerHomePageObjects homeObj = new RyderControlTowerHomePageObjects(driver);
	Element ele = new Element(driver);
	
	public RyderControlTowerLoginPageActions(WebDriver driver) {
		super(driver);
		
	}

	

	public void RyderContolTower_Login(String userName, String pwd) throws InterruptedException {
		
			waitHelp.waitForInvisibleElement(homeObj.spinner_IsClocking);
			action.enterTextInTextBox(RCT_Login_UserName,userName);
			action.enterTextInTextBox(RCT_Login_Password,pwd );
			Thread.sleep(2000);
			action.Click(BTN_Login);
			waitHelp.waitForInvisibleElement(homeObj.spinner_IsClocking);
			ngWebDriver.waitForAngularRequestsToFinish();
	}
	
	public boolean landedOnHomePage()
	{	boolean  loaded =false;
		ngWebDriver.waitForAngularRequestsToFinish();
		homeObj.waitForElement(homeObj.click_Banner_Shipping,15);
		loaded=	homeObj.click_Banner_Shipping.isDisplayed();
		
		return  loaded;
		
	}
}
