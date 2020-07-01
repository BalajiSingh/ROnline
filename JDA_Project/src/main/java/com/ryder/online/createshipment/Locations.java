package com.ryder.online.createshipment;

import java.util.List;

public class Locations
{
    private List<Location> location;

    
    public Locations(List<Location> location) {
    	this.location=location;
    }
    public void setLocation(List<Location> location){
        this.location = location;
    }
    public List<Location> getLocation(){
        return this.location;
    }
//    public static Locations fill(JSONObject jsonobj){
//        Locations entity = new Locations();
//        if (jsonobj.containsKey("location")) {
//            entity.setLocation(jsonobj.getJSONArray("location"));        
//        }
//        return entity;
//    }
//    public static List<Locations> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Locations> olist = new ArrayList<Locations>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
    
    @Override
    public String toString()
    {
        return "ClassPojo [location = "+location+"]";
    }
}
