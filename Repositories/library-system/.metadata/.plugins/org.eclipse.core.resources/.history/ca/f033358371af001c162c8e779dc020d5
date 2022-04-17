package com.sahabt.library.applications.bussiness;

import java.util.Optional;

import com.sahabt.library.applications.UserApplication;
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
		var identityNo= user.getIdentityNo();
		if(userRepository.exists(identityNo)) {
			return Optional.empty();
		}
		eventPublisher.userPublish(new UserHiredEvent(identityNo));
		
		return Optional.of(userRepository.createUser(user));

	}

	@Override
	public Optional<User> removeUser(IdentityNo identityNo) {
		
		Optional<User> fireUser= 
				userRepository.removeUser(identityNo);
		fireUser.ifPresent(
				user-> eventPublisher.userPublish(new UserFiredEvent(user))
				
				);
		
		return fireUser;
	}

	
	@Override
	public Optional<User> editUser(User user) {
		var identityNo= user.getIdentityNo();
		
		eventPublisher.userPublish(new UserEditdEvent(identityNo));
		
		return userRepository.updateUser(user);
	}


	@Override
	public Optional<User> getInformationUser(IdentityNo identityNo) {
			
		return userRepository.getInformationUser(identityNo);
	}

	

}
