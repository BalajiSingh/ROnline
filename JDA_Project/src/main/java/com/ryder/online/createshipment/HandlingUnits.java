package com.ryder.online.createshipment;

import java.util.List;

public class HandlingUnits {
//	private HandlingUnit[] handlingUnit;
//
//    public HandlingUnit[] getHandlingUnit ()
//    {
//        return handlingUnit;
//    }
//
//    public void setHandlingUnit (HandlingUnit[] handlingUnit)
//    {
//        this.handlingUnit = handlingUnit;
//    }
	   private List<HandlingUnit> handlingUnit;

	    public void setHandlingUnit(List<HandlingUnit> handlingUnit){
	        this.handlingUnit = handlingUnit;
	    }
	    public List<HandlingUnit> getHandlingUnit(){
	        return this.handlingUnit;
	    }
	    
	    public HandlingUnits(List<HandlingUnit> handlingUnit) {
	    	this.handlingUnit=handlingUnit;
	    }
    @Override
    public String toString()
    {
        return "ClassPojo [handlingUnit = "+handlingUnit+"]";
    }
    
    
 
//    public static HandlingUnits fill(JSONObject jsonobj){
//        HandlingUnits entity = new HandlingUnits();
//        if (jsonobj.containsKey("handlingUnit")) {
//            entity.setHandlingUnit(jsonobj.getJSONArray("handlingUnit"));        
//        }
//        return entity;
//    }
//    public static List<HandlingUnits> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<HandlingUnits> olist = new ArrayList<HandlingUnits>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
}
