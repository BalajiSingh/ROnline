package com.ryder.online.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Location_GoogleMapsPage_UI_Objects  extends PageBase {
	
	public Location_GoogleMapsPage_UI_Objects(WebDriver driver) {
		super(driver);

	} 
	
	
	//Google Maps Froms field textbox
	@FindBy(how=How.XPATH,using="//input[@placeholder='Choose starting point, or click on the map...']")
	public WebElement Gmap_fromField_Txt;
	
	
	//Google Maps To field textbox
	@FindBy(how=How.XPATH,using="//div[@id='sb_ifc51']//input[@class='tactile-searchbox-input']")
	public WebElement Gmap_toField_Txt;

}
