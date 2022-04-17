package com.contactphone.dto.response;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.contactphone.entity.Phone;

public class AddContactResponse {

	private String name;
	private String lastName;
	private Set<Phone> phone;
	
	
	
	/**
	 * @return the phone
	 */
	public Set<Phone> getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Set<Phone> phone) {
		this.phone = phone;
	}
	/**
	

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 */
	public AddContactResponse() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(lastName, name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddContactResponse other = (AddContactResponse) obj;
		return Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}
	@Override
	public String toString() {
		return "{ name=" + name + ", lastName=" + lastName + ", phone=[" + phone + "]}";
	}
	
}
