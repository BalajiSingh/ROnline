package com.ryder.online.api.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestKeywords {
	public RequestSpecification httpRequest;
	public static Response response;

	public RequestSpecification enterBaseUrl(String baseUrl) {
		RestAssured.baseURI = baseUrl;
		httpRequest = RestAssured.given().contentType("application/x-www-form-urlencoded");
		return httpRequest;
	}

	public RequestSpecification enterFormParameters(Map<String, String> headerMap) {
		for (int i = 0; i <= headerMap.size(); i++) {
			httpRequest.formParam("", "");
		}
		Set keys = headerMap.keySet();
		
		for (Iterator i = keys.iterator(); i.hasNext(); ) {
		       String key = (String) i.next();
		       String value = (String) headerMap.get(key);
		       System.out.println(key + " = " + value);
		       httpRequest.formParam("", "");
		   }
		
		return httpRequest;
	}

	public RequestSpecification SetBodyData(String body) {
		return httpRequest.body(body);
	}
}
