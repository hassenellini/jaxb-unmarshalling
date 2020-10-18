package com.test;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class XmlToObject {
	
	
	public BookStore unmarshall() throws JAXBException, IOException {
	    JAXBContext context = JAXBContext.newInstance(BookStore.class);
	    URL url = getClass().getResource("book.xml");
	    
	    return (BookStore) context.createUnmarshaller()
	      .unmarshal(new File(url.getPath()));
		}
	
	
}
	
