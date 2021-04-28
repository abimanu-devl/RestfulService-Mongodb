package com.af.icaf.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.af.icaf.model.Book;
import com.af.icaf.service.BookService;


@RestController
@RequestMapping(value = "/book")
@CrossOrigin(origins = "*")
public class BookController {
	
	@Autowired
	private BookService bookService;

	
	@GetMapping("/all")
	public List<Book> getAllBooks() {
		return bookService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Book> getBookById(@PathVariable int id) {
		return bookService.findById(id);
	}
	
	@PostMapping("/save")
	public Book addBook(@RequestBody Book book) {
		Book bookObject = bookService.saveBook(book);
		return bookObject;
		
	}
	
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) {
		Book bookObject = bookService.updateBook(book);
		return bookObject;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		String message = bookService.deleteById(id);
		return message;
	}
	
}
