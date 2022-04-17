package com.sahabt.kos.domain.book;

import java.util.Objects;

public class Isbn {

	private String value;

	public static Isbn valueOf(String value) {
		Objects.requireNonNull(value);

		return new Isbn(value);

	}

	private Isbn(String value) {

		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Isbn other = (Isbn) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "Isbn [value=" + value + "]";
	}

	
}
