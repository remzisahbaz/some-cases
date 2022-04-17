package com.sahabt.kos.repository;

import java.util.Optional;

import com.sahabt.kos.domain.book.Book;
import com.sahabt.kos.domain.book.Isbn;
import com.sahabt.kos.domain.user.Identity;

public interface BookRepository {

	boolean exists (Isbn isbn);
	Book createBook(Book book);
	Optional<Book> deleteBook(Isbn isbn);
	Optional<Book> updateBook(Book book);
	Optional<Book> getByIsbn(Isbn isbn);
}
