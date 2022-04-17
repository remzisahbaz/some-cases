package com.sahabt.library.domain.login;

import com.sahabt.library.domain.annotations.Aggregate;
import com.sahabt.library.domain.user.IdentityNo;

@Aggregate(id ="identityNo")
public class Login {

	private final IdentityNo identityNo;
	private final Username username;
	private Password password;

	private Login(Builder builder) {
		this.identityNo = builder.identityNo;
		this.username = builder.username;
		this.password = builder.password;

	}

	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public Username getUsername() {
		return username;
	}

	public Password getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "LoginEvent [identityNo=" + identityNo + ", username=" + username + ", password=" + password + "]";
	}

	public void setPassword(Password password) {
		this.password = password;
	}

public static class Builder {
		private IdentityNo identityNo;
		private Username username;
		private Password password;

		public Builder identityNo(String identityNo) {
			this.identityNo = IdentityNo.of(identityNo);
			return this;
		}

		public Builder username(String username) {
			this.username = Username.of(username);
			return this;
		}

		public Builder password(String password) {
			this.password = Password.of(password);
			return this;
		}

		public Login build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Login(this);
		}
	}
}