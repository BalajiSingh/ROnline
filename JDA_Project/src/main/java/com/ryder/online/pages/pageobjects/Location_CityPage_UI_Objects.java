package com.ryder.online.pages.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author balasing
 *
 */
public class Location_CityPage_UI_Objects extends PageBase {
	
	public Location_CityPage_UI_Objects(WebDriver driver) {
		super(driver);

	} 
	     
	    //List WebElemet - for top header section1 links( Ryder.com, Phone no , Locations)     - //div[@id='inner-header']//div[@class='row component column-splitter'][1]//a   OR  (//div[@class='row component column-splitter'])[1]//a  
	   	@FindBy(how=How.XPATH,using="//div[@id='inner-header']//div[@class='row component column-splitter'][1]//a")
	    public List<WebElement>  headerSection1_links_list;
	
	    //ryder.com link Text      OR //div[@class='field-link']//a[contains(text(),'RYDER.COM')]
	    @FindBy(how=How.XPATH,using="(//div[@class='field-link'])[1]/a")
	    public WebElement ryderDotComLinkTxt;
	
	    //Phone Number           OR //div[@class='field-link']//a[contains(text(),'1-855-785-4200')]
		@FindBy(how=How.XPATH,using="(//div[@class='field-link'])[2]/a")
		public WebElement phoneNoLinkTxt;
		
		//Location Link Text //a[contains(text(),'Locations')]
		@FindBy(how=How.XPATH,using="(//div[@class='field-link'])[3]/a")
		public WebElement locationLinkTxt;
		
		//Ryder Even Better Image Icon Link   //div[@class='header-navigation flex flex-align-center']/a
		@FindBy(how=How.XPATH,using="//a[@class='header-logo flex']//img")
		public WebElement ryderEvenBetterImageLink;
				
				
		
		
		//List WebElemet - for top header Section2 links( Used Vehicles,Brands, RyderBenefits, Promotions)     - //ul[@id='appmenu']/li   OR //div[@class='header-content uvs-row flex-align-center']//ul[@id='appmenu']/li
	   	@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li")
	    public List<WebElement>  headerSection2_links_list;
		
		//Menu Item1 - Used Vehicles  //nav[@id='navigation']/div[1]//ul[1]/li[1]/a  OR //ul[@id='appmenu']/li[2]/a  OR //nav[@id='navigation']/div[1]//ul[1]/li[1]/a[1]
		@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li[1]/a")
		public WebElement Used_Vehicles_MenuItem_LinkTxt;
		
		//Menu Item2 - Brands
		@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li[2]/a")
		public WebElement Brands_MenuItem_LinkTxt;
		
		//Menu Item3 - Ryder Benefits  //header//nav[1]/div[1]/div[1]/ul[1]/li[3]/a[1]
		@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li[3]/a")
		public WebElement ryderBenefits_MenuItem_LinkTxt;
		
		
		//Menu Item 4 - Promotions //ul[@id='appmenu']/li[4]/a    or //ul[@id='appmenu']//a[@class='header-flyout__anchor level-1'][contains(text(),'Promotions')]
		@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li[4]/a")
		public WebElement promotions_MenuItem_LinkTxt;
		
		//Search Image Icon link    //div[@class='header-search']/button[@for='q']   OR //label[@id='toggleID-2137']//*[@class='header-search__toggle-icon icon']  or //*[@class='header-search__toggle flex flex-align-center']//*[@class='header-search__toggle-icon icon']
		@FindBy(how=How.XPATH,using="//div[@class='header-search']/button[@for='q']")
		public WebElement searchImgIcon;
		
		//City Header Text 
		@FindBy(how=How.XPATH,using="//div[@class='col-sm-12 utc-location-city-Header']")
		public WebElement cityHeaderText;
	   		
		//City Header Inner  Text
		@FindBy(how=How.XPATH,using="//span[@class='utc-location-city-Header-innerText']")
		public WebElement cityHeader_Inner_Text;
		
		
		//Address Label		//div[@class='col-sm-5 utc-location-city-card-infolabel'][contains(.,'Address')]  OR  //div[contains(text(),'Address')]
		@FindBy(how=How.XPATH,using="(//div[@class='col-sm-5 utc-location-city-card-infolabel'])[1]")
		public WebElement address_Label;
		
		//Address Line1
		@FindBy(how=How.XPATH,using="//div[@class='col-sm-12 utc-location-address']//ul/li[1]/span")
		public WebElement address_Line1_text;		
		
		//Address Line2
		@FindBy(how=How.XPATH,using="//div[@class='col-sm-12 utc-location-address']//ul/li[2]/span")
		public WebElement address_Line2_text;
		
		//Get Direction link		//div[@class='col-sm-12 utc-get-directions']/a   Or //a[contains(text(),'Get Directions')]
		@FindBy(how=How.XPATH,using="//div[@class='col-sm-12 utc-get-directions']/a")
		public WebElement get_Directions_Link;
		
		//Hour of Operation Label	//div[contains(text(),'Hours of Operation')]	
		@FindBy(how=How.XPATH,using="(//div[@class='col-sm-5 utc-location-city-card-infolabel'])[2]")
		public WebElement hrs_Of_Operation_Label;
		
		//Week Days Operation Timings
		@FindBy(how=How.XPATH,using="//div[@class='utc-location-hours']/ul/li[1]/span")
		public WebElement weekDays_Timings_Txt;
		
		//Week Ends Operation Timings
		@FindBy(how=How.XPATH,using="//div[@class='utc-location-hours']/ul/li[2]/span")
		public WebElement weekEnds_Timings_Txt;
		
		//Sales Representatives Label		
		@FindBy(how=How.XPATH,using="(//div[@class='col-sm-5 utc-location-city-card-infolabel'])[3]")
		public WebElement sales_Representatives_Label;
		
		//Sales Representaive Name and Designation
		@FindBy(how=How.XPATH,using="//div[@class='component city-detail-content']//div[3]//div[2]//div[1]/ul/li[1]/span")
		public WebElement sales_Reresentatives_Name_Txt;
		
		//Sales Representative Ryder Email Id
		@FindBy(how=How.XPATH,using="//div[@class='component city-detail-content']//div[3]//div[2]//div[1]/ul/li[2]/span")
		public WebElement sales_Reresentatives_EmailId_Txt;
		
		//Contact Phone Number Label
		@FindBy(how=How.XPATH,using="(//div[@class='col-sm-5 utc-location-city-card-infolabel'])[4]")
		public WebElement contact_PhoneNo_Label;
		
		//Contact Phone Number (//div[@class='utc-location-address'])[2]//span  OR //span[contains(text(),'Phone:')]
		@FindBy(how=How.XPATH,using="(//div[@class='utc-location-address'])[2]//span")
		public WebElement contact_PhoneNo_Txt;
		
		//About US Bold Header Text	 //p[@class='utc-hero-header']	
		@FindBy(how=How.XPATH,using="(//div[@class='utc-hero-content col-md-8 col-md-offset-2 col-lg-6 col-lg-offset-3'])[1]/p")
		public WebElement about_Us_Bold_Header_Txt;
		
		//About Us Information Paragraph  	  OR //div[@class='utc-hero-text-justify']
		@FindBy(how=How.XPATH,using="//div[@class='component hero-content'][1]//div[@class='utc-hero-text-justify']")
		public WebElement about_Us_Info_Para_Txt;
		
		//New Arrivals Bold header Text //div[@class='component hero-content'][2]//p  OR //p[contains(text(),'new arrivals in')]		
		@FindBy(how=How.XPATH,using="//div[@class='component hero-content'][2]//p")
		public WebElement new_Arrivals_Bold_Header_Txt;
		
		
		//-----Carosel Images , Product Info, Price, year, Mileage info -----------------------------
		//Image Carousel links list 		
		@FindBy(how=How.XPATH,using="(//div[@class='photo']/a)")
		public List<WebElement>  image_Carousel_Links_list;
		
		//Image Carousel previous button   //button[@class='slick-prev slick-arrow'][contains(.,'Previous')]
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Previous')]")
		public WebElement  image_Carousel_Previous_Btn;
		
		//Image Carousel Next button
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Next')]")
		public WebElement  image_Carousel_Next_Btn;
				
		//Product Info which includes Product Tier, Title, Current Price, Strike Through Price, Vehicle Mileage and Year		
		@FindBy(how=How.XPATH,using="(//div[@class='product-info'])")
		public List<WebElement>  product_Info_Txts_list;
		
		//below are seperate xpaths for specific item like Product tier,Title, Current Price, Strike Through Price, Vehicle Mileage and Year
		
		//Product Tier Info Link Text of vehicles
		@FindBy(how=How.XPATH,using="//div[@class='product-info']/div[@class='product-tier']")
		public List<WebElement>  product_Tier_Info_Txt_list;
		
		//Product Title of Vehicles		
		@FindBy(how=How.XPATH,using="//div[@class='product-info']/h4[@class='product-title']/a")
		public List<WebElement>  product_Title_Txt_Link_list;
		
		//Product Current Price    //div[@class='current-price'] OR //div[@class='product-info']/div[@class='current-price']
		@FindBy(how=How.XPATH,using="//div[@class='product-info']/div[2]")
		public List<WebElement>  product_Current_Price_Txt_list; 
		
		//Product Strike Through Price   OR //div[@class='strikethrough-price']
		@FindBy(how=How.XPATH,using="//div[@class='product-info']/div[3]")
		public List<WebElement>  product_Strike_Through_Price_Txt_list;
		
		//Product - Vehicle Mileage		 OR //div[@class='mileage-year']/div[1]/span
		@FindBy(how=How.XPATH,using="//div[@class='product-info']/div[5]/div[1]")
		public List<WebElement>  product_mileage_info_Txt_list;
		
		//Product - Vehicle Year //div[@class='mileage-year']/div[@class='year'][contains(text(),'Year:')]
		@FindBy(how=How.XPATH,using="//div[@class='product-info']/div[5]/div[2]")
		public List<WebElement>  Product_Year_Info_Txt_list;
		
		//--------------------------------------------------------------------------------------------------------------------
		
		//Search Used Trucks for Vehicle Type Bold Header Text    or //div[@class='component hero-content']//p[@class='utc-hero-header-level-2'][contains(text(),'used trucks for vehicle type')]
		@FindBy(how=How.XPATH,using="(//p[@class='utc-hero-header-level-2'])[2]")
		public WebElement search_Used_Trucks_for_Vehicle_Type_Bold_Header_Txt;
		
		//Search Used Trucks For Vehicle Type Header Info Text
		@FindBy(how=How.XPATH,using="(//div[@class='component hero-content']//div[@class='utc-hero-text'])[1]")
		public WebElement search_Used_Trucks_for_Vehicle_Type_Info_Txt;
		
		
		//--- Images of USED TRUCKS FOR VEHICLE TYPE ------------------------------------------------------------------------------
		
		//Image of Semi Truck
		@FindBy(how=How.XPATH,using="(//div[@class='field-icon'])[1]/a/img")
		public WebElement image_Semi_Truck_Link;	

		//Image of Trucks
		@FindBy(how=How.XPATH,using="(//div[@class='field-icon'])[2]/a/img")
		public WebElement image_Trucks_Link;

		//Image of Trailers
		@FindBy(how=How.XPATH,using="(//div[@class='field-icon'])[3]/a/img")
		public WebElement image_Trailers_Link;


		//Image of  Vans & Cars	
		@FindBy(how=How.XPATH,using="(//div[@class='field-icon'])[4]/a/img")
		public WebElement image_Vans_And_Cars_Link;
		
		// ----------------------------------------------------------------------------------------------------------------------------
		
		//Semi truck link Txt	
		@FindBy(how=How.XPATH,using="(//div[@class='field-caption'])[1]/a")
		public WebElement semi_truck_linkTxt;
		
		// Trucks Link
		@FindBy(how=How.XPATH,using="(//div[@class='field-caption'])[2]/a")
		public WebElement truck_linkTxt;
		
		//Trailers Link text
		@FindBy(how=How.XPATH,using="(//div[@class='field-caption'])[3]/a")
		public WebElement trailers_linkTxt;

		
		// Vans and Cars Link Text
		@FindBy(how=How.XPATH,using="(//div[@class='field-caption'])[4]/a")
		public WebElement vans_And_Cars_linkTxt;
		
		//------------------------------------------------------------------------------------------------------------------------------
		
		// See All Vehicles for Sale link city page  //a[contains(text(),'see all vehicles for sale in')]
		@FindBy(how=How.XPATH,using="//div[@class='component location-cta-content']/div[@class='component-content']/a")
		public WebElement see_All_Vehicles_For_Sale_linkTxt;
		
				
		//See what We Currently Have link text on City Page		
		@FindBy(how=How.XPATH,using="//div[@class='utc-hero-header-level-2']")
		public WebElement see_What_We_Currently_Have_linkTxt;
				
				
		//-----Sub Category Links on City Page ----------------------------------------------------------------------------------------
		
		//sub-category list     OR  //*[@class='sub-category-list ']/div//li
		@FindBy(how = How.XPATH, using = "(//div[@class='sub-category-list ']/div[@class='list_item']//li/a)")  //main[1]//div[1]/div[1]/div[10]/div[1]/a[1]
		 public List<WebElement> sub_categoty_List_links;
		
		//used truck image present on right hand side of Sub-category list	
		@FindBy(how=How.XPATH,using="//div[@class='vehicle-img']//img")
		public WebElement used_Truck_Image;
		
		//------------------------------------------------------------------------------------------------------------------------------
				
		//Used Trucks By Brands Bold Header Text
		@FindBy(how=How.XPATH,using="(//div[@class='component hero-content'])[4]//p")
		public WebElement used_Trucks_By_Brands_Bold_Header_Txt;
				
		//Used Trucks By Brands Header Info Text
		@FindBy(how=How.XPATH,using="(//div[@class='component hero-content']//div[@class='utc-hero-text'])[2]")
		public WebElement used_Trucks_By_Brands_Header_Info_Txt;
		
		//-----------------Vehicle Images link by brand ---------------------------------------------------------------------------------
		
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
		
		//-------------------------------------------------------------------------------------
		
		
		
		//-----------------------------------------------------------------------------------
		
		
		
}
