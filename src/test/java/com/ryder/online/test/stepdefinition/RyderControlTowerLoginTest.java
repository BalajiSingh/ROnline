package com.ryder.online.test.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.ryder.online.configreader.PropertyFileReader;
import com.ryder.online.pages.pageactions.RyderControlTowerLoginPageActions;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class RyderControlTowerLoginTest {

	RyderControlTowerLoginPageActions login;
	PropertyFileReader configProperties = new PropertyFileReader();
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	TestContext testContext;

	public RyderControlTowerLoginTest(TestContext testContext) {
		this.testContext = testContext;
		login = testContext.getPageObjectManager().getRyderControlTowerLoginPageActions();
	}

@Given("User was asked to create shipment in RCT channel")
public void user_was_asked_to_create_shipment_in_RCT_channel() {
		String url=configProperties.getRCT_Website();
		ObjectRepo.driver.get(url);
		waitHelp.waitForElement(login.RCT_Login_LandingPage);
}

@When("User Enters User ID,Password in RCT as {string},{string} and clicks Login button")
public void user_Enters_User_ID_Password_in_RCT_as_and_clicks_Login_button(String userName, String password) throws InterruptedException {
//	System.out.println("Username:" + userName);
//	System.out.println("Password:"+ password);
	login.RyderContolTower_Login(userName, password);
	System.out.println("Username and Password has been entered");
}

@Then("User is on Ryder Control Tower Home page after successfull logon")
public void user_is_on_Ryder_Control_Tower_Home_page_after_successfull_logon() {

	Assert.assertTrue(login.landedOnHomePage());
	
}
}
