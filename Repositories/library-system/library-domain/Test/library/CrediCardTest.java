package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.creditcard.CreditCard;

public class CrediCardTest {

	@Test
	void test() {
		
	var remzi = new CreditCard.Builder()
			.identityNo("01111")
			.creditCardNo("15254685632") 
			.expirationDate(05, 1996) 
			.cvv(768)
			.build(); 
	System.out.println(remzi.toString()); 
			assertEquals("01111", remzi.getIdentityNo().getIdentityNo());		
			assertEquals("15254685632", remzi.getCreditCardNo().getCrediCardNo());		
			assertEquals(05, remzi.getExpirationDate().getMount());		
			assertEquals(1996, remzi.getExpirationDate().getYear());		
			assertEquals(768, remzi.getCvv().getCvv());		

	}
	
	

}
