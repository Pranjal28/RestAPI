package com.pranjal.demorest;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
	
	List<Book> books;
	
	public BookRepository()
	{
		books = new ArrayList<Book>();
		
		Book b1 = new Book();
		b1.setName("Harry Potter");
		b1.setPrice(1000);
		
		Book b2 = new Book();
		b2.setName("Alchemist");
		b2.setPrice(2140);
		
		books.add(b1);
		books.add(b2);
	}
	
	public List<Book> getBooks()
	{
		return books;
	}
	
	public void create(Book b1)
	{
		books.add(b1);	
	}
	
	
	public Book getBook(int price)
	{
		
		for(Book b : books)
		{
			if(b.getPrice() == price)
				return b;
		}
		
		return null;
	}
	
	public Book updateBook(Book b1)
	{

		for(Book b : books)
		{
			if(b.getName().equals(b1.getName()) && b.getPrice() == b1.getPrice())			{
				b.setPrice(1200);
				return b;
			}
		}
		
		return null;
	}
}
