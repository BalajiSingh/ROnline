package com.ryder.online.test.runner;

import org.testng.annotations.AfterClass;

import com.ryder.online.helper.reporter.ReporterUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;


                                                                             

@CucumberOptions(features = { "classpath:featurefile" }, glue = { "classpath:com.ryder.online.test.stepdefinition",
		"classpath:com.ryder.online.helper" }, plugin = { "pretty", "json:target/RyderOnline.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true, tags = {
						"@UI33321"})

//tags = {	"@Api","@UI8876"})

public class ROLTestRunner extends AbstractTestNGCucumberTests {

	@AfterClass(alwaysRun = true)
	public static void writeExtentReport() {
		ReporterUtil.archiveReport();
	
	}

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
}
