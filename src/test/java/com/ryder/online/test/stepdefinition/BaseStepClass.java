package com.ryder.online.test.stepdefinition;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;

import org.json.JSONArray;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;

import com.ryder.online.helper.Logger.LoggerHelper;

import org.apache.log4j.Logger;

//check FilterableRequestSpecification ( io.restassured.specification.FilterableRequestSpecification)

public class BaseStepClass  {
	public static  RequestSpecification httpRequest=null;
	public static Response response=null;
	
	public RequestSpecification get_httpRequest_Ref()
	{
		
		
		System.out.println("1.Called the RequestSpecification method");
		httpRequest= null;
		
		if(httpRequest==null)
		{
			//"https://st-cm-usedtrucks.ryder.com";
			//"https://dev-cm-usedtrucks.new.ryder.com"
			System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");                      
			String RyderFleetBase = "https://st-cm-usedtrucks.ryder.com";
			RestAssured.baseURI = RyderFleetBase;
			httpRequest = RestAssured.given().log().all();
			
		}
		else
		{
			System.out.println(" HttpRequest is not null");
		}
		
		return httpRequest;
	}
    
	public RequestSpecification get_httpRequest_Ref(String url)
	{
		
		
		System.out.println("1.Called the RequestSpecification method");
		httpRequest= null;
		
		if(httpRequest==null)
		{			
			System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");                      
			RestAssured.baseURI = url;
			httpRequest = RestAssured.given().log().all();
			
		}
		else
		{
			System.out.println(" HttpRequest is not null");
		}
		
		return httpRequest;
	}

	
	
	public static Response getHttpResponse(String endpoint_path)
	{   
		response = httpRequest.get(endpoint_path);
		return response;
	}

	public String gen_6digit_randon_with_non_Leading_Zero()
	{
		
			LocalDateTime now = LocalDateTime.now();
			String format = now.format(DateTimeFormatter.ofPattern("HHmmss", Locale.ENGLISH));
			
			// Convert str into StringBuffer as Strings are immutable. 
			StringBuffer sb = new StringBuffer(format); 
			
			for(int i =0;i<sb.length(); i++)
			{
				if(sb.charAt(i)=='0')
				{
					// The  StringBuffer replace function removes i characters from given index (0 here) 
					sb.replace(0, i, "1"); 
				}
				break;
			}
	         
			return sb.toString();
	}
	
	
	public static HashMap<String,Integer> get_country_wise_Count_From_Response(JSONArray  categories_Array, String region1, String region2)
	{
		 System.out.println(" ");
		  //Country name  present under Category[26].values array
		  //JSONArray country_Array = categories_Array.getJSONObject(26).getJSONArray("Values");
		 JSONArray country_Array = categories_Array.getJSONObject(1).getJSONArray("Values");
		    String country1_value_from_Res = null;
			String country2_value_from_Res = null;
			int aggregate_count_at_Country1 = 0;
			int aggregate_count_at_Country2 = 0;
		    HashMap<String,Integer>  country_Hmap = null;
			        //to get the country values
					if (country_Array.length() == 1) {
						
						country_Hmap = new HashMap<String,Integer>();
						country1_value_from_Res = country_Array.getJSONObject(0).getString("Name");
						aggregate_count_at_Country1 = country_Array.getJSONObject(0).getInt("AggregateCount");
						country_Hmap.put("Country1_Aggregate_Count", aggregate_count_at_Country1);						
						System.out.println("Country1  : "+country1_value_from_Res);		
						System.out.println("Vehicles Aggregate Count in "+region1 +" region  =  "+aggregate_count_at_Country1);
						
					}
					if (country_Array.length() == 2) {
						
						country_Hmap = new HashMap<String,Integer>();
						country1_value_from_Res = country_Array.getJSONObject(0).getString("Name");
						country2_value_from_Res = country_Array.getJSONObject(1).getString("Name");
						
						aggregate_count_at_Country1 = country_Array.getJSONObject(0).getInt("AggregateCount");
						aggregate_count_at_Country2 = country_Array.getJSONObject(1).getInt("AggregateCount");
						
						country_Hmap.put("Country1_Aggregate_Count", aggregate_count_at_Country1);
						country_Hmap.put("Country2_Aggregate_Count", aggregate_count_at_Country2);
						country_Hmap.put("Total_Count_From_Two_Countries", (aggregate_count_at_Country1+aggregate_count_at_Country2));
						System.out.println("Country1  : "+country1_value_from_Res);
						System.out.println("Country2  : "+country2_value_from_Res);		
						
						System.out.println("Vehicles  Aggregate Count in "+country1_value_from_Res +" region     =  "+aggregate_count_at_Country1);
						System.out.println("Vehicles  Aggregate Count in "+country2_value_from_Res +" region     =  "+aggregate_count_at_Country2);
						System.out.println(" ");
						System.out.println("Total Count from above countries(US & CA)  =  "+(aggregate_count_at_Country1+aggregate_count_at_Country2));
					}
					
					
		return country_Hmap;			
			
	}
	
	public static int get_total_count_of_Vehicles_from_producttypenames_Array(JSONArray categories_Array)
	{
		int Truck_Count = 0;
	    int TRACTOR_Count =0;
	    int TRAILER_Count = 0;    
	    int VANS_AND_CARS_Count = 0;
	    
	    System.out.println(" ");
	    
	    System.out.println("--------Count of each Vehicle Type from ProducttypesNames Values Array---------");
	    System.out.println(" ");
	  
	    int Total_Veh_Count_from_producttypenames = 0;
	    JSONArray producttypename_Values_array = categories_Array.getJSONObject(categories_Array.length()-3).getJSONArray("Values");
	    
	    for(int i =0;i<producttypename_Values_array.length();i++)
	    {
	    	 String str = producttypename_Values_array.getJSONObject(i).getString("Name");
	    	 
	    	if(str.equalsIgnoreCase("TRUCK"))
	    	{
	    		Truck_Count =  producttypename_Values_array.getJSONObject(i).getInt("AggregateCount");
	    		System.out.println("TRUCK    Count =  " +Truck_Count);
	    	}	    	
	    	if(str.equalsIgnoreCase("TRACTOR"))
	    	{
	    		TRACTOR_Count =  producttypename_Values_array.getJSONObject(i).getInt("AggregateCount");
	    		System.out.println("TRACTOR  Count =  " +TRACTOR_Count);
	    	}	    	
	    	if(str.equalsIgnoreCase("TRAILER"))
	    	{
	    		TRAILER_Count =  producttypename_Values_array.getJSONObject(i).getInt("AggregateCount");
	    		 System.out.println("TRAILER  Count =  " +TRAILER_Count);
	    	}	    	
	    	if(str.equalsIgnoreCase("Vans And Cars"))
	    	{
	    		VANS_AND_CARS_Count =  producttypename_Values_array.getJSONObject(i).getInt("AggregateCount");
	    		 System.out.println("Vans And Cars  Count =  " +VANS_AND_CARS_Count);
	    	}
	    	
	    }
	    System.out.println(" ");
	    Total_Veh_Count_from_producttypenames = Truck_Count + TRACTOR_Count +TRAILER_Count +VANS_AND_CARS_Count;
	    System.out.println("Total Count of all above Vehicles types from productTypenames section  = " +Total_Veh_Count_from_producttypenames);
	    System.out.println("-------------------------------------------------------------------------------");
	  
	    System.out.println(" ");
		
		return Total_Veh_Count_from_producttypenames;
	}
	
	
	public static int to_get_Total_Count_From_GVWClass_Array(JSONArray categories_Array,String veh_type)
	{
		System.out.println(" ");
		 System.out.println("-----------Total Count from GVW Class Values Array------------");
			
		 int Total_Count_from_GVWCLass =0;
		 
		//To get the Aggregate count from the GVW Values array categories_Array.getJSONObject(14)
		 JSONArray GVW_Class_Array = categories_Array.getJSONObject(9).getJSONArray("Values");
		 for(int i = 0; i < GVW_Class_Array.length(); i++)
		 {
			 Total_Count_from_GVWCLass = Total_Count_from_GVWCLass + GVW_Class_Array.getJSONObject(i).getInt("AggregateCount");
		 }	
	   
		 if(veh_type.isEmpty())
		 {
			 System.out.println( "Total Vehicles Count = "+Total_Count_from_GVWCLass); 
		 }
		 else
		 {
			 System.out.println( "Total "+veh_type +" Count = "+Total_Count_from_GVWCLass); 
		 }
		 
		 System.out.println("--------------------------------------------------------");
		 System.out.println(" ");
		
		return Total_Count_from_GVWCLass;
	}
	
}
