package com.ryder.online.helper.Navigation;

import java.net.URL;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.interfaces.IwebComponent;

/**
 * @author Madhu Golla
 *
 *         02/07/2K19
 *
 *         Provides access to browser controls Navigate to and back from website
 */

public class NavigationHelper implements IwebComponent {

	private WebDriver driver;
	private Logger oLog = LoggerHelper.getLogger(NavigationHelper.class);

	public NavigationHelper(WebDriver driver) {
		this.driver = driver;
		oLog.debug("NavigationHelper : " + this.driver.hashCode());
	}

	public void navigateTo(String url) {
		oLog.info(url);
		//driver.get(url);
		driver.navigate().to(url);
		
	}

	public void navigateTo(URL url) {
		oLog.info(url.getPath());
		driver.get(url.getPath());
	}

	public String getTitle() {
		String title = driver.getTitle();
		oLog.info(title);
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		oLog.info(url);
		return driver.getCurrentUrl();
	}
	
	public void navigateBack() {
		oLog.info("Navigating back to the previous page");
		driver.navigate().back();
	}

	public String switchToNewTab() {
		String oldTab = driver.getWindowHandle();
		oLog.info(oldTab);
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		oLog.info(newTab);
		
		// change focus to new tab
		driver.switchTo().window(newTab.get(0));
		String Url = getCurrentUrl();
		
		driver.close();
		// change focus back to old tab
		driver.switchTo().window(oldTab);
		
		return Url;
	}

}
