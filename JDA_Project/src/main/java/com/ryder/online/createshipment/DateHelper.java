package com.ryder.online.createshipment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateHelper {
	public static Calendar cal = Calendar.getInstance();
	public static Locale currentLocale = new Locale("US");
	public static String format ="YYYY-MM-DD'T'HH:mm:ss";
	public static String externalShipmentDate = "MMDDYYYY";
	
	
	public static String getCurrentDateForExtShpmnt() {
		DateFormat dateOnly = new SimpleDateFormat(externalShipmentDate,currentLocale);
		String currentDay = dateOnly.format(cal.getTime());
		return currentDay;
	}
	
	public static String getSameDay() {
		DateFormat dateOnly = new SimpleDateFormat(format,currentLocale);
		String sameDay = dateOnly.format(cal.getTime());
		return sameDay;
	}
	
	public static String getNextDay() {
		DateFormat dateOnly = new SimpleDateFormat(format,currentLocale);
		cal.add(Calendar.DATE,1);
		String nextDate = dateOnly.format(cal.getTime());
		return nextDate;
	}
	
	public static String getTwoDays() {
		DateFormat dateOnly = new SimpleDateFormat(format,currentLocale);
		cal.add(Calendar.DATE,2);
		String twoDays = dateOnly.format(cal.getTime());
		return twoDays;
	}
	
	public static String getThreeDays() {
		DateFormat dateOnly = new SimpleDateFormat(format,currentLocale);
		cal.add(Calendar.DATE,3);
		String threeDays = dateOnly.format(cal.getTime());
		return threeDays;
	}
	
	public static String getFourDays() {
		DateFormat dateOnly = new SimpleDateFormat(format,currentLocale);
		cal.add(Calendar.DATE,4);
		String fourDays = dateOnly.format(cal.getTime());
		return fourDays;
	}
	
	public static String getAfterFiveDays() {
		DateFormat dateOnly = new SimpleDateFormat(format,currentLocale);
		cal.add(Calendar.DATE,5);
		String fiveDays = dateOnly.format(cal.getTime());
		return fiveDays;
	}
	
	public static String getAfterSixDays() {
		DateFormat dateOnly = new SimpleDateFormat(format,currentLocale);
		cal.add(Calendar.DATE,6);
		String sixDays = dateOnly.format(cal.getTime());
		return sixDays;
	}
	
public static String getDateOfThisWeek(int i) {
		
		DateFormat weekDate = new SimpleDateFormat("MM/dd/YYYY",currentLocale);
		cal.add(Calendar.DATE, i+1);
		String sevenDays =weekDate.format(cal.getTime());
		return sevenDays;
	}
	
	public static String getAnyNoOftWeekStartingFromThisWeek(int i) {
		
		DateFormat weekDate = new SimpleDateFormat("MM/dd/YYYY",currentLocale);
		cal.add(Calendar.DATE, 7+(7*i));
		String sevenDays =weekDate.format(cal.getTime());
		return sevenDays;
	}
	
public String getNextMonthDate(){
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.MONTH, 1 );    
		String convertedDate=dateOnly.format(cal.getTime());    
		return  convertedDate;
		
	}
}
