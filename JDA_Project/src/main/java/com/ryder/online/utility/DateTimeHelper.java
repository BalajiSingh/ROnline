package com.ryder.online.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author Madhu Golla
 *
 *02/08/2K19
 *
 */

public class DateTimeHelper {
	/**
	 * Generates Current Date and Time
	 * @format yyyy-MM-dd_HH-mm-ss
	 */
	public static String getCurrentDateTime() {

		DateFormat dateFormat = new SimpleDateFormat("_yyyy-MM-dd_HH-mm-ss");
		Calendar cal = Calendar.getInstance();
		String time = "" + dateFormat.format(cal.getTime());
		return time;
	}

	/**
	 * Generates Current Date
	 */
	public static String getCurrentDate() {
		return getCurrentDateTime().substring(0, 11);
	}

	/**
	 * Convert current Time into milliseconds
	 */
	public static long getTimeInMilliSeconds() {
		Date date = new java.util.Date();
		return date.getTime();
	}
	public static int randomnumber() {
		Random r = new Random(System.nanoTime());
	 //   Random r = new Random( System.currentTimeMillis() );
	    return 100 + r.nextInt(200);
	}
}
