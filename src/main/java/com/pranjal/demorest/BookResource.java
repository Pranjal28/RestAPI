package com.pranjal.demorest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("books")
public class BookResource {
	
	BookRepository repo = new BookRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)  
	public List<Book> getBooks()
	{
	
		return repo.getBooks();	
	}
	
	
	@GET
	@Path("book/{price}")
	@Produces(MediaType.APPLICATION_JSON)  
	public Book getBook(@PathParam("price") int price)
	{
		return repo.getBook(price);
	}
	
	
	@POST
	@Path("book")
	@Consumes(MediaType.APPLICATION_JSON)  
	public Book createBook(Book b1)
	{
		System.out.println(b1);
		repo.create(b1);
		
		return b1;
	}
	
	@PUT
	@Path("book")
	@Consumes(MediaType.APPLICATION_JSON)  
	public Book updateBook(Book b1)
	{
		System.out.println(b1);
		repo.updateBook(b1);
		
		return b1;
	}
	
	
	
}
