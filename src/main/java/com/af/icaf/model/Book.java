package com.af.icaf.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {
	@Id
	private Integer id;
	
	private String name;
	
	private Date publishedDate;

	public Book(Integer id, String name, Date publishedDate) {
		super();
		this.id = id;
		this.name = name;
		this.publishedDate = publishedDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publishedDate=" + publishedDate + "]";
	}
	
}
