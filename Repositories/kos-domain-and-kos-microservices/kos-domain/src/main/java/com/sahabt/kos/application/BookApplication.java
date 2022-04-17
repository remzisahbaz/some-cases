package com.sahabt.kos.application;

import java.util.Optional;

import com.sahabt.kos.anatation.Application;
import com.sahabt.kos.domain.book.Book;
import com.sahabt.kos.domain.book.Isbn;
@Application(name="book")
public interface BookApplication {

	Optional<Book> hireBook(Book book);
	Optional<Book> fireBook(Isbn isbn);
	Optional<Book> editBook(Book book);
	Optional<Book> getInformationBook(Isbn isbn);
}
