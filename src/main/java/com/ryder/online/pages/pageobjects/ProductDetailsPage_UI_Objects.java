package com.ryder.online.pages.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailsPage_UI_Objects extends PageBase {
	
	public ProductDetailsPage_UI_Objects(WebDriver driver) {
		super(driver);

	} 
	
    // Ryder Certified or Verified  Or Reclassified Image on Product Card 
	@FindBy(how=How.XPATH,using="//div[@class='Rectangle_box']//span/img")
	public WebElement condition_Tier_Img;
	
	
	//Product title Header Text1 on Product Card	
	@FindBy(how=How.XPATH,using="//div[@class='Rectangle_box']//h1/div[1]")
	public WebElement product_Titile_Text1;
	
	//Product title Header Text2 on Product Card	
	@FindBy(how=How.XPATH,using="//div[@class='Rectangle_box']//h1/div[2]")
	public WebElement product_Titile_Text2;	
	
	//Miles info on Product Card
	@FindBy(how=How.XPATH,using="//div[@class='Rectangle_box']//h3//span/div[1]")
	public WebElement miles_info_Txt;
	
	//Year Info on Product Card	
	@FindBy(how=How.XPATH,using="//div[@class='Rectangle_box']//h3//span/div[2]")
	public WebElement year_info_Txt;
	
	//Vehcile Number , location info on Product Card
	@FindBy(how=How.XPATH,using="//div[@class='Rectangle_box']//h3[2]//span")
	public WebElement vehicle_No_Txt;
	
	//Price info on Product Card
	@FindBy(how=How.XPATH,using="(//div[@class='Rectangle_box']//h2)[2]")
	public WebElement price_info_Txt;
	
	//Sale Pending Text on Product Card
	@FindBy(how=How.XPATH,using="(//div[@class='Rectangle_box']//a)/h2")
	public WebElement sale_Pending_Link_Txt;
	
	//Get Started Button Or NOTIFY IF VEHICLE BECOMES AVAILABLE Button	
	@FindBy(how=How.XPATH,using="(//div[@class='Rectangle_box']//a)/div")
	public WebElement get_started_Btn;		
	

	//VEHICLE HIGHLIGHTS Header Text
	@FindBy(how=How.XPATH,using="(//div[@class='col-xs-12 col-md-8'])//h2[1]")
	public WebElement vehicle_Highlights_Header_Txt;	
	
}
