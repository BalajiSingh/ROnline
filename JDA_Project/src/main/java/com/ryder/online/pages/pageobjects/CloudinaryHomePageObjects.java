package com.ryder.online.pages.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Balaji Singh
 *
 *         25/11/2019
 */
public class CloudinaryHomePageObjects extends PageBase {

	
	public CloudinaryHomePageObjects(WebDriver driver) {
		super(driver);
		 PageFactory.initElements(driver, this);
	}
	
    /** Web Elements */
	
	//Logo image  present on Cloudinary Home page
	@FindBy(how = How.XPATH, using = "//img[@class='sc-kAzzGY bepeOi']")
	public WebElement cloudinary_Logo_HomePage_Image;
	
	//span[contains(text(),'Dashboard')]
	
	//DashBoard Link Txt as present on Cloudinary Home page
	@FindBy(how = How.XPATH, using = "//a[@class='module-link dashboard']")
	public WebElement DashBoard_LinkTxt;
	
	
	//QA-Ryder_Trucks DropDown login menu Text 
	@FindBy(how = How.XPATH, using = "//div[@class='br-100 box-xl3 lh-xl3 tc fw5 flex items-center justify-center f-xs sc-jzJRlG igDzqz']")
	public WebElement QA_Ryder_Trucks_DropdownText;
	                                                
	
	//Login in  User Name	
	@FindBy(how = How.XPATH, using = "//div[@class='br-100 box-xl3 lh-xl3 tc fw5 flex items-center justify-center f-xs sc-jzJRlG igDzqz']")
	public WebElement Login_Username_Text;
		
	
	//USCA Folder Text
	@FindBy(how = How.XPATH, using = "//span[@class='-breadcrumbsItemTitle___Jh']/span[contains(text(),'usca')]")
	public WebElement USCA_Folder_Txt;
	
	//New Images inserted
	@FindBy(how = How.XPATH, using = "//article[*]//div[3]//div[1]//div[1]//div[1]")
	 public List<WebElement> LIST_Inserted_Images;
	 
	 public By LIST_Inserted_Image = By.xpath("//article[*]//div[3]//div[1]//div[1]//div[1]");	// this xpath is active only when new images are inserted i image cloudinary and new icon text will displayed on images
	                                           
	
	
}
