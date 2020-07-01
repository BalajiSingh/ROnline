package com.ryder.online.pages.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageUIObjects extends PageBase {

	public HomePageUIObjects(WebDriver driver) {
		super(driver);

	}

	/** Web Elements  Balaji*/
	
	@FindBy(how = How.XPATH, using = "//a[@title='home']/span")    
	public WebElement TXT_PromoBanner;
	
	@FindBy(how = How.XPATH, using = "//a[@title='home']/span/span[@id='learn-more']")   // or //*[@id='header']/div/div[1]/div/div/a/span/span
	public WebElement LNK_LearnMore;

	@FindBy(how = How.XPATH, using = "//*[@id=\"site-header-ryder-dot-com\"]/div/div/a")
	public WebElement LNK_RYDERCOM;

	@FindBy(how = How.XPATH, using = "//*[@id=\"site-header-contact-info\"]/div/div/a")
	public WebElement LNK_PhoneNumber;

	@FindBy(how = How.XPATH, using = "//*[@id=\"site-header-locations\"]/div/div/a")
	public WebElement LNK_Locations;
	
	@FindBy(how = How.XPATH, using = "//a[@class='header-logo flex']//img")  
	public WebElement LNK_RyderLogo;

	@FindBy(how = How.XPATH, using = "//ul[@id='appmenu']/li[1]/a")
	public WebElement UsedVehicles_Link;

	@FindBy(how = How.XPATH, using = "//ul[@id='appmenu']/li[2]/a")
	public WebElement Brands_Link;

	@FindBy(how = How.XPATH, using = "//ul[@id='appmenu']/li[3]/a")
	public WebElement RyderBenefits_Link;

	////*[contains(text(),'Promotions')]   or  //a[@title='Go to Promotions' and @xpath='1']  or //ul[@id='appmenu']//a[@class='header-flyout__anchor level-1'][contains(text(),'Promotions')]
	@FindBy(how = How.XPATH, using = "//ul[@id='appmenu']/li[4]/a")           
	public WebElement Promotions_Link;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Sign In')]")
	public WebElement LNK_SignIn;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Resources')]")
	public WebElement TXT_RESOURCES;

	@FindBy(how = How.XPATH, using = "(//li[@class='item0 odd first']/div/a)[5]")
	public WebElement LNK_Suppliers;

	@FindBy(how = How.XPATH, using = "(//li[@class='item1 even']/div/a)[5]")
	public WebElement LNK_Careers;

	@FindBy(how = How.XPATH, using = "(//li[@class='item2 odd last']/div/a)[1]")
	public WebElement LNK_TruckRentals;

	@FindBy(how = How.XPATH, using = "(//li[@class='item0 odd first']/div/a)[6]")
	public WebElement LNK_Investors;

	@FindBy(how = How.XPATH, using = "(//li[@class='item1 even']/div/a)[6]")
	public WebElement LNK_Rydercom;

	@FindBy(how = How.XPATH, using = "(//li[@class='item2 odd last']/div/a)[2]")
	public WebElement LNK_RyderTruckParts;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Services')]")
	public WebElement TXT_SERVICES;

	@FindBy(how = How.XPATH, using = "(//li[@class='item0 odd first']/div/a)[7]")
	public WebElement LNK_PreventativeMaintenance;

	@FindBy(how = How.XPATH, using = "(//li[@class='item1 even']/div/a)[7]")
	public WebElement LNK_Warranty;

	@FindBy(how = How.XPATH, using = "(//li[@class='item2 odd last']/div/a)[3]")
	public WebElement LNK_Finance;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Connect')]")
	public WebElement TXT_CONNECT;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'info@ryder.com')]")
	public WebElement LNK_InfoEmail;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='item1 even']/div/a)[8]")
	public WebElement LNK_PhoneNumberFooter;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='item2 odd last']/div/a)[4]")
	public WebElement LNK_WorkHours;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='item0 odd first']/div/a)[9]")
	public WebElement LNK_LinkedIn;

	@FindBy(how = How.XPATH, using = "(//li[@class='item1 even']/div/a)[9]")
	public WebElement LNK_Facebook;

	@FindBy(how = How.XPATH, using = "(//li[@class='item2 odd']/div/a)[5]")
	public WebElement LNK_Twitter;

	@FindBy(how = How.XPATH, using = "(//li[@class='item3 even last']/div/a)[4]")
	public WebElement LNK_Youtube;

	@FindBy(how = How.XPATH, using = "(//li[@class='item0 odd first']/div/a)[10]")
	public WebElement LNK_PrivacyPolicy;

	@FindBy(how = How.XPATH, using = "(//li[@class='item1 even']/div/a)[10]")
	public WebElement LNK_TermsofUse;

	@FindBy(how = How.XPATH, using = "(//li[@class='item2 odd last']/div/a)[5]")
	public WebElement LNK_Sitemap;

	@FindBy(how = How.XPATH, using = "//*[@id=\"footer-disclosure\"]/div/div/div[1]/div/div/span")
	public WebElement TXT_Copyright;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'SHOP OUR TRUCKS')]")
	public WebElement TXT_SHOPOURTRUCKS;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'USED TRUCKS FOR SALE')]")
	public WebElement TXT_USEDTRUCKSFORSALE;

	@FindBy(how = How.XPATH, using = "(//div[@class='field-caption'])[1]/a")
	public WebElement LNK_SEMITRUCK;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='field-caption'])[2]/a")
	public WebElement LNK_TRUCKS;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='field-caption'])[3]/a")
	public WebElement LNK_TRAILERS;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='field-caption'])[4]/a")
	public WebElement LNK_VANSCARS; 
	
	//-----------------------------------------Featured Brands--------------------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "(//div[@class='component promo position-center promo--headline-smaller'])[2]//h2")
	public WebElement FEATUREDBRANDS_Header_Txt;
	
	//Brand Images Link
	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-icon']//a)[1]")
	public WebElement FREIGHTLINER_Image_Link;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-icon']//a)[2]")
	public WebElement ISUZU_Image_Link;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-icon']//a)[3]")
	public WebElement PETERBILT_Image_Link;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-icon']//a)[4]")
	public WebElement HINO_Image_Link;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-icon']//a)[5]")
	public WebElement MERCEDESBENZ_Image_Link;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-icon']//a)[6]")
	public WebElement INTERNATIONAL_Image_Link;
	
	//Brand link Text
	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-caption']//a)[1]")
	public WebElement LNK_FREIGHTLINER_link_Txt;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-caption']//a)[2]")
	public WebElement LNK_ISUZU_link_Txt;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-caption']//a)[3]")
	public WebElement LNK_PETERBILT_link_Txt;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-caption']//a)[4]")
	public WebElement LNK_HINO_link_Txt;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-caption']//a)[5]")
	public WebElement LNK_MERCEDESBENZ_link_Txt;

	@FindBy(how = How.XPATH, using = "((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-caption']//a)[6]")
	public WebElement LNK_INTERNATIONAL_link_Txt;

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(how = How.XPATH, using = "(//li[@class='item0 odd first']/div/a/img)[1]") //dont use need to check why is this here
	public WebElement LNK_Freightliner;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'RYDER DOT VERIFIED')]")
	public WebElement TXT_RYDERDOTVERIFIED;

	@FindBy(how = How.XPATH, using = "(//div[@class='field-blurb'])[1]")
	public WebElement TXT_RYDERDOTVERIFIEDCONTENT;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'RYDER CERTIFIED')]")
	public WebElement TXT_RYDERCERTIFIED;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='field-blurb'])[2]")
	public WebElement TXT_RYDERCERTIFIEDCONTENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"promo-cards\"]/div/div/div[3]/div/div/div/div[1]/h3")
	public WebElement TXT_ASIS;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='field-blurb'])[3]")
	public WebElement TXT_ASISCONTENT;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'VERIFIED VEHICLES')]")
	public WebElement LNK_VERIFIEDVEHICLES;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'CERTIFIED VEHICLES')]")
	public WebElement LNK_CERTIFIEDVEHICLES;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'AS-IS VEHICLES')]")
	public WebElement LNK_ASISVEHICLES;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[5]/div[3]/a[1]")       ///html/body/div[2]/div[3]/a
	
	public WebElement BTN_cookieConfirmation;
	
	@FindBy(how = How.ID, using = "fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_Fields_b2e8e608-8259-4316-958c-13ee7030029b__Value")
	public WebElement INP_FirstName;
	
	@FindBy(how = How.ID, using = "fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_Fields_03db2bb2-dd4d-42f1-900d-9ea18ffe55f6__Value")
	public WebElement INP_LastName;
	
	@FindBy(how = How.ID, using = "fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_Fields_f3a2c72a-3a79-439e-909d-a190cd5ce28c__Value")
	public WebElement INP_BusinessName;
	
	@FindBy(how = How.ID, using = "fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_Fields_ed2a4a59-46f1-4d28-9e1e-5294bbb28627__Value")
	public WebElement INP_EmailAddress;
	
	@FindBy(how = How.ID, using = "fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_Fields_76bd0b06-3525-491c-8c14-c6f24ea45f7a__Value")
	public WebElement INP_Phone;
	
	@FindBy(how = How.ID, using = "fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_Fields_034b978d-375c-47a4-82d8-c530fa90193a__Value")
	public WebElement INP_ZipCode;
	
	@FindBy(how = How.ID, using = "fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_Fields_a2899e56-dc9c-41df-820e-c883d8a42d69__Value")
	public WebElement INP_Comment;
	
	@FindBy(how = How.ID, using = "fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_Fields_d861b38f-21c8-452c-bd07-4d75f95a68d0__Value")
	public WebElement DRPDWN_Select;
	public By dropDown = By.id("fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_Fields_d861b38f-21c8-452c-bd07-4d75f95a68d0__Value");
	
	@FindBy(how = How.XPATH, using = "//*[@class='validation-summary-errors']/ul/li")
	public WebElement TXT_sucessfullSubmissionMsg;
	
	@FindBy(how = How.XPATH, using = "//*[@value='SUBMIT']")
	public WebElement BTN_submit;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_240b0163-1d79-49d6-977c-5fae317445f3\"]/div/div[1]/span/span")
	public WebElement TXT_FirstNameErrorMessage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_240b0163-1d79-49d6-977c-5fae317445f3\"]/div/div[2]/span/span")
	public WebElement TXT_LastNameErrorMessage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"fxb_c1ce364a-5fa5-48d3-b51e-298067bccd1c_240b0163-1d79-49d6-977c-5fae317445f3\"]/div/div[4]/span/span")
	public WebElement TXT_EmailAddressErrorMessage;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='component-content']/div[@class='promo-headline col-md-8 col-md-offset-2 col-lg-6 col-lg-offset-3']/h2)[1]")
	public WebElement featured_Vehicles_Header_Txt;
	
	//-----Carosel Images , Product Info, Price, year, Mileage info -----------------------------
			//Image Carousel links list 		
			@FindBy(how=How.XPATH,using="(//div[@class='photo']/a)")
			public List<WebElement>  image_Carousel_Links_list;
			
			//Image Carousel previous button
			@FindBy(how=How.XPATH,using="//button[@class='slick-prev slick-arrow']")
			public WebElement  image_Carousel_Previous_Btn;
			
			//Image Carousel Next button
			@FindBy(how=How.XPATH,using="//button[@class='slick-next slick-arrow']")
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
			
			//--------------------------------------------------------------------------------------------------------------------
			
			
}
