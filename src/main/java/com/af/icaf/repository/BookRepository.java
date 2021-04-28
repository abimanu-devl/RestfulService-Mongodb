package com.af.icaf.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.af.icaf.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
