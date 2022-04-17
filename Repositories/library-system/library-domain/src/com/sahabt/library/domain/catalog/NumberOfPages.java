package com.sahabt.library.domain.catalog;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class NumberOfPages {
	private int numberOfPages;

	public static NumberOfPages of(int numberOfPages) {
		return new NumberOfPages(numberOfPages);
	}
	private NumberOfPages(int numberOfPages) {
		super();
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numberOfPages);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberOfPages other = (NumberOfPages) obj;
		return numberOfPages == other.numberOfPages;
	}

	@Override
	public String toString() {
		return "NumberOfPages [numberOfPages=" + numberOfPages + "]";
	}
	
	
}
