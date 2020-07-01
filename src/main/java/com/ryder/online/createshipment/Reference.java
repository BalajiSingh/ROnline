package com.ryder.online.createshipment;

public class Reference
{
    private String qualifier;

    private String value;
    
    public Reference(String qualifier,String value) {
    	this.qualifier=qualifier;
    	this.value=value;
    }

    public void setQualifier(String qualifier){
        this.qualifier = qualifier;
    }
    public String getQualifier(){
        return this.qualifier;
    }
    public void setValue(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
   
    @Override
    public String toString()
    {
        return "ClassPojo [qualifier = "+qualifier+", value = "+value+"]";
    }
//    public static Reference fill(JSONObject jsonobj){
//        Reference entity = new Reference();
//        if (jsonobj.containsKey("qualifier")) {
//            entity.setQualifier(jsonobj.getString("qualifier"));        
//        }
//        if (jsonobj.containsKey("value")) {
//            entity.setValue(jsonobj.getString("value"));        
//        }
//        return entity;
//    }
//    public static List<Reference> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Reference> olist = new ArrayList<Reference>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
}

