package com.sahabt.kos.business.event.book;

import com.sahabt.kos.domain.book.Book;

public class BookHireEvent extends BookEvent {
	
	private final Book book;

	public BookHireEvent(Book book) {
		super(book.getIsbn());
		this.book= book;
	}

	public Book getBook() {
		return book;
	}


}
