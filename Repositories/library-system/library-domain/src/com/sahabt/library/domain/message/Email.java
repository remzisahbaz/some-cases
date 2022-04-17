package com.sahabt.library.domain.message;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class Email {
	private String email;
	private EmailType emailType;
  
	public static Email of(String email, EmailType emailType) {
		
		return  new Email(email,emailType);
	}

	private Email(String email, EmailType emailType) {
		super();
		this.email = email;
		this.emailType = emailType;
	}

	public String getEmail() {
		return email; 
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmailType getEmailType() {
		return emailType;
	}

	public void setEmailType(EmailType emailType) {
		this.emailType = emailType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, emailType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		return Objects.equals(email, other.email) && emailType == other.emailType;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + ", emailType=" + emailType + "]";
	}

	
}
