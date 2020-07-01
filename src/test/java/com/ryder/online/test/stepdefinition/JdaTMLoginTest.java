package com.ryder.online.test.stepdefinition;

import com.ryder.online.configreader.FileReaderManager;
import com.ryder.online.pages.pageactions.JDAHomePageActions;
import com.ryder.online.pages.pageactions.JDALoginPageActions;
import com.ryder.online.helper.managers.TestContext;
import com.ryder.online.settings.ObjectRepo;

import cucumber.api.java.en.Then;

//import io.cucumber.java.en.Then;

import org.testng.Assert;

public class JdaTMLoginTest {

	TestContext testContext;
	JDALoginPageActions login;
	JDAHomePageActions home;
	public JdaTMLoginTest(TestContext testContext) {
			this.testContext = testContext;
			login =testContext.getPageObjectManager().getJDALoginPageActions();
			home =testContext.getPageObjectManager().getJDAHomePageActions();
		}

	@Then("user must login to new jda environment successfully using {string},{string}")
	public void user_must_login_to_new_jda_environment_successfully_using(String username, String password) {
	String url=FileReaderManager.getInstance().getConfigReader().getJDA_Website();
	  ObjectRepo.driver.get(url);
	  login.loginToJDA(username,password);

	  Assert.assertTrue(home.verifyVisibilityOfAboutButton());
	}


}
