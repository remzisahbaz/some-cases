package com.sahabt.library.domain.user;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;
@ValueObject
public class Contact {
	private Email  email;
	private Phone  phone;
	private Address address;
	
	public static Contact of (Email email,Phone phone,Address address) {
		return new Contact(email,phone,address);
	}
	private Contact(Email email, Phone phone, Address address) {
		this.email = email;
		this.phone = phone;
		this.address = address; 
	}
	public Email getEmail() {
		return email;
	}
	public Phone getPhone() {
		return phone;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, email, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(phone, other.phone);
	}
	@Override
	public String toString() {
		return "Contact [email=" + email + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}
