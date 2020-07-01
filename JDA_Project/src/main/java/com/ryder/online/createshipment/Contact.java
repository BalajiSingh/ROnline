package com.ryder.online.createshipment;

public class Contact
{
    private String contactType;

    private String primaryLanguage;

    private String firstName;

    private String lastName;

    private String phone;

    private String alternatePhone;

    private String faxNumber;

    private String email;

    private String isPrimaryContact;

    
    public Contact(  String contactType,    String primaryLanguage,    String firstName,    String lastName,
     String phone,     String alternatePhone,     String faxNumber,     String email,     String isPrimaryContact) {
    	
    	
    	this.contactType=contactType;
    	this.primaryLanguage=primaryLanguage;
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.phone=phone;
    	this.alternatePhone=alternatePhone;
    	this.faxNumber=faxNumber;
    	this.email=email;
    	this.isPrimaryContact=isPrimaryContact;
    	
    }
    public void setContactType(String contactType){
        this.contactType = contactType;
    }
    public String getContactType(){
        return this.contactType;
    }
    public void setPrimaryLanguage(String primaryLanguage){
        this.primaryLanguage = primaryLanguage;
    }
    public String getPrimaryLanguage(){
        return this.primaryLanguage;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setAlternatePhone(String alternatePhone){
        this.alternatePhone = alternatePhone;
    }
    public String getAlternatePhone(){
        return this.alternatePhone;
    }
    public void setFaxNumber(String faxNumber){
        this.faxNumber = faxNumber;
    }
    public String getFaxNumber(){
        return this.faxNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setIsPrimaryContact(String isPrimaryContact){
        this.isPrimaryContact = isPrimaryContact;
    }
    public String getIsPrimaryContact(){
        return this.isPrimaryContact;
    }
//    public static Contact fill(JSONObject jsonobj){
//        Contact entity = new Contact();
//        if (jsonobj.containsKey("contactType")) {
//            entity.setContactType(jsonobj.getString("contactType"));        
//        }
//        if (jsonobj.containsKey("primaryLanguage")) {
//            entity.setPrimaryLanguage(jsonobj.getString("primaryLanguage"));        
//        }
//        if (jsonobj.containsKey("firstName")) {
//            entity.setFirstName(jsonobj.getString("firstName"));        
//        }
//        if (jsonobj.containsKey("lastName")) {
//            entity.setLastName(jsonobj.getString("lastName"));        
//        }
//        if (jsonobj.containsKey("phone")) {
//            entity.setPhone(jsonobj.getString("phone"));        
//        }
//        if (jsonobj.containsKey("alternatePhone")) {
//            entity.setAlternatePhone(jsonobj.getString("alternatePhone"));        
//        }
//        if (jsonobj.containsKey("faxNumber")) {
//            entity.setFaxNumber(jsonobj.getString("faxNumber"));        
//        }
//        if (jsonobj.containsKey("email")) {
//            entity.setEmail(jsonobj.getString("email"));        
//        }
//        if (jsonobj.containsKey("isPrimaryContact")) {
//            entity.setIsPrimaryContact(jsonobj.getString("isPrimaryContact"));        
//        }
//        return entity;
//    }
//    public static List<Contact> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Contact> olist = new ArrayList<Contact>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
    @Override
    public String toString()
    {
        return "ClassPojo [firstName = "+firstName+", lastName = "+lastName+", phone = "+phone+", alternatePhone = "+alternatePhone+", faxNumber = "+faxNumber+", contactType = "+contactType+", isPrimaryContact = "+isPrimaryContact+", primaryLanguage = "+primaryLanguage+", email = "+email+"]";
    }
}

