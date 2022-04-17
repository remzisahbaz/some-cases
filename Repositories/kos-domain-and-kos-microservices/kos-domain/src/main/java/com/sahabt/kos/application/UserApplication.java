package com.sahabt.kos.application;

import java.util.Optional;

import com.sahabt.kos.anatation.Application;
import com.sahabt.kos.domain.book.Isbn;
import com.sahabt.kos.domain.user.Identity;
import com.sahabt.kos.domain.user.User;
@Application(name="user")
public interface UserApplication {

	Optional<User> hireBook(User user);
	Optional<User> fireBook(Identity identity);
	Optional<User> editBook(User user);
	Optional<User> getInformationBook(Identity identity);
}
