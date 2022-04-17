package com.sahabt.admincrud.adapter;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.sahabt.admincrud.document.UserDocument;
import com.sahabt.admincrud.repository.userDocumentRepository;
import com.sahabt.library.domain.user.IdentityNo;
import com.sahabt.library.domain.user.User;
import com.sahabt.library.repository.UserRepository;

@Component
public class UserRepositorySpringDataMongoAdapter implements UserRepository {

	private userDocumentRepository userDocumentRepository;
	private ModelMapper modelMapper;

	/**
	 * @param userDocumentRepository
	 * @param modelMapper
	 */
	public UserRepositorySpringDataMongoAdapter(userDocumentRepository userDocumentRepository,
			ModelMapper modelMapper) {
		System.out.println("adapter()");
		this.userDocumentRepository = userDocumentRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public boolean exists(IdentityNo identity) {
		return userDocumentRepository.existsById(identity.getIdentityNo());
	}

	@Override
	public Optional<User> removeUser(IdentityNo identityNo) {
		var userDoc = userDocumentRepository.findById(identityNo.getIdentityNo());
		if (userDoc.isEmpty()) {
			return Optional.empty();
		}

		userDocumentRepository.delete(userDoc.get());

		return Optional.of(modelMapper.map(userDoc.get(), User.class));
	}

	@Override
	public Optional<User> updateUser(User user) {
		var userDoc = userDocumentRepository.findById(user.getIdentityNo().getIdentityNo());
		if (userDoc.isEmpty()) {
			return Optional.empty();
		}

		userDocumentRepository.save(userDoc.get());

		return Optional.of(modelMapper.map(userDoc.get(), User.class));

	}

	@Override
	public Optional<User> getInformationUser(IdentityNo identityNo) {
		var userDoc = userDocumentRepository.findById(identityNo.getIdentityNo());
		if (userDoc.isEmpty()) {
			return Optional.empty();
		}
		userDocumentRepository.findById(identityNo.getIdentityNo());
		return Optional.of(modelMapper.map(userDoc.get(), User.class));
	}

	@Override
	public User createUser(User user) {
		var document = modelMapper.map(user, UserDocument.class);
		var newUserDoc = userDocumentRepository.save(document);
		return modelMapper.map(newUserDoc, User.class);
	}

}
