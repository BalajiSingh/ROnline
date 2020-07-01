package com.ryder.online.pages.pageactions;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.ryder.online.helper.Javascript.JavaScriptHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageobjects.Location_GoogleMapsPage_UI_Objects;
import com.ryder.online.pages.pageobjects.Location_StatePage_UI_Objects;
import com.ryder.online.settings.ObjectRepo;

public class Location_GoogleMapsPage_UI_Actions extends Location_GoogleMapsPage_UI_Objects{
	
	private WebDriver driver;
	private JavaScriptHelper jsHelper = new JavaScriptHelper(ObjectRepo.driver);
	private final Logger log = LoggerHelper.getLogger(Location_GoogleMapsPage_UI_Actions.class);
	
	
	public Location_GoogleMapsPage_UI_Actions(WebDriver driver){
		super(driver);
		this.driver=driver;
	} 
	
	//Method gets and verify`s the title of Google Maps page
	public boolean verify_GoogleMapsPage_Title()
	{
		boolean flag=false;
		if(driver.getTitle().equalsIgnoreCase("Google Maps"))	
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		
		return flag ;
	}

	//Method gets the Title of Google Maps page
	public String  get_GoogleMapsPage_Title()
	{		
		String page_Title=null;
		if(driver.getCurrentUrl().contains("https://www.google.com/maps"))	
		{
			page_Title =driver.getTitle();
		}
		return page_Title ;
	}
	
	
	public String get_text_from_Gmaps_FromTxtField()
	{
		return Gmap_fromField_Txt.getText();
	}
	
	public String get_text_from_Gmaps_ToTxtField()
	{
		String ToTxtField_Txt=null;
		
		ToTxtField_Txt = Gmap_toField_Txt.getAttribute("value");	
		return ToTxtField_Txt;
	}
	
   
	
}
