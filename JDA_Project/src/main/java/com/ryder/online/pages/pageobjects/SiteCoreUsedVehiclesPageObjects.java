package com.ryder.online.pages.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SiteCoreUsedVehiclesPageObjects extends PageBase{
	
	public SiteCoreUsedVehiclesPageObjects(WebDriver driver) {
		super(driver);
		 PageFactory.initElements(driver, this);
	}
	
	/** Web Elements */
	
	//vehicle tractor link present on categories webtable
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'TRACTOR')]") 
	public WebElement vehicleType_Link_Txt;
	
	//vehicle Category  link 130 present on categories webtable in UsedVehciles-Tractor Page
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'130')]") 
	public WebElement SamClass_Sub_category_Id_Link_txt;
	
	//div[contains(text(),'485274')]
	
	//productcode link present under sellable Items section in Category-UsedVehicles-130 summary page
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'485274')]") 
	public WebElement productCode_Link_Txt;
	
	//Images links present under Custom Images webtable in  Entity-SellableItem Summary page
	//sc-bizfx-flatview[@id='flatView-SellableItemCustomImages']//table[@class='mb-0 table table-striped table-hover']/tbody[1]/tr[1]/td[*]
	
	@FindBy(how = How.XPATH, using = "//sc-bizfx-flatview[@id='flatView-SellableItemCustomImages']//table[@class='mb-0 table table-striped table-hover']/tbody[1]/tr[1]/td[*]") 
	public WebElement uploaded_ImageList;
	
	public By uploaded_ImageList1 = By.xpath("//sc-bizfx-flatview[@id='flatView-SellableItemCustomImages']//table[@class='mb-0 table table-striped table-hover']/tbody[1]/tr[1]/td[*]");	
	
	
}
