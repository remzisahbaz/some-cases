package com.sahabt.admincrud.config;

import org.modelmapper.Converter;
import org.springframework.context.annotation.Configuration;

import com.sahabt.admincrud.dto.request.HireUserRequest;
import com.sahabt.library.domain.user.User;

@Configuration
public class ModelMapperConfig {
	
	private static final Converter<HireUserRequest,User> HIRE_USER_REQUEST_TO_USER =
			(context)->{
				var request = context.getSource();
				return new User.Builder()
						.identityNo(request.getIdentityNo())
						.fullName(request.getFirstName(), request.getLastName())
						.birthDate(0, 0, 0)
						.build();
				
				
			};

}
