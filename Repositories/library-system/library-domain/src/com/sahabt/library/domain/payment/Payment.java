package com.sahabt.library.domain.payment;

import com.sahabt.library.domain.annotations.Aggregate;
import com.sahabt.library.domain.creditcard.CreditCard;

@Aggregate(id = "identityNo")
public final class Payment {

	private IdentityNo identityNo;
	private FullName fullName;
	private CreditCard creditCard;
	private ProcessType processType;// this class enum who include punishment etc.

	public Payment(Builder builder) {
		this.identityNo = builder.identityNo;
		this.fullName = builder.fullName;
		this.creditCard = builder.creditCard;
		this.processType = builder.processType;

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

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public ProcessType getProcessType() {
		return processType;
	}

	public void setProcessType(ProcessType processType) {
		this.processType = processType;
	}

	@Override
	public String toString() {
		return "Payment [identityNo=" + identityNo + ", fullName=" + fullName + ", creditCard=" + creditCard
				+ ", processType=" + processType + "]";
	}

	public static class Builder {
		private IdentityNo identityNo;
		private FullName fullName;
		private CreditCard creditCard;
		private ProcessType processType;

		public Builder identityNo(String identityNo) {
			this.identityNo = IdentityNo.of(identityNo);
			return this;
		}

		public Builder fullName(String firstName, String lastName) {
			this.fullName = FullName.of(firstName, lastName);
			return this;
		}

		public Builder creditCard(CreditCard creditCard) {

			this.creditCard = creditCard;
			return this;
		}

		public Builder processType(String value) {
			this.processType = ProcessType.valueOf(value);
			return this;
		}

		public Payment build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Payment(this);
		}
	}

}