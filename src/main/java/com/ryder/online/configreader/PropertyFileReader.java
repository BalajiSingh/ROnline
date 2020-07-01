package com.ryder.online.configreader;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Level;

import com.ryder.online.configuration.browser.BrowserType;
import com.ryder.online.configuration.browser.EnvironmentType;
import com.ryder.online.interfaces.IconfigReader;

/**
 * @author Madhu Golla
 *
 *         02/01/2K19
 *
 */

public class PropertyFileReader implements IconfigReader {

	String Env = null;
	String cloudinary_website = null;
	private Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();

		try {
			FileInputStream in = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\configFile\\config.properties");
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String get_Env() {

		Env = prop.getProperty("ENV");

		return prop.getProperty("ENV");
	}

	public String getUserName() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getWebsite() {
		return prop.getProperty("Website");
	}

	public boolean getBrowserWindowSize() {

		return prop.getProperty("windowMaximize") != null;
	}

	public String getROL_Website() {
		return prop.getProperty("ROLWebsite");
	}
	
	public String getTM_Website() {
		// TODO Auto-generated method stub
		return prop.getProperty("TM_Website");
	}
	
	public String getRCT_Website() {
		return prop.getProperty("RCTWebsite");
	}
	
	
	public EnvironmentType getEnvironment() {
		return EnvironmentType.valueOf(prop.getProperty("Environment"));
	}

	public String getDriverPath() {

		return prop.getProperty("DriverPath");
	}

	public String getShipmentBaseURL() {

		return prop.getProperty("BaseURL");
	}

	public String getPort() {
		return prop.getProperty("CreateShipmentRestPort");
	}

	public String getCASJsonDataFileName() {
		return prop.getProperty("CAS");

	}

	public String getNGXJsonDataFileName() {
		return prop.getProperty("NGX");
	}

	public String getKBNJsonDataFileName() {
		return prop.getProperty("KBN");
	}

	public String getCreateShipementJsonDataFileName() {
		return prop.getProperty("CreateShipmentjsonDataFileName");
	}

	public String getRYDJsonDataFileName() {

		return prop.getProperty("RYD");
	}

	public String getEMAJsonDataFileName() {

		return prop.getProperty("EMA");
	}

	public String getEMA1JsonDataFileName() {
		// TODO Auto-generated method stub
		return prop.getProperty("EMA1");
	}

	public String getJsonDataFileName(String JsonFileName) {
		return prop.getProperty(JsonFileName);
	}

	public String getALSJsonDataFileName() {

		return prop.getProperty("ALS");
	}

	public String getIRMJsonDataFileName() {

		return prop.getProperty("IRM");
	}

	public String getJDA_Website() {

		return prop.getProperty("JDAWebsite");
	}

	public String getDIAJsonDataFileName() {

		return prop.getProperty("DIA");
	}

	public String getResourceName() {
		return prop.getProperty("CreateShipmentRestResourceName");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

	public int getImplicitWait() {
		return Integer.parseInt(prop.getProperty("ImplcitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
	}

	public BrowserType getBrowser() {
		return BrowserType.valueOf(prop.getProperty("Browser"));
	}

	public Level getLoggerLevel() {

		switch (prop.getProperty("Logger.Level")) {

		case "DEBUG":
			return Level.DEBUG;
		case "INFO":
			return Level.INFO;
		case "WARN":
			return Level.WARN;
		case "ERROR":
			return Level.ERROR;
		case "FATAL":
			return Level.FATAL;
		}
		return Level.ALL;
	}

	public String getJsonDataFilePath() {
		return prop.getProperty("jsonDataFileReader");
	}

	public String extentConfigFilePath() {
		return prop.getProperty("extentReportPathConfig");
	}

	public String getTokenGenerationBaseURL() {
		return prop.getProperty("TokenGenerationBaseURL");
	}

	public String getEDIFilePath(String SOUPEDIURL) {
		return prop.getProperty(SOUPEDIURL);
	}
	public String getSOAPAPIRL(String SOAPAPIRL) {
		return prop.getProperty(SOAPAPIRL);
	}
	
	// for API CALL
	public String getSiteCoreBaseURL() {
		return prop.getProperty("SiteCoreBaseURL");
	}

	public String getChannelAdvisorBaseURL() {
		return prop.getProperty("ChannelAdvisorBaseURL");
	}

	@Override
	public String getSalesForceTokenGenerationBaseURL() {
		return prop.getProperty("SalesForceTokenGenerationURL");
	}

	public String getSalesForceTokenBaseURL() {
		return prop.getProperty("SalesForceTokenBaseURL");
	}

	public String getRyderFleetBaseURL() {
		return prop.getProperty("RyderFleetBaseURL");
	}

	@Override
	public String getImageUploadBaseURL() {
		String imageUploadUrl = null;
		if (get_Env().startsWith("QA")) {

			imageUploadUrl = prop.getProperty("QA_ImageUpload_BaseURL");
		}
		if (get_Env().startsWith("PROD")) {
			imageUploadUrl = prop.getProperty("Prod_ImageUpload_BaseURL");
		}
		return imageUploadUrl;

	}

	@Override
	public String get_Cloudinary_Website() {

		if (get_Env().startsWith("QA")) {

			cloudinary_website = prop.getProperty("QA_Couldinary_Website");
		}
		if (get_Env().startsWith("PROD")) {
			cloudinary_website = prop.getProperty("PROD_Couldinary_Website");
		}
		return cloudinary_website;
	}

	public String get_Cloudinary_UserName() {
		String cloudinary_username = null;
		if (get_Env().startsWith("QA")) {
			cloudinary_username = prop.getProperty("QA_Cloudinary_Username");
		}
		if (get_Env().startsWith("PROD")) {
			cloudinary_username = prop.getProperty("PROD_Cloudinary_Username");
		}

		return cloudinary_username;

	}

	public String get_Cloudinary_Password() {
		String cloudinary_password = null;
		if (get_Env().startsWith("QA")) {
			cloudinary_password = prop.getProperty("QA_Cloudinary_Password");
		}
		if (get_Env().startsWith("PROD")) {
			cloudinary_password = prop.getProperty("PROD_Cloudinary_Password");
		}

		return cloudinary_password;
	}

	// for SiteCore WebSite
	@Override
	public String getSiteCore_Website() {
		String siteCore_WebSite = null;
		if (get_Env().startsWith("QA")) {
			siteCore_WebSite = prop.getProperty("QA_SiteCore_Website");
		}
		if (get_Env().startsWith("PROD")) {
			siteCore_WebSite = prop.getProperty("PROD_SiteCore_Website");
		}
		return siteCore_WebSite;
	}

	@Override
	public String get_SiteCore_Website_UserName() {
		String siteCore_Website_username = null;
		if (get_Env().startsWith("QA")) {
			siteCore_Website_username = prop.getProperty("QA_SiteCore_WebSite_Username");
		}
		if (get_Env().startsWith("PROD")) {
			siteCore_Website_username = prop.getProperty("PROD_SiteCore_WebSite_Username");
		}

		return siteCore_Website_username;
	}

	@Override
	public String get_SiteCore_Website_Password() {
		String siteCore_Website_Password = null;
		if (get_Env().startsWith("QA")) {
			siteCore_Website_Password = prop.getProperty("QA_SiteCore_WebSite_Password");
		}
		if (get_Env().startsWith("PROD")) {
			siteCore_Website_Password = prop.getProperty("PROD_SiteCore_WebSite_Password");
		}

		return siteCore_Website_Password;
	}

	public String getUploadCustomerFilePath(String UploadCustomerFilePath) {
		return prop.getProperty(UploadCustomerFilePath);
	}
	
	
}
