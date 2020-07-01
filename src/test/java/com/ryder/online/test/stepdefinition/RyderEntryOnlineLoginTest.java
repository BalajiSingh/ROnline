package com.ryder.online.test.stepdefinition;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

import org.testng.Assert;

import com.ryder.online.configreader.PropertyFileReader;
import com.ryder.online.pages.pageactions.GenericActions;
import com.ryder.online.pages.pageactions.RyderEntryOnlineLoginPageActions;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class RyderEntryOnlineLoginTest {
	
	
	GenericActions action=new GenericActions(ObjectRepo.driver);
	RyderEntryOnlineLoginPageActions login;//=pageObjectManager.getRyderEntryOnlineLoginPageActions();
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	PropertyFileReader configProperties = new PropertyFileReader();
	TestContext testContext;//= new TestContext(ObjectRepo.driver);
	
	
	public RyderEntryOnlineLoginTest(TestContext testContext) {
		this.testContext = testContext;
		login = testContext.getPageObjectManager().getRyderEntryOnlineLoginPageActions();
	}
	
	
	
	@Given("^User is on login page of ROL website$") 
	  public void	  user_is_on_login_page() throws InterruptedException, UnsupportedEncodingException { 
		  String url=configProperties.getROL_Website().toString();
		
		  ObjectRepo.driver.get(url);
		  try {
			  System.out.println(ObjectRepo.driver);
			  System.out.println("*****************************");
			  System.out.println(ObjectRepo.driver.getTitle());
				  if("This site isn’t secure".equals(ObjectRepo.driver.getTitle())) {
					 login.unsecured_correction();
				  }
		  }catch(Exception e)
		  {
			  e.getMessage();
			  System.out.println(e.getMessage());
		  }
		  waitHelp.waitForLocator(login.ROL_Landing_CustomerLoginText);
	  }
	  
	  
	
	@When("^User Enters User ID,Password in ROL as \"([^\"]*)\",\"([^\"]*)\" and clicks on the Login button$")
	public void	  user_Enters_User_ID_Password_as_and_clicks_on_the_Login_button(String	  userName, String pwd) throws Throwable {
		login.RyderEntry_Login(userName,pwd);
	  }

	  
	@Then("^User is on Ryder online Home page after successfull logon$") 
	public void user_should_be_on_ROL_HomePage() throws InterruptedException {
	  System.out.println("ROL home page should be visible"); 
	  Assert.assertEquals(waitHelp.waitForElement(login.BTN_Logout), true);
	 
	}
}
