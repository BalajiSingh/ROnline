package com.ryder.online.createshipment;

import java.util.List;

public class HandlingUnit {

	 private String handlingUnitId;

	    private String quantity;

	    private String stackCode;

	    private String documentMappings;

	    private String handlingUnitTypeNumber;

	    private String description;

	    private String stackFactor;

	    private Measures measures;

	    private String freightClasses;

	    private List<String> hazmatDetails;

	    private String stackGroup;

	    private String externalHandlingUnitNumber;

	    private ReferenceNumbers referenceNumbers;

	    private String isHazmat;

	    private Items items;

	    private String isPalletOrSkid;

	    
	    public HandlingUnit(
	    		  String handlingUnitId,    String quantity,    String stackCode,    String documentMappings,
    		     String handlingUnitTypeNumber,     String description,     String stackFactor,    Measures measures,
	    		     String freightClasses,     List<String> hazmatDetails,    String stackGroup,     String externalHandlingUnitNumber,
    		     ReferenceNumbers referenceNumbers,    String isHazmat,     Items items,String isPalletOrSkid) 
	    {
	    	
	    	 this.handlingUnitId=handlingUnitId;     
	    	 this.quantity=quantity;     
	    	 this.stackCode=stackCode;     
	    	 this.documentMappings= 	 documentMappings;
		     this.handlingUnitTypeNumber=handlingUnitTypeNumber;      
		     this.description=description;      
		     this.stackFactor=stackFactor;    
		     this.measures=measures;
   		      this.freightClasses=freightClasses;     
   		      this.hazmatDetails=hazmatDetails;     
   		      this.stackGroup=stackGroup;      
   		      this.externalHandlingUnitNumber=externalHandlingUnitNumber;
		      this.referenceNumbers=referenceNumbers;     
		      this.isHazmat=isHazmat;      
		      this.items=items; 
		      this.isPalletOrSkid=isPalletOrSkid;
	    	
	    }
	    
	    
	    public void setHandlingUnitId(String handlingUnitId){
	        this.handlingUnitId = handlingUnitId;
	    }
	    public String getHandlingUnitId(){
	        return this.handlingUnitId;
	    }
	    public void setQuantity(String quantity){
	        this.quantity = quantity;
	    }
	    public String getQuantity(){
	        return this.quantity;
	    }
	    public void setStackCode(String stackCode){
	        this.stackCode = stackCode;
	    }
	    public String getStackCode(){
	        return this.stackCode;
	    }
	    public void setDocumentMappings(String documentMappings){
	        this.documentMappings = documentMappings;
	    }
	    public String getDocumentMappings(){
	        return this.documentMappings;
	    }
	    public void setHandlingUnitTypeNumber(String handlingUnitTypeNumber){
	        this.handlingUnitTypeNumber = handlingUnitTypeNumber;
	    }
	    public String getHandlingUnitTypeNumber(){
	        return this.handlingUnitTypeNumber;
	    }
	    public void setDescription(String description){
	        this.description = description;
	    }
	    public String getDescription(){
	        return this.description;
	    }
	    public void setStackFactor(String stackFactor){
	        this.stackFactor = stackFactor;
	    }
	    public String getStackFactor(){
	        return this.stackFactor;
	    }
	    public void setMeasures(Measures measures){
	        this.measures = measures;
	    }
	    public Measures getMeasures(){
	        return this.measures;
	    }
	    public void setFreightClasses(String freightClasses){
	        this.freightClasses = freightClasses;
	    }
	    public String getFreightClasses(){
	        return this.freightClasses;
	    }
	    public void setHazmatDetails(List<String> hazmatDetails){
	        this.hazmatDetails = hazmatDetails;
	    }
	    public List<String> getHazmatDetails(){
	        return this.hazmatDetails;
	    }
	    public void setStackGroup(String stackGroup){
	        this.stackGroup = stackGroup;
	    }
	    public String getStackGroup(){
	        return this.stackGroup;
	    }
	    public void setExternalHandlingUnitNumber(String externalHandlingUnitNumber){
	        this.externalHandlingUnitNumber = externalHandlingUnitNumber;
	    }
	    public String getExternalHandlingUnitNumber(){
	        return this.externalHandlingUnitNumber;
	    }
	    public void setReferenceNumbers(ReferenceNumbers referenceNumbers){
	        this.referenceNumbers = referenceNumbers;
	    }
	    public ReferenceNumbers getReferenceNumbers(){
	        return this.referenceNumbers;
	    }
	    public void setIsHazmat(String isHazmat){
	        this.isHazmat = isHazmat;
	    }
	    public String getIsHazmat(){
	        return this.isHazmat;
	    }
	    public void setItems(Items items){
	        this.items = items;
	    }
	    public Items getItems(){
	        return this.items;
	    }
	    public void setIsPalletOrSkid(String isPalletOrSkid){
	        this.isPalletOrSkid = isPalletOrSkid;
	    }
	    public String getIsPalletOrSkid(){
	        return this.isPalletOrSkid;
	    }
//	    public static HandlingUnit fill(JSONObject jsonobj){
//	        HandlingUnit entity = new HandlingUnit();
//	        if (jsonobj.containsKey("handlingUnitId")) {
//	            entity.setHandlingUnitId(jsonobj.getString("handlingUnitId"));        
//	        }
//	        if (jsonobj.containsKey("quantity")) {
//	            entity.setQuantity(jsonobj.getString("quantity"));        
//	        }
//	        if (jsonobj.containsKey("stackCode")) {
//	            entity.setStackCode(jsonobj.getString("stackCode"));        
//	        }
//	        if (jsonobj.containsKey("documentMappings")) {
//	            entity.setDocumentMappings(jsonobj.getString("documentMappings"));        
//	        }
//	        if (jsonobj.containsKey("handlingUnitTypeNumber")) {
//	            entity.setHandlingUnitTypeNumber(jsonobj.getString("handlingUnitTypeNumber"));        
//	        }
//	        if (jsonobj.containsKey("description")) {
//	            entity.setDescription(jsonobj.getString("description"));        
//	        }
//	        if (jsonobj.containsKey("stackFactor")) {
//	            entity.setStackFactor(jsonobj.getString("stackFactor"));        
//	        }
//	        if (jsonobj.containsKey("measures")) {
//	            entity.setMeasures(jsonobj.getMeasures("measures"));        
//	        }
//	        if (jsonobj.containsKey("freightClasses")) {
//	            entity.setFreightClasses(jsonobj.getString("freightClasses"));        
//	        }
//	        if (jsonobj.containsKey("hazmatDetails")) {
//	            entity.setHazmatDetails(jsonobj.getJSONArray("hazmatDetails"));        
//	        }
//	        if (jsonobj.containsKey("stackGroup")) {
//	            entity.setStackGroup(jsonobj.getString("stackGroup"));        
//	        }
//	        if (jsonobj.containsKey("externalHandlingUnitNumber")) {
//	            entity.setExternalHandlingUnitNumber(jsonobj.getString("externalHandlingUnitNumber"));        
//	        }
//	        if (jsonobj.containsKey("referenceNumbers")) {
//	            entity.setReferenceNumbers(jsonobj.getReferenceNumbers("referenceNumbers"));        
//	        }
//	        if (jsonobj.containsKey("isHazmat")) {
//	            entity.setIsHazmat(jsonobj.getString("isHazmat"));        
//	        }
//	        if (jsonobj.containsKey("items")) {
//	            entity.setItems(jsonobj.getItems("items"));        
//	        }
//	        if (jsonobj.containsKey("isPalletOrSkid")) {
//	            entity.setIsPalletOrSkid(jsonobj.getString("isPalletOrSkid"));        
//	        }
//	        return entity;
//	    }
//	    public static List<HandlingUnit> fillList(JSONArray jsonarray) {
//	        if (jsonarray == null || jsonarray.size() == 0)
//	            return null;
//	        List<HandlingUnit> olist = new ArrayList<HandlingUnit>();
//	        for (int i = 0; i < jsonarray.size(); i++) {
//	            olist.add(fill(jsonarray.getJSONObject(i)));
//	        }
//	        return olist;
//	    }
	

	
	
 
 



 


//    public String[] getHazmatDetails ()
//    {
//        return hazmatDetails;
//    }
//
//    public void setHazmatDetails (String[] hazmatDetails)
//    {
//        this.hazmatDetails = hazmatDetails;
//    }

   

    @Override
    public String toString()
    {
        return "ClassPojo [handlingUnitId = "+handlingUnitId+", quantity = "+quantity+", stackCode = "+stackCode+", documentMappings = "+documentMappings+", handlingUnitTypeNumber = "+handlingUnitTypeNumber+", description = "+description+", stackFactor = "+stackFactor+", measures = "+measures+", freightClasses = "+freightClasses+", hazmatDetails = "+hazmatDetails+", stackGroup = "+stackGroup+", externalHandlingUnitNumber = "+externalHandlingUnitNumber+", referenceNumbers = "+referenceNumbers+", isHazmat = "+isHazmat+", items = "+items+", isPalletOrSkid = "+isPalletOrSkid+"]";
    }
}
