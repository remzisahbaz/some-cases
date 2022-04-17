package com.sahabt.kosbookcrud.dto.request;

import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

import com.sahabt.kos.domain.book.Type;

public class HireBookRequest {
	private String isbn;

	private String title;

	private String authorFirstName;

	private String authorLastName;

	private Type type;

	public HireBookRequest() {
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
		if (!(obj instanceof HireBookRequest))
			return false;
		HireBookRequest other = (HireBookRequest) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "HireBookRequest [isbn=" + isbn + ", title=" + title + ", authorFirstName=" + authorFirstName
				+ ", authorlastName=" + authorLastName + ", type=" + type + "]";
	}

}
