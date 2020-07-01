package com.ryder.online.createshipment;

import java.util.List;

public class Rate {
	 private String currencyCd;

	    private String accountNum;

	    private boolean validForSelectedService;

	    private String requestedDeliveryToDate;

	    private String serviceCode;

	    private String ratePurpose;

	    private String scheduledPickupToDate;

	    private int rank;

	    private boolean selected;

	    private String scheduledDeliveryToDate;

	    private String requestedPickupFromDate;

	    private String equipment;

	    private boolean validForDate;

	    private int transitDays;

	    private List<String> serviceOptions;

	    private String requestedDeliveryFromDate;

	    private String quoteId;

	    private String rateSource;

	    private String totalCharge;

	    private List<String> equipmentOptions;

	    private String scheduledDeliveryFromDate;

	    private String transportMode;

	    private String requestedPickupToDate;

	    private String carrierNum;

	    private String scheduledPickupFromDate;
	    public Rate( String currencyCd,	     String accountNum,	     boolean validForSelectedService,     String requestedDeliveryToDate,	     String serviceCode,
	     String ratePurpose,	     String scheduledPickupToDate,	     int rank,	     boolean selected,	     String scheduledDeliveryToDate,	     String requestedPickupFromDate,
	     String equipment,	     boolean validForDate,	     int transitDays,	     List<String> serviceOptions,	     String requestedDeliveryFromDate,	     String quoteId,
	     String rateSource,	     String totalCharge,	     List<String> equipmentOptions,	     String scheduledDeliveryFromDate,	     String transportMode,	     String requestedPickupToDate,
	     String carrierNum,	     String scheduledPickupFromDate)
	    {
	    this.currencyCd=currencyCd;
	    this.accountNum=accountNum;
	    this.validForSelectedService=validForSelectedService;
	    this.requestedDeliveryToDate=requestedDeliveryToDate;
	    this.serviceCode=serviceCode;
	    this.ratePurpose=ratePurpose;
	    this.scheduledPickupToDate=scheduledPickupToDate;
	    this.rank=rank;
	    this.selected=selected;
	    this.scheduledDeliveryToDate=scheduledDeliveryToDate;
	    this.requestedPickupFromDate=requestedPickupFromDate;
	    this.equipment=equipment;
	    this.validForDate=validForDate;
	    this.transitDays=transitDays;
	    this.serviceOptions=serviceOptions;
	    this.requestedDeliveryFromDate=requestedDeliveryFromDate;
	    this.quoteId=quoteId;
	    this.rateSource=rateSource;
	    this.totalCharge=totalCharge;
	    this.equipmentOptions=equipmentOptions;
	    this.scheduledDeliveryFromDate=scheduledDeliveryFromDate;
	    this.transportMode=transportMode;
	    this.requestedPickupToDate=requestedPickupToDate;
	    this.carrierNum=carrierNum;
	    this.scheduledPickupFromDate=scheduledPickupFromDate;	    
	    
	    }

	    public void setCurrencyCd(String currencyCd){
	        this.currencyCd = currencyCd;
	    }
	    public String getCurrencyCd(){
	        return this.currencyCd;
	    }
	    public void setAccountNum(String accountNum){
	        this.accountNum = accountNum;
	    }
	    public String getAccountNum(){
	        return this.accountNum;
	    }
	    public void setValidForSelectedService(boolean validForSelectedService){
	        this.validForSelectedService = validForSelectedService;
	    }
	    public boolean getValidForSelectedService(){
	        return this.validForSelectedService;
	    }
	    public void setRequestedDeliveryToDate(String requestedDeliveryToDate){
	        this.requestedDeliveryToDate = requestedDeliveryToDate;
	    }
	    public String getRequestedDeliveryToDate(){
	        return this.requestedDeliveryToDate;
	    }
	    public void setServiceCode(String serviceCode){
	        this.serviceCode = serviceCode;
	    }
	    public String getServiceCode(){
	        return this.serviceCode;
	    }
	    public void setRatePurpose(String ratePurpose){
	        this.ratePurpose = ratePurpose;
	    }
	    public String getRatePurpose(){
	        return this.ratePurpose;
	    }
	    public void setScheduledPickupToDate(String scheduledPickupToDate){
	        this.scheduledPickupToDate = scheduledPickupToDate;
	    }
	    public String getScheduledPickupToDate(){
	        return this.scheduledPickupToDate;
	    }
	    public void setRank(int rank){
	        this.rank = rank;
	    }
	    public int getRank(){
	        return this.rank;
	    }
	    public void setSelected(boolean selected){
	        this.selected = selected;
	    }
	    public boolean getSelected(){
	        return this.selected;
	    }
	    public void setScheduledDeliveryToDate(String scheduledDeliveryToDate){
	        this.scheduledDeliveryToDate = scheduledDeliveryToDate;
	    }
	    public String getScheduledDeliveryToDate(){
	        return this.scheduledDeliveryToDate;
	    }
	    public void setRequestedPickupFromDate(String requestedPickupFromDate){
	        this.requestedPickupFromDate = requestedPickupFromDate;
	    }
	    public String getRequestedPickupFromDate(){
	        return this.requestedPickupFromDate;
	    }
	    public void setEquipment(String equipment){
	        this.equipment = equipment;
	    }
	    public String getEquipment(){
	        return this.equipment;
	    }
	    public void setValidForDate(boolean validForDate){
	        this.validForDate = validForDate;
	    }
	    public boolean getValidForDate(){
	        return this.validForDate;
	    }
	    public void setTransitDays(int transitDays){
	        this.transitDays = transitDays;
	    }
	    public int getTransitDays(){
	        return this.transitDays;
	    }
	    public void setServiceOptions(List<String> serviceOptions){
	        this.serviceOptions = serviceOptions;
	    }
	    public List<String> getServiceOptions(){
	        return this.serviceOptions;
	    }
	    public void setRequestedDeliveryFromDate(String requestedDeliveryFromDate){
	        this.requestedDeliveryFromDate = requestedDeliveryFromDate;
	    }
	    public String getRequestedDeliveryFromDate(){
	        return this.requestedDeliveryFromDate;
	    }
	    public void setQuoteId(String quoteId){
	        this.quoteId = quoteId;
	    }
	    public String getQuoteId(){
	        return this.quoteId;
	    }
	    public void setRateSource(String rateSource){
	        this.rateSource = rateSource;
	    }
	    public String getRateSource(){
	        return this.rateSource;
	    }
	    public void setTotalCharge(String totalCharge){
	        this.totalCharge = totalCharge;
	    }
	    public String getTotalCharge(){
	        return this.totalCharge;
	    }
	    public void setEquipmentOptions(List<String> equipmentOptions){
	        this.equipmentOptions = equipmentOptions;
	    }
	    public List<String> getEquipmentOptions(){
	        return this.equipmentOptions;
	    }
	    public void setScheduledDeliveryFromDate(String scheduledDeliveryFromDate){
	        this.scheduledDeliveryFromDate = scheduledDeliveryFromDate;
	    }
	    public String getScheduledDeliveryFromDate(){
	        return this.scheduledDeliveryFromDate;
	    }
	    public void setTransportMode(String transportMode){
	        this.transportMode = transportMode;
	    }
	    public String getTransportMode(){
	        return this.transportMode;
	    }
	    public void setRequestedPickupToDate(String requestedPickupToDate){
	        this.requestedPickupToDate = requestedPickupToDate;
	    }
	    public String getRequestedPickupToDate(){
	        return this.requestedPickupToDate;
	    }
	    public void setCarrierNum(String carrierNum){
	        this.carrierNum = carrierNum;
	    }
	    public String getCarrierNum(){
	        return this.carrierNum;
	    }
	    public void setScheduledPickupFromDate(String scheduledPickupFromDate){
	        this.scheduledPickupFromDate = scheduledPickupFromDate;
	    }
	    public String getScheduledPickupFromDate(){
	        return this.scheduledPickupFromDate;
	    }
//	    public static Rate fill(JSONObject jsonobj){
//	        Rate entity = new Rate();
//	        if (jsonobj.containsKey("currencyCd")) {
//	            entity.setCurrencyCd(jsonobj.getString("currencyCd"));        
//	        }
//	        if (jsonobj.containsKey("accountNum")) {
//	            entity.setAccountNum(jsonobj.getString("accountNum"));        
//	        }
//	        if (jsonobj.containsKey("validForSelectedService")) {
//	            entity.setValidForSelectedService(jsonobj.getBoolean("validForSelectedService"));        
//	        }
//	        if (jsonobj.containsKey("requestedDeliveryToDate")) {
//	            entity.setRequestedDeliveryToDate(jsonobj.getString("requestedDeliveryToDate"));        
//	        }
//	        if (jsonobj.containsKey("serviceCode")) {
//	            entity.setServiceCode(jsonobj.getString("serviceCode"));        
//	        }
//	        if (jsonobj.containsKey("ratePurpose")) {
//	            entity.setRatePurpose(jsonobj.getString("ratePurpose"));        
//	        }
//	        if (jsonobj.containsKey("scheduledPickupToDate")) {
//	            entity.setScheduledPickupToDate(jsonobj.getString("scheduledPickupToDate"));        
//	        }
//	        if (jsonobj.containsKey("rank")) {
//	            entity.setRank(jsonobj.getInt("rank"));        
//	        }
//	        if (jsonobj.containsKey("selected")) {
//	            entity.setSelected(jsonobj.getBoolean("selected"));        
//	        }
//	        if (jsonobj.containsKey("scheduledDeliveryToDate")) {
//	            entity.setScheduledDeliveryToDate(jsonobj.getString("scheduledDeliveryToDate"));        
//	        }
//	        if (jsonobj.containsKey("requestedPickupFromDate")) {
//	            entity.setRequestedPickupFromDate(jsonobj.getString("requestedPickupFromDate"));        
//	        }
//	        if (jsonobj.containsKey("equipment")) {
//	            entity.setEquipment(jsonobj.getString("equipment"));        
//	        }
//	        if (jsonobj.containsKey("validForDate")) {
//	            entity.setValidForDate(jsonobj.getBoolean("validForDate"));        
//	        }
//	        if (jsonobj.containsKey("transitDays")) {
//	            entity.setTransitDays(jsonobj.getInt("transitDays"));        
//	        }
//	        if (jsonobj.containsKey("serviceOptions")) {
//	            entity.setServiceOptions(jsonobj.getJSONArray("serviceOptions"));        
//	        }
//	        if (jsonobj.containsKey("requestedDeliveryFromDate")) {
//	            entity.setRequestedDeliveryFromDate(jsonobj.getString("requestedDeliveryFromDate"));        
//	        }
//	        if (jsonobj.containsKey("quoteId")) {
//	            entity.setQuoteId(jsonobj.getString("quoteId"));        
//	        }
//	        if (jsonobj.containsKey("rateSource")) {
//	            entity.setRateSource(jsonobj.getString("rateSource"));        
//	        }
//	        if (jsonobj.containsKey("totalCharge")) {
//	            entity.setTotalCharge(jsonobj.getString("totalCharge"));        
//	        }
//	        if (jsonobj.containsKey("equipmentOptions")) {
//	            entity.setEquipmentOptions(jsonobj.getJSONArray("equipmentOptions"));        
//	        }
//	        if (jsonobj.containsKey("scheduledDeliveryFromDate")) {
//	            entity.setScheduledDeliveryFromDate(jsonobj.getString("scheduledDeliveryFromDate"));        
//	        }
//	        if (jsonobj.containsKey("transportMode")) {
//	            entity.setTransportMode(jsonobj.getString("transportMode"));        
//	        }
//	        if (jsonobj.containsKey("requestedPickupToDate")) {
//	            entity.setRequestedPickupToDate(jsonobj.getString("requestedPickupToDate"));        
//	        }
//	        if (jsonobj.containsKey("carrierNum")) {
//	            entity.setCarrierNum(jsonobj.getString("carrierNum"));        
//	        }
//	        if (jsonobj.containsKey("scheduledPickupFromDate")) {
//	            entity.setScheduledPickupFromDate(jsonobj.getString("scheduledPickupFromDate"));        
//	        }
//	        return entity;
//	    }
//	    public static List<Rate> fillList(JSONArray jsonarray) {
//	        if (jsonarray == null || jsonarray.size() == 0)
//	            return null;
//	        List<Rate> olist = new ArrayList<Rate>();
//	        for (int i = 0; i < jsonarray.size(); i++) {
//	            olist.add(fill(jsonarray.getJSONObject(i)));
//	        }
//	        return olist;
//	    }
	    @Override
	    public String toString()
	    {
	        return "ClassPojo [currencyCd = "+currencyCd+", accountNum = "+accountNum+", validForSelectedService = "+validForSelectedService+", requestedDeliveryToDate = "+requestedDeliveryToDate+", serviceCode = "+serviceCode+", ratePurpose = "+ratePurpose+", scheduledPickupToDate = "+scheduledPickupToDate+", rank = "+rank+", selected = "+selected+", scheduledDeliveryToDate = "+scheduledDeliveryToDate+", requestedPickupFromDate = "+requestedPickupFromDate+", equipment = "+equipment+", validForDate = "+validForDate+", transitDays = "+transitDays+", serviceOptions = "+serviceOptions+", requestedDeliveryFromDate = "+requestedDeliveryFromDate+", quoteId = "+quoteId+", rateSource = "+rateSource+", totalCharge = "+totalCharge+", equipmentOptions = "+equipmentOptions+", scheduledDeliveryFromDate = "+scheduledDeliveryFromDate+", transportMode = "+transportMode+", requestedPickupToDate = "+requestedPickupToDate+", carrierNum = "+carrierNum+", scheduledPickupFromDate = "+scheduledPickupFromDate+"]";
	    }
}
