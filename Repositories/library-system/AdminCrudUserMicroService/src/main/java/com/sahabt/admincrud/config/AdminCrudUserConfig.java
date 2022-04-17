package com.sahabt.admincrud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.sahabt.library.applications.UserApplication;
import com.sahabt.library.applications.bussiness.StandardUserApplication;
import com.sahabt.library.infra.EventPublisher;
import com.sahabt.library.repository.UserRepository;

@Configuration

public class AdminCrudUserConfig {

	@Bean
	public UserApplication createUserApplication(
			UserRepository userRepository,
			EventPublisher eventPublisher ) {
		
		return new StandardUserApplication(userRepository, eventPublisher);
		
		
	}
}
