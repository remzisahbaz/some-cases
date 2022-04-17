package com.sahabt.library.domain.admin;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public class Phone {
	private String phoneNumber;
	private PhoneType phoneType;
	private static Map<String,Phone> phoneList = new ConcurrentHashMap<>();

	public static Phone of (String phoneNumber,PhoneType phoneType) {
		
		return new Phone (phoneNumber,phoneType);
	}
	public Phone(String phoneNumber, PhoneType phoneType) {
		super();
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(phoneNumber, phoneType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(phoneNumber, other.phoneNumber) && phoneType == other.phoneType;
	}

	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", phoneType=" + phoneType + "]";
	}

}
