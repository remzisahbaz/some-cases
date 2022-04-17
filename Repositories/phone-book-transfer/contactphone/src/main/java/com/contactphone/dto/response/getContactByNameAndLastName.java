package com.contactphone.dto.response;

import java.util.Objects;

public class getContactByNameAndLastName {

	private String name;
	private String lastName;
	
	
	public getContactByNameAndLastName() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(lastName, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		getContactByNameAndLastName other = (getContactByNameAndLastName) obj;
		return Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "getContactByNameAndLastName [name=" + name + ", lastName=" + lastName + "]";
	}
	
	
}
