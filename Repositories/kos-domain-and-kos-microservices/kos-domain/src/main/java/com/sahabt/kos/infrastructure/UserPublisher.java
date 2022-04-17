package com.sahabt.kos.infrastructure;

import com.sahabt.kos.business.event.book.BookEvent;

public interface UserPublisher {

	void publish(BookEvent event);
}
