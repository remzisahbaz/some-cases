package library;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.booking.Booking;

public class BookingTest {

	@Test
	void test() {
		
	var booking1 = new Booking.Builder()
			.identityNo("11111")
			.bookId(19910)
			.build();
	assertEquals("11111", booking1.getIdentityNo().getIdentityNo());
	assertEquals(19910, booking1.getBookId().getBookId());

	}

	

}
