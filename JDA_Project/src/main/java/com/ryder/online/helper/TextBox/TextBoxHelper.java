package com.ryder.online.helper.TextBox;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ryder.online.helper.Grid.GridHelper;
import com.ryder.online.helper.Logger.LoggerHelper;


/**
 * @author Madhu Golla
 *
 *02/08/2K19
 *
 *Includes methods related to Text box
 */

public class TextBoxHelper extends GridHelper {

	private WebDriver driver;
	private Logger oLog = LoggerHelper.getLogger(TextBoxHelper.class);
	
	public TextBoxHelper(WebDriver driver) {
		super(driver);
		this.driver = driver;
		oLog.debug("TextBoxHelper : " + this.driver.hashCode());
	}
	
	public void sendKeys(By locator,String value) {
		oLog.info("Locator : " + locator + " Value : " + value);
		getElement(locator).sendKeys(value);
	}
	
	public void clear(By locator) {
		oLog.info("Locator : " + locator);
		getElement(locator).clear();
	}
	
	public String getText(By locator) {
		oLog.info("Locator : " + locator);
		return getElement(locator).getText();
	}
	
	public String getText(WebElement element) {
		oLog.info("WebElement : " + element);
		return element.getText();
	}
	
	public void clearAndSendKeys(By locator,String value) {
		WebElement element =  getElement(locator);
		element.clear();
		element.sendKeys(value);
		oLog.info("Locator : " + locator + " Value : " + value);
	}

	public void clearAndSendKeys(WebElement userName, String value) {
		
		WebElement element = userName;
		element.clear();
		element.sendKeys(value);
		oLog.info("WebElement : " + element + " Value : " + value);
	}

}
