package com.sahabt.library.applications.bussiness.event.user;

import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import com.sahabt.library.domain.user.IdentityNo;

public class UserEvent {
	private static AtomicLong counter = new AtomicLong();
	private final String eventId;
	private final ZonedDateTime dateTime;
	private final long orderId;
	private final IdentityNo identity;

	public UserEvent(IdentityNo identity) {
		eventId = UUID.randomUUID().toString();
		dateTime = ZonedDateTime.now();
		orderId = counter.getAndIncrement();
		this.identity = identity;
	}

	public String getEventId() {
		return eventId;
	}

	public ZonedDateTime getDateTime() {
		return dateTime;
	}

	public long getOrderId() {
		return orderId;
	}

	public IdentityNo getIdentity() {
		return identity;
	}

}
