package com.ryder.online.helper.HyperLink;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.ryder.online.helper.Generic.GenericHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.settings.ObjectRepo;


/**
 * @author Madhu Golla
 *
 *02/07/2K19
 *
 */

public class LinkHelper extends GenericHelper {

	private WebDriver driver;
	private Logger oLog = LoggerHelper.getLogger(LinkHelper.class);

	public LinkHelper(WebDriver driver) {
		super(driver);
		this.driver = driver;
		oLog.debug("LinkHelper : " + this.driver.hashCode());
	}
	
	public void clickLink(String linkText) {
		oLog.info(linkText);
		getElement(By.linkText(linkText)).click();
	}
	
	public void clickLink(WebElement linkText) {
		
		WebElement element = linkText;
		if(element.isDisplayed() && element.isEnabled())
		{
			oLog.info("clicked on the link text - "+linkText);
			element.click();
		}
		else
		{
			oLog.info("Unable to click the link -"+linkText);
		}
	}
	
	public boolean is_LinkTxt_displayed(WebElement linkText)
	{
		boolean flag=false;
		
		WebElement element = linkText;
		if(element.isDisplayed() && element.isEnabled())
		{
			oLog.info("Displayed link text - "+linkText);
			flag =true;
		}
		else
		{
			oLog.info("Link text not displayed  - "+linkText);
			flag = false;
		}
		
		return flag;
	}
	
	
	public boolean is_LinkTxt_fontColor_changes_to_red_on_mouse_hover(WebElement linkText)
	{  
		boolean flag =false;
		//Check this link to check the color https://www.w3schools.com/colors/colors_rgb.asp?color=rgb(0,%20191,%20255)
		// this rgb value(206, 18, 37, 1) is for red
		// this rgb(89, 89, 89) value is for gray ash color 
		WebElement linkTxt = linkText;
		if(is_LinkTxt_displayed(linkText))
		{
			//linkTxt = ObjectRepo.driver.findElement(By.xpath("//ul[@id='appmenu']//a[@class='header-flyout__anchor level-1'][contains(text(),'Promotions')]"));
			System.out.println("Color of a button before mouse hover: "	+ linkTxt.getCssValue("color"));
			oLog.info("Color of a button before mouse hover: "	+ linkTxt.getCssValue("color"));
			Actions action = new Actions(driver);
			action.moveToElement(linkTxt).perform();
			System.out.println("Color of a button after mouse hover : "	+ linkTxt.getCssValue("color"));
			oLog.info("Color of a button after mouse hover : "	+ linkTxt.getCssValue("color"));
			
			if(linkTxt.getCssValue("color").equalsIgnoreCase("rgba(206, 18, 37, 1)"))
			{
				flag=true;
			}
			else
			{
				flag = false;
			}
		}
		else
		{
			Assert.assertEquals(true, false,"Failed -Link Text is not displayed and hence link text font colot cannot be validated  ");
		}
		
		return flag;
	}
	
	public boolean is_LinkTxt_font_Bold(WebElement linkText)
	{
		boolean flag =false;
		WebElement linkTxt = linkText;
	
		if(is_LinkTxt_displayed(linkText))
		{
			String fontWeight1 = linkTxt.getCssValue("font-weight");
	        System.out.println("FontWeight of Link text before Mouse hover: "+fontWeight1);
			Actions action = new Actions(driver);
			action.moveToElement(linkTxt).perform();			
			String fontWeight2 = linkTxt.getCssValue("font-weight");
			System.out.println("FontWeight of Link text After Mouse hover : "	+ linkTxt.getCssValue("font-weight"));
	        boolean isBold = "bold".equals(fontWeight2) || "bolder".equals(fontWeight2) || Integer.parseInt(fontWeight2) >= 600;
	       
	        
	        if(isBold)
	        {
	        	flag = true;
	        }
	        else
	        {
	        	flag = false;
	        }
		}
		else
		{
			Assert.assertEquals(true, false,"Failed -Link Text is not displayed and hence link text font is Bold or not cannot be validated  ");
		}
		
		return flag;
	}
	
	public void clickPartialLink(String partialLinkText) {
		oLog.info(partialLinkText);
		getElement(By.partialLinkText(partialLinkText)).click();
	}
	
	public String getHyperLink(By locator){
		oLog.info(locator);
		return getHyperLink(getElement(locator));
	}
	
	public String getHyperLink(WebElement element) {
		String link = element.getAttribute("href");
		oLog.info("Element : " + element + " Value : " + link);
		return link;
	}
	
	public boolean isAttributePresent(WebElement element, String attribute) {
		Boolean result = false;
		try {
			String value = element.getAttribute(attribute);
			if (value != null) {
				result = true;
			}
		} catch (Exception e) {
		}

		return result;
	}
}
