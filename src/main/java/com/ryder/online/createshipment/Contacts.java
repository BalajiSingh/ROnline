package com.ryder.online.createshipment;

import java.util.List;

public class Contacts
{
    private List<Contact> contact;

    
    public Contacts(List<Contact> contact) {
    	this.contact=contact;
    	
    }
    public void setContact(List<Contact> contact){
        this.contact = contact;
    }
    public List<Contact> getContact(){
        return this.contact;
    }
//    public static Contacts fill(JSONObject jsonobj){
//        Contacts entity = new Contacts();
//        if (jsonobj.containsKey("contact")) {
//            entity.setContact(jsonobj.getJSONArray("contact"));        
//        }
//        return entity;
//    }
//    public static List<Contacts> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<Contacts> olist = new ArrayList<Contacts>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
    
    
    @Override
    public String toString()
    {
        return "ClassPojo [contact = "+contact+"]";
    }
}
