package com.sahabt.catalog.dto.request;

import com.sahabt.library.domain.catalog.Periodical;

public class FindBookByPeriodicalRequest {

	private Periodical periodical; 
	
	public FindBookByPeriodicalRequest() {
		
	}

	public Periodical getPeriodical() {
		return periodical;
	}

	public void setPeriodical(Periodical periodical) {
		this.periodical = periodical;
	}

	@Override
	public String toString() {
		return "FindBookByPeriodicalRequest [periodical=" + periodical + "]";
	}
	
	
}
