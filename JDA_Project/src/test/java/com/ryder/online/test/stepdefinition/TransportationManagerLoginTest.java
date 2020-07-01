package com.ryder.online.test.stepdefinition;



import com.ryder.online.configreader.PropertyFileReader;
import com.ryder.online.pages.pageactions.GenericActions;
import com.ryder.online.pages.pageactions.TransportationManagerLoginPageActions;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TransportationManagerLoginTest {
	
	GenericActions action=new GenericActions(ObjectRepo.driver);
	TransportationManagerLoginPageActions TM_login ;//= pageObjectManager.getTransportationManagerLoginPageActions();
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	PropertyFileReader configProperties = new PropertyFileReader();
	TestContext testContext;// = new TestContext(ObjectRepo.driver);
	
	public TransportationManagerLoginTest(TestContext testContext) {
		this.testContext = testContext;
		TM_login = testContext.getPageObjectManager().getTransportationManagerLoginPageActions();
	}
	
	
	
	@When("^user enters \"([^\"]*)\",\"([^\"]*)\" and clicks on login button$")
	public void user_enters_and_clicks_on_login_button(String username, String password) throws Throwable {
		 String url=configProperties.getTM_Website();
		  ObjectRepo.driver.get(url);
		  ObjectRepo.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  TM_login.loginToJDA(username,password);
	}

	@Then("^user should be able to logon successfully$")
	public void user_should_be_able_to_logon_successfully() throws Throwable {

		Assert.assertTrue(TM_login.verifyVisibilityOfLogOutButton());
	}
}
