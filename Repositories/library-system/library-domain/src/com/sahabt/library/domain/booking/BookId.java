
package com.sahabt.library.domain.booking;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class BookId {

	private int bookId;

	public static BookId of(int bookId) {
		return new BookId(bookId);
	}

	private BookId(int bookId) {
		super();
		this.bookId = bookId;
	}

	public int getBookId() {
		return bookId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookId other = (BookId) obj;
		return bookId == other.bookId;
	}

	@Override
	public String toString() {
		return "BookId [bookId=" + bookId + "]";
	}

}
