package com.sahabt.library.domain.user;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;
@ValueObject
public final class FullName {

	private final String firstName;
	private final String lastName;

	public static FullName of(String firstName,
			                  String lastName) {
		return new FullName(firstName,lastName);
		
	}
	private FullName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
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
