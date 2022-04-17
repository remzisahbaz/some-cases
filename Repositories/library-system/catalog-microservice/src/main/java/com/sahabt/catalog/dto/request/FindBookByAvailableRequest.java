package com.sahabt.catalog.dto.request;

import com.sahabt.library.domain.catalog.Periodical;

public class FindBookByAvailableRequest {

	private Periodical periodical; 
	
	public FindBookByAvailableRequest() {
		
	}

	public Periodical getPeriodical() {
		return periodical;
	}

	public void setPeriodical(Periodical periodical) {
		this.periodical = periodical;
	}

	@Override
	public String toString() {
		return "FindBookByAvailableRequest [periodical=" + periodical + "]";
	}
	
	
}
