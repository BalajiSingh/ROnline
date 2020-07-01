package com.ryder.online.helper.Window;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ryder.online.helper.Generic.GenericHelper;
import com.ryder.online.helper.Logger.LoggerHelper;

public class WindowHandles extends GenericHelper {

	private WebDriver driver;
	private Logger oLog = LoggerHelper.getLogger(WindowHandles.class);
	
	public WindowHandles(WebDriver driver) {
		super(driver);
		this.driver = driver;
		oLog.debug("TextBoxHelper : " + this.driver.hashCode());
	}

	
	public Map<String,String> oneParentoneChildWindows(WebElement element) {
	
	String parentWindow = driver.getWindowHandle();
    String childWindow = "";
    (element).click();
    Set<String> allWindows = driver.getWindowHandles();

    for (String window : allWindows) {
        if (!window.equals(parentWindow)) {
            childWindow = window;
        }
    }
    Map<String, String> result = new HashMap<String, String>();
   
    result.put(parentWindow, parentWindow);
    result.put(childWindow, childWindow);
 
  //  driver.switchTo().window(parentWindow);
  //  assertThat(driver.getTitle(), is(not(equalTo("New Window"))));

    driver.switchTo().window(childWindow);
  //  assertThat(driver.getTitle(), is(equalTo("New Window")));
	return result;
}

}

