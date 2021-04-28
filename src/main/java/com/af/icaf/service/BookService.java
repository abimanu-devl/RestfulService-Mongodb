package com.af.icaf.service;

import java.util.List;
import java.util.Optional;

import com.af.icaf.model.Book;

public interface BookService {

	public List<Book> findAll();

	public Optional<Book> findById(int id);

	public Book saveBook(Book book);

	public String deleteById(int id);
	
	public Book updateBook(Book book);

}
