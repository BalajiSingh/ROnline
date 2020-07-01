package com.ryder.online.pages.pageactions;



import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.ryder.online.helper.Javascript.JavaScriptHelper;
import com.ryder.online.helper.Logger.LoggerHelper;
import com.ryder.online.pages.pageobjects.ComponentBaseUI_Objects;
import com.ryder.online.settings.ObjectRepo;


public class ComponentBaseUI_Actions extends ComponentBaseUI_Objects{
	
	private WebDriver driver;
	
	private final Logger log = LoggerHelper.getLogger(ComponentBaseUI_Actions.class);
	
	public ComponentBaseUI_Actions(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	private JavaScriptHelper jsHelper = new JavaScriptHelper(ObjectRepo.driver);	
	WebDriverWait wait;

  public boolean verify_Top_Header_MenuItems_isDisplayed(String header_Item)
  {
	 boolean flag = false;
		
	 System.out.println(" Top Header Section1 links");
	 System.out.println("==========================");
	 
	 for(int i =0;i<headerSection1_links_list.size();i++)
	 {  
		 if(i<3)
		 {
			 if(headerSection1_links_list.get(i).isDisplayed())
			 {
				 System.out.println(+i+1+") "+headerSection1_links_list.get(i).getText());
			 }
		 }
		 else
		 {
			 
			 if(headerSection1_links_list.get(i).isDisplayed())
			 {
				 System.out.println(+i+1+") New Links Added in Header Section1 -" +headerSection1_links_list.get(i).getText());
			 }
		 }
		 
	 }
	 
	 System.out.println("");
	 System.out.println(" Top Header Section2 links");
	 System.out.println("==========================");
	 
	 
	 for(int i =0;i<headerSection2_links_list.size();i++)
	 {
		 if(i<4)
		 {
			 if(headerSection2_links_list.get(i).isDisplayed())
			 {
				 System.out.println(+i+1+") "+headerSection2_links_list.get(i).getText());
			 }
		 }
		 else
		 {
			 
			 if(headerSection1_links_list.get(i).isDisplayed())
			 {
				 System.out.println(+i+1+") New Links Added in Header Section2 -" +headerSection2_links_list.get(i).getText());
			 }
		 }
	 }
	 System.out.println(""); 
	 
	 switch (header_Item) { 
	    
	    case "RYDER.COM":
	    	  flag = ryderDotComLinkTxt.isDisplayed() ? true : false;
	          break;
	    case "PhoneNo":
	    	  flag = phoneNoLinkTxt.isDisplayed() ? true : false;     
	          break;
	    case "Locations":
	    	  flag = locationLinkTxt.isDisplayed() ? true : false; 		    	  
	          break;
	    		          
	    case "RyderEvenBetterImg":
	    	  flag = ryderEvenBetterImageLink.isDisplayed() ? true : false;  	  
	    	  break;
        case "Used Vehicles": 
        	  flag= Used_Vehicles_MenuItem_LinkTxt.isDisplayed() ? true : false;		        	 
              break; 
        case "Brands": 
        	 flag= Brands_MenuItem_LinkTxt.isDisplayed() ? true : false;
            break; 
        case "Ryder Benefits": 
        	flag= ryderBenefits_MenuItem_LinkTxt.isDisplayed() ? true : false;
            break; 
        case "Promotions": 
        	flag= promotions_MenuItem_LinkTxt.isDisplayed() ? true : false;
            break; 
        case "header-search": 
        	flag= searchImgIcon.isDisplayed() ? true : false;
            break; 
        case "ALL": 
        	flag= ryderDotComLinkTxt.isDisplayed() && phoneNoLinkTxt.isDisplayed() && locationLinkTxt.isDisplayed() 
        	      && ryderEvenBetterImageLink.isDisplayed() && Used_Vehicles_MenuItem_LinkTxt.isDisplayed() 
        	      && Brands_MenuItem_LinkTxt.isDisplayed() && ryderBenefits_MenuItem_LinkTxt.isDisplayed() && promotions_MenuItem_LinkTxt.isDisplayed()
        	      && searchImgIcon.isDisplayed() ? true : false;
            break;    
            
        default: 
        	header_Item = "Invalid Input";
        	System.out.println("Invalid Header Item Supplied - Please use parameters as 'Used Vehicles' OR 'Brands' OR 'Ryder Benefits' OR 'Promotions' OR 'header-Search' OR 'ALL'");
            break; 
	 } 
	 if(flag)
	     {
		    System.out.println(header_Item+" link/links are displayed on Top Header Section "); 
	     }
	     else
	     {
	    	System.err.println("Invalid " +header_Item+" -- link/links passed as Input or Link/Links are not displayed on Top Header Section ");
	     }
	 return flag;
 }

//Method Clicks on the link present on Top Header Section
public void click_On_Top_Header_Section_links(String header_link)
{
	boolean flag = false;
	WebElement ele =null;
	 
	 switch (header_link) { 
	 
	    case "RYDER.COM":
	    	  flag = ryderDotComLinkTxt.isDisplayed() ? true : false;
	    	  ele = ryderDotComLinkTxt;
	          break;
	          
	    case "PhoneNo":
	    	  flag = phoneNoLinkTxt.isDisplayed() ? true : false;     
	    	  ele = phoneNoLinkTxt;
	          break;
	          
	    case "Locations":
	    	  flag = locationLinkTxt.isDisplayed() ? true : false; 
	    	  ele = locationLinkTxt;
	          break;
	          
	    case "RyderEvenBetterImg":
	    	  flag = ryderEvenBetterImageLink.isDisplayed() ? true : false;  
	    	  ele = ryderEvenBetterImageLink;
	    	  break;
	    	  
        case "Used Vehicles": 
        	  flag= Used_Vehicles_MenuItem_LinkTxt.isDisplayed() ? true : false;	
        	  ele = Used_Vehicles_MenuItem_LinkTxt;
              break; 
              
        case "Brands": 
        	  flag= Brands_MenuItem_LinkTxt.isDisplayed() ? true : false;
        	  ele = Brands_MenuItem_LinkTxt;
              break; 
              
        case "Ryder Benefits": 
        	  flag= ryderBenefits_MenuItem_LinkTxt.isDisplayed() ? true : false;
        	  ele = ryderBenefits_MenuItem_LinkTxt;
              break; 
              
        case "Promotions": 
        	  flag= promotions_MenuItem_LinkTxt.isDisplayed() ? true : false;
        	  ele = promotions_MenuItem_LinkTxt;
              break; 
            
        case "header-search": 
        	  flag= searchImgIcon.isDisplayed() ? true : false;
        	  ele = searchImgIcon;
              break; 
              
        default: 
        	header_link = "Invalid Input";	        	
        	System.out.println("Invalid Header Item Supplied - Please pass parameters as 'RYDER.COM' OR 'PhoneNo' OR 'Locations' OR 'RyderEvenBetterImg' OR 'Used Vehicles' OR 'Brands' OR 'Ryder Benefits' OR 'Promotions' OR 'header-Search' ");
            break; 
	          
	 }        
	
	 if(flag)
	 {
		 ele.click();
		 System.out.println("Clicked on the WebElement - '" +ele.getText() +"' present on Header section ");
	 }
	 else
	 {
		 System.err.println("Failed - Unable to Click on the WebElement - "+ele.getText() +" Present on Top Header Section");
	 }
}


//Verify whether Carousel images are displayed on Home page and appropriate City Page
 public boolean verify_Carousel_Image_Links_isDisplayed_On_HomePage_OR_CityPage() throws InterruptedException
	{
	   
		boolean flag =false;
		System.out.println(" Image Carousel list Size "+image_Carousel_Links_list.size());
		
		int no_of_Next_Button_Clicks =((image_Carousel_Links_list.size())/3)+1;
		
		System.out.println("No of Next Button clicks to be done : "+no_of_Next_Button_Clicks);
		
		for(int i=0;i<image_Carousel_Links_list.size();i++)
		{					
			
			if(image_Carousel_Links_list.get(i).isDisplayed() && image_Carousel_Links_list.get(i).isEnabled())
			{
				flag = true;
		    	log.info("Image Carousel links is displayed On City Page");
				System.out.println(" Image Carousel links is displayed On City Page");
			}
			else
		    {
				if(image_Carousel_Next_Btn.isDisplayed() && image_Carousel_Next_Btn.isEnabled())
				{
				   for(int j =0; j<no_of_Next_Button_Clicks;j++)
				   {
					   image_Carousel_Next_Btn.click();
					   Thread.sleep(1200);
					   if(image_Carousel_Links_list.get(i).isDisplayed() && image_Carousel_Links_list.get(i).isEnabled())
						{
						   flag = true;
					    	log.info("Image Carousel links is displayed On City Page");
							System.out.println(" Image Carousel links is displayed On City Page");
						}
					  
				   }
			   }
			   else
				 {	   
				    flag = false;
				   	log.info("Image Carousel link is not  displayed On City Page");
					System.err.println(" Image Carousel link is not displayed On City Page");
				 }	
			  	
		    }
		}
	    
	    
		return flag;
	}

    //Method clicks  on Image present in Image carousel to open Product Details page
 
 public void click_On_Image_Carousel_Images_To_Open_ProductDetailsPage() throws InterruptedException
 {
	 
	 WebElement ele1= null;		
	 int TruckCount =1;		 
	 int TractorCount=1;
	 int TrailerCount =1;
	 int VansAndCar = 1;
	 SoftAssert softAssertion= new SoftAssert();	 
	
	 
	    boolean flag  = new_Arrivals_Header_Txt.isDisplayed();
		WebElement scroll_ele = null;
		String page=null;
		if(!flag)
		{   
			//to Scroll down in Home page to view Image Carousel Component
			scroll_ele = featured_Vehices_Header_Txt;
			page = "Home Page";
		}
		else
		{		
			//to Scroll down in City Page to view Image Carousel Component
			scroll_ele = new_Arrivals_Header_Txt;
			page = "City Page";
		}			
			
		JavascriptExecutor js = (JavascriptExecutor) driver;		
	    js.executeScript("arguments[0].scrollIntoView();", scroll_ele);
	    
	    System.out.println("No of Images Present in Image Carousel :"+image_Carousel_Links_list.size());
	    
	    String str_Veh = null;
	    
	  if(image_Carousel_Links_list.size()>0)
	  {  	
	    
	    for(int i=1;i<=image_Carousel_Links_list.size();i++)
		 {			
			 String[] str =image_Carousel_Links_list.get(i-1).toString().split("xpath:");
			 String str1 = str[str.length-1];
			 str1=str1.substring(0,str1.length()-1).trim();						
			
			 String image_url = driver.findElement(By.xpath(str1+"["+i+"]")).getAttribute("href");
			 System.out.println(+i+")Image links :"+image_url);
			 	
			// https://st-usedtrucks.ryder.com/used-trucks/inventory/tx/el-paso/truck/refrigerated-trucks/2016/freightlinersprinter/sprinter-3500/666527/
				 
			
			 
			 if(image_url.contains("/truck/"))
			 {
				 str_Veh ="truck";
				 str_Veh=str_Veh.toUpperCase();
			 }
			 if(image_url.contains("/tractor/"))
			 {
				 str_Veh ="tractor";
				 str_Veh=str_Veh.toUpperCase();
			 }
			 if(image_url.contains("/trailer/"))
			 {
				 str_Veh ="trailer";
				 str_Veh=str_Veh.toUpperCase();
			 }
			 if(image_url.contains("/vans-and-cars/"))
			 {
				 str_Veh ="vans-and-cars";
				 str_Veh=str_Veh.toUpperCase();
			 }
			 
			 
			 ele1 =driver.findElement(By.xpath(str1+"["+i+"]"));
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;	
			 
			 int wait1 =2500;
			 
			 switch(str_Veh)
			 {  
			    //Case statements  
			    case "TRUCK":  
			    	   
			    	    if(TruckCount==1 )
					     {
   		    	       	   log.info("Clicking on Truck Image Present in Image Carousel on "+page);	
			    	       js1.executeScript("arguments[0].click()", ele1);
			    	       
					       Thread.sleep(2000);
					       if(!driver.getPageSource().contains("Server Error in '/' Application."))
					       {
					    	   if(driver.findElement(By.xpath("//h2[@class='col-md-12']")).isDisplayed())
						       {
						    	  TruckCount++; 
						    	  System.out.println("");
						    	  System.out.println("===========================================================================================================================");					    	  
						    	  System.out.println(i+") Able to Navigate to Product Details page by clicking on Truck Image Present in Image  Carousel on  - "+page);
							      System.out.println("   Link : "+driver.getCurrentUrl());
							      System.out.println("===========================================================================================================================");
							      System.out.println("");
							      driver.navigate().back();
							      Thread.sleep(wait1);
							    //to click on the popup present on Home page
								   if(page.equalsIgnoreCase("Home Page"))
								   {
								   	  isCookieConfirmationPopUpPresent();
								   }
						      }
					       }
					       else
					       {
					    	  TruckCount++;  
						      System.err.println("   Unable to display Truck Product Details Page due to Server Error" );
						      System.err.println("   Link : "+driver.getCurrentUrl());
						      softAssertion.assertTrue(false,"Failed - Due to Truck Product Details Page threw Server Error");
						      driver.navigate().back();
						      Thread.sleep(wait1);
						      //to click on the popup present on Home page
						      if(page.equalsIgnoreCase("Home Page"))
						      {
						    	  isCookieConfirmationPopUpPresent();
						      }
						    		  
					       }
					 }
			    break;  
			    case "TRACTOR":  
			    	   
		    	    if(TractorCount==1 )
				     {
		    	       log.info("Clicking on Tractor Image Present in Image Carousel on "+page);
		    	       js1.executeScript("arguments[0].click()", ele1);		
		    	       
				       Thread.sleep(2000);
				       if(!driver.getPageSource().contains("Server Error in '/' Application."))
				       { 
				         if(driver.findElement(By.xpath("//h2[@class='col-md-12']")).isDisplayed())
				         {
				    	   TractorCount++; 
				    	   System.out.println("");
				    	   System.out.println("===========================================================================================================================");					    	  
				    	   System.out.println(i+") Able to Navigate to Product Details page by clicking on Tractor Image Present in Image  Carousel on  - "+page);
					       System.out.println("   Link : "+driver.getCurrentUrl());
					       System.out.println("===========================================================================================================================");
					       System.out.println("");
					       driver.navigate().back();
					       Thread.sleep(wait1);
					     //to click on the popup present on Home page
						   if(page.equalsIgnoreCase("Home Page"))
						   {
						   	  isCookieConfirmationPopUpPresent();
						   }
				         }
				       }   
				      else
				      {
				    	  TractorCount++;
					      System.err.println("   Unable to display Tractor Product Details Page due to Server Error");
					      System.err.println("   Link : "+driver.getCurrentUrl());
					      softAssertion.assertTrue(false,"Failed - Due to Tractor Product Details Page threw Server Error");
					      driver.navigate().back();
                         Thread.sleep(wait1);
                       //to click on the popup present on Home page
						  if(page.equalsIgnoreCase("Home Page"))
						   {
						   	  isCookieConfirmationPopUpPresent();
						   }
				      }
				  }
		        break;  
			    case "TRAILER":  
			    	   
		    	    if(TrailerCount==1 )
				     {
		    	       log.info("Clicking on Trailer Image Present in Image Carousel on "+page);	
		    	       js1.executeScript("arguments[0].click()", ele1);
		    	       
				       Thread.sleep(2000);
				       if(!driver.getPageSource().contains("Server Error in '/' Application."))
				       {
				         if(driver.findElement(By.xpath("//h2[@class='col-md-12']")).isDisplayed())
				         {
				    	   TrailerCount++; 
				    	  System.out.println("");
				    	  System.out.println("===========================================================================================================================");					    	  
				    	  System.out.println(i+") Able to Navigate to Product Details page by clicking on Trailer Image Present in Image  Carousel on  - "+page);
					      System.out.println("   Link : "+driver.getCurrentUrl());
					      System.out.println("===========================================================================================================================");
					      System.out.println("");
					      driver.navigate().back();
					      Thread.sleep(wait1);
					    //to click on the popup present on Home page
						   if(page.equalsIgnoreCase("Home Page"))
						   {
						   	  isCookieConfirmationPopUpPresent();
						   }
				        }
				      }   
				      else
				      {
				    	  TrailerCount++;
					      System.err.println("   Unable to display Trailer Product Details Page due to Server Error");
					      System.err.println("   Link : "+driver.getCurrentUrl());
					      softAssertion.assertTrue(false,"Failed - Due to Trailer Product Details Page threw Server Error");
					      driver.navigate().back();
					      Thread.sleep(wait1);
					    //to click on the popup present on Home page
						   if(page.equalsIgnoreCase("Home Page"))
						   {
						   	  isCookieConfirmationPopUpPresent();
						   }
				      }
				 }
		    break;  
			case "VANS-AND-CARS" :     //UsedVehicles-VANS-AND-CARS   OR     UsedVehicles-VANS%20AND%20CARS
			    	   
		    	    if(VansAndCar==1 )
				     {
		    	       log.info("Clicking  on Vans And Cars Image Present in Image Carousel on "+page);
		    	       js1.executeScript("arguments[0].click()", ele1);	
		    	       
				       Thread.sleep(2000);
				       if(!driver.getPageSource().contains("Server Error in '/' Application."))
				       { 
				          if(driver.findElement(By.xpath("//h2[@class='col-md-12']")).isDisplayed())
				          {
				    	     VansAndCar++; 
				    	     System.out.println("");
				    	     System.out.println("===========================================================================================================================");					    	  
					         System.out.println(i+") Able to Navigate to Product Details page by clicking on Van And Cars Image Present in Image  Carousel on  - "+page);
					         System.out.println("   Link : "+driver.getCurrentUrl());
					         System.out.println("===========================================================================================================================");
					         System.out.println("");
					         driver.navigate().back();
					         Thread.sleep(wait1);
					       //to click on the popup present on Home page
							   if(page.equalsIgnoreCase("Home Page"))
							   {
							   	  isCookieConfirmationPopUpPresent();
							   }
				         }
				      }    
				      else
				      {
				    	  VansAndCar++;
					      System.err.println("   Unable to display Van And Cars Product Details Page due to Server Error");
					      System.err.println("   Link : "+driver.getCurrentUrl());
					      softAssertion.assertTrue(false,"Failed - Due to Vans and Cars Product Details Page threw Server Error");
					      driver.navigate().back();
					      Thread.sleep(wait1);
					    //to click on the popup present on Home page
						   if(page.equalsIgnoreCase("Home Page"))
						   {
						   	  isCookieConfirmationPopUpPresent();
						   }
				      }
				 }
		    break;  
			    //Default case statement  
			    default:System.err.println("Image Carousel is not Present hence cannnot navigate to Product Detaills Page");  
			}  
			 
		 }
		 softAssertion.assertAll();	   
	  }
	  else
	  {
		  System.err.println("Image Carousel is not Present on "+page +" hence cannnot navigate to Product Detaills Page");
	  }
 }
 
       //Method  clicks on the popup present on Home page 
        public void isCookieConfirmationPopUpPresent() throws InterruptedException {
        	        	
        	List<WebElement> popup = driver.findElements(By.xpath("/html/body/div[5]/div[3]/a[1]"));
        	if(popup.size() >0)
        	{
		       if (BTN_cookieConfirmation.isDisplayed()) {
			        BTN_cookieConfirmation.click();			
			        Thread.sleep(1000);
		      }
        	}   
	      }
        
        
     public boolean verify_Used_Trucks_For_Vehicle_Type_Image_Links_Are_Displayed()
     {
    	 boolean flag = false;
    	 
         System.out.println("No of Used Trucks for Vehicle Type Image Links : " +list_Of_All_Used_Trucks_Image_links.size());
         
         WebElement ele1= null;
 		String used_veh_type_Image_Link=null;
         
         if(list_Of_All_Used_Trucks_Image_links.size()!=0)
         {
         	                
               for(int i =1;i<=list_Of_All_Used_Trucks_Image_links.size();i++)
               {
         	     String[] str =list_Of_All_Used_Trucks_Image_links.get(i-1).toString().split("xpath:");
 			     String str1 = str[str.length-1];
 			     str1=str1.substring(0,str1.length()-1).trim();
 			     //System.out.println("Xpath : "+str1);
 			 
 			     used_veh_type_Image_Link = driver.findElement(By.xpath(str1+"["+i+"]")).getAttribute("alt");
 			     System.out.println(+i+")Image links :"+used_veh_type_Image_Link.toUpperCase());
 			 	
 			
 			     ele1 =driver.findElement(By.xpath(str1+"["+i+"]"));
 			     JavascriptExecutor js1 = (JavascriptExecutor) driver;	
 			     
 			    if(ele1.isDisplayed())
			       {
			    	   flag=true;
			    	  System.out.println(used_veh_type_Image_Link+" - USED TRUCKS FOR VEHICLE TYPE Image link is displayed on the Page "); 
		              log.info(used_veh_type_Image_Link+" - USED TRUCKS FOR VEHICLE TYPE Image link is displayed on the Page ");
			       }
			       else
			       {
			    	   flag=false;
			    	  System.err.println(used_veh_type_Image_Link+" - USED TRUCKS FOR VEHICLE TYPE Image link is not displayed on the Page "); 
		              log.info(used_veh_type_Image_Link+"- USED TRUCKS FOR VEHICLE TYPE Image link is not displayed on the Page ");
			       }
 			     
 			 
 			     /*switch (veh_type_Image_Link.toUpperCase())
 			     { 
 			    
 			            case "TRACTOR":  // Its Semi Truck
 			    	             flag = ele1.isDisplayed() ? true : false;
 			    	    break;
 			            case "TRUCK":
 			    	             flag = ele1.isDisplayed() ? true : false;     
 			    	    break;
 			          
 			            case "TRAILER":
 			    	            flag = ele1.isDisplayed() ? true : false;     
 			    	    break;      
 			          
 			            case "VANS & CARS":
 			    	           flag = ele1.isDisplayed() ? true : false;     
 			    	    break;       
 			            default: 
 			            	veh_type_Image_Link = "Invalid Input";
 		        	            System.err.println("Invalid Used  Trucks Vehicle Type Supplied - Or Used Trucks Vehicle Image Type links is not present on the page");
 		               break; 
 			     }
               
                  if(flag)
 	             {
 		             System.out.println(veh_type_Image_Link+" Vehicle Image link is displayed on Page "); 
 		             log.info(veh_type_Image_Link+" Vehicle Image link is displayed on page ");
 	             }
 	             else
 	             {
 	    	         System.err.println("Invalid " +veh_type_Image_Link+" -- Image link passed as Input or  Used Trucks Vehicle Type Image Link/Links are not displayed on the page ");
 	    	         log.info("Invalid " +veh_type_Image_Link+" -- Image link passed as Input or  Used Trucks Vehicle Type Image  Link/Links are not displayed on the page" );
 	              }
                   */
              }
         }
         else
         {    flag =false;
         	System.err.println("Used Trucks Vehicle Type Image Link/Links are not displayed on the page ");
         }  
    	     	 
    	 return flag;
     }
 
        //Used Trucks for Vehicle Type links  present on Home page, City Page , StatePage
     public boolean  verify_Used_Trucks_For_Vehicle_Type_Links_Text_Are_Displalyed()
     {
    	boolean flag = false;
        System.out.println("No of Used Trucks Vehicle  Type Links : " +list_Of_All_Used_Trucks_links_Txt.size());
        
        WebElement ele1= null;
		String used_veh_type_link_txt=null;
    	
    	//List<WebElement> list_Of_All_Used_Trucks_links = driver.findElements(By.xpath("(//div[@class='field-caption']/a)"));
    	
        System.out.println("No of Used Trucks Vehicle  Type Links : " +list_Of_All_Used_Trucks_links_Txt.size());
        if(list_Of_All_Used_Trucks_links_Txt.size()!=0)
        {
        	               
              for(int i =1;i<=list_Of_All_Used_Trucks_links_Txt.size();i++)
              {
        	     String[] str =list_Of_All_Used_Trucks_links_Txt.get(i-1).toString().split("xpath:");
			     String str1 = str[str.length-1];
			     str1=str1.substring(0,str1.length()-1).trim();
			     //System.out.println("Xpath : "+str1);
			 
			     used_veh_type_link_txt = driver.findElement(By.xpath(str1+"["+i+"]")).getAttribute("text");
			     System.out.println(+i+")Image links :"+used_veh_type_link_txt.toUpperCase());
			 	
			
			     ele1 =driver.findElement(By.xpath(str1+"["+i+"]"));
			     JavascriptExecutor js1 = (JavascriptExecutor) driver;	
			 
			     if(ele1.isDisplayed())
			       {
			    	   flag=true;
			    	  System.out.println(used_veh_type_link_txt+" - USED TRUCKS FOR VEHICLE TYPE Link Text is displayed on the Page "); 
		              log.info(used_veh_type_link_txt+" - USED TRUCKS FOR VEHICLE TYPE Link Text is displayed on the Page ");
			       }
			       else
			       {
			    	   flag=false;
			    	  System.err.println(used_veh_type_link_txt+" - USED TRUCKS FOR VEHICLE TYPE link Text is not displayed on the Page "); 
		              log.info(used_veh_type_link_txt+"- USED TRUCKS FOR VEHICLE TYPE link Text is not displayed on the Page ");
			       }
			     
			     
			     /*switch (veh_type_link_txt.toUpperCase())
			     { 
			    
			            case "SEMI TRUCK":
			    	             flag = ele1.isDisplayed() ? true : false;
			    	    break;
			            case "TRUCKS":
			    	             flag = ele1.isDisplayed() ? true : false;     
			    	    break;
			          
			            case "TRAILERS":
			    	            flag = ele1.isDisplayed() ? true : false;     
			    	    break;      
			          
			            case "VANS & CARS":
			    	           flag = ele1.isDisplayed() ? true : false;     
			    	    break;       
			            default: 
			            	veh_type_link_txt = "Invalid Input";
		        	            System.err.println("Invalid Used  Trucks Vehicle Type Supplied - Or Used Trucks Vehicle Type links is not present on the page");
		               break; 
			     }
        
                 if(flag)
	             {
		             System.out.println(veh_type_link_txt+" Vehicle Type link is displayed on Page "); 
		             log.info(veh_type_link_txt+" Vehicle Type link is displayed on page ");
	             }
	             else
	             {
	    	         System.err.println("Invalid " +veh_type_link_txt+" -- link passed as Input or  Used Trucks Vehicle Type Link/Links are not displayed on the page ");
	    	         log.info("Invalid " +veh_type_link_txt+" -- link passed as Input or  Used Trucks Vehicle Type Link/Links are not displayed on the page" );
	              }
                    */
             }
        }
        else
        {    flag =false;
        	System.err.println("Used Trucks Vehicle Type Link/Links are not displayed on the page ");
        }  
        
        return flag;
     }
        
     public boolean Verify_Featured_Brands_Image_Links_Are_Displayed() throws InterruptedException
     {
    	 //To Scroll Brands Image Section
    	 JavascriptExecutor js = (JavascriptExecutor) driver;		
  	     js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[@class='component location-cta-content']/div[@class='component-content']")));
  	    //js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("((//div[@class='component link-list horizontal-icon-link-list link-list-centered link-list-bold-caption col-xs-12'])[2]//div[@class='field-icon']//img)")));
  	     Thread.sleep(2000);
    	 
    	 
         boolean flag =false;
    	 System.out.println("No of Featured Brand Image Links : " +list_Of_Featured_Brands_Image_links.size());
         
         WebElement ele1= null;
 		String brand_Image_Link=null;
         
         if(list_Of_Featured_Brands_Image_links.size()!=0)
         {
         	                
               for(int i =1;i<=list_Of_Featured_Brands_Image_links.size();i++)
               {
         	     String[] str =list_Of_Featured_Brands_Image_links.get(i-1).toString().split("xpath:");
 			     String str1 = str[str.length-1];
 			     str1=str1.substring(0,str1.length()-1).trim();
 			     //System.out.println("Xpath : "+str1);
 			 
 			     brand_Image_Link = driver.findElement(By.xpath(str1+"["+i+"]")).getAttribute("alt");
 			     System.out.println(+i+")Image links :"+brand_Image_Link.toUpperCase());
 			 	
 			
 			     ele1 =driver.findElement(By.xpath(str1+"["+i+"]"));
 			     
 			       if(ele1.isDisplayed())
 			       {
 			    	   flag=true;
 			    	  System.out.println(brand_Image_Link+" Brand Image link is displayed on the Page "); 
  		              log.info(brand_Image_Link+" Brand Image link is displayed on page ");
 			       }
 			       else
 			       {
 			    	   flag=false;
 			    	  System.err.println(brand_Image_Link+" Brand Image link is not displayed on the Page "); 
  		              log.info(brand_Image_Link+" Brand Image link is not displayed on the page ");
 			       }
 			       
              }
         }
         else
         {    flag =false;
         	System.err.println("Featured Brand Image Link/Links are not displayed on the page ");
         	log.info("Featured Brand Image Link/Links are not displayed on the page ");
         }  
    	     	 
    	 return flag;
     }
     
     
     public boolean Verify_Featured_Brands_Text_Links_Are_Displayed() throws InterruptedException
     {
    	 
    	  boolean flag =false;
     	 System.out.println("No of Featured Brand Text Links : " +list_Of_Featured_Brands_links_Txt.size());
          
          WebElement ele1= null;
  		String brand_Link_Txt=null;
          
          if(list_Of_Featured_Brands_links_Txt.size()!=0)
          {
          	                
                for(int i =1;i<=list_Of_Featured_Brands_links_Txt.size();i++)
                {
          	     String[] str =list_Of_Featured_Brands_links_Txt.get(i-1).toString().split("xpath:");
  			     String str1 = str[str.length-1];
  			     str1=str1.substring(0,str1.length()-1).trim();
  			     //System.out.println("Xpath : "+str1);
  			 
  			   brand_Link_Txt = driver.findElement(By.xpath(str1+"["+i+"]")).getText();
  			     System.out.println(+i+")Brand Text links :"+brand_Link_Txt.toUpperCase());
  			 	
  			
  			     ele1 =driver.findElement(By.xpath(str1+"["+i+"]"));
  			     
  			       if(ele1.isDisplayed())
  			       {
  			    	   flag=true;
  			    	  System.out.println(brand_Link_Txt+" Brand link Text is displayed on the Page "); 
   		              log.info(brand_Link_Txt+" Brand link Text is displayed on page ");
  			       }
  			       else
  			       {
  			    	   flag=false;
  			    	  System.err.println(brand_Link_Txt+" Brand link Text is not displayed on the Page "); 
   		              log.info(brand_Link_Txt+" Brand link Text is not displayed on the page ");
  			       }
  			       
               }
          }
          else
          {    flag =false;
          	System.err.println("Featured Brand Link/Links Text are not displayed on the page ");
          	log.info("Featured Brand Link/Links Text are not displayed on the page ");
          }  
     	     	 
     	 return flag;	 
     }
     
}
