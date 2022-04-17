package com.sahabt.library.domain.catalog;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class Title {
	private String title;

	public static Title of(String title) {
		return new Title(title);
	}
	private Title(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
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
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Title [title=" + title + "]";
	}
	
	
}
