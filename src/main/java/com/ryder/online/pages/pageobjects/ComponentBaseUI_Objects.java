package com.ryder.online.pages.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ComponentBaseUI_Objects extends PageBase {
	
	public ComponentBaseUI_Objects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//===========================Header Section Elements Common in all Pages======================================================================
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
	
	
	//List WebElemet - for top header Section2 links( Used Vehicles,Brands, RyderBenefits, Promotions)- //ul[@id='appmenu']/li   OR //div[@class='header-content uvs-row flex-align-center']//ul[@id='appmenu']/li
   	@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li")
    public List<WebElement>  headerSection2_links_list;
	
	//Menu Item1 - Used Vehicles  //nav[@id='navigation']/div[1]//ul[1]/li[1]/a  OR //ul[@id='appmenu']/li[2]/a  OR //nav[@id='navigation']/div[1]//ul[1]/li[1]/a[1]
	@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li[1]/a")
	public WebElement Used_Vehicles_MenuItem_LinkTxt;
	
	//Menu Item2 - Brands
	@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li[2]/a")
	public WebElement Brands_MenuItem_LinkTxt;
	
	//Menu Item3 - Ryder Benefits  
	@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li[3]/a")
	public WebElement ryderBenefits_MenuItem_LinkTxt;
	
	
	//Menu Item 4 - Promotions //ul[@id='appmenu']/li[4]/a    or //ul[@id='appmenu']//a[@class='header-flyout__anchor level-1'][contains(text(),'Promotions')]
	@FindBy(how=How.XPATH,using="//ul[@id='appmenu']/li[4]/a")
	public WebElement promotions_MenuItem_LinkTxt;
	
	//Search Image Icon link    //div[@class='header-search']/button[@for='q']   OR //label[@id='toggleID-2137']//*[@class='header-search__toggle-icon icon']  or //*[@class='header-search__toggle flex flex-align-center']//*[@class='header-search__toggle-icon icon']
	@FindBy(how=How.XPATH,using="//div[@class='header-search']/button[@for='q']")
	public WebElement searchImgIcon;
	
	//=================================End of Header Section elements==============================================================================================

   //=====================================Home Page Elements======================================================================================================
	
	//Featured Vehicles Header Text present in Home Page
	@FindBy(how=How.XPATH,using="(//div[@class='component-content']/div[@class='promo-headline col-md-8 col-md-offset-2 col-lg-6 col-lg-offset-3']/h2)[1]")
	public WebElement featured_Vehices_Header_Txt;
	
    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div[3]/a[1]")       ///html/body/div[2]/div[3]/a	
	public WebElement BTN_cookieConfirmation;
	
   //==========================================End of Home Page Elements ========================================================================================	
	
  //============================================City page Elements ==============================================================================================
	
	//New Arrivals Header Text present in City page
	@FindBy(how=How.XPATH,using="(//div[@class='component-content']//p)[6]")
	public WebElement new_Arrivals_Header_Txt;
	
	
 //===============================================End of city page Elements=======================================================================================	
	
	
	//-----Carosel Images , Product Info, Price, year, Mileage info -----------------------------
			//Image Carousel links list 		
			@FindBy(how=How.XPATH,using="(//div[@class='photo']/a)")
			public List<WebElement>  image_Carousel_Links_list;
			
			//Image Carousel previous button     OR //button[@class='slick-prev slick-arrow']
			@FindBy(how=How.XPATH,using="//button[@class='slick-prev slick-arrow'][contains(.,'Previous')]")
			public WebElement  image_Carousel_Previous_Btn;
			
			//Image Carousel Next button        OR //button[@class='slick-next slick-arrow']  OR //button[contains(text(),'Next')]
			@FindBy(how=How.XPATH,using="//button[contains(text(),'Next')]")
			public WebElement  image_Carousel_Next_Btn;
					
			//Product Info which includes Product Tier, Title, Current Price, Strike Through Price, Vehicle Mileage and Year		
			@FindBy(how=How.XPATH,using="//div[@class='product-info']")
			public List<WebElement>  product_Info_Txts_list;
			
			//below are seperate xpaths for specific item like Product tier,Title, Current Price, Strike Through Price, Vehicle Mileage and Year
			
			//Product Tier Info Link Text of vehicles
			@FindBy(how=How.XPATH,using="//div[@class='product-info']/div[@class='product-tier']")
			public List<WebElement>  product_Tier_Info_Txt_list;
			
			//Product Title of Vehicles		
			@FindBy(how=How.XPATH,using="//div[@class='product-info']/h4[@class='product-title']/a")
			public List<WebElement>  product_Title_Txt_Link_list;
			
			//Product Current Price
			@FindBy(how=How.XPATH,using="//div[@class='current-price']")
			public List<WebElement>  product_Current_Price_Txt_list;
			
			//Product Strike Through Price
			@FindBy(how=How.XPATH,using="//div[@class='strikethrough-price']")
			public List<WebElement>  product_Strike_Through_Price_Txt_list;
			
			//Product - Vehicle Mileage		
			@FindBy(how=How.XPATH,using="//div[@class='mileage-year']/div[1]/span")
			public List<WebElement>  product_mileage_info_Txt_list;
			
			//Product - Vehicle Year
			@FindBy(how=How.XPATH,using="//div[@class='mileage-year']/div[@class='year'][contains(text(),'Year:')]")
			public List<WebElement>  Product_Year_Info_Txt_list;
			
			//-----------------------------------------End of Image Carousel Section---------------------------------------------------------------------------
	
			
	//======= Used Trucks for Vehicle Type Section Elements section as present in Homepage , State and City Page=============================== 	
			
			//list of Image Links of Used  Trucks For Vehicle Type  Header Txt Section ( Semi Truck , Trucks, Trailers , Vans And Cars)
			
			@FindBy(how=How.XPATH,using="((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[1]//div[@class='field-icon']//img)")
			public List<WebElement> list_Of_All_Used_Trucks_Image_links;						
					
			
			//List of all links under Used Trucks For Vehicle Type  Header Txt Section ( Semi Truck , Trucks, Trailers , Vans And Cars)  (//div[@class='field-caption']/a)   or ((//div[@class='component-content'])[33]//div[@class='field-caption']/a)
			@FindBy(how=How.XPATH,using="((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[1]//div[@class='field-caption']//a)")
			public List<WebElement> list_Of_All_Used_Trucks_links_Txt;
			
			
			//List of All Featured Brand Image Links		((//div[@class='component-content'])[39]//div[@class='field-icon']//img)	
			@FindBy(how=How.XPATH,using="((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-icon']//img)")
			public List<WebElement> list_Of_Featured_Brands_Image_links;
			
			//List of All Featured Brand Text Links		or ((//div[@class='component-content'])[39]//div[@class='field-caption']/a)	
			@FindBy(how=How.XPATH,using="((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-caption']//a)")
			public List<WebElement> list_Of_Featured_Brands_links_Txt;
			
			
    //==============================End ===================================================================================================			
}
