package com.sahabt.kos.business;

import java.util.Optional;

import com.sahabt.kos.application.UserApplication;
import com.sahabt.kos.domain.book.Book;
import com.sahabt.kos.domain.book.Isbn;
import com.sahabt.kos.domain.user.Identity;
import com.sahabt.kos.domain.user.User;
import com.sahabt.kos.infrastructure.UserPublisher;
import com.sahabt.kos.repository.UserRepository;

public class StandardKosUserApplication implements UserApplication{

	private UserRepository userRepository;
	private UserPublisher userPublisher;
	
	@Override
	public Optional<User> hireBook(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<User> fireBook(Identity identity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<User> editBook(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<User> getInformationBook(Identity identity) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
