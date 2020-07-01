package com.ryder.online.RyderEntry;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class Util {
	public static final SimpleDateFormat ISO8601_DATESTAMP = new SimpleDateFormat("yyyy-MM-dd");
	public static final SimpleDateFormat ISO8601_DATETIMESTAMP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	public static final SimpleDateFormat ISO8601_TIMESTAMP = new SimpleDateFormat("HH:mm:ss.SSS");
	
	
 
    
	public Calendar cal = Calendar.getInstance();

	public Util()
	{
	}
	/**
	 * Sleep some ms
	 * @param ms
	 */
	public void sleep(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
		}
	}

	/**
	 * generates a random int between Min and Max inclusive, returns Integer instead of int so user is able to perform Integer.toString()
	 * Created by An Doan.
	 *
	 * @param Min : min number
	 * @param Max : max number
	 * @return Integer : Integer between min and max inclusive
	 *
	 */
	public static Integer randomNum(int Min, int Max) {
		return Min + (int) (Math.random() * ((Max - Min) + 1));
	}
	
	public static Long randomNum(long Min, long Max) {
		return Min + (long) (Math.random() * ((Max - Min) + 1));
	}
	
	public static String getFileSeparator() {
		return System.getProperty("file.separator");
	}
	
	public static String getCurrentFormattedTime(String dateFormatString) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatString);
		Calendar calendar = Calendar.getInstance();
		return dateFormat.format(calendar.getTime());
	}
	

	

	/**
	 * get the date stamp
	 * @param dateFormat
	 * @return
	 */
	public static String getDateStamp(SimpleDateFormat dateFormat)
	{
		//dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

		if (dateFormat.equals(ISO8601_DATETIMESTAMP))
			return dateFormat.format(new Date()).replace(" ", "T") + "Z";
		else
			return dateFormat.format(new Date());
	}

	
	public int randomnumber() {
	    Random r = new Random( System.currentTimeMillis() );
	    return 10000 + r.nextInt(20000);
	}
	
	
	public String gettodaydate(String format){
				
		SimpleDateFormat dateOnly = new SimpleDateFormat(format);
		String date = dateOnly.format(cal.getTime());
		return date;
		
	}	
	
	public String replacetext(String value, String Character){
		
		String newvalue = value.replace(Character,"");		
		return newvalue;	
	}
	
	public String tomorrowsdate(){
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.DAY_OF_MONTH, 1 );    
		String convertedDate=dateOnly.format(cal.getTime());    
		return  convertedDate;
		
	}
	
	public String tomorrowsdatePlusOne(){
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.DAY_OF_MONTH, 2 );    
		String convertedDate=dateOnly.format(cal.getTime());    
		return  convertedDate;
		
	}
	
	
	public String currentSystemDate( ) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		    LocalDateTime now = LocalDateTime.now();  
		    String systemDate =dtf.format(now);  
		
		return systemDate;
	}
	
	public String gettingCurrentDate() {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	       Date dateobj = new Date();
	       System.out.println(dateobj);
	        Calendar calobj = Calendar.getInstance();
	       System.out.println(df.format(calobj.getTime()));
	       return df.format(calobj);
	}
	
public String getCurrentdate(){
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.DAY_OF_MONTH, 0 );     
		String convertedDate=dateOnly.format(cal.getTime());    
		return  convertedDate;
		
	}
public String getNextWeekdate(){
	
	SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
	cal.add(Calendar.WEEK_OF_MONTH, 1 );    
	String convertedDate=dateOnly.format(cal.getTime());    
	return  convertedDate;
	
}
	public String nextmonth_date(){
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.MONTH, 1 );    
		String convertedDate=dateOnly.format(cal.getTime());    
		return  convertedDate;
		
	}
	
	public String futuredate(String cycledate) throws ParseException{
	
			SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
			Date date = dateOnly.parse(cycledate);
			cal.setTime(date);
			cal.add(Calendar.MONTH, 3);    
			String futureDate = dateOnly.format(cal.getTime());    
			return  futureDate;		
	}
	
	public String futureyear(String cycledate, int noofyears) throws ParseException{
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		Date date = dateOnly.parse(cycledate);
		cal.setTime(date);
		cal.add(Calendar.YEAR, noofyears);    
		String futureDate = dateOnly.format(cal.getTime());    
		return  futureDate;		
	}
	
	public String nextmonthdate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(1, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		return  futuredate;
		
	}
	
	public String nextmonthdateformat(){
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(1, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		return  futuredate;
		
	}
	
	public String twomonthsdateformat(){
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(2, ChronoUnit.MONTHS);
		String futureDate = nextmonth.format(formatter);
		String futuredate = change_dateformat(futureDate);
		return  futuredate;
		
	}
	
	public String quaterlydate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(3, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		return  futuredate;
		
	}
	
	public String twomonthsdate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate today = LocalDate.now();
		LocalDate nextmonth = today.plus(2, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		return  futuredate;
		
	}	
	
	public String nextmonth_date(String datevalue){
		
		SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
		cal.add(Calendar.MONTH, 1 );		
		String convertedDate=dateOnly.format(cal.getTime());		
		return  convertedDate;
		
		
		
	}
	
	public String getFutureDay(String date,int noOfDays){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.plus(noOfDays, ChronoUnit.DAYS);
		String futuredate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(futuredate);
		return finalDate;
		
	}
	
	public String getFutureMonth(String date,int noOfMonths){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.plus(noOfMonths, ChronoUnit.MONTHS);
		String futuredate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(futuredate);
		return finalDate;
		
	}
	
	public String getFutureYear(String date,int noOfYears){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.plus(noOfYears, ChronoUnit.YEARS);
		String futuredate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(futuredate);
		return finalDate;
		
	}
	
	
	public String getEarlierMonth(String date,int noOfMonths){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.minus(noOfMonths, ChronoUnit.MONTHS);
		String earlierdate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(earlierdate);
		return finalDate;
		
	}
	
	public String getEarlierDay(String date,int noOfDays){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextmonth = today.minus(noOfDays, ChronoUnit.DAYS);
		String earlierdate = nextmonth.format(formatter);	
		String finalDate = change_dateformat(earlierdate);	
		return finalDate;
		
	}
	
	public String getEarlierYear(String date,int noOfMonths){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.of(year, month, day);
		LocalDate nextyear = today.minus(noOfMonths, ChronoUnit.YEARS);
		String earlierdate = nextyear.format(formatter);	
		String finalDate = change_dateformat(earlierdate);
		return finalDate;
		
	}

	public String dateformat(String date){
		
		String[] dateval = date.split("/");
		
		int month = Integer.parseInt(dateval[0]);
		int day = Integer.parseInt(dateval[1]);
		int year = Integer.parseInt(dateval[2]);
				
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		LocalDate datevalue = LocalDate.of(year, month, day);		
		String formateddate = datevalue.format(formatter);
			
		return formateddate;
		
	}
	
	public String changedateformat(String date){
				
			String[] dateval = date.split("-");
			String formatedate = dateval[0]+dateval[1]+dateval[2];		
			return formatedate;
	}	
	
	public String change_dateformat(String date){
		
		String[] dateval = date.split("-");		                                                           
		String formatedate = dateval[1]+"/"+dateval[2]+"/"+dateval[0];		
		return formatedate;
	}	
	
	public String convertStringToDollorFormat(String sString){
		 Double dAmount =  Double.parseDouble(sString);		
		 NumberFormat fmt = NumberFormat.getCurrencyInstance();
		 String  sDollor = fmt.format(dAmount);	
		return sDollor;
	}
	
	
	public String getEarlierdate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.now();
		LocalDate earlierdate = today.plus(-15, ChronoUnit.DAYS);
		String Earlierdate = earlierdate.format(formatter);	
		String formattedate = change_dateformat(Earlierdate);
		return  formattedate;
		
	}
	
	public String getTodaydate(){
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		LocalDate today = LocalDate.now();		
		String Todaydate = today.format(formatter);	
		String todaydate = change_dateformat(Todaydate);
		return  todaydate;
		
	}
	
}