package com.ryder.online.test.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.ryder.online.helper.HyperLink.LinkHelper;
import com.ryder.online.helper.Navigation.NavigationHelper;

import com.ryder.online.settings.ObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidatingWebpageLinksImages {
	boolean flag = false;
	static boolean Link = false;
	static boolean Image = false;
	//private HomePageUIActions home;
	private NavigationHelper navigation;
	//private LinksValidation validate;
	private LinkHelper lnk;

	@Given("User opened the website")
	public void user_opened_the_website() {
	//	home = new HomePageUIActions(ObjectRepo.driver);
		navigation = new NavigationHelper(ObjectRepo.driver);
		lnk = new LinkHelper(ObjectRepo.driver);
		//validate = new LinksValidation(ObjectRepo.driver);
		// navigation.navigateTo(ObjectRepo.reader.getWebsite());
		navigation.navigateTo("https://www.rydergyde.com");
		// home.isCookieConfirmationPopUpPresent();
	}

	@When("user clicks on Tab button again and again")
	public void user_clicks_on_Tab_button_again_and_again() {

		//validate.validateLinkAndImage();
	}

	// Remain empty for now
	@When("while focusing user is identifying whether it is a link or Image or both")
	public void while_focusing_user_is_identifying_whether_it_is_a_link_or_Image_or_both() {

	}

//remain empty for now
	@Then("if it is link it should have {string}, {string} in case of Image")
	public void if_it_is_link_it_should_have_in_case_of_Image(String string, String string2) {

	}

	@When("User navigates to Sitemap link")
	public void user_navigates_to_Sitemap_link() {
		navigation.navigateTo("https://www.rydergyde.com/en/sitemap");
	}

	@When("from list of Website Links user navigates all")
	public void from_list_of_Website_Links_user_navigates_all() throws InterruptedException {

		List<WebElement> list = ObjectRepo.driver.findElements(By.xpath("//ul[@class='rg-sitemap-list']"));
		for (WebElement ele : list) {
			System.out.println("Element Name --> " + ele.getText());
			String tag = ele.getTagName();
			System.out.println(ele.getSize());
			if (tag.contains("ul")) {
				List<WebElement> links = ele.findElements(By.tagName("a"));
				

				for (WebElement link : links) {
					System.out.println("Link clicked -->" + link.getText());
					if (!link.getText().isEmpty()) {

						String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
						link.sendKeys(selectLinkOpeninNewTab);

						String oldTab = ObjectRepo.driver.getWindowHandle();
						System.out.println(oldTab);
						ArrayList<String> newTab = new ArrayList<String>(ObjectRepo.driver.getWindowHandles());
						newTab.remove(oldTab);
						System.out.println(newTab);

						// change focus to new tab
						ObjectRepo.driver.switchTo().window(newTab.get(0));
						String Url = ObjectRepo.driver.getCurrentUrl();
						String currentUrl = ObjectRepo.driver.getCurrentUrl();
						System.out.println("Opened Url -->" + currentUrl);

						List<WebElement> innerPageLinks = ObjectRepo.driver.findElements(By.tagName("a"));

						for (WebElement innerPageLink : innerPageLinks) {
							//Link = validate.verifyLink(innerPageLink);
						}

						List<WebElement> innerPageImages = ObjectRepo.driver.findElements(By.tagName("img"));

						for (WebElement innerPageImage : innerPageImages) {
						//	Image = validate.verifyImage(innerPageImage);
						}
						ObjectRepo.driver.close();
						// change focus back to old tab
						ObjectRepo.driver.switchTo().window(oldTab);
						Thread.sleep(2000);
					}
				}
			}
		}
	}

//	@When("from list of Website Links user navigates all")
//	public void from_list_of_Website_Links_user_navigates_all() throws InterruptedException {
//		List<WebElement> list = ObjectRepo.driver.findElements(By.xpath("//ul[@class='rg-sitemap-list']"));
//		for (WebElement ele : list) {
//			System.out.println("Element Name --> " + ele.getText());
//			String tag = ele.getTagName();
//			System.out.println(ele.getSize());
//			if (tag.contains("ul")) {
//				List<WebElement> links = ele.findElements(By.tagName("a"));
//
//				for (WebElement link : links) {
//					System.out.println("Link clicked -->" + link.getText());
//					if (!link.getText().isEmpty()) {
//
//						String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
//						link.sendKeys(selectLinkOpeninNewTab);
//
//						String oldTab = ObjectRepo.driver.getWindowHandle();
//						System.out.println(oldTab);
//						ArrayList<String> newTab = new ArrayList<String>(ObjectRepo.driver.getWindowHandles());
//						newTab.remove(oldTab);
//						System.out.println(newTab);
//
//						// change focus to new tab
//						ObjectRepo.driver.switchTo().window(newTab.get(0));
//						String currentUrl = ObjectRepo.driver.getCurrentUrl();
//						System.out.println("Opened Url -->" + currentUrl);
//
//						validate.validateLinkAndImage();
//
//						ObjectRepo.driver.close();
//						// change focus back to old tab
//						ObjectRepo.driver.switchTo().window(oldTab);
//						Thread.sleep(2000);
//					}
//				}
//			}
//		}
//	}

	@Then("verifies whether Links & Images on every page should have {string}, {string} respectively")
	public void verifies_whether_Links_Images_on_every_page_should_have_respectively(String string, String string2)
			throws InterruptedException {

	}

}
