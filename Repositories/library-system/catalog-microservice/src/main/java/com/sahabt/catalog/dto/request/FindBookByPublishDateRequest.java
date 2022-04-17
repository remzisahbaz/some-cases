package com.sahabt.catalog.dto.request;

import com.sahabt.library.domain.catalog.PublishDate;

public class FindBookByPublishDateRequest {

	private PublishDate publishDate;
	
	public FindBookByPublishDateRequest() {
		
	}

	public PublishDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(PublishDate publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "FindBookByPublishDateRequest [publishDate=" + publishDate + "]";
	}
	
}
