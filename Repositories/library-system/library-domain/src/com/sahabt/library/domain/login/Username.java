package com.sahabt.library.domain.login;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class Username {

	private String username;

	public static Username of (String username) {
		return new Username(username);
	}
	private Username(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Username other = (Username) obj;
		return Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Username [username=" + username + "]";
	}
	
	
}
