package com.test;
import java.io.IOException;
import java.util.List;

import javax.lang.model.element.VariableElement;
import javax.xml.bind.JAXBException;

public class App {

	public static void main(String[] args) {
		XmlToObject xmlToObject = new XmlToObject();
		try {
			BookStore bookStore = xmlToObject.unmarshall();
			System.out.println("####### Welcome To Our Book Store ######");
			System.out.println("####### Here it is our Collection ######");
			List<Book> books = bookStore.getBooks();
			
			for(Book book:books) {
				System.out.println(book);
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
