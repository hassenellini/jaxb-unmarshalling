package com.test;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bookstore")
public class BookStore {
	
  private List<Book> books;

  @XmlElement(name = "book")
	/*
	 * public List<Book> getBook() { return book; }
	 * 
	 * public void setBook(List<Book> book) { this.book = book; }
	 */

public List<Book> getBooks() {
	return books;
}

public void setBooks(List<Book> books) {
	this.books = books;
}

  



  
  
}
