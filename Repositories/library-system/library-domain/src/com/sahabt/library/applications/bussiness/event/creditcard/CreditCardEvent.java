package com.sahabt.library.applications.bussiness.event.creditcard;

import java.util.UUID;

import com.sahabt.library.domain.creditcard.CreditCardNo;

public class CreditCardEvent {
	
	private final String eventId;
	private final CreditCardNo creditCardNo;
	
	public CreditCardEvent(String eventId, CreditCardNo creditCardNo) {
	
		this.eventId = UUID.randomUUID().toString();
		this.creditCardNo = creditCardNo;
	}


	public String getEventId() {
		return eventId;
	}

	public CreditCardNo getCreditCardNo() {
		return creditCardNo;
	}
	
	
	
}
