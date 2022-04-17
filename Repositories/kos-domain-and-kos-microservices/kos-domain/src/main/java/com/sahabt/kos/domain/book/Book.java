package com.sahabt.kos.domain.book;

import java.util.Objects;

import com.sahabt.kos.anatation.AggregateRoot;

@AggregateRoot(id="isbn")
public class Book {
	private Isbn isbn;
	private Title title;
	private Author author;
	private Type type;
	
	private Book(Isbn isbn, Title title, Author author, Type type) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.type = type;
	}
	
	public Book(Builder builder) {
		this(builder.isbn, builder.title, builder.author, builder.type);
	}

	public Isbn getIsbn() {
		return isbn;
	}
	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
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
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", type=" + type + "]";
	}
	
/*
 * 
 * BUILDER CLASS
 * 
 * */
	public static class  Builder{
		private Isbn isbn;
		private Title title;
		private Author author;
		private Type type;
		
		public Builder isbn(String isbn) {
			this.isbn=Isbn.valueOf(isbn);
			return this;
		}
		public Builder title(String title) {
			this.title=Title.valueOf(title);
			return this;
		}
		public Builder author(String firstName, String LastName) {
			this.author=Author.of(firstName, LastName);
			return this;
		}
		public Builder type(Type type) {
			this.type=type;
			return this;
		}
		public Book build() {
			
			return new Book(this);
		}
		}
	
	
	
}
