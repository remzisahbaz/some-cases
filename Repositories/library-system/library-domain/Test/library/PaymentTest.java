package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.creditcard.CreditCard;
import com.sahabt.library.domain.payment.Payment;

public class PaymentTest {

	@Test
	void test() {

		var remziCard = new CreditCard.Builder()
				.identityNo("01111")
				.creditCardNo("15254685632")
				.expirationDate(05,1996)
				.cvv(768)
				.build();
		
		System.out.println(remziCard.toString());

		assertEquals("01111", remziCard.getIdentityNo().getIdentityNo());
		assertEquals("15254685632", remziCard.getCreditCardNo().getCrediCardNo());
		assertEquals(05, remziCard.getExpirationDate().getMount());
		assertEquals(1996, remziCard.getExpirationDate().getYear());
		assertEquals(768, remziCard.getCvv().getCvv());

		var payment = new Payment.Builder()
							.identityNo("01111")
							.fullName("remzi","baba")
							.creditCard(remziCard)
							.processType("PUNISHMENT")
							.build();
		
		assertEquals("01111", payment.getIdentityNo().getIdentityNo());
		assertEquals("remzi", payment.getFullName().getFirstName());
		assertEquals("baba", payment.getFullName().getLastName());
		assertEquals("15254685632", payment.getCreditCard().getCreditCardNo().getCrediCardNo());
		assertEquals(05, payment.getCreditCard().getExpirationDate().getMount());
		assertEquals(1996, payment.getCreditCard().getExpirationDate().getYear());
		assertEquals(768, payment.getCreditCard().getCvv().getCvv());

	}

}