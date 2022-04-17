package com.sahabt.library.domain.catalog;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class ISBN {

	private String isbn;

	public static ISBN of(String isbn) {
		return new ISBN(isbn);
	}

	private ISBN(String isbn) {
		super();
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ISBN other = (ISBN) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "ISBN [isbn=" + isbn + "]";
	}

}
