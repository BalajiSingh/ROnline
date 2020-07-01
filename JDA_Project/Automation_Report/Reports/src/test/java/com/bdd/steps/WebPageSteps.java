package com.bdd.steps;

import com.levelaccess.continuum.*;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class WebPageSteps {
	private WebDriver driver;
	private Continuum continuum = new Continuum();
	
	@Given("^the web page \"(.*?)\" is displayed\\.$")
	public void the_web_page_is_displayed(String arg1) throws Throwable {
		WebDriverManager webDriverManager = WebDriverManager.chromedriver();
		if (!ConfigProvider.getProxyHost().isEmpty()) {
			// user has specified they would like to use a proxy
			webDriverManager = webDriverManager
					.proxy(ConfigProvider.getProxyHost() + ":" + ConfigProvider.getProxyPort());

			if (!ConfigProvider.getProxyUsername().isEmpty()) {
				// user has specified the proxy they would like to use requires user authentication
				webDriverManager = webDriverManager
						.proxyUser(ConfigProvider.getProxyUsername())
						.proxyPass(ConfigProvider.getProxyPassword());
			}
		}
		webDriverManager.setup();
		driver = new ChromeDriver();
		driver.navigate().to(arg1);
	}
	
	@Given("^Access Engine is set-up\\.$")
	public void Access_Engine_is_set_up() throws Throwable {
		continuum.setUp(driver);
	}
	
	@When("^I call Access Engine's \"(.*?)\" api function\\.$")
	public void i_call_Access_Engine_s_api_function(String arg1) throws Throwable {
		continuum.runAllTests();
	}
	
	@When("^I call Access Engine's \"(.*?)\" api function on the node specified by the CSS selector \"(.*?)\"\\.$")
	public void i_call_Access_Engine_s_api_function_on_the_node_specified_by_the_CSS_selector(String arg1, String arg2) throws Throwable {
		continuum.runAllTestsOnNode(arg2);
	}
	
	@Then("^no accessibility issues are found\\.$")
	public void no_accessibility_issues_are_found() throws Throwable {
		System.out.println();
		System.out.println("Accessibility Test Results:");
		System.out.println(continuum.getAccessibilityConcernsPrettyPrinted());

		assertEquals(0, continuum.getAccessibilityConcerns().size());
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}

