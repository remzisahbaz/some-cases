package com.sahabt.library.domain.creditcard;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class CVV {

	private int cvv;

	public static CVV of(int cvv) {
		return new CVV(cvv);
	}
	private CVV(int cvv) {
		super();
		this.cvv = cvv;
	}

	public int getCvv() {
		return cvv;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cvv);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CVV other = (CVV) obj;
		return cvv == other.cvv;
	}

	@Override
	public String toString() {
		return "CVV [cvv=" + cvv + "]";
	}
	
	
}
