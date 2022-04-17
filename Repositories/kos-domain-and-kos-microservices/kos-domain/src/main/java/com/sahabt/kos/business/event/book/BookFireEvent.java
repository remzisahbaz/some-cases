package com.sahabt.kos.business.event.book;

import com.sahabt.kos.domain.book.Book;
import com.sahabt.kos.domain.book.Isbn;

public class BookFireEvent extends BookEvent{

	private final Book book;

	public BookFireEvent(Book book) {
		super(book.getIsbn());
		this.book=book;
	}

	public Book getBook() {
		return book;
	}

}
