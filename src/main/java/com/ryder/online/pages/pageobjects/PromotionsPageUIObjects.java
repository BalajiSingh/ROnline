package com.ryder.online.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PromotionsPageUIObjects extends PageBase  {
	
	public PromotionsPageUIObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	//Promotion Page Header Text
	@FindBy(how = How.XPATH, using = "//h1[contains(text(), 'RYDER DRIVE TO SAVINGS')]") 
	public WebElement promotion_headerTxt;
		
	
   //Learn More Button
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'col-sm-3 ryder-promo-offset')]//div[contains(@class,'btn btn-danger')]") 
	public WebElement learn_More_Btn;
	
	//Promotion page Image header
	@FindBy(how = How.XPATH, using = "//div[@class='container-fluid promo-hero-with-text-button-container']")     
	public WebElement IMG_HeaderImage;
}
