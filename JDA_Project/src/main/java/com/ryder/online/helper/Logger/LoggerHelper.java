package com.ryder.online.helper.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.ryder.online.utility.ResourceHelper;

/**
 * @author Madhu Golla
 *
 *02/07/2K19
 *
 */

@SuppressWarnings("rawtypes")
public class LoggerHelper {
	
	private static boolean root = false;
	
	public static Logger getLogger(Class clas) {
		if(root)
			return Logger.getLogger(clas);
		
		/*PropertyConfigurator.configure(ResourceHelper
				.getResourcePath("configfile/log4j.properties"));*/
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\configFile\\log4j.properties");
			
			PropertyConfigurator.configure(inputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		root = true;
		return Logger.getLogger(clas);
	}

}
