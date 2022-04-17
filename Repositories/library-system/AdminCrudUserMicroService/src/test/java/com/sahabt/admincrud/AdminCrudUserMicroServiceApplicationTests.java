package com.sahabt.admincrud;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sahabt.admincrud.controller.UserController;
import com.sahabt.admincrud.dto.request.BirthDate;
import com.sahabt.admincrud.dto.request.Faculty;
import com.sahabt.admincrud.dto.request.HireUserRequest;

@SpringBootTest
class AdminCrudUserMicroServiceApplicationTests {

	@Autowired
	private UserController userController;
	
	/**
	 * @param userController
	 */
	public AdminCrudUserMicroServiceApplicationTests(UserController userController) {
		this.userController = userController;
	}

	@Test
	void contextLoads() {
		var hireUser =new HireUserRequest();
		hireUser.setIdentityNo("11111");
		hireUser.setBirthDate(BirthDate.of(1, 1, 1));
		hireUser.setFaculty(Faculty.of("IT", 2011));
		
		assertThat(userController.addUser(hireUser));
	}

}
