package com.sahabt.admincrud.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.sahabt.admincrud.dto.request.HireUserRequest;
import com.sahabt.admincrud.dto.userResponse.UserResponse;
import com.sahabt.admincrud.service.UserService;

@RestController
@CrossOrigin
@RequestScope
@RequestMapping("users")
@Validated
public class UserController {

	private UserService userService;

	/**
	 * @param userService
	 */
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public UserResponse addUser(@RequestBody @Validated HireUserRequest request) {
		System.out.println("burası controller:hire");
		return userService.createUser(request);
	}
	
	@GetMapping("{identityNo}")
	public UserResponse deleteUser(@PathVariable String identityNo) {
		System.out.println("burası controller:delete");
		return userService.deleteUser(identityNo);
	}
}
