package com.ryder.online.settings;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.ryder.online.interfaces.IconfigReader;


/**
 * @author Madhu Golla
 *
 *02/08/2K19
 *
 *It holds the instances of 'driver'
 * 'config reader' and a Map
 */

public class ObjectRepo {
	
	public static WebDriver driver;
	public static IconfigReader reader;
	public static Map<String, Object> data = new LinkedHashMap<String, Object>();
		
}

