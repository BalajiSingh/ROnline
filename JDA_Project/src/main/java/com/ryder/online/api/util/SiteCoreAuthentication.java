package com.ryder.online.api.util;

/**
 * @author Madhu Golla
 *
 *         04/01/2K19
 *
 */

public class SiteCoreAuthentication {

	private String auth_token = "";
	private String ca_token = "";
	private String base_URL = "";
	private static String generatedId = "";
	private String storeValue = "";
	
	public String getStoreValue() {
		return storeValue;
	}
	public void setStoreValue(String storeValue) {
		this.storeValue = storeValue;
	}

	//
	private static SiteCoreAuthentication instance = new SiteCoreAuthentication( );
	//
	public static SiteCoreAuthentication getInstance( ) {
	      return instance;
	   }
//
	private SiteCoreAuthentication(){
		
	}

	public String getCa_token() {
		return ca_token;
	}

	public void setCa_token(String ca_token) {
		this.ca_token = ca_token;
	}

	public void setAuth_token(String auth_token) {
		this.auth_token = "Bearer " + auth_token;
	}

	public String getAuth_token() {
		
		return auth_token;
	}

	public void setBaseURL(String baseURL) {
		this.base_URL = baseURL;
	}

	public String getBaseURL() {
		return base_URL;
	}

	public String getGeneratedId() {
		return generatedId;
	}

	public void setGeneratedId(String generatedId) {
		SiteCoreAuthentication.generatedId = generatedId;
	}
}
