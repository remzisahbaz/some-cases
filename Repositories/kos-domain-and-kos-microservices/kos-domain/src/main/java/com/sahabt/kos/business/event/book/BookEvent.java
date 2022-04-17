package com.sahabt.kos.business.event.book;

import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import com.sahabt.kos.domain.book.Isbn;
import com.sahabt.kos.domain.user.Identity;

public class BookEvent {

	private static AtomicLong counter= new AtomicLong();
	private final String eventId;
	private final ZonedDateTime dateTime;
	private final long orderId;
	private final Isbn isbn;
	
	public BookEvent(Isbn isbn) {
		this.eventId = UUID.randomUUID().toString();
		this.dateTime = ZonedDateTime.now();
		this.orderId = counter.getAndIncrement();
		this.isbn = isbn;
	}

	public static AtomicLong getCounter() {
		return counter;
	}

	public static void setCounter(AtomicLong counter) {
		BookEvent.counter = counter;
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

	public Isbn getIsbn() {
		return isbn;
	}


	
}
