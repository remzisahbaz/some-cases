package com.sahabt.kosbookcrud.config;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sahabt.kos.domain.book.Book;
import com.sahabt.kosbookcrud.document.BookDocument;
import com.sahabt.kosbookcrud.dto.request.HireBookRequest;
import com.sahabt.kosbookcrud.dto.response.BookResponse;

@Configuration
public class ModelMapperConfig {

	private static final Converter<HireBookRequest, Book> HIRE_BOOK_REQUEST_TO_BOOK_CONVERTER = (context) -> {
		var request = context.getSource();

		return new Book.Builder().isbn(request.getIsbn()).title(request.getTitle())
				.author(request.getAuthorFirstName(), request.getAuthorLastName()).type(request.getType()).build();
	};

	private static final Converter<BookDocument, Book> BOOK_DOCUMENT_TO_BOOK_CONVERTER = (context) -> {

		var request = context.getSource();
		return new Book.Builder().isbn(request.getIsbn()).title(request.getTitle())
				.author(request.getAuthorFirstName(), request.getAuthorLastName()).type(request.getType()).build();

	};
	private static final Converter<Book, BookResponse> BOOK_TO_BOOK_RESPONSE_CONVERTER = (context) -> {

		var book = context.getSource();
		var fullName = book.getAuthor();
		var response = new BookResponse();

		response.setIsbn(book.getIsbn().getValue());
		response.setTitle(book.getTitle().getValue());
		response.setAuthorFirstName(fullName.getFirstName());
		response.setAuthorLastName(fullName.getLastName());
		response.setType(book.getType());

		return response;
	};
	private static final Converter<Book, BookDocument> BOOK_TO_BOOK_DOCUMENT_CONVERTER = (context) -> {

		var book = context.getSource();
		var fullName = book.getAuthor();
		var document = new BookDocument();

		document.setIsbn(book.getIsbn().getValue());
		document.setTitle(book.getTitle().getValue());
		document.setAuthorFirstName(fullName.getFirstName());
		document.setAuthorLastName(fullName.getLastName());
		document.setType(book.getType());

		return document;

	};

	@Bean
	public ModelMapper modelMapper() {
		var model= new ModelMapper();
		model.addConverter(HIRE_BOOK_REQUEST_TO_BOOK_CONVERTER ,HireBookRequest.class,Book.class);
		model.addConverter(BOOK_DOCUMENT_TO_BOOK_CONVERTER ,BookDocument.class,Book.class);
		model.addConverter(BOOK_TO_BOOK_RESPONSE_CONVERTER ,Book.class,BookResponse.class);
		model.addConverter(BOOK_TO_BOOK_DOCUMENT_CONVERTER ,Book.class,BookDocument.class);
		
		return model;
	}
}
