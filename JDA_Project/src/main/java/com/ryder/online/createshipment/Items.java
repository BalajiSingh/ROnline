package com.ryder.online.createshipment;

import java.util.List;

public class Items {

	private List<String> item;

	public  Items(List<String> item) {
		this.item =item;
	}
	
	
    public void setItem(List<String> item){
        this.item = item;
    }
    public List<String> getItem(){
        return this.item;
    }
//    public static Items fill(JSONObject jsonobj){
//        Items entity = new Items();
//        if (jsonobj.containsKey("item")) {
//            entity.setItem(jsonobj.getJSONArray("item"));        
//        }
//        return entity;
//    }
//    public static List<Items> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Items> olist = new ArrayList<Items>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
	

	
//	 private String[] item;
//
//	    public String[] getItem ()
//	    {
//	        return item;
//	    }
//
//	    public void setItem (String[] item)
//	    {
//	        this.item = item;
//	    }
//
	    @Override
	    public String toString()
	    {
	        return "ClassPojo [item = "+item+"]";
	    }
}
