package com.sahabt.library.domain.borrow;

import com.sahabt.library.domain.annotations.Aggregate;
import com.sahabt.library.domain.user.IdentityNo;

@Aggregate(id = "")
public class Borrow {

	private IdentityNo identityNo;
	private BookId bookId;
	private Deadline deadline;
	private Delivery date;
	private Punishment punishment;
	private BorrowCounter borrowCounter;

	public Borrow(Builder builder) {
		this.identityNo = builder.identityNo;
		this.bookId = builder.bookId;
		this.deadline = builder.deadline;
		this.date = builder.date;
		this.punishment = builder.punishment;
		this.borrowCounter = builder.borrowCounter;
	}

	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(IdentityNo identityNo) {
		this.identityNo = identityNo;
	}


	public BookId getBookId() {
		return bookId;
	}

	public void setBookId(BookId bookId) {
		this.bookId = bookId;
	}

	public Deadline getDeadline() {
		return deadline;
	}

	public void setDeadline(Deadline deadline) {
		this.deadline = deadline;
	}

	public Delivery getDate() {
		return date;
	}

	public void setDate(Delivery date) {
		this.date = date;
	}

	public Punishment getPunishment() {
		return punishment;
	}

	public void setPunishment(Punishment punishment) {
		this.punishment = punishment;
	}

	public BorrowCounter getBorrowCounter() {
		return borrowCounter;
	}

	public void setBorrowCounter(BorrowCounter borrowCounter) {
		this.borrowCounter = borrowCounter;
	}

	public static class Builder {
		private IdentityNo identityNo;
		private BookId bookId;
		private Deadline deadline;
		private Delivery date;
		private Punishment punishment;
		private BorrowCounter borrowCounter;

		public Builder identityNo(String identityNo) {
			this.identityNo = IdentityNo.of(identityNo);
			return this;
		}

		public Builder bookId(int bookId) {
			this.bookId = BookId.of(bookId);
			return this;
		}

		public Builder deadline(int day, int mount, int year) {
			this.deadline = Deadline.of(day, mount, year);
			return this;
		}

		public Builder date(int day, int mount, int year) {
			this.date = Delivery.of(day, mount, year);
			return this;
		}

		public Builder punishment(int punishmentAmount) {
			this.punishment = Punishment.of(punishmentAmount);
			return this;
		}

		public Builder borrowCounter(int borrowCounter) {
			this.borrowCounter = BorrowCounter.of(borrowCounter);
			return this;
		}

		public Borrow build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Borrow(this);
		}
	}

}
