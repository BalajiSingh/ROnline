package com.ryder.online.createshipment;

public class Options
{
    private String isShipDirect;

    private String isUrgent;

    private String isHold;

    private String carrierScac;

    private String serviceCode;

    private String freightTerms;

    private String incoTerms;

    private String consolidationClass;

    private String isHazmat;

    private String isWatchDesignated;

    private String isSpecialAttention;
public Options(String isShipDirect, String isUrgent, String isHold, String carrierScac, String serviceCode,
		String freightTerms, String incoTerms, String consolidationClass, String isHazmat, String isWatchDesignated, String isSpecialAttention) 
{
	this.isShipDirect=isShipDirect;
	this.isUrgent=isUrgent;
	this.isHold=isHold;
	this.carrierScac=carrierScac;
	this.serviceCode=serviceCode;
	this.freightTerms=freightTerms;
	this.incoTerms=incoTerms;
	this.consolidationClass=consolidationClass;
	this.isHazmat=isHazmat;
	this.isWatchDesignated=isWatchDesignated;
	this.isSpecialAttention=isSpecialAttention;
}
    public void setIsShipDirect(String isShipDirect){
        this.isShipDirect = isShipDirect;
    }
    public String getIsShipDirect(){
        return this.isShipDirect;
    }
    public void setIsUrgent(String isUrgent){
        this.isUrgent = isUrgent;
    }
    public String getIsUrgent(){
        return this.isUrgent;
    }
    public void setIsHold(String isHold){
        this.isHold = isHold;
    }
    public String getIsHold(){
        return this.isHold;
    }
    public void setCarrierScac(String carrierScac){
        this.carrierScac = carrierScac;
    }
    public String getCarrierScac(){
        return this.carrierScac;
    }
    public void setServiceCode(String serviceCode){
        this.serviceCode = serviceCode;
    }
    public String getServiceCode(){
        return this.serviceCode;
    }
    public void setFreightTerms(String freightTerms){
        this.freightTerms = freightTerms;
    }
    public String getFreightTerms(){
        return this.freightTerms;
    }
    public void setIncoTerms(String incoTerms){
        this.incoTerms = incoTerms;
    }
    public String getIncoTerms(){
        return this.incoTerms;
    }
    public void setConsolidationClass(String consolidationClass){
        this.consolidationClass = consolidationClass;
    }
    public String getConsolidationClass(){
        return this.consolidationClass;
    }
    public void setIsHazmat(String isHazmat){
        this.isHazmat = isHazmat;
    }
    public String getIsHazmat(){
        return this.isHazmat;
    }
    public void setIsWatchDesignated(String isWatchDesignated){
        this.isWatchDesignated = isWatchDesignated;
    }
    public String getIsWatchDesignated(){
        return this.isWatchDesignated;
    }
    public void setIsSpecialAttention(String isSpecialAttention){
        this.isSpecialAttention = isSpecialAttention;
    }
    public String getIsSpecialAttention(){
        return this.isSpecialAttention;
    }
//    public static Options fill(JSONObject jsonobj){
//        Options entity = new Options();
//        if (jsonobj.containsKey("isShipDirect")) {
//            entity.setIsShipDirect(jsonobj.getString("isShipDirect"));        
//        }
//        if (jsonobj.containsKey("isUrgent")) {
//            entity.setIsUrgent(jsonobj.getString("isUrgent"));        
//        }
//        if (jsonobj.containsKey("isHold")) {
//            entity.setIsHold(jsonobj.getString("isHold"));        
//        }
//        if (jsonobj.containsKey("carrierScac")) {
//            entity.setCarrierScac(jsonobj.getString("carrierScac"));        
//        }
//        if (jsonobj.containsKey("serviceCode")) {
//            entity.setServiceCode(jsonobj.getString("serviceCode"));        
//        }
//        if (jsonobj.containsKey("freightTerms")) {
//            entity.setFreightTerms(jsonobj.getString("freightTerms"));        
//        }
//        if (jsonobj.containsKey("incoTerms")) {
//            entity.setIncoTerms(jsonobj.getString("incoTerms"));        
//        }
//        if (jsonobj.containsKey("consolidationClass")) {
//            entity.setConsolidationClass(jsonobj.getString("consolidationClass"));        
//        }
//        if (jsonobj.containsKey("isHazmat")) {
//            entity.setIsHazmat(jsonobj.getString("isHazmat"));        
//        }
//        if (jsonobj.containsKey("isWatchDesignated")) {
//            entity.setIsWatchDesignated(jsonobj.getString("isWatchDesignated"));        
//        }
//        if (jsonobj.containsKey("isSpecialAttention")) {
//            entity.setIsSpecialAttention(jsonobj.getString("isSpecialAttention"));        
//        }
//        return entity;
//    }
//    public static List<Options> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Options> olist = new ArrayList<Options>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
    
    @Override
    public String toString()
    {
        return "ClassPojo [isUrgent = "+isUrgent+", incoTerms = "+incoTerms+", carrierScac = "+carrierScac+", serviceCode = "+serviceCode+", freightTerms = "+freightTerms+", isHold = "+isHold+", isWatchDesignated = "+isWatchDesignated+", consolidationClass = "+consolidationClass+", isSpecialAttention = "+isSpecialAttention+", isHazmat = "+isHazmat+", isShipDirect = "+isShipDirect+"]";
    }
}

