package com.sahabt.admincrud.dto.request;

import java.util.Objects;

import javax.validation.constraints.NotBlank;



public class HireUserRequest {

	private String identityNo;
	private FullName fullName;
	private BirthDate birthDate;
	private Photo photo;
	private Status status; // Status include main role as teacher, student
	private Contact contact;
	private Faculty faculty;
	/**
	 * @return the fullName
	 */
	public FullName getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the birthDate
	 */
	public BirthDate getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the photo
	 */
	public Photo getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	/**
	 * @return the faculty
	 */
	public Faculty getFaculty() {
		return faculty;
	}
	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	/**
	 * @return the identityNo
	 */
	public String getIdentityNo() {
		return identityNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(identityNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HireUserRequest other = (HireUserRequest) obj;
		return Objects.equals(identityNo, other.identityNo);
	}
	@Override
	public String toString() {
		return "HireUserRequest [identityNo=" + identityNo + ", fullName=" + fullName + ", birthDate=" + birthDate
				+ ", photo=" + photo + ", status=" + status + ", contact=" + contact + ", faculty=" + faculty + "]";
	}


	
}
