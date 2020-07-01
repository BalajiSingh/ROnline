package com.ryder.online.RyderEntry;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ryder.online.helper.Generic.GenericHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageactions.GenericActions;
import com.ryder.online.helper.Wait.WaitHelper;
import com.ryder.online.settings.ObjectRepo;
import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Element extends GenericHelper{

	private WebDriver driver;
	GenericActions action=new GenericActions(driver);
	private static Logger oLog = LoggerHelper.getLogger(Element.class);
	WaitHelper waitHelp = new WaitHelper(ObjectRepo.driver, ObjectRepo.reader);
	
	public Element(WebDriver driver) {
		super(driver);
		this.driver = driver;
		oLog.debug("DropDownHelper : " + this.driver.hashCode());
	}
	
	//to get the text of the Web Element 
		public String getElementText(By locator)
		{
			return driver.findElement(locator).getText();
		}
		
		public String getElementText(WebElement element)
		{
			return element.getText();
		}

		/**
		 * Finds and returns a list of matching elements
		 *
		 * @param locator
		 * @return
		 */
		public List<WebElement> getElements(final By locator) {
			try {
				return driver.findElements(locator);
			} catch (Exception e) {
				String errorName = "Un-handled Exception in getElements:";
				oLog.info(errorName + e.getMessage());
//				oLog.info(errorName, genericHelper.takeScreenShot());

				return new ArrayList<WebElement>();
			}
		}
		

		public String getWebElementText(WebElement element)
		{
			return element.getText();
		}
		//to get the attribute value  of the Web Element 
			public String getvalue(By locator, String attribute)
			{
				return driver.findElement(locator).getAttribute(attribute);
			}
		
			
			public String getElementvalue(WebElement element, String attribute)
			{
				return element.getAttribute(attribute);
			}
		//to get the WebElement of a locator
		public WebElement getWebElement(By locator)
		{
			return driver.findElement(locator);
		}
		
		

public void RefreshPmtPrcs(WebElement element) {

for (int i=0; i<5; i++) {
	waitHelp.waitForElement(element);
	action.clickElement(element);
	Refresh(element);
}
}


public boolean isElementPresnt(WebDriver driver,WebElement element,int time)
{
	boolean ispresent = false;
	
	for(int i=0;i<time;i++)
		{
			try
			{				
				oLog.info("......custom ..waiting and verifying for element or text to be displayed on the page............");
				break;
			}
			catch(Exception e){
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e1){
				System.out.println("Waiting for element to appear on DOM which is taking longer than expected");
				oLog.info("....custom ....waited too long and element or text is not displayed on the DOM page............");
			}
								}

			
		}
	return ispresent;
				

}
public static boolean isPresentAndDisplayed(final WebElement element) {
    try {
        return element.isDisplayed();
    } catch (NoSuchElementException e) {
        return false;
    }
}


public static WebElement waitAndClick(WebDriver driver, WebElement element) throws InterruptedException {
  
    while (!isDisplayed(element)) 
    {
        Thread.sleep(3000);
        System.out.println("Element is not visible yet");
    }
    return element;

    }
    public static boolean isDisplayed(WebElement element) {
        try {
            if(element.isDisplayed())
                return element.isDisplayed();
            }catch (NoSuchElementException ex) {
            return false;
        }
        return false;
    }
    
    
public boolean Refresh(WebElement element) {
	
	Boolean result;
	
	try {
	 result = waitHelp.waitForElement(element); 
	
	if (result==true)
	{
		System.out.println("element visible now");
		return result;
		
	}
	}
	catch(Exception e) {
		System.out.println("element not visible yet so retrying on more time");
		return	 waitHelp.waitForElement(element);
		 
	}

	return result;
	
	
}

public void clickByLocatorJs(By locator) {
	 WebElement e =driver.findElement(locator);
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+e.getLocation().x+")");
	e.click();
	
}

public void Actions_Click(By locator) {
	WebElement element = driver.findElement(locator);
	try {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void clickElementJsvar(WebElement Element) {

	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", Element);

}

public void clickelementJs(WebElement Element) {

	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", Element);

}


public void Actions_Click(WebElement element) {
	
	try {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public boolean hover(WebElement element) {
	oLog.info("Hover Over Element: " + element.toString());
	if (ObjectRepo.reader.getBrowser().toString().equalsIgnoreCase("Chrome")) {

		String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initEvent( 'mouseover', true, true );" + "fireOnThis.dispatchEvent(evObj);";
		((JavascriptExecutor) driver).executeScript(code, element);
	} else {

		Actions actions = new Actions(driver);
		Action action = actions.moveToElement(element).build();
		action.perform();
	}
	return true;
}

public boolean moveCursorTo(WebElement element) 
{          
    try {
    	
    	Actions builder = new Actions(driver);    
		builder.moveToElement(element).click(element);    
	    builder.perform();
	    
        return true;
     } catch (InvalidElementStateException e) {
        //se.log().logSeStep("Could not enter text in " + element.toString() + ", element not visible or not enabled");
        //se.verify().reportError("Could not enter text, element not visible or not enabled");
        return false;
     } catch (Exception e) {
         //se.log().logSeStep("Could not enter text in " + element.toString());
         //se.verify().reportError("Could not enter text");
         return false;
     }
}


public void verifyLinesButtonEnabled(By locator1, By locator2) {
	
	try {
boolean result = getWebElement(locator1).isDisplayed();
		
		if(result==true) {
			
		System.out.println("All Line Items are shown to get the line number count ................");
		
		}
		
	}
	catch (Exception e) {
		 {
				//(getWebElement(FooterLinesExpand).isDisplayed()==true)
				getWebElement(locator2).click();
			}
		
	}
	
}

public void clickElementJsvar(By selectBillingTypeLocator) {
	// TODO Auto-generated method stub
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", driver.findElement(selectBillingTypeLocator));
}

}

