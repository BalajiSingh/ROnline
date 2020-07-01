package com.ryder.online.api.util;

import com.google.gson.Gson;

public class ApiUtil {
	
	/**
	 * Converts java object to json.
	 * 
	 * @param object
	 *            the java object
	 * @return string of json
	 */
	public static String toJson(final Object object) {
		final Gson gson = new Gson();
		return gson.toJson(object);
	}

	/**
	 * Converts json to specified java object.
	 * 
	 * @param json
	 *            the json to be converted
	 * @param object
	 *            the java class in whict it need to be converted
	 * @return the java object
	 */
	public static Object fromJson(final String json, final Class<?> object) {
		final Gson gson = new Gson();
		return gson.fromJson(json, object);
	}

}
