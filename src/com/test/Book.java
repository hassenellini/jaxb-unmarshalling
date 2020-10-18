package com.test;
import javax.xml.bind.annotation.XmlAttribute;



public class Book {
    private Long id;
    private String title;
    private String genre;
    private Long quantity;
    private Long price;
    
    
	public Book() {
		super();
	}
	public Book(Long id, String title, String genre, Long quantity, Long price) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.quantity = quantity;
		this.price = price;
	}
	
	@XmlAttribute
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genre=" + genre + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
    
    
}
