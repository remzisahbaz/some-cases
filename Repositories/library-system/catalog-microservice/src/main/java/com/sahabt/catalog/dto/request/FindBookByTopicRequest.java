package com.sahabt.catalog.dto.request;

import com.sahabt.library.domain.catalog.Topic;

public class FindBookByTopicRequest {

	private Topic topic; 
	public FindBookByTopicRequest() {
		
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "FindBookByTopicRequest [topic=" + topic + "]";
	}
	
	
}
