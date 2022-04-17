package com.sahabt.kos.domain.user;

import java.util.Objects;

import com.sahabt.kos.anatation.AggregateRoot;

@AggregateRoot(id="identity")
public final class User {

	private Identity identity;
	private FullName fullName;
	private Status status;
	
	

	public User(Builder builder) {
		this.identity = builder.identity;
		this.fullName = builder.fullName;
		this.status = builder.status;
	}

	public User(Identity identity, FullName fullName, Status status) {
		this.identity = identity;
		this.fullName = fullName;
		this.status = status;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(identity, other.identity);
	}

	@Override
	public String toString() {
		return "User [identity=" + identity + ", FullName=" + fullName + ", status=" + status + "]";
	}

	public static class Builder {
		private Identity identity;
		private FullName fullName;
		private Status status;

		public Builder(Identity identity) {
			this.identity = identity;
		}

		public Builder identity(String identity) {
			this.identity = Identity.valueOf(identity);
			return this;
		}

		public Builder fullName(String firstName, String lastName) {
			this.fullName = FullName.of(firstName, lastName);
			return this;
		}

		public Builder Status(Status status) {
			this.status = status;
			return this;
		}

		public User build() {

			return new User(this);
		}

	}

}