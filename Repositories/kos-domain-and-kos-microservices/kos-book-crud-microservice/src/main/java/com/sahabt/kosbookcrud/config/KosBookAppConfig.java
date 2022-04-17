package com.sahabt.kosbookcrud.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.sahabt.kos.application.BookApplication;
import com.sahabt.kos.business.StandardKosBookApplication;
import com.sahabt.kos.infrastructure.BookPublisher;
import com.sahabt.kos.repository.BookRepository;

@Configuration

public class KosBookAppConfig {

	@Bean 
	public BookApplication createBookApplication(
			BookRepository bookRepository,
			BookPublisher bookPublisher ) {
		
		return new StandardKosBookApplication(bookRepository, bookPublisher);
		
	}
}
