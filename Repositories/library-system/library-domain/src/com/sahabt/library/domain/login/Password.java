package com.sahabt.library.domain.login;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public class Password {

	private String password;

	public static Password of (String password) {
		return new Password(password);
	}
	private Password(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Password other = (Password) obj;
		return Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "Password [password=" + password + "]";
	}
	
	
}
