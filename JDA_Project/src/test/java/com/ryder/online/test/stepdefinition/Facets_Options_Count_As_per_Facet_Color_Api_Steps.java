package com.ryder.online.test.stepdefinition;


import java.util.HashMap;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import com.ryder.online.helper.Logger.LoggerHelper;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facets_Options_Count_As_per_Facet_Color_Api_Steps extends BaseStepClass {
	
	Logger log =LoggerHelper.getLogger(Facets_Options_Count_As_per_Facet_Color_Api_Steps.class);
    int Truck_Count = 0;
    int TRACTOR_Count =0;
    int TRAILER_Count = 0;    
    int VANS_AND_CARS_Count = 0;
    JSONObject results = null;
    JSONArray  categories_Array = null;
    HashMap<String, Integer> Country_Wise_Count = null;
    int Total_Veh_Count_from_producttypenames = 0;
    int Total_Count_from_GVWCLass =0;
    
    @When("User passes facet filter region as {string} {string}, Vehicle Type {string} and color as {string}")
    public void user_passes_facet_filter_region_as_Vehicle_Type_and_color_as(String region1, String region2, String veh_type, String color) {
    	
    	
    	if(region1.trim().isEmpty() && region2.trim().isEmpty() && veh_type.trim().isEmpty() && !color.trim().isEmpty())  
		 {
			 httpRequest.queryParam("filterby","color="+color).urlEncodingEnabled(true);		 
		 }
    	
    	if(!region1.trim().isEmpty() && region2.trim().isEmpty() && veh_type.trim().isEmpty() && !color.trim().isEmpty())  
		 {
			 httpRequest.queryParam("filterby","r="+region1.trim()+";color="+color).urlEncodingEnabled(true);		 
		 }
   	
    	if(!region1.trim().isEmpty() && !region2.trim().isEmpty() && veh_type.trim().isEmpty() && !color.trim().isEmpty())  
		 {
			 httpRequest.queryParam("filterby","r="+region1.trim()+"|"+region2.trim()+";color="+color).urlEncodingEnabled(true);		 
		 }
	
    	if(!region1.trim().isEmpty() && region2.trim().isEmpty() && !veh_type.trim().isEmpty() && !color.trim().isEmpty())  
		 {
			 httpRequest.queryParam("filterby","r="+region1.trim()+";g="+veh_type.trim()+";color="+color).urlEncodingEnabled(true);		 
		 }
		
    	if(!region1.trim().isEmpty() && !region2.trim().isEmpty() && !veh_type.trim().isEmpty() && !color.trim().isEmpty()) 
		 {
			 httpRequest.queryParam("filterby","r="+region1.trim()+"|"+region2.trim()+";g="+veh_type.trim()+";color="+color).urlEncodingEnabled(true);		 
		 }
		
    	
    }

    @Then("Aggregate Count of Vehicles should Match based on searched facet Region as {string} {string}, Vehicle Type as {string} and color as {string} in the response")
    public void aggregate_Count_of_Vehicles_should_Match_based_on_searched_facet_Region_as_Vehicle_Type_as_and_color_as_in_the_response(String region1, String region2, String veh_type, String color) 
    {
    
    	results = new JSONObject(response.asString());
		System.out.println(" response ouput :" +results);
		
	    categories_Array = results.getJSONObject("Data").getJSONArray("Categories");	  	    
	    System.out.println(" ");
	    
	  //Country name  present under Category[1].values array
	    Country_Wise_Count = new HashMap<String, Integer>();
	    Country_Wise_Count = BaseStepClass.get_country_wise_Count_From_Response(categories_Array,region1,region2);
	   // System.out.println("Size of Country_Wise_Count :"+Country_Wise_Count.size());
	    int Total_Count_at_Country_level =0;
	    if(Country_Wise_Count==null)
	    {
	    	System.err.println("Country Array size is zero or blank , hence can`t validate Country level Aggregate counts");
			log.info("Country Array size is zero or blank , hence can`t validate Country level Aggregate counts");
			Assert.assertTrue(false,"Country Array size is zero or blank , hence can`t validate Country level Aggregate counts");
	    }
	    else
	    {
	    	if(Country_Wise_Count.size()==1)
		    {
		    	Total_Count_at_Country_level = Country_Wise_Count.get("Country1_Aggregate_Count");		    	
		    }
	    	else
		    {
		    	Total_Count_at_Country_level =Country_Wise_Count.get("Total_Count_From_Two_Countries");			    	
		    }
	    }
	
		System.out.println(" ");
		
		//producttypenames Section
		Total_Veh_Count_from_producttypenames = BaseStepClass.get_total_count_of_Vehicles_from_producttypenames_Array(categories_Array);
	    if(Total_Veh_Count_from_producttypenames==0)
	    {
	    	Assert.assertTrue(false,"ProducttypesNames Values Array is blank hence cant Validate");
	    }
		
	   
			  //to Get color value and aggregate count 
			    JSONArray color_Array = categories_Array.getJSONObject(40).getJSONArray("Values");
			    
			    String color_value_from_Res = color_Array.getJSONObject(0).getString("Name");
			    int aggregate_count_in_color_section  = color_Array.getJSONObject(0).getInt("AggregateCount");
			    System.out.println("Color Value  in Response : " +color_value_from_Res);
			    System.out.println("Aggregate Count present in Color section : " +aggregate_count_in_color_section);
			    System.out.println(" ");
			    
		    //GVW Section - To get the Aggregate count from the GVW Values array			    
		    int Total_Count_from_GVWCLass =0;   
					
		    Total_Count_from_GVWCLass = BaseStepClass.to_get_Total_Count_From_GVWClass_Array(categories_Array,veh_type);
		   // System.out.println( "Total Vehciles Count = "+Total_Count_from_GVWCLass); 
		    if(Total_Count_from_GVWCLass==0)
		    {
		    	Assert.assertTrue(false,"GVW  Values Array is blank hence cant Validate");
		    }
				 
				
		 Assert.assertEquals(Total_Count_from_GVWCLass, Total_Veh_Count_from_producttypenames,"Failed - Due to Count Mismatch b/w GVW Total_Count : " +Total_Count_from_GVWCLass+" and sum total from ProductTypenames : "+Total_Veh_Count_from_producttypenames );
		 Assert.assertEquals(Total_Count_from_GVWCLass, Total_Count_at_Country_level,"Failed - Due to Count Mismatch b/w GVW Total_Count : " +Total_Count_from_GVWCLass +" and "+"sum total at country level"+Total_Count_at_Country_level);
				 
		 Assert.assertEquals(color_value_from_Res.trim(), color.trim());
		 Assert.assertEquals(Total_Count_from_GVWCLass, aggregate_count_in_color_section,"Failed - Due to Count Mismatch b/w GVW Total_Count : " +Total_Count_from_GVWCLass+" and color section Aggregate Count :"+aggregate_count_in_color_section);
			    
				
    }

}
