package com.ryder.online.createshipment;

public class Equipment
{
    private String equipmentInitial;

    private String equipmentNumber;

    private String equipmentName;

    private String country;

    private String routeNumber;

    private String equipmentDescriptionCode;

    private String equipmentCode;

    private String weightUOM;

    private String weight;

    private String volumeUOM;

    private String volume;

    private String temperatureUOM;

    private String minimumTemperature;

    private String maximumTemperature;

    private String dimUOM;

    private String length;

    private String width;

    private String height;
    
    
    public Equipment( String equipmentInitial,     String equipmentNumber,     String equipmentName,     String country,     String routeNumber,
     String equipmentDescriptionCode,     String equipmentCode,     String weightUOM,     String weight,    String volumeUOM,
     String volume,     String temperatureUOM,     String minimumTemperature,     String maximumTemperature,     String dimUOM,
     String length,     String width,     String height) {
    	
    	this.equipmentInitial=equipmentInitial;
    	this.equipmentNumber=equipmentNumber;
    	this.equipmentName=equipmentName;
    	this.country=country;
    	this.routeNumber=routeNumber;
    	this.equipmentDescriptionCode=equipmentDescriptionCode;
    	this.equipmentCode=equipmentCode;
    	this.weightUOM=weightUOM;
    	this.weight=weight;
    	this.volumeUOM=volumeUOM;
    	this.volume=volume;
    	this.temperatureUOM=temperatureUOM;
    	this.minimumTemperature=minimumTemperature;
    	this.maximumTemperature=maximumTemperature;
    	this.dimUOM=dimUOM;
    	this.length=length;
    	this.width=width;
    	this.height=height;
    		
    	
    }

    public void setEquipmentInitial(String equipmentInitial){
        this.equipmentInitial = equipmentInitial;
    }
    public String getEquipmentInitial(){
        return this.equipmentInitial;
    }
    public void setEquipmentNumber(String equipmentNumber){
        this.equipmentNumber = equipmentNumber;
    }
    public String getEquipmentNumber(){
        return this.equipmentNumber;
    }
    public void setEquipmentName(String equipmentName){
        this.equipmentName = equipmentName;
    }
    public String getEquipmentName(){
        return this.equipmentName;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setRouteNumber(String routeNumber){
        this.routeNumber = routeNumber;
    }
    public String getRouteNumber(){
        return this.routeNumber;
    }
    public void setEquipmentDescriptionCode(String equipmentDescriptionCode){
        this.equipmentDescriptionCode = equipmentDescriptionCode;
    }
    public String getEquipmentDescriptionCode(){
        return this.equipmentDescriptionCode;
    }
    public void setEquipmentCode(String equipmentCode){
        this.equipmentCode = equipmentCode;
    }
    public String getEquipmentCode(){
        return this.equipmentCode;
    }
    public void setWeightUOM(String weightUOM){
        this.weightUOM = weightUOM;
    }
    public String getWeightUOM(){
        return this.weightUOM;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight;
    }
    public void setVolumeUOM(String volumeUOM){
        this.volumeUOM = volumeUOM;
    }
    public String getVolumeUOM(){
        return this.volumeUOM;
    }
    public void setVolume(String volume){
        this.volume = volume;
    }
    public String getVolume(){
        return this.volume;
    }
    public void setTemperatureUOM(String temperatureUOM){
        this.temperatureUOM = temperatureUOM;
    }
    public String getTemperatureUOM(){
        return this.temperatureUOM;
    }
    public void setMinimumTemperature(String minimumTemperature){
        this.minimumTemperature = minimumTemperature;
    }
    public String getMinimumTemperature(){
        return this.minimumTemperature;
    }
    public void setMaximumTemperature(String maximumTemperature){
        this.maximumTemperature = maximumTemperature;
    }
    public String getMaximumTemperature(){
        return this.maximumTemperature;
    }
    public void setDimUOM(String dimUOM){
        this.dimUOM = dimUOM;
    }
    public String getDimUOM(){
        return this.dimUOM;
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
//    public static Equipment fill(JSONObject jsonobj){
//        Equipment entity = new Equipment();
//        if (jsonobj.containsKey("equipmentInitial")) {
//            entity.setEquipmentInitial(jsonobj.getString("equipmentInitial"));        
//        }
//        if (jsonobj.containsKey("equipmentNumber")) {
//            entity.setEquipmentNumber(jsonobj.getString("equipmentNumber"));        
//        }
//        if (jsonobj.containsKey("equipmentName")) {
//            entity.setEquipmentName(jsonobj.getString("equipmentName"));        
//        }
//        if (jsonobj.containsKey("country")) {
//            entity.setCountry(jsonobj.getString("country"));        
//        }
//        if (jsonobj.containsKey("routeNumber")) {
//            entity.setRouteNumber(jsonobj.getString("routeNumber"));        
//        }
//        if (jsonobj.containsKey("equipmentDescriptionCode")) {
//            entity.setEquipmentDescriptionCode(jsonobj.getString("equipmentDescriptionCode"));        
//        }
//        if (jsonobj.containsKey("equipmentCode")) {
//            entity.setEquipmentCode(jsonobj.getString("equipmentCode"));        
//        }
//        if (jsonobj.containsKey("weightUOM")) {
//            entity.setWeightUOM(jsonobj.getString("weightUOM"));        
//        }
//        if (jsonobj.containsKey("weight")) {
//            entity.setWeight(jsonobj.getString("weight"));        
//        }
//        if (jsonobj.containsKey("volumeUOM")) {
//            entity.setVolumeUOM(jsonobj.getString("volumeUOM"));        
//        }
//        if (jsonobj.containsKey("volume")) {
//            entity.setVolume(jsonobj.getString("volume"));        
//        }
//        if (jsonobj.containsKey("temperatureUOM")) {
//            entity.setTemperatureUOM(jsonobj.getString("temperatureUOM"));        
//        }
//        if (jsonobj.containsKey("minimumTemperature")) {
//            entity.setMinimumTemperature(jsonobj.getString("minimumTemperature"));        
//        }
//        if (jsonobj.containsKey("maximumTemperature")) {
//            entity.setMaximumTemperature(jsonobj.getString("maximumTemperature"));        
//        }
//        if (jsonobj.containsKey("dimUOM")) {
//            entity.setDimUOM(jsonobj.getString("dimUOM"));        
//        }
//        if (jsonobj.containsKey("length")) {
//            entity.setLength(jsonobj.getString("length"));        
//        }
//        if (jsonobj.containsKey("width")) {
//            entity.setWidth(jsonobj.getString("width"));        
//        }
//        if (jsonobj.containsKey("height")) {
//            entity.setHeight(jsonobj.getString("height"));        
//        }
//        return entity;
//    }
//    public static List<Equipment> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Equipment> olist = new ArrayList<Equipment>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
    @Override
    public String toString()
    {
        return "ClassPojo [country = "+country+", routeNumber = "+routeNumber+", equipmentCode = "+equipmentCode+", temperatureUOM = "+temperatureUOM+", length = "+length+", weight = "+weight+", equipmentInitial = "+equipmentInitial+", equipmentNumber = "+equipmentNumber+", volume = "+volume+", equipmentDescriptionCode = "+equipmentDescriptionCode+", dimUOM = "+dimUOM+", maximumTemperature = "+maximumTemperature+", width = "+width+", minimumTemperature = "+minimumTemperature+", equipmentName = "+equipmentName+", weightUOM = "+weightUOM+", volumeUOM = "+volumeUOM+", height = "+height+"]";
    }
}

