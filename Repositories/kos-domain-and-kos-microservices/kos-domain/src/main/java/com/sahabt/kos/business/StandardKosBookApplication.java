package com.sahabt.kos.business;

import java.util.Optional;

import com.sahabt.kos.application.BookApplication;
import com.sahabt.kos.business.event.book.BookEditEvent;
import com.sahabt.kos.business.event.book.BookFireEvent;
import com.sahabt.kos.business.event.book.BookHireEvent;
import com.sahabt.kos.domain.book.Book;
import com.sahabt.kos.domain.book.Isbn;
import com.sahabt.kos.infrastructure.BookPublisher;
import com.sahabt.kos.repository.BookRepository;

public class StandardKosBookApplication implements BookApplication {

	private BookRepository bookRepository;
	private BookPublisher bookPublisher;

	public StandardKosBookApplication(BookRepository bookRepository, BookPublisher bookPublisher) {
		this.bookRepository = bookRepository;
		this.bookPublisher = bookPublisher;
	}

	@Override
	public Optional<Book> hireBook(Book book) {
		var isbn = book.getIsbn();
		if (bookRepository.exists(isbn)) {
			return Optional.empty();
		} else {
			bookPublisher.publish(new BookHireEvent(book));
		}
		return Optional.of(bookRepository.createBook(book));

	}

	@Override
	public Optional<Book> fireBook(Isbn isbn) {
		Optional<Book> fireBook= bookRepository.deleteBook(isbn);
		fireBook.ifPresent(
				book->bookPublisher.publish(
						new BookFireEvent(book)
											)
						);
		
		return fireBook;
	
	}

	@Override
	public Optional<Book> editBook(Book book) {
		Optional<Book> editBook=bookRepository.updateBook(book);
		editBook.ifPresent(
				bk-> bookPublisher.publish(
						new BookEditEvent(bk)));
		return editBook;
	}

	@Override
	public Optional<Book> getInformationBook(Isbn isbn) {
		
		return bookRepository.getByIsbn(isbn);
	}

}
