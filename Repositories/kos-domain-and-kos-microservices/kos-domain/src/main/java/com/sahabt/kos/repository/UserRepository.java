package com.sahabt.kos.repository;

import java.util.Optional;

import com.sahabt.kos.domain.user.Identity;
import com.sahabt.kos.domain.user.User;

public interface UserRepository {

	boolean exists (Identity identity);
	User createBook(User book);
	Optional<User> deleteBook(Identity identity);
	Optional<User> updateBook(User book);
	Optional<User> getByIsbn(Identity identity);
}
