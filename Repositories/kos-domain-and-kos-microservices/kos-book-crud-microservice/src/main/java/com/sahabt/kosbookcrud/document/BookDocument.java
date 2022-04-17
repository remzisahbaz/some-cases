package com.sahabt.kosbookcrud.document;

import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

import com.sahabt.kos.domain.book.Type;

@Document(collection="books")
public class BookDocument {
	@Id
	@Indexed(unique=true)
	private String isbn;
	@NonNull
	@NotBlank
	@Min(3)
	private String title;
	@NonNull
	@NotBlank
	@Min(3)
	private String authorFirstName;
	@NonNull
	@NotBlank
	@Min(3)
	private String authorLastName;
	@NonNull
	@NotBlank
	private Type type;
	
	
	public BookDocument() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorFirstName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BookDocument))
			return false;
		BookDocument other = (BookDocument) obj;
		return Objects.equals(authorFirstName, other.authorFirstName);
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
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BookDocument [isbn=" + isbn + ", title=" + title + ", authorFirstName=" + authorFirstName
				+ ", authorLastName=" + authorLastName + ", type=" + type + "]";
	}
	
	
}
