package com.sahabt.library.domain.creditcard;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class CreditCardNo {
	private String crediCardNo;

	public static CreditCardNo of (String crediCardNo) {
		return new CreditCardNo(crediCardNo);
	}
	private CreditCardNo(String crediCardNo) {
		super();
		this.crediCardNo = crediCardNo;
	}

	public String getCrediCardNo() {
		return crediCardNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(crediCardNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCardNo other = (CreditCardNo) obj;
		return Objects.equals(crediCardNo, other.crediCardNo);
	}

	@Override
	public String toString() {
		return "CrediCardNo [crediCardNo=" + crediCardNo + "]";
	}
	
}
