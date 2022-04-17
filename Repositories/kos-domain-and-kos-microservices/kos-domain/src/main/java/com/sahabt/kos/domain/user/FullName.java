package com.sahabt.kos.domain.user;

import java.util.Objects;

public class FullName {

	private final String firstName;
	private final String lastName;
	
	private FullName(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public static FullName of(String firstName, String lastName) {
			Objects.requireNonNull(lastName);
			Objects.requireNonNull(firstName);
			
			if(!firstName.matches("^[a-z]{3,}$")) {throw new IllegalArgumentException("Bu isim alanı hatalı !");}
			if(!lastName.matches("^[a-z]{2,}$")) {throw new IllegalArgumentException("Bu soayad alanı hatalı !");}
			
		
		return new FullName(firstName,lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		lastName = lastName;
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
		FullName other = (FullName) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
}
