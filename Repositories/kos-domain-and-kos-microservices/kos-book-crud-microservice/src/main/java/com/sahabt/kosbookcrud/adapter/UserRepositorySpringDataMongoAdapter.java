package com.sahabt.kosbookcrud.adapter;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.sahabt.kos.domain.book.Book;
import com.sahabt.kos.domain.book.Isbn;
import com.sahabt.kos.repository.BookRepository;
import com.sahabt.kosbookcrud.document.BookDocument;

@Component
public class UserRepositorySpringDataMongoAdapter implements BookRepository{

	private BookDocument bookDocument;
	private ModelMapper modelMapper;
	
	/**
	 * @param bookDocument
	 * @param modelMapper
	 */
	public UserRepositorySpringDataMongoAdapter(BookDocument bookDocument, ModelMapper modelMapper) {
		this.bookDocument = bookDocument;
		this.modelMapper = modelMapper;
	}

	@Override
	public boolean exists(Isbn isbn) {
		//bookDocument.x;
		return false;
	}

	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> deleteBook(Isbn isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> getByIsbn(Isbn isbn) {
		// TODO Auto-generated method stub
		return null;
	}

}
