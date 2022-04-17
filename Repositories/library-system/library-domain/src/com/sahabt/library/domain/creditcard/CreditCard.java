package com.sahabt.library.domain.creditcard;

import com.sahabt.library.domain.annotations.Aggregate;


@Aggregate(id = "creditCardNo")
public class CreditCard {
	private IdentityNo identityNo;
	private CreditCardNo creditCardNo;
	private ExpirationDate expirationDate;
	private CVV cvv;

	public CreditCard (Builder builder) {
		this.identityNo=builder.identityNo;
		this.creditCardNo=builder.creditCardNo;
		this.expirationDate=builder.expirationDate;
		this.cvv=builder.cvv; 
		}
	
	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(IdentityNo identityNo) {
		this.identityNo = identityNo;
	}

	public CreditCardNo getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(CreditCardNo creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public ExpirationDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(ExpirationDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public CVV getCvv() {
		return cvv;
	}

	public void setCvv(CVV cvv) {
		this.cvv = cvv;
	}

	public static class Builder{
		private IdentityNo identityNo;
		private CreditCardNo creditCardNo;
		private ExpirationDate expirationDate;
		private CVV cvv;
		
		public Builder identityNo(String identityNo) {
			this.identityNo=IdentityNo.of(identityNo);
			return this;
		}
		public Builder creditCardNo(String creditCardNo) {
			this.creditCardNo=CreditCardNo.of(creditCardNo);
			return this;
		}
		public Builder expirationDate(int mount, int year) {
			this.expirationDate=ExpirationDate.of(mount,year);
			return this;
		}
		public Builder cvv(int cvv) {
			this.cvv=CVV.of(cvv);
			return this;
		}
		public CreditCard build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new CreditCard(this);
		}
	
	}
}
