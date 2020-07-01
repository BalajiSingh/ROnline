package com.ryder.online.createshipment;

public class createShipmentRootPayload {

	
	 	private String isReturn;

	    private HandlingUnits handlingUnits;

	    private DocumentMappings documentMappings;

	    private String chargedAmount;

	    private String discountAmount;

	    private String memo;

	    private String logisticsGroupCode;

	    private String type;

	    private String fuelAmount;

	    private Measures measures;

	    private String viewConfigs;

	    private String returnReason;

	    private String legs;

	    private String commodityCode;

	    private Options options;

	    private String actionCode;

	    private String externalShipmentNumber;

	    private String shipmentNumber;

	    private String events;

	    private String chargeOverrides;

	    private String mergeInTransitConsolidationCode;

	    private String idempotencyKey;

	    private Rates rates;

	    private Equipment equipment;

	    private Dates dates;

	    private String customerNumber;

	    private String userId;

	    private String carrierAccountType;

	    private String externalTimeStamp;

	    private String divisionCode;

	    private String totalAmount;

	    private String tradingPartner;

	    private Locations locations;

	    private String throughPoints;

	    private String carrierAccountNumber;

	    private ReferenceNumbers referenceNumbers;

	    private String mergeInTransitConsolidationNum;

	    private String status;
	    
	    
	    public createShipmentRootPayload( String isReturn,     HandlingUnits handlingUnits,    DocumentMappings documentMappings,     String chargedAmount,     String discountAmount,
	     String memo,    String logisticsGroupCode,     String type,     String fuelAmount,     Measures measures,     String viewConfigs,	     String returnReason,	     String legs,
	     String commodityCode,     Options options,	     String actionCode,	     String externalShipmentNumber,	     String shipmentNumber,	     String events,	     String chargeOverrides,
	     String mergeInTransitConsolidationCode,	     String idempotencyKey,	     Rates rates,	     Equipment equipment,	     Dates dates,	     String customerNumber,	     String userId,
	     String carrierAccountType,	     String externalTimeStamp,	     String divisionCode,	     String totalAmount,	     String tradingPartner,	     Locations locations,	     String throughPoints,
	     String carrierAccountNumber,	     ReferenceNumbers referenceNumbers,	     String mergeInTransitConsolidationNum,	     String status)
	    {
	    	 this.isReturn=isReturn;
		     this.handlingUnits=handlingUnits;
		     this.documentMappings= documentMappings;
		     this.chargedAmount=chargedAmount;
		     this.discountAmount=discountAmount;
		     this.memo=memo;
		     this.logisticsGroupCode=logisticsGroupCode;
		     this.type=type;
		     this.fuelAmount=fuelAmount;
		     this.measures= measures;
		     this.viewConfigs=viewConfigs;
		     this.returnReason=returnReason;
		     this.legs=legs;
		     this.commodityCode=commodityCode;
		     this.options=options;
		     this.actionCode=actionCode;
		     this.externalShipmentNumber=externalShipmentNumber;
		     this.shipmentNumber=shipmentNumber;
		     this.events=events;
		     this.chargeOverrides=chargeOverrides;
		     this.mergeInTransitConsolidationCode=mergeInTransitConsolidationCode;
		     this.idempotencyKey=idempotencyKey;
		     this.rates= rates;
		     this.equipment= equipment;
		     this.dates= dates;
		     this.customerNumber=customerNumber;
		     this.userId=userId;
		     this.carrierAccountType=carrierAccountType;
		     this.externalTimeStamp=externalTimeStamp;
		     this.divisionCode=divisionCode;
		     this.totalAmount=totalAmount;
		     this.tradingPartner=tradingPartner;
		     this.locations=locations;
		     this.throughPoints=throughPoints;
		     this.carrierAccountNumber=carrierAccountNumber;
		     this.referenceNumbers= referenceNumbers;
		     this.mergeInTransitConsolidationNum=mergeInTransitConsolidationNum;
		     this.status=status;
	    }

	    public void setIsReturn(String isReturn){
	        this.isReturn = isReturn;
	    }
	    public String getIsReturn(){
	        return this.isReturn;
	    }
	    public void setHandlingUnits(HandlingUnits handlingUnits){
	        this.handlingUnits = handlingUnits;
	    }
	    public HandlingUnits getHandlingUnits(){
	        return this.handlingUnits;
	    }
	    public void setDocumentMappings(DocumentMappings documentMappings){
	        this.documentMappings = documentMappings;
	    }
	    public DocumentMappings getDocumentMappings(){
	        return this.documentMappings;
	    }
	    public void setChargedAmount(String chargedAmount){
	        this.chargedAmount = chargedAmount;
	    }
	    public String getChargedAmount(){
	        return this.chargedAmount;
	    }
	    public void setDiscountAmount(String discountAmount){
	        this.discountAmount = discountAmount;
	    }
	    public String getDiscountAmount(){
	        return this.discountAmount;
	    }
	    public void setMemo(String memo){
	        this.memo = memo;
	    }
	    public String getMemo(){
	        return this.memo;
	    }
	    public void setLogisticsGroupCode(String logisticsGroupCode){
	        this.logisticsGroupCode = logisticsGroupCode;
	    }
	    public String getLogisticsGroupCode(){
	        return this.logisticsGroupCode;
	    }
	    public void setType(String type){
	        this.type = type;
	    }
	    public String getType(){
	        return this.type;
	    }
	    public void setFuelAmount(String fuelAmount){
	        this.fuelAmount = fuelAmount;
	    }
	    public String getFuelAmount(){
	        return this.fuelAmount;
	    }
	    public void setMeasures(Measures measures){
	        this.measures = measures;
	    }
	    public Measures getMeasures(){
	        return this.measures;
	    }
	    public void setViewConfigs(String viewConfigs){
	        this.viewConfigs = viewConfigs;
	    }
	    public String getViewConfigs(){
	        return this.viewConfigs;
	    }
	    public void setReturnReason(String returnReason){
	        this.returnReason = returnReason;
	    }
	    public String getReturnReason(){
	        return this.returnReason;
	    }
	    public void setLegs(String legs){
	        this.legs = legs;
	    }
	    public String getLegs(){
	        return this.legs;
	    }
	    public void setCommodityCode(String commodityCode){
	        this.commodityCode = commodityCode;
	    }
	    public String getCommodityCode(){
	        return this.commodityCode;
	    }
	    public void setOptions(Options options){
	        this.options = options;
	    }
	    public Options getOptions(){
	        return this.options;
	    }
	    public void setActionCode(String actionCode){
	        this.actionCode = actionCode;
	    }
	    public String getActionCode(){
	        return this.actionCode;
	    }
	    public void setExternalShipmentNumber(String externalShipmentNumber){
	        this.externalShipmentNumber = externalShipmentNumber;
	    }
	    public String getExternalShipmentNumber(){
	        return this.externalShipmentNumber;
	    }
	    public void setShipmentNumber(String shipmentNumber){
	        this.shipmentNumber = shipmentNumber;
	    }
	    public String getShipmentNumber(){
	        return this.shipmentNumber;
	    }
	    public void setEvents(String events){
	        this.events = events;
	    }
	    public String getEvents(){
	        return this.events;
	    }
	    public void setChargeOverrides(String chargeOverrides){
	        this.chargeOverrides = chargeOverrides;
	    }
	    public String getChargeOverrides(){
	        return this.chargeOverrides;
	    }
	    public void setMergeInTransitConsolidationCode(String mergeInTransitConsolidationCode){
	        this.mergeInTransitConsolidationCode = mergeInTransitConsolidationCode;
	    }
	    public String getMergeInTransitConsolidationCode(){
	        return this.mergeInTransitConsolidationCode;
	    }
	    public void setIdempotencyKey(String idempotencyKey){
	        this.idempotencyKey = idempotencyKey;
	    }
	    public String getIdempotencyKey(){
	        return this.idempotencyKey;
	    }
	    public void setRates(Rates rates){
	        this.rates = rates;
	    }
	    public Rates getRates(){
	        return this.rates;
	    }
	    public void setEquipment(Equipment equipment){
	        this.equipment = equipment;
	    }
	    public Equipment getEquipment(){
	        return this.equipment;
	    }
	    public void setDates(Dates dates){
	        this.dates = dates;
	    }
	    public Dates getDates(){
	        return this.dates;
	    }
	    public void setCustomerNumber(String customerNumber){
	        this.customerNumber = customerNumber;
	    }
	    public String getCustomerNumber(){
	        return this.customerNumber;
	    }
	    public void setUserId(String userId){
	        this.userId = userId;
	    }
	    public String getUserId(){
	        return this.userId;
	    }
	    public void setCarrierAccountType(String carrierAccountType){
	        this.carrierAccountType = carrierAccountType;
	    }
	    public String getCarrierAccountType(){
	        return this.carrierAccountType;
	    }
	    public void setExternalTimeStamp(String externalTimeStamp){
	        this.externalTimeStamp = externalTimeStamp;
	    }
	    public String getExternalTimeStamp(){
	        return this.externalTimeStamp;
	    }
	    public void setDivisionCode(String divisionCode){
	        this.divisionCode = divisionCode;
	    }
	    public String getDivisionCode(){
	        return this.divisionCode;
	    }
	    public void setTotalAmount(String totalAmount){
	        this.totalAmount = totalAmount;
	    }
	    public String getTotalAmount(){
	        return this.totalAmount;
	    }
	    public void setTradingPartner(String tradingPartner){
	        this.tradingPartner = tradingPartner;
	    }
	    public String getTradingPartner(){
	        return this.tradingPartner;
	    }
	    public void setLocations(Locations locations){
	        this.locations = locations;
	    }
	    public Locations getLocations(){
	        return this.locations;
	    }
	    public void setThroughPoints(String throughPoints){
	        this.throughPoints = throughPoints;
	    }
	    public String getThroughPoints(){
	        return this.throughPoints;
	    }
	    public void setCarrierAccountNumber(String carrierAccountNumber){
	        this.carrierAccountNumber = carrierAccountNumber;
	    }
	    public String getCarrierAccountNumber(){
	        return this.carrierAccountNumber;
	    }
	    public void setReferenceNumbers(ReferenceNumbers referenceNumbers){
	        this.referenceNumbers = referenceNumbers;
	    }
	    public ReferenceNumbers getReferenceNumbers(){
	        return this.referenceNumbers;
	    }
	    public void setMergeInTransitConsolidationNum(String mergeInTransitConsolidationNum){
	        this.mergeInTransitConsolidationNum = mergeInTransitConsolidationNum;
	    }
	    public String getMergeInTransitConsolidationNum(){
	        return this.mergeInTransitConsolidationNum;
	    }
	    public void setStatus(String status){
	        this.status = status;
	    }
	    public String getStatus(){
	        return this.status;
	    }
//	    public static Root fill(JSONObject jsonobj){
//	        Root entity = new Root();
//	        if (jsonobj.containsKey("isReturn")) {
//	            entity.setIsReturn(jsonobj.getString("isReturn"));        
//	        }
//	        if (jsonobj.containsKey("handlingUnits")) {
//	            entity.setHandlingUnits(jsonobj.getHandlingUnits("handlingUnits"));        
//	        }
//	        if (jsonobj.containsKey("documentMappings")) {
//	            entity.setDocumentMappings(jsonobj.getDocumentMappings("documentMappings"));        
//	        }
//	        if (jsonobj.containsKey("chargedAmount")) {
//	            entity.setChargedAmount(jsonobj.getString("chargedAmount"));        
//	        }
//	        if (jsonobj.containsKey("discountAmount")) {
//	            entity.setDiscountAmount(jsonobj.getString("discountAmount"));        
//	        }
//	        if (jsonobj.containsKey("memo")) {
//	            entity.setMemo(jsonobj.getString("memo"));        
//	        }
//	        if (jsonobj.containsKey("logisticsGroupCode")) {
//	            entity.setLogisticsGroupCode(jsonobj.getString("logisticsGroupCode"));        
//	        }
//	        if (jsonobj.containsKey("type")) {
//	            entity.setType(jsonobj.getString("type"));        
//	        }
//	        if (jsonobj.containsKey("fuelAmount")) {
//	            entity.setFuelAmount(jsonobj.getString("fuelAmount"));        
//	        }
//	        if (jsonobj.containsKey("measures")) {
//	            entity.setMeasures(jsonobj.getMeasures("measures"));        
//	        }
//	        if (jsonobj.containsKey("viewConfigs")) {
//	            entity.setViewConfigs(jsonobj.getString("viewConfigs"));        
//	        }
//	        if (jsonobj.containsKey("returnReason")) {
//	            entity.setReturnReason(jsonobj.getString("returnReason"));        
//	        }
//	        if (jsonobj.containsKey("legs")) {
//	            entity.setLegs(jsonobj.getString("legs"));        
//	        }
//	        if (jsonobj.containsKey("commodityCode")) {
//	            entity.setCommodityCode(jsonobj.getString("commodityCode"));        
//	        }
//	        if (jsonobj.containsKey("options")) {
//	            entity.setOptions(jsonobj.getOptions("options"));        
//	        }
//	        if (jsonobj.containsKey("actionCode")) {
//	            entity.setActionCode(jsonobj.getString("actionCode"));        
//	        }
//	        if (jsonobj.containsKey("externalShipmentNumber")) {
//	            entity.setExternalShipmentNumber(jsonobj.getString("externalShipmentNumber"));        
//	        }
//	        if (jsonobj.containsKey("shipmentNumber")) {
//	            entity.setShipmentNumber(jsonobj.getString("shipmentNumber"));        
//	        }
//	        if (jsonobj.containsKey("events")) {
//	            entity.setEvents(jsonobj.getString("events"));        
//	        }
//	        if (jsonobj.containsKey("chargeOverrides")) {
//	            entity.setChargeOverrides(jsonobj.getString("chargeOverrides"));        
//	        }
//	        if (jsonobj.containsKey("mergeInTransitConsolidationCode")) {
//	            entity.setMergeInTransitConsolidationCode(jsonobj.getString("mergeInTransitConsolidationCode"));        
//	        }
//	        if (jsonobj.containsKey("idempotencyKey")) {
//	            entity.setIdempotencyKey(jsonobj.getString("idempotencyKey"));        
//	        }
//	        if (jsonobj.containsKey("rates")) {
//	            entity.setRates(jsonobj.getRates("rates"));        
//	        }
//	        if (jsonobj.containsKey("equipment")) {
//	            entity.setEquipment(jsonobj.getEquipment("equipment"));        
//	        }
//	        if (jsonobj.containsKey("dates")) {
//	            entity.setDates(jsonobj.getDates("dates"));        
//	        }
//	        if (jsonobj.containsKey("customerNumber")) {
//	            entity.setCustomerNumber(jsonobj.getString("customerNumber"));        
//	        }
//	        if (jsonobj.containsKey("userId")) {
//	            entity.setUserId(jsonobj.getString("userId"));        
//	        }
//	        if (jsonobj.containsKey("carrierAccountType")) {
//	            entity.setCarrierAccountType(jsonobj.getString("carrierAccountType"));        
//	        }
//	        if (jsonobj.containsKey("externalTimeStamp")) {
//	            entity.setExternalTimeStamp(jsonobj.getString("externalTimeStamp"));        
//	        }
//	        if (jsonobj.containsKey("divisionCode")) {
//	            entity.setDivisionCode(jsonobj.getString("divisionCode"));        
//	        }
//	        if (jsonobj.containsKey("totalAmount")) {
//	            entity.setTotalAmount(jsonobj.getString("totalAmount"));        
//	        }
//	        if (jsonobj.containsKey("tradingPartner")) {
//	            entity.setTradingPartner(jsonobj.getString("tradingPartner"));        
//	        }
//	        if (jsonobj.containsKey("locations")) {
//	            entity.setLocations(jsonobj.getLocations("locations"));        
//	        }
//	        if (jsonobj.containsKey("throughPoints")) {
//	            entity.setThroughPoints(jsonobj.getString("throughPoints"));        
//	        }
//	        if (jsonobj.containsKey("carrierAccountNumber")) {
//	            entity.setCarrierAccountNumber(jsonobj.getString("carrierAccountNumber"));        
//	        }
//	        if (jsonobj.containsKey("referenceNumbers")) {
//	            entity.setReferenceNumbers(jsonobj.getReferenceNumbers("referenceNumbers"));        
//	        }
//	        if (jsonobj.containsKey("mergeInTransitConsolidationNum")) {
//	            entity.setMergeInTransitConsolidationNum(jsonobj.getString("mergeInTransitConsolidationNum"));        
//	        }
//	        if (jsonobj.containsKey("status")) {
//	            entity.setStatus(jsonobj.getString("status"));        
//	        }
//	        return entity;
//	    }
//	    public static List<Root> fillList(JSONArray jsonarray) {
//	        if (jsonarray == null || jsonarray.size() == 0)
//	            return null;
//	        List<Root> olist = new ArrayList<Root>();
//	        for (int i = 0; i < jsonarray.size(); i++) {
//	            olist.add(fill(jsonarray.getJSONObject(i)));
//	        }
//	        return olist;
//	    }
	    
	    
	    @Override
	    public String toString()
	    {
	        return "ClassPojo [isReturn = "+isReturn+", handlingUnits = "+handlingUnits+", documentMappings = "+documentMappings+", chargedAmount = "+chargedAmount+", discountAmount = "+discountAmount+", memo = "+memo+", logisticsGroupCode = "+logisticsGroupCode+", type = "+type+", fuelAmount = "+fuelAmount+", measures = "+measures+", viewConfigs = "+viewConfigs+", returnReason = "+returnReason+", legs = "+legs+", commodityCode = "+commodityCode+", options = "+options+", actionCode = "+actionCode+", externalShipmentNumber = "+externalShipmentNumber+", shipmentNumber = "+shipmentNumber+", events = "+events+", chargeOverrides = "+chargeOverrides+", mergeInTransitConsolidationCode = "+mergeInTransitConsolidationCode+", idempotencyKey = "+idempotencyKey+", rates = "+rates+", equipment = "+equipment+", dates = "+dates+", customerNumber = "+customerNumber+", userId = "+userId+", carrierAccountType = "+carrierAccountType+", externalTimeStamp = "+externalTimeStamp+", divisionCode = "+divisionCode+", totalAmount = "+totalAmount+", tradingPartner = "+tradingPartner+", locations = "+locations+", throughPoints = "+throughPoints+", carrierAccountNumber = "+carrierAccountNumber+", referenceNumbers = "+referenceNumbers+", mergeInTransitConsolidationNum = "+mergeInTransitConsolidationNum+", status = "+status+"]";
	    }
}
