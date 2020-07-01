package com.ryder.online.createshipment;


	
	
	
	public class Dates
	{
	    private String requestShipFrom;

	    private String requestShipTo;

	    private String requestDeliveryFrom;

	    private String requestDeliveryTo;

	    private String scheduledShipFrom;

	    private String scheduledShipTo;

	    private String scheduledDeliveryFrom;

	    private String scheduledDeliveryTo;

	    private String appointmentPickUp;

	    private String appointmentDelivery;

	    private String actualPickup;

	    private String actualDelivery;
	    
	    public Dates( String requestShipFrom,	     String requestShipTo,	     String requestDeliveryFrom,	     String requestDeliveryTo,
	     String scheduledShipFrom,	     String scheduledShipTo,	     String scheduledDeliveryFrom,     String scheduledDeliveryTo,	     String appointmentPickUp,
	     String appointmentDelivery,	     String actualPickup,	     String actualDelivery) {
	    	
	    	 this.requestShipFrom=requestShipFrom;

		      this.requestShipTo=requestShipTo;

		      this.requestDeliveryFrom=requestDeliveryFrom;

		      this.requestDeliveryTo=requestDeliveryTo;

		      this.scheduledShipFrom=scheduledShipFrom;

		      this.scheduledDeliveryTo=scheduledShipTo;

		      this.scheduledDeliveryFrom=scheduledDeliveryFrom;

		      this.scheduledDeliveryTo=scheduledDeliveryTo;

		      this.appointmentPickUp=appointmentPickUp;

		      this.appointmentDelivery=appointmentDelivery;

		      this.actualPickup=actualPickup;

		      this.actualDelivery=actualDelivery;
	    	
	    }

	    public void setRequestShipFrom(String requestShipFrom){
	        this.requestShipFrom = requestShipFrom;
	    }
	    public String getRequestShipFrom(){
	        return this.requestShipFrom;
	    }
	    public void setRequestShipTo(String requestShipTo){
	        this.requestShipTo = requestShipTo;
	    }
	    public String getRequestShipTo(){
	        return this.requestShipTo;
	    }
	    public void setRequestDeliveryFrom(String requestDeliveryFrom){
	        this.requestDeliveryFrom = requestDeliveryFrom;
	    }
	    public String getRequestDeliveryFrom(){
	        return this.requestDeliveryFrom;
	    }
	    public void setRequestDeliveryTo(String requestDeliveryTo){
	        this.requestDeliveryTo = requestDeliveryTo;
	    }
	    public String getRequestDeliveryTo(){
	        return this.requestDeliveryTo;
	    }
	    public void setScheduledShipFrom(String scheduledShipFrom){
	        this.scheduledShipFrom = scheduledShipFrom;
	    }
	    public String getScheduledShipFrom(){
	        return this.scheduledShipFrom;
	    }
	    public void setScheduledShipTo(String scheduledShipTo){
	        this.scheduledShipTo = scheduledShipTo;
	    }
	    public String getScheduledShipTo(){
	        return this.scheduledShipTo;
	    }
	    public void setScheduledDeliveryFrom(String scheduledDeliveryFrom){
	        this.scheduledDeliveryFrom = scheduledDeliveryFrom;
	    }
	    public String getScheduledDeliveryFrom(){
	        return this.scheduledDeliveryFrom;
	    }
	    public void setScheduledDeliveryTo(String scheduledDeliveryTo){
	        this.scheduledDeliveryTo = scheduledDeliveryTo;
	    }
	    public String getScheduledDeliveryTo(){
	        return this.scheduledDeliveryTo;
	    }
	    public void setAppointmentPickUp(String appointmentPickUp){
	        this.appointmentPickUp = appointmentPickUp;
	    }
	    public String getAppointmentPickUp(){
	        return this.appointmentPickUp;
	    }
	    public void setAppointmentDelivery(String appointmentDelivery){
	        this.appointmentDelivery = appointmentDelivery;
	    }
	    public String getAppointmentDelivery(){
	        return this.appointmentDelivery;
	    }
	    public void setActualPickup(String actualPickup){
	        this.actualPickup = actualPickup;
	    }
	    public String getActualPickup(){
	        return this.actualPickup;
	    }
	    public void setActualDelivery(String actualDelivery){
	        this.actualDelivery = actualDelivery;
	    }
	    public String getActualDelivery(){
	        return this.actualDelivery;
	    }
//	    public static Dates fill(JSONObject jsonobj){
//	        Dates entity = new Dates();
//	        if (jsonobj.containsKey("requestShipFrom")) {
//	            entity.setRequestShipFrom(jsonobj.getString("requestShipFrom"));        
//	        }
//	        if (jsonobj.containsKey("requestShipTo")) {
//	            entity.setRequestShipTo(jsonobj.getString("requestShipTo"));        
//	        }
//	        if (jsonobj.containsKey("requestDeliveryFrom")) {
//	            entity.setRequestDeliveryFrom(jsonobj.getString("requestDeliveryFrom"));        
//	        }
//	        if (jsonobj.containsKey("requestDeliveryTo")) {
//	            entity.setRequestDeliveryTo(jsonobj.getString("requestDeliveryTo"));        
//	        }
//	        if (jsonobj.containsKey("scheduledShipFrom")) {
//	            entity.setScheduledShipFrom(jsonobj.getString("scheduledShipFrom"));        
//	        }
//	        if (jsonobj.containsKey("scheduledShipTo")) {
//	            entity.setScheduledShipTo(jsonobj.getString("scheduledShipTo"));        
//	        }
//	        if (jsonobj.containsKey("scheduledDeliveryFrom")) {
//	            entity.setScheduledDeliveryFrom(jsonobj.getString("scheduledDeliveryFrom"));        
//	        }
//	        if (jsonobj.containsKey("scheduledDeliveryTo")) {
//	            entity.setScheduledDeliveryTo(jsonobj.getString("scheduledDeliveryTo"));        
//	        }
//	        if (jsonobj.containsKey("appointmentPickUp")) {
//	            entity.setAppointmentPickUp(jsonobj.getString("appointmentPickUp"));        
//	        }
//	        if (jsonobj.containsKey("appointmentDelivery")) {
//	            entity.setAppointmentDelivery(jsonobj.getString("appointmentDelivery"));        
//	        }
//	        if (jsonobj.containsKey("actualPickup")) {
//	            entity.setActualPickup(jsonobj.getString("actualPickup"));        
//	        }
//	        if (jsonobj.containsKey("actualDelivery")) {
//	            entity.setActualDelivery(jsonobj.getString("actualDelivery"));        
//	        }
//	        return entity;
//	    }
//	    public static List<Dates> fillList(JSONArray jsonarray) {
//	        if (jsonarray == null || jsonarray.size() == 0)
//	            return null;
//	        List<Dates> olist = new ArrayList<Dates>();
//	        for (int i = 0; i < jsonarray.size(); i++) {
//	            olist.add(fill(jsonarray.getJSONObject(i)));
//	        }
//	        return olist;
//	    }
	    
	    @Override
	    public String toString()
	    {
	        return "ClassPojo [actualPickup = "+actualPickup+"; requestDeliveryFrom = "+requestDeliveryFrom+"; scheduledDeliveryTo = "+scheduledDeliveryTo+"; requestDeliveryTo = "+requestDeliveryTo+"; appointmentPickUp = "+appointmentPickUp+"; scheduledDeliveryFrom = "+scheduledDeliveryFrom+"; appointmentDelivery = "+appointmentDelivery+"; actualDelivery = "+actualDelivery+"; scheduledShipTo = "+scheduledShipTo+"; requestShipFrom = "+requestShipFrom+"; scheduledShipFrom = "+scheduledShipFrom+"; requestShipTo = "+requestShipTo+"]";
	    }
	}


