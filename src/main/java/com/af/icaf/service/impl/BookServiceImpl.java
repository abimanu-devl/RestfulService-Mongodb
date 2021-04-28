package com.af.icaf.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.af.icaf.model.Book;
import com.af.icaf.repository.BookRepository;
import com.af.icaf.service.BookService;

@Component
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookrepository;

	@Override
	public List<Book> findAll() {
		return bookrepository.findAll();
	}

	@Override
	public Optional<Book> findById(int id) {
		return bookrepository.findById(id);
	}

	@Override
	public Book saveBook(Book book) {
		bookrepository.save(book);
		return book;
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		bookrepository.deleteById(id);
		return "Book" + id + " deleted successfully";
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		bookrepository.save(book);
		return book;
	}

}
