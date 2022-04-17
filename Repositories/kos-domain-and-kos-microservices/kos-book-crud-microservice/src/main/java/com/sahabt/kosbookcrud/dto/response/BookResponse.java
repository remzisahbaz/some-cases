package com.sahabt.kosbookcrud.dto.response;


import java.util.Objects;

import com.sahabt.kos.domain.book.Type;

public class BookResponse {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	private Type type;
	
	public BookResponse() {
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorlastName) {
		this.authorLastName = authorlastName;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BookResponse))
			return false;
		BookResponse other = (BookResponse) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "HireBookRequest [isbn=" + isbn + ", title=" + title + ", authorFirstName=" + authorFirstName
				+ ", authorlastName=" + authorLastName + ", type=" + type + "]";
	}

	
	
}
