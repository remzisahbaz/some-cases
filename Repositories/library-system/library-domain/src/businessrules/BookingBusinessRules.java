package businessrules;

import com.sahabt.library.domain.catalog.BookId;
import com.sahabt.library.domain.catalog.Catalog;
import com.sahabt.library.domain.user.IdentityNo;
import com.sahabt.library.domain.user.User;

public class BookingBusinessRules {

	private Catalog catalog;
	private User user;
	private BookId bookId;
	private IdentityNo identityNo;
	
	public Catalog getCatalog() {
		return catalog;
	}
	public BookId getBookId() {
		return bookId;
	}
	public IdentityNo getIdentityNo() {
		return identityNo;
	}
	public User getUser() {
		return user;
	}



}


