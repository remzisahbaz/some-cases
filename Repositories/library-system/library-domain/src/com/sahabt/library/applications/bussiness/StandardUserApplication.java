package com.sahabt.library.applications.bussiness;

import java.util.Optional;

import com.sahabt.library.applications.UserApplication;
import com.sahabt.library.applications.bussiness.event.user.UserEditedEvent;
import com.sahabt.library.applications.bussiness.event.user.UserHiredEvent;
import com.sahabt.library.domain.user.IdentityNo;
import com.sahabt.library.domain.user.User;
import com.sahabt.library.infra.EventPublisher;
import com.sahabt.library.repository.UserRepository;

public class StandardUserApplication implements UserApplication {

	private UserRepository userRepository;
	private EventPublisher eventPublisher; 

	public StandardUserApplication(UserRepository userRepository, EventPublisher eventPublisher) {
		this.userRepository = userRepository;
		this.eventPublisher = eventPublisher;
	}


	@Override
	public Optional<User> addUser(User user) {
		var isUser= userRepository.exists(user.getIdentityNo());
		if(isUser)
		{return Optional.empty();}
		else
		eventPublisher.userPublish(new UserHiredEvent(user));
		
		return Optional.of(userRepository.createUser(user));
	}


	@Override
	public Optional<User> removeUser(IdentityNo identityNo) {
		var isUser= userRepository.exists(identityNo);
		if(isUser)
		{return userRepository.removeUser(identityNo);
		}
		else
		return null;
	}

	@Override
	public Optional<User> editUser(User user) {
		var isUser= userRepository.exists(user.getIdentityNo());
		if(isUser)
		{
		eventPublisher.userPublish(new UserEditedEvent(user));
		return userRepository.updateUser(user);
		
		}
		else
		return null;
		
	}

	@Override
	public Optional<User> getInformationUser(IdentityNo identityNo) {
		
		return userRepository.getInformationUser(identityNo);
	}



}
