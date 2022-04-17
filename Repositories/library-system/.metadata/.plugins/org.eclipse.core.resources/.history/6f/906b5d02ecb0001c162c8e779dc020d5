package com.sahabt.admincrud.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.sahabt.admincrud.dto.request.HireUserRequest;
import com.sahabt.admincrud.dto.userResponse.UserResponse;
import com.sahabt.library.applications.UserApplication;
import com.sahabt.library.domain.user.IdentityNo;
import com.sahabt.library.domain.user.User;

@Service
public class UserService {

	private UserApplication userApplication;
	private ModelMapper modelMapper;
	
	
	
	/**
	 * @param userApplication
	 * @param modelMapper
	 */
	public UserService(UserApplication userApplication, ModelMapper modelMapper) {
		super();
		this.userApplication = userApplication;
		this.modelMapper = modelMapper;
	}


	public UserResponse createUser(HireUserRequest request) {
		var user= modelMapper.map(request, User.class);
		var hireUser=userApplication.addUser(user);
		return modelMapper.map(hireUser, UserResponse.class);
	}
	
	
	public UserResponse deleteUser(String identityNo) {
		var delete= userApplication.removeUser(IdentityNo.of(identityNo));
		
		return modelMapper.map(delete, UserResponse.class);
	}
	
	
	public UserResponse updateUser(HireUserRequest request) {
		var user= modelMapper.map(request, User.class);
		var updateUser=userApplication.editUser(user);
		return modelMapper.map(updateUser, UserResponse.class);
	}
	
	public UserResponse getUser(String identityNo) {
	
		return null;
	}

}
