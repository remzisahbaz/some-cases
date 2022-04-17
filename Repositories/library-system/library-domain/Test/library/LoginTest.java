package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.login.Login;

public class LoginTest {

	@Test
	void test() {

		var login = new Login.Builder()
						.identityNo("111111")
						.username("remzi3434")
						.password("istanbul")
						.build();
		 
		//System.out.println(jack.getBirthDate().getDay());

		assertEquals("111111", login.getIdentityNo().getIdentityNo());
		assertEquals("remzi3434", login.getUsername().getUsername());
		assertEquals("istanbul", login.getPassword().getPassword());

	}

}