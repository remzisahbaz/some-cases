package com.sahabt.library.applications;

import java.util.Optional;

import com.sahabt.library.domain.payment.Payment;
import com.sahabt.library.domain.user.User;

public interface PaymentApplication {


	Optional<Payment> getInformationByIdentityNo(User userId);
	

}
