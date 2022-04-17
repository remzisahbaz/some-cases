package com.sahabt.library.applications.bussiness.event.user;

import com.sahabt.library.domain.user.IdentityNo;
import com.sahabt.library.domain.user.User;

public class UserEditedEvent extends UserEvent {

	private final  User user;
	public UserEditedEvent(User user) {
		super(user.getIdentityNo());
		this.user = user;
	}

}
