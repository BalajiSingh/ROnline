package com.ryder.online.createshipment;

public class Address
{
    private String address;

    private String address2;

    private String city;

    private String sau;

    private String country;

    private String postalCode;

    private String latitude;

    private String longitude;

    private String timezone;
    
    public Address(String address,String address2, String city, String sau, String country, String postalCode, String latitude, 
    		String longitude,String timezone) {
    	
    	this.address=address;
    	this.address2=address2;
    	this.city=city;
    	this.sau=sau;
    	this.country=country;
    	this.postalCode=postalCode;
    	this.latitude=latitude;
    	this.longitude=longitude;
    	this.timezone=timezone;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress2(String address2){
        this.address2 = address2;
    }
    public String getAddress2(){
        return this.address2;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setSau(String sau){
        this.sau = sau;
    }
    public String getSau(){
        return this.sau;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public String getPostalCode(){
        return this.postalCode;
    }
    public void setLatitude(String latitude){
        this.latitude = latitude;
    }
    public String getLatitude(){
        return this.latitude;
    }
    public void setLongitude(String longitude){
        this.longitude = longitude;
    }
    public String getLongitude(){
        return this.longitude;
    }
    public void setTimezone(String timezone){
        this.timezone = timezone;
    }
    public String getTimezone(){
        return this.timezone;
    }
//    public static Address fill(JSONObject jsonobj){
//        Address entity = new Address();
//        if (jsonobj.containsKey("address")) {
//            entity.setAddress(jsonobj.getString("address"));        
//        }
//        if (jsonobj.containsKey("address2")) {
//            entity.setAddress2(jsonobj.getString("address2"));        
//        }
//        if (jsonobj.containsKey("city")) {
//            entity.setCity(jsonobj.getString("city"));        
//        }
//        if (jsonobj.containsKey("sau")) {
//            entity.setSau(jsonobj.getString("sau"));        
//        }
//        if (jsonobj.containsKey("country")) {
//            entity.setCountry(jsonobj.getString("country"));        
//        }
//        if (jsonobj.containsKey("postalCode")) {
//            entity.setPostalCode(jsonobj.getString("postalCode"));        
//        }
//        if (jsonobj.containsKey("latitude")) {
//            entity.setLatitude(jsonobj.getString("latitude"));        
//        }
//        if (jsonobj.containsKey("longitude")) {
//            entity.setLongitude(jsonobj.getString("longitude"));        
//        }
//        if (jsonobj.containsKey("timezone")) {
//            entity.setTimezone(jsonobj.getString("timezone"));        
//        }
//        return entity;
//    }
//    public static List<Address> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Address> olist = new ArrayList<Address>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
    @Override
    public String toString()
    {
        return "ClassPojo [country = "+country+", address = "+address+", address2 = "+address2+", city = "+city+", sau = "+sau+", timezone = "+timezone+", postalCode = "+postalCode+", latitude = "+latitude+", longitude = "+longitude+"]";
    }
}
