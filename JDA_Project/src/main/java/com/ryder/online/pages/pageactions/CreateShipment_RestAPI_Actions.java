package com.ryder.online.pages.pageactions;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CreateShipment_RestAPI_Actions {

	public String createInputString(String input, String Parameter, String ParameterValue){
		System.out.println("parameter "+Parameter+" and the value is "+ParameterValue); 
		if(ParameterValue.trim().equals("NULL")){
			 System.out.println("Its a NULL");
		}
		else{
			 if(input.length()<3){
				 input=Parameter+"="+ParameterValue;
			 }
			 else{
				 input=input+"&"+Parameter+"="+ParameterValue;
			 }
		   }
		 	return input;
	}
	
	public String createInputString(String input, String Parameter, int ParameterValue){
		System.out.println("parameter "+Parameter+" and the value is "+ParameterValue); 
		if(ParameterValue==0){
			 System.out.println("Its a NULL");
		}
		else{
			 if(input.length()<3){
				 input=Parameter+"="+ParameterValue;
			 }
			 else{
				 input=input+"&"+Parameter+"="+ParameterValue;
			 }
		   }
		 	return input;
	}
	
	
	@SuppressWarnings("rawtypes")
	public String createShipmentPayload(Map<String, String> myMap) {
		
		
	//	System.out.println(myMap);
		
		Iterator<Entry<String, String>> it = myMap.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry pair = (Map.Entry)it.next();
		    System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		return null;
		
	}
}
