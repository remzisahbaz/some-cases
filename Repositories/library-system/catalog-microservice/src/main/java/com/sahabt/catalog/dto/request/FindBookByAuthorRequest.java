package com.sahabt.catalog.dto.request;

import com.sahabt.library.domain.catalog.Author;

public class FindBookByAuthorRequest {

	private Author author;
	
	public FindBookByAuthorRequest() {
		
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "FindBookByAuthorRequest [author=" + author + "]";
	}
	
	
}
