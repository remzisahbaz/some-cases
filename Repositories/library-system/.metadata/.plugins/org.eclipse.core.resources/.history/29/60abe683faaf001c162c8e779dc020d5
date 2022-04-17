package com.sahabt.library.domain.user;

import com.sahabt.library.domain.annotations.Aggregate;

@Aggregate(id ="identityNo")
public class User {
	private IdentityNo identityNo;
	private FullName fullName;
	private BirthDate birthDate;
	private Photo photo;
	private Status status; // Status include main role as teacher, student
	private Contact contact;
	private Faculty faculty;

	public User(Builder builder) {
		this.identityNo = builder.identityNo;
		this.fullName = builder.fullName;
		this.birthDate = builder.birthDate;
		this.photo = builder.photo;
		this.status = builder.status;
		this.contact = builder.contact;
		this.faculty = builder.faculty;
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

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
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
		private Faculty faculty;

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

		public Builder faculty(String facultyName, int foundationYear) {
			this.faculty = Faculty.of(facultyName, foundationYear);
			return this;
		}

		public User build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new User(this);
		}
	}

}
