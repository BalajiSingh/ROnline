package com.ryder.online.createshipment;

public class Measures
{
    private String length;

    private String width;

    private String height;

    private String dimensionUOM;

    private String weight;

    private String weightUOM;

    private String volume;

    private String volumeUOM;

    private String nominalWeight;

    private String tareWeight;

    private String totalSkids;

    private String totalHandlingUnits;

    private String orderValue;

    private String declaredValue;

    private String currency;

    private String actualWeight;

    private String actualVolume;

    private String actualPieces;

    private String actualHandlingUnits;
    
    
    public Measures(String length,String width, String height,String dimensionUOM, String weight, String weightUOM, String volume, String volumeUOM,String nominalWeight,  String tareWeight,   
    		String totalSkids, String totalHandlingUnits,  String orderValue,     String declaredValue,     String currency,     String actualWeight,    String actualVolume,     String actualPieces,     String actualHandlingUnits   ) 
    {
    	this.length =length;
    	this.width = width;
    	this.height= height;
    	this.dimensionUOM = dimensionUOM;
    	this.actualWeight = weight;
    	this.weightUOM=weightUOM;
    	this.volume =volume;
    	this.volumeUOM=volumeUOM;
    	this.nominalWeight =nominalWeight;
    	this.tareWeight=tareWeight;
    	this.totalSkids =totalSkids;
    	this.totalHandlingUnits = totalHandlingUnits;
    	this.orderValue =orderValue;
    	this.declaredValue =declaredValue;
    	this.currency =currency;
    	this.actualWeight=actualWeight;
    	this.actualVolume=actualVolume;
    	this.actualPieces =actualPieces;
    	this.actualHandlingUnits=actualHandlingUnits;
    }
    

    public void setLength(String length){
        this.length = length;
    }
    public String getLength(){
        return this.length;
    }
    public void setWidth(String width){
        this.width = width;
    }
    public String getWidth(){
        return this.width;
    }
    public void setHeight(String height){
        this.height = height;
    }
    public String getHeight(){
        return this.height;
    }
    public void setDimensionUOM(String dimensionUOM){
        this.dimensionUOM = dimensionUOM;
    }
    public String getDimensionUOM(){
        return this.dimensionUOM;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight;
    }
    public void setWeightUOM(String weightUOM){
        this.weightUOM = weightUOM;
    }
    public String getWeightUOM(){
        return this.weightUOM;
    }
    public void setVolume(String volume){
        this.volume = volume;
    }
    public String getVolume(){
        return this.volume;
    }
    public void setVolumeUOM(String volumeUOM){
        this.volumeUOM = volumeUOM;
    }
    public String getVolumeUOM(){
        return this.volumeUOM;
    }
    public void setNominalWeight(String nominalWeight){
        this.nominalWeight = nominalWeight;
    }
    public String getNominalWeight(){
        return this.nominalWeight;
    }
    public void setTareWeight(String tareWeight){
        this.tareWeight = tareWeight;
    }
    public String getTareWeight(){
        return this.tareWeight;
    }
    public void setTotalSkids(String totalSkids){
        this.totalSkids = totalSkids;
    }
    public String getTotalSkids(){
        return this.totalSkids;
    }
    public void setTotalHandlingUnits(String totalHandlingUnits){
        this.totalHandlingUnits = totalHandlingUnits;
    }
    public String getTotalHandlingUnits(){
        return this.totalHandlingUnits;
    }
    public void setOrderValue(String orderValue){
        this.orderValue = orderValue;
    }
    public String getOrderValue(){
        return this.orderValue;
    }
    public void setDeclaredValue(String declaredValue){
        this.declaredValue = declaredValue;
    }
    public String getDeclaredValue(){
        return this.declaredValue;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }
    public String getCurrency(){
        return this.currency;
    }
    public void setActualWeight(String actualWeight){
        this.actualWeight = actualWeight;
    }
    public String getActualWeight(){
        return this.actualWeight;
    }
    public void setActualVolume(String actualVolume){
        this.actualVolume = actualVolume;
    }
    public String getActualVolume(){
        return this.actualVolume;
    }
    public void setActualPieces(String actualPieces){
        this.actualPieces = actualPieces;
    }
    public String getActualPieces(){
        return this.actualPieces;
    }
    public void setActualHandlingUnits(String actualHandlingUnits){
        this.actualHandlingUnits = actualHandlingUnits;
    }
    public String getActualHandlingUnits(){
        return this.actualHandlingUnits;
    }
//    public static Measures fill(JSONObject jsonobj){
//        Measures entity = new Measures();
//        if (jsonobj.containsKey("length")) {
//            entity.setLength(jsonobj.getString("length"));        
//        }
//        if (jsonobj.containsKey("width")) {
//            entity.setWidth(jsonobj.getString("width"));        
//        }
//        if (jsonobj.containsKey("height")) {
//            entity.setHeight(jsonobj.getString("height"));        
//        }
//        if (jsonobj.containsKey("dimensionUOM")) {
//            entity.setDimensionUOM(jsonobj.getString("dimensionUOM"));        
//        }
//        if (jsonobj.containsKey("weight")) {
//            entity.setWeight(jsonobj.getString("weight"));        
//        }
//        if (jsonobj.containsKey("weightUOM")) {
//            entity.setWeightUOM(jsonobj.getString("weightUOM"));        
//        }
//        if (jsonobj.containsKey("volume")) {
//            entity.setVolume(jsonobj.getString("volume"));        
//        }
//        if (jsonobj.containsKey("volumeUOM")) {
//            entity.setVolumeUOM(jsonobj.getString("volumeUOM"));        
//        }
//        if (jsonobj.containsKey("nominalWeight")) {
//            entity.setNominalWeight(jsonobj.getString("nominalWeight"));        
//        }
//        if (jsonobj.containsKey("tareWeight")) {
//            entity.setTareWeight(jsonobj.getString("tareWeight"));        
//        }
//        if (jsonobj.containsKey("totalSkids")) {
//            entity.setTotalSkids(jsonobj.getString("totalSkids"));        
//        }
//        if (jsonobj.containsKey("totalHandlingUnits")) {
//            entity.setTotalHandlingUnits(jsonobj.getString("totalHandlingUnits"));        
//        }
//        if (jsonobj.containsKey("orderValue")) {
//            entity.setOrderValue(jsonobj.getString("orderValue"));        
//        }
//        if (jsonobj.containsKey("declaredValue")) {
//            entity.setDeclaredValue(jsonobj.getString("declaredValue"));        
//        }
//        if (jsonobj.containsKey("currency")) {
//            entity.setCurrency(jsonobj.getString("currency"));        
//        }
//        if (jsonobj.containsKey("actualWeight")) {
//            entity.setActualWeight(jsonobj.getString("actualWeight"));        
//        }
//        if (jsonobj.containsKey("actualVolume")) {
//            entity.setActualVolume(jsonobj.getString("actualVolume"));        
//        }
//        if (jsonobj.containsKey("actualPieces")) {
//            entity.setActualPieces(jsonobj.getString("actualPieces"));        
//        }
//        if (jsonobj.containsKey("actualHandlingUnits")) {
//            entity.setActualHandlingUnits(jsonobj.getString("actualHandlingUnits"));        
//        }
//        return entity;
//    }
//    public static List<Measures> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Measures> olist = new ArrayList<Measures>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
    
    @Override
    public String toString()
    {
        return "ClassPojo [actualHandlingUnits = "+actualHandlingUnits+", length = "+length+", weight = "+weight+", dimensionUOM = "+dimensionUOM+", orderValue = "+orderValue+", actualPieces = "+actualPieces+", volume = "+volume+", actualWeight = "+actualWeight+", nominalWeight = "+nominalWeight+", width = "+width+", actualVolume = "+actualVolume+", currency = "+currency+", totalSkids = "+totalSkids+", weightUOM = "+weightUOM+", volumeUOM = "+volumeUOM+", tareWeight = "+tareWeight+", declaredValue = "+declaredValue+", height = "+height+", totalHandlingUnits = "+totalHandlingUnits+"]";
    }
}
