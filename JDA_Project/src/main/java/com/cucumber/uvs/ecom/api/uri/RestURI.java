package com.cucumber.uvs.ecom.api.uri;

public class RestURI {

	public String siteCoreURI(String vehicleId) {
		String uri = "/api/SellableItems('Habitat_Master," + vehicleId
		+ ",')?$expand=Components($expand=ChildComponents($expand=ChildComponents($expand=ChildComponents($expand=ChildComponents))))";
		return uri;
	}
	
}
