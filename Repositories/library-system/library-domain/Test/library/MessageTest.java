package library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahabt.library.domain.message.EmailType;
import com.sahabt.library.domain.message.Message;

public class MessageTest {

	@Test
	void test() { 

		var turgutUyar = new Message.Builder().identityNo("00000000001")
				.email("buyuksaat@example.com", EmailType.PERSONAL)
				.messageContent("Bir bozuk saattir yüreðim, hep sende durur")
				.build();
		
		System.out.println(turgutUyar.getEmail().getEmailType());

		assertEquals("00000000001", turgutUyar.getIdentityNo().getIdentityNo());
		assertEquals("buyuksaat@example.com", turgutUyar.getEmail().getEmail());
		assertEquals("PERSONAL", turgutUyar.getEmail().getEmailType().toString());
		assertEquals("Bir bozuk saattir yüreðim, hep sende durur", turgutUyar.getMessageContent().getMessageContent());

	}

}