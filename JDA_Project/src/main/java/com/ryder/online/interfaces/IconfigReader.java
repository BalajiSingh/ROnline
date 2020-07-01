package com.ryder.online.interfaces;

import com.ryder.online.configuration.browser.BrowserType;

/**
 * @author Madhu Golla
 *
 *         02/08/2K19
 *
 */

public interface IconfigReader {
	/**
	 * Get the username from config
	 * 
	 * @return the Username
	 */
	public String getUserName();

	/**
	 * Get the password from config
	 * 
	 * @return the password
	 */
	public String getPassword();

	/**
	 * Get the webste Url from config
	 * 
	 * @return the website Url
	 */
	public String getWebsite();

	/**
	 * Get the Page Load TimeOut from config
	 * 
	 * @return the page Load TimeOut
	 */
	public int getPageLoadTimeOut();

	/**
	 * Get the Implicit Wait time from config
	 * 
	 * @return the Implicit Wait time
	 */
	public int getImplicitWait();

	/**
	 * Get the Explicit Wait time from config
	 * 
	 * @return the Explicit Wait time
	 */
	public int getExplicitWait();

	/**
	 * Get the Browser from config
	 * 
	 * @return the Browser
	 */
	public BrowserType getBrowser();

	/**
	 * Get the Token Generation URL from config
	 * 
	 * @return the URL
	 */
	public String getTokenGenerationBaseURL();

	/**
	 * Get the Site Core Base URL from config
	 *  This is used for API call
	 * @return the URL
	 */
	public String getSiteCoreBaseURL();

	/**
	 * Get the Channel Advisor Base URL from config
	 * 
	 * @return the URL
	 */
	public String getChannelAdvisorBaseURL();
	
	/**
	 * Get the Site Core website from config
	 *  This is used for SiteCore UI testing
	 * @return the siteCore website url
	 */
	public String getSiteCore_Website();
	
	/**
	 * Get login username for Sitecore website from config
	 *  This is used for SiteCore UI testing
	 * @return the username 
	 */
	public String get_SiteCore_Website_UserName();
	/**
	 * Get login Password for Sitecore website from Config
	 *  This is used for SiteCore UI testing
	 * @return the Password 
	 */
	public String get_SiteCore_Website_Password();
	
	public String getSalesForceTokenGenerationBaseURL();
	
	public String getSalesForceTokenBaseURL();
	
	public String getRyderFleetBaseURL();

	public String get_Env();
	
	public String getImageUploadBaseURL();
	
	public String get_Cloudinary_Website();
	
	public String get_Cloudinary_UserName();
	public String get_Cloudinary_Password();
}
