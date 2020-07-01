package com.ryder.online.helper.managers;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

	private  Map<String, Object> scenarioContext;
	 
    public ScenarioContext(){
        scenarioContext = new HashMap<>();
    }
    public enum Context {
    	 UNIQUE_SHIPMENT_ID, LOAD_ID, SHIPMENT_STATUS;
    	}
    public void setContext(Context key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public Object getContext(Context key){
        return scenarioContext.get(key.toString());
    }

    public Boolean isContains(Context key){
        return scenarioContext.containsKey(key.toString());
    }
}
