package com.sahabt.catalog.dto.request;

public class FindBookByPublishigHouseRequest {

	private String publishingHouseName;
	
	public FindBookByPublishigHouseRequest() {
		
	}

	public String getPublishingHouseName() {
		return publishingHouseName;
	}

	public void setPublishingHouseName(String publishingHouseName) {
		this.publishingHouseName = publishingHouseName;
	}

	@Override
	public String toString() {
		return "FindBookByPublishigHouseRequest [publishingHouseName=" + publishingHouseName + "]";
	}
	
	
}
