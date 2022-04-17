package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.borrow.Borrow;

public class BorrowTest {

	@Test
	void test() {
		
	var fake = new Borrow.Builder()
			.identityNo("11515")
			.bookId(26)
			.deadline(02, 03, 2021)
			.date(02, 03, 2021)
			.punishment(0)
			.borrowCounter(0)
			.build();
	
	assertEquals("11515",fake.getIdentityNo().getIdentityNo());
	assertEquals(26,fake.getBookId().getBookId());
	assertEquals(02,fake.getDeadline().getDay());
	assertEquals(03,fake.getDeadline().getMount());
	assertEquals(2021,fake.getDeadline().getYear());
	assertEquals(0,fake.getPunishment().getPunishmentAmount());
	assertEquals(0,fake.getBorrowCounter().getBorrowCounter());
	}
	
	

}
