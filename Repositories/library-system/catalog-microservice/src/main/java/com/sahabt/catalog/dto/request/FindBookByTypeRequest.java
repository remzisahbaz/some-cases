package com.sahabt.catalog.dto.request;

import com.sahabt.library.domain.catalog.Type;

public class FindBookByTypeRequest {
	private Type type; // like novel, poem, article

	public  FindBookByTypeRequest() {
		
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FindBookByTypeRequest [type=" + type + "]";
	}
	
	
}
