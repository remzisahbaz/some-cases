package com.sahabt.catalog.dto.request;

import java.util.Arrays;

import com.sahabt.library.domain.catalog.Author;
import com.sahabt.library.domain.catalog.Available;
import com.sahabt.library.domain.catalog.Language;
import com.sahabt.library.domain.catalog.Periodical;
import com.sahabt.library.domain.catalog.PublishDate;
import com.sahabt.library.domain.catalog.Topic;
import com.sahabt.library.domain.catalog.Type;
import com.sahabt.library.domain.catalog.UseTarget;

public class AddCatalogRequest {
	
	private int bookId;
	private byte[] cover;
	private String isbn;
	private String title;
	private Author author;
	private int numberOfPages;
	private PublishDate publishDate;
	private String publishingHouseName;
	private Language language;
	private Type type; // like novel, poem, article
	private Topic topic; // like history, sience,
	private UseTarget useTarget; // lesson or daily
	private Periodical periodical; // Limited or unlimeted
	private Available available;
	
	public AddCatalogRequest() {
		
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public byte[] getCover() {
		return cover;
	}
	public void setCover(byte[] cover) {
		this.cover = cover;
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
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public PublishDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(PublishDate publishDate) {
		this.publishDate = publishDate;
	}
	public String getPublishingHouseName() {
		return publishingHouseName;
	}
	public void setPublishingHouseName(String publishingHouseName) {
		this.publishingHouseName = publishingHouseName;
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
	public Available getAvailable() {
		return available;
	}
	public void setAvailable(Available available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "AddCatalogRequest [bookId=" + bookId + ", cover=" + Arrays.toString(cover) + ", isbn=" + isbn
				+ ", title=" + title + ", author=" + author + ", numberOfPages=" + numberOfPages + ", publishDate="
				+ publishDate + ", publishingHouseName=" + publishingHouseName + ", language=" + language + ", type="
				+ type + ", topic=" + topic + ", useTarget=" + useTarget + ", periodical=" + periodical + ", available="
				+ available + "]";
	}
	
	
}
