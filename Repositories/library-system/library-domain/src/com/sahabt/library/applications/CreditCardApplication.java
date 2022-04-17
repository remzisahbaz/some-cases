package com.sahabt.library.applications;

import java.util.Optional;

import com.sahabt.library.domain.creditcard.CreditCard;

public interface CreditCardApplication {

	Optional<CreditCard> addCreditCard(CreditCard creditCard);
	Optional<CreditCard> removeCreditCard(CreditCard creditCardNo);
	Optional<CreditCard> editCreditCard(CreditCard creditCard);
	Optional<CreditCard> getInformationCreditCard(CreditCard creditCardNo);
	

}