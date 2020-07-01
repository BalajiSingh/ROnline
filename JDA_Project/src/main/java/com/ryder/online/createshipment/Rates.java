package com.ryder.online.createshipment;

import java.util.List;

public class Rates {
	
	 private List<Rate> rate;
	public Rates(List<Rate> rate) {
		this.rate=rate;
	}
  //  private Rate[] rate;
   
    public void setRate(List<Rate> rate){
        this.rate = rate;
    }
    public List<Rate> getRate(){
        return this.rate;
    }
//    public Rate[] getRate ()
//    {
//        return rate;
//    }
//
//    public void setRate (Rate[] rate)
//    {
//        this.rate = rate;
//    }

    @Override
    public String toString()
    {
        return "ClassPojo [rate = "+rate+"]";
    }
    
    
    
//    private List<Rate> rate;
//

//    public static Rates fill(JSONObject jsonobj){
//        Rates entity = new Rates();
//        if (jsonobj.containsKey("rate")) {
//            entity.setRate(jsonobj.getJSONArray("rate"));        
//        }
//        return entity;
//    }
//    public static List<Rates> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Rates> olist = new ArrayList<Rates>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
}
