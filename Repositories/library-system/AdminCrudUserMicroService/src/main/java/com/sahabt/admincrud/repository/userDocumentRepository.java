package com.sahabt.admincrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sahabt.admincrud.document.UserDocument;

@Repository
public interface userDocumentRepository extends MongoRepository<UserDocument, String>{

	
}
