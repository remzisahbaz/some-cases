package com.sahabt.library.domain.borrow;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class BorrowCounter {
	private int borrowCounter;

	public static BorrowCounter of (int borrowCounter) {
		return new BorrowCounter(borrowCounter);
	}
	private BorrowCounter(int borrowCounter) {
		super();
		this.borrowCounter = borrowCounter;
	}

	public int getBorrowCounter() {
		return borrowCounter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(borrowCounter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BorrowCounter other = (BorrowCounter) obj;
		return borrowCounter == other.borrowCounter;
	}

	@Override
	public String toString() {
		return "BorrowCounter [borrowCounter=" + borrowCounter + "]";
	}
	
	
}
