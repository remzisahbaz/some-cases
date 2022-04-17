package com.sahabt.catalog.dto.request;

import com.sahabt.library.domain.catalog.UseTarget;

public class FindBookByUseTargetRequest {

	private UseTarget useTarget;
	
	public FindBookByUseTargetRequest() {
		
	}

	public UseTarget getUseTarget() {
		return useTarget;
	}

	public void setUseTarget(UseTarget useTarget) {
		this.useTarget = useTarget;
	}

	@Override
	public String toString() {
		return "FindBookByUseTargetRequest [useTarget=" + useTarget + "]";
	}
	
	
}
