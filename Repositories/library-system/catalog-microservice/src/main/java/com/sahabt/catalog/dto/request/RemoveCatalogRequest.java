package com.sahabt.catalog.dto.request;

public class RemoveCatalogRequest {
	
	private int bookId;
	
	public RemoveCatalogRequest() {
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "RemoveCatalogRequest [bookId=" + bookId + "]";
	}
	
	
}
