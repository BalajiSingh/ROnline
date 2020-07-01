package com.ryder.online.pages.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Location_StatePage_UI_Objects extends PageBase {
	
	public Location_StatePage_UI_Objects(WebDriver driver) {
		super(driver);

	} 
	
    //ryder.com link Text
	@FindBy(how=How.XPATH,using="//div[@class='field-link']//a[contains(text(),'RYDER.COM')]")
	public WebElement ryderDotComLinkTxt;
	
	//Phone Number
	@FindBy(how=How.XPATH,using="//div[@class='field-link']//a[contains(text(),'1-855-785-4200')]")
	public WebElement phoneNoLinkTxt;
	
	//Location Link Text
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Locations')]")
	public WebElement locationLinkTxt;
	
	//Ryder Even Better Image Icon Link
	@FindBy(how=How.XPATH,using="//a[@class='header-logo flex']//img")
	public WebElement ryderEvenBetterImageLinkTxt;
	
	//Menu Item1 - Used Vehicles
	@FindBy(how=How.XPATH,using="//header//nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	public WebElement Used_Vehicles_MenuItem_LinkTxt;
	
	//Menu Item2 - Brands
	@FindBy(how=How.XPATH,using="//header//nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	public WebElement Brands_MenuItem_LinkTxt;
	
	//Menu Item3 - Ryder Benefits
	@FindBy(how=How.XPATH,using="//header//nav[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement ryderBenefits_MenuItem_LinkTxt;
	
	
	//Menu Item 4 - Promotions
	@FindBy(how=How.XPATH,using="//ul[@id='appmenu']//a[@class='header-flyout__anchor level-1'][contains(text(),'Promotions')]")
	public WebElement promotions_MenuItem_LinkTxt;
	
	
	//Search Image Icon link //label[@id='toggleID-2137']//*[@class='header-search__toggle-icon icon']
	@FindBy(how=How.XPATH,using="//*[@class='header-search__toggle flex flex-align-center']//*[@class='header-search__toggle-icon icon']")
	public WebElement searchImgIcon;
	
	//State Header Text 
	@FindBy(how=How.XPATH,using="//div[@class='utc-location-city-Header']")
	public WebElement stateHeaderText;
	
    //State Header Info text
	@FindBy(how=How.XPATH,using="//div[@class='utc-state-header-info-text']")
	public WebElement stateHeader_InfoText;
	
	//State Name as present on left hand side below the Header text
	@FindBy(how=How.XPATH,using="//div[@class='utc-location-state']")
	public WebElement stateName_Text;
	
	//city Name 
	@FindBy(how=How.XPATH,using="//div[@class='utc-location-city']")
	public WebElement cityName_Text;
	
	
	//city Name 
	@FindBy(how=How.XPATH,using="//div[@class='utc-location-city']")
	public List<WebElement> cityNameList;
	
	//City Address line1  - if more than two cities present  
	@FindBy(how=How.XPATH,using="//body[1]//div[@class='utc-location-address']//li[1]/span[1]")
	public List<WebElement> citi_Address_Line1_list1;
	
	//City Address line1       //span[contains(text(),'3100 9Th Ave N')]
	@FindBy(how=How.XPATH,using="//body[1]//div[@class='utc-location-address']//li[1]/span[1]")
	public WebElement cityAddressLine1_Text;
	
	
	//City Address line2  - if more than two cities present  
	@FindBy(how=How.XPATH,using="//body[1]//div[@class='utc-location-address']//li[2]/span[1]")
	public List<WebElement> citi_Address_Line1_list2;
	
	//city Address line2       //span[contains(text(),'Birmingham, Alabama')]
	@FindBy(how=How.XPATH,using="//body[1]//div[@class='utc-location-address']//li[2]/span[1]")
	public WebElement cityAddressLine2_Text;
	
	//Get Directions Link   OR //a[contains(text(),'Get Directions')]
	@FindBy(how=How.XPATH,using="//div[@class='utc-get-directions']/a")
	public WebElement getdirections_LinkTxt;
	
	//Get Directions Link
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Get Directions')]")
	public List<WebElement> getdirections_Link_List;
	
	
	//city Phone number
	@FindBy(how=How.XPATH,using="//div[@class='utc-location-phone']")
	public List<WebElement> city_PhoneNum_Txt_list;
	
	//Week Day Timings
	@FindBy(how=How.XPATH,using="//body[1]//div[@class='utc-location-hours']//li[1]/span[1]")
	public List<WebElement> weekDay_Timings_Txt_list;
	
	//WeekEnds 
	@FindBy(how=How.XPATH,using="//body[1]//div[@class='utc-location-hours']//li[2]/span[1]")
	public List<WebElement> weekEnd_Timings_Txt_list;
	
	//see all vehicles link 	//body//div[3]/div[2]/div[1]/div[6]/a[1]      or //a[contains(text(),'see all vehicles in Birmingham')]
	@FindBy(how=How.XPATH,using="//body//div[3]/div[2]/div//a[contains(text(),'see all')]")   // use this if you have multiple 'see all vehicles ' link  //body//div[3]/div[2]/div//a[contains(text(),'see all')] 
	public List<WebElement> all_vehicles_Link_Txt;
	
	//Search Alabama used trucks for vehicle type Header Text     //body//div[2]/div[1]/div[1]/p[1]
	@FindBy(how=How.XPATH,using="(//p[@class='utc-hero-header-level-2'])[2]")
	public WebElement used_Trucks_For_VehicleType_Header_Txt;
	
	
	//Second header info text present below the Used Trucks for Vehicle Type header  //main//div[2]//div[1]//div[1]//div[1]	
	@FindBy(how=How.XPATH,using="(//div[@class='component hero-content']//div[@class='utc-hero-text'])[1]")
	public WebElement used_Trucks_For_VehicleType_Header_InfoTxt;
	
	
	//--- Images of USED TRUCKS FOR VEHICLE TYPE -----
	
	//Image of Semi Truck
	@FindBy(how=How.XPATH,using="//li[@class='item0 odd first']/div[1]/a[@title='Semi Truck']")
	public WebElement image_Semi_Truck_Link;	

	//Image of Trucks
	@FindBy(how=How.XPATH,using="//li[@class='item1 even']/div[1]/a[@title='Trucks']")
	public WebElement image_Trucks_Link;

	//Image of Trailers
	@FindBy(how=How.XPATH,using="//li[@class='item2 odd']/div[1]/a[@title='Trailers']")
	public WebElement image_Trailers_Link;


	//Image of  Vans & Cars	
	@FindBy(how=How.XPATH,using="//li[@class='item3 even last']/div[1]/a[@title='Vans & Cars']")
	public WebElement image_Vans_And_Cars_Link;
	
	// --------------------------------------------------------------------------------------------------
	
	//List of all links under Used Trucks For Vehicle Type  Header Txt Section ( Semi Truck , Trucks, Trailers , Vans And Cars)
	@FindBy(how=How.XPATH,using="(//div[@class='field-caption']/a)")
	public List<WebElement> list_Of_All_Used_Trucks_links;
	
	
	//Semi truck link	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'SEMI TRUCK')]")
	public WebElement semi_truck_linkTxt;
	
	// Trucks Link
	@FindBy(how=How.XPATH,using="//a[contains(text(),'TRUCKS')]")
	public WebElement truck_linkTxt;
	
	//Trailers Link text
	@FindBy(how=How.XPATH,using="//a[contains(text(),'TRAILERS')]")
	public WebElement trailers_linkTxt;

	
	// Vans and Cars Link Text
	@FindBy(how=How.XPATH,using="//a[contains(text(),'VANS & CARS')]")
	public WebElement vans_And_Cars_linkTxt;
	
		
	//see what we currently have in alabama  - it is an Hero Header text 
	@FindBy(how=How.XPATH,using="//div[@class='utc-hero-header-level-2']")
	public WebElement hero_Header_Txt;
	
	//see all vehicles for sale in state  - example : SEE ALL VEHICLES FOR SALE IN ALABAMA   //div[@class='component location-cta-content']//div[@class='component-content']/a
	@FindBy(how=How.XPATH,using="//div[@class='component location-cta-content']//div[@class='component-content']/a")
	public WebElement see_all_vehicles_for_sale_link_txt;
	
	@FindBy(how=How.XPATH,using="//div[@class='component location-cta-content']//div[@class='component-content']/a")
	public List<WebElement> see_all_vehicles_for_sale_link_txt1;
	
	//see all vehicles for sale in state  - example : SEE ALL VEHICLES FOR SALE IN FLORIDA    //div[@class='component location-cta-content']//div[@class='component-content']/a
	@FindBy(how=How.XPATH,using="//main[1]//div[1]/div[1]/div[4]/div[1]/a[1]")
	public List<WebElement> see_all_vehicles_for_sale_link_txt2;
		
	//sub-category list    //*[@class='sub-category-list']/div//li  OR //div[@class='sub-category-list ']/div[@class='list_item']//li
	@FindBy(how = How.XPATH, using = "(//div[@class='sub-category-list ']/div[@class='list_item']//li/a)")	                                 
	 public List<WebElement> sub_categoty_List_links;
	
	//used truck image present on right hand side of Sub-category list	
	@FindBy(how=How.XPATH,using="//div[@class='vehicle-img']//img")
	public WebElement used_Truck_Image;
	
	//Used Trucks By Brand  hero Heading Txt - Search Alabama used trucks by brands
	@FindBy(how=How.XPATH,using="(//P[@class='utc-hero-header-level-2'])[2]")       //  //body//div[5]/div[1]/div[1]/p[1]
	public WebElement used_Truck_By_Brand_Hero_HeaderTxt;  
		
	//Used Trucks by Brand Header info Text	
	@FindBy(how=How.XPATH,using="(//div[@class='utc-hero-text'])[2]")
	public WebElement used_Truck_By_Brand_Hero_HeaderInfoTxt;		
	
	
	//Freightliner Image Link	
	@FindBy(how=How.XPATH,using="//li[@class='item0 odd first']//a[@title='Freightliner']")
	public WebElement freightLiner_img_link;	
	
	//Isuzu Image Link	
	@FindBy(how=How.XPATH,using="//li[@class='item1 even']//a[@title='Isuzu']")
	public WebElement isuzu_img_link;
	
	//PeterBilt Image Link
	@FindBy(how=How.XPATH,using="//li[@class='item2 odd']//a[@title='PeterBilt']")
	public WebElement peterBilt_img_link;
	
	//Hino Image Link
	@FindBy(how=How.XPATH,using="//li[@class='item3 even']//a[@title='Hino']")
	public WebElement hino_img_link;
	
	//Mercedes Benz Image Link
	@FindBy(how=How.XPATH,using="//li[@class='item4 odd']//a[@title='Mercedes Benz']")
	public WebElement Mercedes_Benz_img_link;	
	
	//International Image Link
	@FindBy(how=How.XPATH,using="//li[@class='item5 even last']//a[@title='International']")
	public WebElement international_img_link;
}
