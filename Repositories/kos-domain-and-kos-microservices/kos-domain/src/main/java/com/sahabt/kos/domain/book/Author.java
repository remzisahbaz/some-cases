package com.sahabt.kos.domain.book;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class Author {

	private String firstName;
	private String lastName;
	private final static Map<String, Author> cache = new ConcurrentHashMap<>();
	private static Map<String, Author> authorList = new HashMap<>();

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static Author of(String firstName, String lastName) {
		Objects.requireNonNull(lastName);
		Objects.requireNonNull(firstName);

		if (!firstName.matches("^[a-z]{3,}$")) {
			throw new IllegalArgumentException("Bu isim alanı hatalı !");
		}
		if (!lastName.matches("^[a-z]{2,}$")) {
			throw new IllegalArgumentException("Bu soayad alanı hatalı !");
		}

		var firstLastName = firstName + "" + lastName;
		var newCache = cache.get(firstLastName);
		
		if (!Objects.isNull(newCache)) {
			newCache = new Author(firstName, lastName);
			cache.put(firstLastName, newCache);
			authorList.put(firstLastName, newCache);
		}
		return authorList.put(firstLastName, newCache);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
