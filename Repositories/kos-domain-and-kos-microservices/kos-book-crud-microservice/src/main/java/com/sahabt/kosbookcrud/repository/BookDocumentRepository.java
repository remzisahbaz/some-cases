package com.sahabt.kosbookcrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sahabt.kosbookcrud.document.BookDocument;

@Repository
public interface BookDocumentRepository extends MongoRepository<BookDocument,String>{

}
