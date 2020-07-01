package com.ryder.online.createshipment;

public class Location
{
    private String useCode;

    private String locationCode;

    private String locationName;

    private String locationNameAddtl;

    private String isPickupAppointmentRequired;

    private String isDeliveryAppointmentRequired;

    private String isResidential;

    private String externalLocationType;

    private String memo;

    private String businessHours;

    private Address address;

    private Contacts contacts;

    private String chargeOverrides;
    
    public Location   ( String useCode,     String locationCode,     String locationName,     String locationNameAddtl,
     String isPickupAppointmentRequired,     String isDeliveryAppointmentRequired,     String isResidential,
     String externalLocationType,     String memo,     String businessHours,     Address address,
     Contacts contacts,     String chargeOverrides) {
    	
    	
    	this.useCode=useCode;
    	this.locationCode=locationCode;
    	this.locationName=locationName;
    	this.locationNameAddtl=locationNameAddtl;
    	this.isPickupAppointmentRequired=isPickupAppointmentRequired;
    	this.isDeliveryAppointmentRequired=isDeliveryAppointmentRequired;
    	this.isResidential=isResidential;
    	this.externalLocationType=externalLocationType;
    	this.memo=memo;
    	this.businessHours=businessHours;
    	this.address=address;
    	this.contacts=contacts;
    	this.chargeOverrides=chargeOverrides;
    	
    	
    	
    }
    
    

    public void setUseCode(String useCode){
        this.useCode = useCode;
    }
    public String getUseCode(){
        return this.useCode;
    }
    public void setLocationCode(String locationCode){
        this.locationCode = locationCode;
    }
    public String getLocationCode(){
        return this.locationCode;
    }
    public void setLocationName(String locationName){
        this.locationName = locationName;
    }
    public String getLocationName(){
        return this.locationName;
    }
    public void setLocationNameAddtl(String locationNameAddtl){
        this.locationNameAddtl = locationNameAddtl;
    }
    public String getLocationNameAddtl(){
        return this.locationNameAddtl;
    }
    public void setIsPickupAppointmentRequired(String isPickupAppointmentRequired){
        this.isPickupAppointmentRequired = isPickupAppointmentRequired;
    }
    public String getIsPickupAppointmentRequired(){
        return this.isPickupAppointmentRequired;
    }
    public void setIsDeliveryAppointmentRequired(String isDeliveryAppointmentRequired){
        this.isDeliveryAppointmentRequired = isDeliveryAppointmentRequired;
    }
    public String getIsDeliveryAppointmentRequired(){
        return this.isDeliveryAppointmentRequired;
    }
    public void setIsResidential(String isResidential){
        this.isResidential = isResidential;
    }
    public String getIsResidential(){
        return this.isResidential;
    }
    public void setExternalLocationType(String externalLocationType){
        this.externalLocationType = externalLocationType;
    }
    public String getExternalLocationType(){
        return this.externalLocationType;
    }
    public void setMemo(String memo){
        this.memo = memo;
    }
    public String getMemo(){
        return this.memo;
    }
    public void setBusinessHours(String businessHours){
        this.businessHours = businessHours;
    }
    public String getBusinessHours(){
        return this.businessHours;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return this.address;
    }
    public void setContacts(Contacts contacts){
        this.contacts = contacts;
    }
    public Contacts getContacts(){
        return this.contacts;
    }
    public void setChargeOverrides(String chargeOverrides){
        this.chargeOverrides = chargeOverrides;
    }
    public String getChargeOverrides(){
        return this.chargeOverrides;
    }
//    public static Location fill(JSONObject jsonobj){
//        Location entity = new Location();
//        if (jsonobj.containsKey("useCode")) {
//            entity.setUseCode(jsonobj.getString("useCode"));        
//        }
//        if (jsonobj.containsKey("locationCode")) {
//            entity.setLocationCode(jsonobj.getString("locationCode"));        
//        }
//        if (jsonobj.containsKey("locationName")) {
//            entity.setLocationName(jsonobj.getString("locationName"));        
//        }
//        if (jsonobj.containsKey("locationNameAddtl")) {
//            entity.setLocationNameAddtl(jsonobj.getString("locationNameAddtl"));        
//        }
//        if (jsonobj.containsKey("isPickupAppointmentRequired")) {
//            entity.setIsPickupAppointmentRequired(jsonobj.getString("isPickupAppointmentRequired"));        
//        }
//        if (jsonobj.containsKey("isDeliveryAppointmentRequired")) {
//            entity.setIsDeliveryAppointmentRequired(jsonobj.getString("isDeliveryAppointmentRequired"));        
//        }
//        if (jsonobj.containsKey("isResidential")) {
//            entity.setIsResidential(jsonobj.getString("isResidential"));        
//        }
//        if (jsonobj.containsKey("externalLocationType")) {
//            entity.setExternalLocationType(jsonobj.getString("externalLocationType"));        
//        }
//        if (jsonobj.containsKey("memo")) {
//            entity.setMemo(jsonobj.getString("memo"));        
//        }
//        if (jsonobj.containsKey("businessHours")) {
//            entity.setBusinessHours(jsonobj.getString("businessHours"));        
//        }
//        if (jsonobj.containsKey("address")) {
//            entity.setAddress(jsonobj.getAddress("address"));        
//        }
//        if (jsonobj.containsKey("contacts")) {
//            entity.setContacts(jsonobj.getContacts("contacts"));        
//        }
//        if (jsonobj.containsKey("chargeOverrides")) {
//            entity.setChargeOverrides(jsonobj.getString("chargeOverrides"));        
//        }
//        return entity;
//    }
//    public static List<Location> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Location> olist = new ArrayList<Location>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }

    @Override
    public String toString()
    {
        return "ClassPojo [chargeOverrides = "+chargeOverrides+", locationName = "+locationName+", address = "+address+", businessHours = "+businessHours+", memo = "+memo+", externalLocationType = "+externalLocationType+", useCode = "+useCode+", locationNameAddtl = "+locationNameAddtl+", isResidential = "+isResidential+", isPickupAppointmentRequired = "+isPickupAppointmentRequired+", isDeliveryAppointmentRequired = "+isDeliveryAppointmentRequired+", locationCode = "+locationCode+", contacts = "+contacts+"]";
    }

}





