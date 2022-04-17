package com.sahabt.library.infra;

import com.sahabt.library.applications.bussiness.event.booking.BookingEvent;
import com.sahabt.library.applications.bussiness.event.borrow.BorrowEvent;
import com.sahabt.library.applications.bussiness.event.creditcard.CreditCardEvent;
import com.sahabt.library.applications.bussiness.event.login.LoginEvent;
import com.sahabt.library.applications.bussiness.event.message.MessageEvent;
import com.sahabt.library.applications.bussiness.event.payment.PaymentEvent;
import com.sahabt.library.applications.bussiness.event.user.UserEvent;

public interface EventPublisher {
	
	void bookingPublish(BookingEvent bookingEvent);
	void borrowPublish(BorrowEvent borrowEvent);
	void creditCardPublish(CreditCardEvent creditCardEvent);
	void paymentPublish(PaymentEvent paymentEvent);
	void messagePublish(MessageEvent messageEvent);
	void userPublish(UserEvent userEvent);
	void loginPublish(LoginEvent loginEvent);

}
