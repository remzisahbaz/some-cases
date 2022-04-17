package com.sahabt.library.domain.booking;

import java.util.Objects;

import com.sahabt.library.domain.annotations.Aggregate;

@Aggregate(id = "bookId")
public class Booking {

	private IdentityNo identityNo;
	private BookId bookId;

	// private IsBooking isBooking;
	public Booking(Builder builder) {
		this.identityNo = builder.identityNo;
		this.bookId = builder.bookId;
	}

	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public BookId getBookId() {
		return bookId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identityNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Booking))
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(identityNo, other.identityNo);
	}

	@Override
	public String toString() {
		return "Booking [identityNo=" + identityNo + ", bookId=" + bookId + "]";
	}

	public static class Builder {
		private IdentityNo identityNo;
		private BookId bookId;

		public Builder identityNo(String identityNo) {
			this.identityNo = IdentityNo.of(identityNo);
			return this;
		}

		public Builder bookId(int bookId) {
			this.bookId = BookId.of(bookId);
			return this;
		}

		public Booking build() {
			return new Booking(this);
		}

	}

}
