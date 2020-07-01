package com.ryder.online.pages.pageactions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ryder.online.helper.Logger.LoggerHelper;

public class GenericActions {
		
	WebDriver driver;
//	public WebDriver driver() { return driver; }
	
	public GenericActions(WebDriver driver) {
		this.driver =driver;
	}
	
	private Logger oLog = LoggerHelper.getLogger(GenericActions.class);
	
	
	
	public boolean enterTextInTextBox(WebElement ElementToEnter, String textToEnter){
		
	
		ElementToEnter.clear();
		ElementToEnter.sendKeys(textToEnter);
		//ElementToEnter.sendKeys(Keys.RETURN);
		//ElementToEnter.sendKeys(Keys.ENTER);
		//oLog.info(ElementToEnter);
		return true;
	}
	public boolean enterTextInTextBox_JS(WebElement element, String text) {
	

	JavascriptExecutor js = (JavascriptExecutor) driver;  
	js.executeScript("arguments[0].value='"+text+"';", element);
	element.sendKeys(Keys.SPACE);
	return true;
	
}
	public void clickElement(WebElement ElementTobeClicked){
		ElementTobeClicked.click();
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	
	public boolean presenceOfElement(WebElement ElementToBeValidated) throws InterruptedException{
		Thread.sleep(5000);
		if(ElementToBeValidated.isDisplayed()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String getAttribute(WebElement ElementToBeValidated,String togetValueOf){
		if(ElementToBeValidated.isDisplayed()){
			System.out.println("attribute is -->"+togetValueOf+"and the value is----> "+ElementToBeValidated.getAttribute(togetValueOf));
			return ElementToBeValidated.getAttribute(togetValueOf);
		}
		else{
			return "Element not Displayed";
		}
	}
	


	public boolean Click(WebElement Element) {
		if (Element != null) {
			try {
					Element.click();
				//oLog.info(Element);
				return true;
			} catch (InvalidElementStateException e) {
				oLog.info("Could not click on " + Element.toString() + ", element not visible");
				return false;
			}
		} else
			return false;
	}

	public boolean ClickLocator(By selectLocId) {
		// TODO Auto-generated method stub
		if (selectLocId != null) {
			try {
			
				driver.findElement(selectLocId).click();
				//oLog.info(Element);
				return true;
			} catch (InvalidElementStateException e) {
				oLog.info("Could not click on " + selectLocId.toString() + ", element not visible");
				return false;
			}
		} else
			return false;
	}


	
}
