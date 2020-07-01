package com.ryder.online.createshipment;

import java.util.List;

public class ReferenceNumbers
{
    private List<Reference> reference;
   // private Reference[] reference;
    
    public ReferenceNumbers( List<Reference> reference) {
    	
    	this.reference=reference;
    }
    
    public void setReference(List<Reference> reference){
        this.reference = reference;
    }
//    public void setReference (Reference[] reference)
//    {
//        this.reference = reference;
//    }
    public List<Reference> getReference(){
        return this.reference;
    }
//    public Reference[] getReference ()
//    {
//        return reference;
//    }
    @Override
    public String toString()
    {
        return "ClassPojo [reference = "+reference+"]";
    }
    
//    public static ReferenceNumbers fill(JSONObject jsonobj){
//        ReferenceNumbers entity = new ReferenceNumbers();
//        if (jsonobj.containsKey("reference")) {
//            entity.setReference(jsonobj.getJSONArray("reference"));        
//        }
//        return entity;
//    }
//    public static List<ReferenceNumbers> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<ReferenceNumbers> olist = new ArrayList<ReferenceNumbers>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
}