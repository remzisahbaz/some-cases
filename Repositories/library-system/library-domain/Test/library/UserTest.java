package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.user.Address;
import com.sahabt.library.domain.user.AddressType;
import com.sahabt.library.domain.user.Email;
import com.sahabt.library.domain.user.EmailType;
import com.sahabt.library.domain.user.Phone;
import com.sahabt.library.domain.user.PhoneType;
import com.sahabt.library.domain.user.User;

public class UserTest {

	@Test
	void test() {
		
		var email= Email.of("fake@email.com",EmailType.PERSONAL );
		var phone= Phone.of("555 55 55", PhoneType.WORK);
		var address = Address.of("türkiye","istanbul","ümraniye","namýk kemal", "18", "5", AddressType.HOME);
		
		var jack = new User.Builder()
				  .identityNo("111111")
				  .fullName("Jack", "Bauer")
				  .birthDate(23,05,1996)
				  .photo(null)
				  .status("TEACHER")
				  .contact(email, 
						  phone, 
						  address)
				  .faculty("engineering faculty", 1973)
				  .build();
		//System.out.println(jack.getBirthDate().getDay());
		
		assertEquals("111111",jack.getIdentityNo().getIdentityNo());
		assertEquals("Jack" ,jack.getFullName().getFirstName());
		assertEquals("Bauer" ,jack.getFullName().getLastName());
		assertEquals(23 ,jack.getBirthDate().getDay());
		assertEquals(05, jack.getBirthDate().getMount());
		assertEquals(1996, jack.getBirthDate().getYear());
		assertEquals(null, jack.getPhoto().getValue());
		assertEquals(email, jack.getContact().getEmail());
		assertEquals(phone, jack.getContact().getPhone()); 
		assertEquals(address, jack.getContact().getAddress());
		assertEquals("engineering faculty", jack.getFaculty().getFacultyName());
		assertEquals(1973, jack.getFaculty().getFoundationYear());
	}

}
