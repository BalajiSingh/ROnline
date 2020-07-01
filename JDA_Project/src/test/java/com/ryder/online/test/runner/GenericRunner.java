package com.ryder.online.test.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import com.ryder.online.helper.reporter.ReporterUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/Fetch_Book_Details_Get_Api.feature" }, glue = { "classpath:com.cucumber.uvs.ecom.test.stepdefinition",
		"classpath:com.cucumber.uvs.ecom.helper" }, plugin = { "pretty", "json:target/UVSEComm.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true, tags = {
						"@ApiApi5932,@UI8876" })

//"@UI1"
//PrimaryCategoryCount_From_Solr_API.feature

public class GenericRunner extends AbstractTestNGCucumberTests {

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
