package com.ryder.online.helper.Wait;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.ryder.online.helper.Generic.GenericHelper;
import com.ryder.online.helper.Logger.LoggerHelper;

import com.google.common.base.Function;
import com.ryder.online.configreader.PropertyFileReader;
import com.ryder.online.helper.Generic.GenericHelper;
import com.ryder.online.helper.Javascript.JavaScriptHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageactions.GenericActions;
import com.ryder.online.interfaces.IconfigReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Madhu Golla
 *
 *         02/08/2K19
 *
 *         Includes Wait methods
 */

public class WaitHelper extends GenericHelper {

	private WebDriver driver;
	private IconfigReader reader;
	private Logger oLog = LoggerHelper.getLogger(WaitHelper.class);

	public WaitHelper(WebDriver driver, IconfigReader reader) {
		super(driver);
		this.driver = driver;
		this.reader = reader;
		oLog.debug("WaitHelper : " + this.driver.hashCode());
	}

	private WebDriverWait getWait(int timeOutInSeconds, int pollingEveryInMiliSec) {
		oLog.debug("");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.pollingEvery(pollingEveryInMiliSec, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		return wait;
	}

	public boolean waitForElement(WebElement element) {

		boolean islocatorLoaded = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			Boolean condition1 = wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
			Boolean condition3 = wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();

			islocatorLoaded = condition1 && condition3;

		} catch (NoSuchElementException er) {
			oLog.info("No Such Element exists" + element.toString());
			oLog.error(" Element expected is not present / displayed");
			return islocatorLoaded;
		}
		return islocatorLoaded;
	}

	public boolean waitForInvisibleElement(By locator) {

		boolean islocatorInvisible = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			Boolean condition2 = wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
			islocatorInvisible = condition2;
		} catch (NoSuchElementException er) {
			oLog.info(" Element exists" + locator.toString());
			oLog.info(" Element is not expected to be displayed");
			return islocatorInvisible;
		}
		return islocatorInvisible;
	}

	public boolean waitForLocator(By locator) {

		boolean islocatorLoaded = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			Boolean condition1 = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
			Boolean condition3 = wait.until(ExpectedConditions.elementToBeClickable(locator)).isEnabled();

			islocatorLoaded = condition1 && condition3;

		} catch (NoSuchElementException er) {
			oLog.info("No Such Element exists" + locator.toString());
			oLog.error(" Element expected is not present / displayed");
			return islocatorLoaded;
		}
		return islocatorLoaded;
	}

	private boolean waitForInvisibleElement(WebElement we) {
		boolean isElementInvisible = false;
		try

		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			Boolean condition2 = wait.until(ExpectedConditions.invisibilityOf(we));
			isElementInvisible = condition2;
		}

		catch (NoSuchElementException er) {
			oLog.info(" Element exists" + we.getText());
			oLog.info(" Element is not expected to be displayed");
			return isElementInvisible;
		}
		return isElementInvisible;
	}
	
	public void waitUntilElementDisplayed(final WebElement webElement) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 90);
				//reader.getImplicitWait()));
		ExpectedCondition<Boolean> elementIsDisplayed = new ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver arg0) {
		  try {
		     webElement.isDisplayed();
		     return true;
		  }
		  catch (NoSuchElementException e ) {
		    return false;
		  }
		  catch (StaleElementReferenceException f) {
		    return false;
		  }
		    }
		};
		wait.until(elementIsDisplayed);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}


	public void waitForCountIsZero(List<WebElement> elements) {

		Iterator<WebElement> iter = elements.iterator();

		while (iter.hasNext()) {
			WebElement we = iter.next();

			int eleSize = elements.size();
			try {
				for (int i = 0; i < eleSize; i++)
					if (eleSize > 0) {
						waitForInvisibleElement(we);
						System.out.println(elements);
						// Thread.sleep(500);
					} else {
						System.out.println("elements size must be zero : - " + eleSize);

					}
			} catch (NoSuchElementException ne) {
				// | InterruptedException ne) {
				ne.getMessage();
				ne.printStackTrace();
			}
		}
	}

	public boolean waitForElement(List<WebElement> bTN_Accept) {
		// TODO Auto-generated method stub

		boolean islocatorLoaded = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			List<WebElement> condition1 = wait.until(ExpectedConditions.visibilityOfAllElements(bTN_Accept));
			// Boolean condition3=
			// wait.until(ExpectedConditions.elementToBeClickable(bTN_Accept)).isEnabled();

			islocatorLoaded = condition1 != null;// && condition3;

		} catch (NoSuchElementException er) {
			oLog.info("No Such Element exists" + bTN_Accept.toString());
			oLog.error(" Element expected is not present / displayed");
			return islocatorLoaded;
		}
		return islocatorLoaded;
	}

	public void waitForSpinnerToDisappear(By locator) {

		List<WebElement> elements = driver.findElements(locator);
		System.out.println(elements);
		// try {
		for (int i = 0; i < elements.size(); i++) {

			if (waitForInvisibleElement(locator)) {

				System.out.println(i);
				break;
			}
		}
		// }
		// catch(Exception e) {
		// e.getMessage();
		// oLog.info("size of the element is less than or equal to zero : - "
		// +elements.size());
		// }
		//
	}

	public void setImplicitWait(long timeout, TimeUnit unit) {
		oLog.info(timeout);
		driver.manage().timeouts().implicitlyWait(timeout, unit == null ? TimeUnit.SECONDS : unit);
	}

	public void waitForElementVisible(By locator, int timeOutInSeconds, int pollingEveryInMiliSec) {
		oLog.info(locator);
		setImplicitWait(1, TimeUnit.SECONDS);
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryInMiliSec);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
		setImplicitWait(reader.getImplicitWait(), TimeUnit.SECONDS);
	}

	public void hardWait(int timeOutInMiliSec) throws InterruptedException {
		oLog.info(timeOutInMiliSec);
		Thread.sleep(timeOutInMiliSec);
	}

	public WebElement handleStaleElement(By locator, int retryCount, int delayInSeconds) throws InterruptedException {
		oLog.info(locator);
		WebElement element = null;

		while (retryCount >= 0) {
			try {
				element = driver.findElement(locator);
				return element;
			} catch (StaleElementReferenceException e) {
				hardWait(delayInSeconds);
				retryCount--;
			}
		}
		throw new StaleElementReferenceException("Element cannot be recovered");
	}

	public void elementExits(By locator, int timeOutInSeconds, int pollingEveryInMiliSec) {
		oLog.info(locator);
		setImplicitWait(1, TimeUnit.SECONDS);
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryInMiliSec);
		wait.until(elementLocatedBy(locator));
		setImplicitWait(reader.getImplicitWait(), TimeUnit.SECONDS);
	}

	public void elementExistAndVisible(By locator, int timeOutInSeconds, int pollingEveryInMiliSec) {
		oLog.info(locator);
		setImplicitWait(1, TimeUnit.SECONDS);
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryInMiliSec);
		wait.until(elementLocatedBy(locator));
		new JavaScriptHelper(driver).scrollIntoView(locator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		setImplicitWait(reader.getImplicitWait(), TimeUnit.SECONDS);

	}

	public void waitForIframe(By locator, int timeOutInSeconds, int pollingEveryInMiliSec) {
		oLog.info(locator);
		setImplicitWait(1, TimeUnit.SECONDS);
		WebDriverWait wait = getWait(timeOutInSeconds, pollingEveryInMiliSec);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		driver.switchTo().defaultContent();
		setImplicitWait(reader.getImplicitWait(), TimeUnit.SECONDS);
	}

	private Function<WebDriver, Boolean> elementLocatedBy(final By locator) {
		return new Function<WebDriver, Boolean>() {

			public Boolean apply(WebDriver driver) {
				oLog.debug(locator);
				return driver.findElements(locator).size() >= 1;
			}
		};
	}

}
