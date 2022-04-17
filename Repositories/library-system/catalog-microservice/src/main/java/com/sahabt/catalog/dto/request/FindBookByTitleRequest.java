package com.sahabt.catalog.dto.request;

public class FindBookByTitleRequest {
	private String title;
	
	public FindBookByTitleRequest() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "FindBookByTitleRequest [title=" + title + "]";
	}
	
	
}
