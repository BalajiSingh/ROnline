package com.ryder.online.test.testdata;

public class RestURI {

	public String siteCoreURI(String vehicleId) {
		String uri = "/api/SellableItems('UsedVehicles," + vehicleId
		+ ",')?$expand=Components($expand=ChildComponents($expand=ChildComponents($expand=ChildComponents($expand=ChildComponents))))";
		return uri;
	}
	
}
