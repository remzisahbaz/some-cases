package com.sahabt.kos.business.event.user;

import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import com.sahabt.kos.business.event.book.BookEvent;
import com.sahabt.kos.domain.book.Isbn;
import com.sahabt.kos.domain.user.Identity;

public class UserEvent {

	private static AtomicLong counter= new AtomicLong();
	private final String eventId;
	private final ZonedDateTime dateTime;
	private final long orderId;
	private final Identity identity;
	
	public UserEvent(Identity identity) {
		this.eventId = UUID.randomUUID().toString();
		this.dateTime = ZonedDateTime.now();
		this.orderId = counter.getAndIncrement();
		this.identity = identity;
	}

	public static AtomicLong getCounter() {
		return counter;
	}

	public static void setCounter(AtomicLong counter) {
		UserEvent.counter = counter;
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

	public Identity getIdentity() {
		return identity;
	}


	
}
