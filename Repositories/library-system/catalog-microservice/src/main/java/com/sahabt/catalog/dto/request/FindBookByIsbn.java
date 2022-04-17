package com.sahabt.catalog.dto.request;

public class FindBookByIsbn {
	private String isbn;

	public FindBookByIsbn() {

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "FindBookByIsbn [isbn=" + isbn + "]";
	}

}
