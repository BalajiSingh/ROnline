package com.ryder.online.pages.pageobjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.ryder.online.helper.Logger.LoggerHelper;

/**
 * 
 *
 *         
 *
 */
@SuppressWarnings("rawtypes")
public abstract class PageBase {

	private final Logger log = LoggerHelper.getLogger(PageBase.class);
	protected WebDriver driver;
	protected NgWebDriver ngWebDriver;
	private JavascriptExecutor js ;
	
	
	public PageBase(WebDriver driver) {
		if (driver == null)
			throw new IllegalArgumentException("Driver object is null");
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
		this.driver = driver;
		this.ngWebDriver = new NgWebDriver (js) ;
	}



	private By getFindByAnno(FindBy anno) {
		log.info(anno);
		switch (anno.how()) {

		case CLASS_NAME:
			return new By.ByClassName(anno.using());
		case CSS:
			return new By.ByCssSelector(anno.using());
		case ID:
			return new By.ById(anno.using());
		case LINK_TEXT:
			return new By.ByLinkText(anno.using());
		case NAME:
			return new By.ByName(anno.using());
		case PARTIAL_LINK_TEXT:
			return new By.ByPartialLinkText(anno.using());
		case XPATH:
			return new By.ByXPath(anno.using());
		default:
			throw new IllegalArgumentException("Locator not Found : " + anno.how() + " : " + anno.using());
		}
	}

	protected By getElemetLocator(Object obj, String element) throws SecurityException, NoSuchFieldException {
		Class childClass = obj.getClass();
		By locator = null;
		try {
			locator = getFindByAnno(childClass.getDeclaredField(element).getAnnotation(FindBy.class));
		} catch (SecurityException | NoSuchFieldException e) {
			log.info(e);
			throw e;
		}
		log.debug(locator);
		return locator;
	}

	public void waitForElement(WebElement element, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
	/*	wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(ElementNotFoundException.class);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);*/
		wait.until(elementLocated(element));
		log.debug("");
	}
	
	

	public void waitForSepcifiedTime(int timeOutInSeconds) {
		try {
			log.debug("");
			Thread.sleep(timeOutInSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void waitForElementsAbsence(WebElement element, int timeOutInSeconds)  {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		
	do {
		System.out.println("hgdfghxxxd "+wait.until(elementLocated(element)));
		waitForSepcifiedTime(1000);
//		boolean x=wait.until(elementLocated(element));
	} while ((elementLocatedret(element))==true);
		log.debug("");
	}
	

	public void waitFor(int timeOutInMinutes) {
		log.debug("");
		driver.manage().timeouts().implicitlyWait(timeOutInMinutes, TimeUnit.MINUTES);
	}

	private Function<WebDriver, Boolean> elementLocated(final WebElement element) {
		return new Function<WebDriver, Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				log.debug("Waiting for Element : " + element);
				return element.isDisplayed();
			}
		};
	}

	
	private Boolean elementLocatedret(final WebElement element) {
				return element.isDisplayed();
			}


	public boolean checkForTitle(String title) {
		log.info(title);
		if (title == null || title.isEmpty())
			throw new IllegalArgumentException(title);
		return driver.getTitle().trim().contains(title);
	}

	public void scrollByPixel(String xaxis, String yaxis) {
		js = (JavascriptExecutor) driver;
		js.executeScript(("window.scrollBy(" + xaxis + "," + yaxis + ")"));
	}

	public void scrollToVisibleElement(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void scrollToPageBottom() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public String getURL(){
		return(driver.getCurrentUrl());
	}

}
