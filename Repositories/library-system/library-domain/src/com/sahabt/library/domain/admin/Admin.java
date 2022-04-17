package com.sahabt.library.domain.admin;

import com.sahabt.library.domain.annotations.Aggregate;

@Aggregate(id="identityNo")
public class Admin {
	private IdentityNo identityNo;
	private FullName fullName;
	private BirthDate birthDate;
	private Photo photo;
	private Status status; // Status include main role as teacher, student
	private Contact contact;
	

	public Admin(Builder builder) {
		this.identityNo = builder.identityNo;
		this.fullName = builder.fullName;
		this.birthDate = builder.birthDate;
		this.photo = builder.photo;
		this.status = builder.status;
		this.contact = builder.contact;
	}

	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(IdentityNo identityNo) {
		this.identityNo = identityNo;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}


	public BirthDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public static class Builder {
		private IdentityNo identityNo;
		private FullName fullName;
		private BirthDate birthDate;
		private Photo photo;
		private Status status; // Status include main role as teacher, student
		private Contact contact; 

		public Builder identityNo(String identityNo) {
			this.identityNo = IdentityNo.of(identityNo);
			return this; 
		}

		public Builder fullName(String firstName, String lastName) {
			this.fullName = FullName.of(firstName, lastName);
			return this;
		}

		public Builder birthDate(int day, int mount, int year) {
			this.birthDate = BirthDate.of(day, mount, year);
			return this;
		}

		public Builder photo(byte[] value) {
			this.photo = Photo.of(value);
			return this;
		}

		public Builder status(String value) {
			this.status = Status.valueOf(value);
			return this;
		}

		public Builder contact(Email email, Phone phone, Address address) {
			this.contact = Contact.of(email, phone, address);
			return this; 
		}


		public Admin build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Admin(this);
		}
	}

}
