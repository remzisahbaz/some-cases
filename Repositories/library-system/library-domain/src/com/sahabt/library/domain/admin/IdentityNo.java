package com.sahabt.library.domain.admin;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class IdentityNo {
	private final String identityNo;

	public static IdentityNo of(String identityNo) {
		return new IdentityNo(identityNo);
		
	}
	private IdentityNo(String identityNo) {
		super();
		this.identityNo = identityNo;
	}

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
		IdentityNo other = (IdentityNo) obj;
		return Objects.equals(identityNo, other.identityNo);
	}

	@Override
	public String toString() {
		return "IdentityNo [identityNo=" + identityNo + "]";
	}
	
	
}
