package com.sahabt.library.domain.catalog;

import com.sahabt.library.domain.annotations.Aggregate;

@Aggregate(id = "bookId")
public class Catalog {
	private BookId bookId;
	private Cover cover;
	private ISBN isbn;
	private Title title;
	private Author author;
	private NumberOfPages numberOfPages;
	private PublishDate publishDate;
	private PublishingHouse publishingHouse;
	private Language language;
	private Type type; // like novel, poem, article
	private Topic topic; // like history, sience,
	private UseTarget useTarget; // lesson or daily
	private Periodical periodical; // Limited or unlimeted
	private Available available;

	
	public Catalog(Builder builder) {
		this.bookId =builder.bookId;
		this.cover = builder.cover;
		this.isbn = builder.isbn;
		this.title = builder.title;
		this.author = builder.author;
		this.numberOfPages = builder.numberOfPages;
		this.publishDate = builder.publishDate;
		this.publishingHouse = builder.publishingHouse;
		this.language = builder.language;
		this.type = builder.type;
		this.topic = builder.topic;
		this.useTarget = builder.useTarget;
		this.periodical = builder.periodical;
		this.available = builder.available;
	}


	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
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

	public NumberOfPages getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(NumberOfPages numberOfPages) {
		this.numberOfPages = numberOfPages;
	}



	public PublishDate getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(PublishDate publishDate) {
		this.publishDate = publishDate;
	}


	public void setBookId(BookId bookId) {
		this.bookId = bookId;
	}


	public void setIsbn(ISBN isbn) {
		this.isbn = isbn;
	}


	public PublishingHouse getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(PublishingHouse publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public UseTarget getUseTarget() {
		return useTarget;
	}

	public void setUseTarget(UseTarget useTarget) {
		this.useTarget = useTarget;
	}

	public Periodical getPeriodical() {
		return periodical;
	}

	public void setPeriodical(Periodical periodical) {
		this.periodical = periodical;
	}

	public BookId getBookId() {
		return bookId;
	}

	public ISBN getIsbn() {
		return isbn;
	}

	public Available getAvailable() {
		return available;
	}

	public void setAvailable(Available available) {
		this.available = available;
	}

	public static class Builder {
		private BookId bookId;
		private Cover cover;
		private ISBN isbn;
		private Title title;
		private Author author;
		private NumberOfPages numberOfPages;
		private PublishDate publishDate;
		private PublishingHouse publishingHouse;
		private Language language;
		private Type type;
		private Topic topic;
		private UseTarget useTarget;
		private Periodical periodical;
		private Available available;
		
		

		public Builder bookId(int value) {
			this.bookId = BookId.of(value);
			return this;
		}

		public Builder cover(byte[] cover) {
			this.cover = Cover.of(cover);
			return this;
		}

		public Builder isbn(String value) {
			this.isbn = ISBN.of(value);
			return this;
		}

		public Builder title(String value) {
			this.title = Title.of(value);
			return this;
		}

		public Builder author(String firstName, String lastName) {
			this.author = Author.of(firstName, lastName);
			return this;
		}

		public Builder numberOfPages(int value) {
			this.numberOfPages = NumberOfPages.of(value);
			return this;
		}

		public Builder publishDate(int day,
								   int mounth,
								   int year) {
			this.publishDate = PublishDate.of(day,mounth,year);
			return this;
		}

		public Builder publishingHouse(String value) {
			this.publishingHouse = PublishingHouse.of(value);
			return this;
		}

		public Builder language(String value) {
			this.language = Language.valueOf(value);
			return this;
		}

		public Builder topic(String value) {
			this.topic = Topic.valueOf(value);
			return this;
		}

		public Builder type(String value) {
			this.type = Type.valueOf(value);
			return this;
		}
		public Builder useTarget(String value) {
			this.useTarget = UseTarget.valueOf(value);
			return this;
		}

		public Builder periodical(String value) {
			this.periodical = Periodical.valueOf(value);
			return this;
		}

		public Builder available(String value) {
			this.available = Available.valueOf(value);
			return this;
		}

		public Catalog build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Catalog(this);
		}
	}
}
