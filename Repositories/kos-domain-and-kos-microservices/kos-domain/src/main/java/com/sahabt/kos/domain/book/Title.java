package com.sahabt.kos.domain.book;

import java.util.Objects;

public class Title {

	private String value;

	private Title(String value) {
		this.value = value;
	}

	public static Title valueOf(String value) {
		Objects.requireNonNull(value);
		return new Title(value);
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
		Title other = (Title) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "Title [value=" + value + "]";
	}
}
