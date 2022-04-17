package com.sahabt.kos.business.event.book;

import com.sahabt.kos.domain.book.Book;
import com.sahabt.kos.domain.book.Isbn;

public class BookEditEvent extends BookEvent{

	private final Book book;

	public BookEditEvent(Book book) {
		super(book.getIsbn());
		this.book=book;
	}

	public Book getBook() {
		return book;
	}

}
