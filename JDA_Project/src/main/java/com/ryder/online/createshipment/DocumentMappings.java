package com.ryder.online.createshipment;

import java.util.List;

public class DocumentMappings {
//	private String[] documentMap;
	private List<String> documentMap;
    
	public DocumentMappings(List<String> documentMap) {
		this.documentMap=documentMap;
	}
//	public String[] getDocumentMap ()
//    {
//        return documentMap;
//    }
//
//    public void setDocumentMap (String[] documentMap)
//    {
//        this.documentMap = documentMap;
//    }

    @Override
    public String toString()
    {
        return "ClassPojo [documentMap = "+documentMap+"]";
    }
    
//    private List<String> documentMap;

    public void setDocumentMap(List<String> documentMap){
        this.documentMap = documentMap;
    }
    public List<String> getDocumentMap(){
        return this.documentMap;
    }
//    public static DocumentMappings fill(JSONObject jsonobj){
//        DocumentMappings entity = new DocumentMappings();
//        if (jsonobj.containsKey("documentMap")) {
//            entity.setDocumentMap(jsonobj.getJSONArray("documentMap"));        
//        }
//        return entity;
//    }
//    public static List<DocumentMappings> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<DocumentMappings> olist = new ArrayList<DocumentMappings>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
}
