package com.sahabt.library.repository;

import java.util.Optional;

import com.sahabt.library.domain.user.IdentityNo;
import com.sahabt.library.domain.user.User;

public interface UserRepository {

	boolean exists(IdentityNo identity);
	
	User createUser(User user);
	Optional<User> removeUser(IdentityNo identityNo);
	Optional<User> updateUser(User user);
	Optional<User> getInformationUser(IdentityNo identityNo);
	
}
