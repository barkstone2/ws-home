package com.spp.p10001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class BookDao implements IBookDao {
	
	private HashMap<String, Book> dbBook;
	
	public BookDao() {
		dbBook = new HashMap<String, Book>();
	}
	
	
	@Override
	public void insertBook(String name, String author, String isbn, String price) {
		Book book = new Book(name, author, isbn, price);
		
		dbBook.put(isbn, book);
		
	}
	
	@Override
	public ArrayList<Book> readBooks() {
		ArrayList<Book> books = new ArrayList<Book>();
		Set<String> keys = dbBook.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Book book = dbBook.get(key);
			books.add(book);
		}
		
		return books;
	}
	
	@Override
	public Book readBook(String isbn) {
		return dbBook.get(isbn);
	}
	
	@Override
	public void updateBook(String name, String author, String isbn, String price) {
		Book book = dbBook.get(isbn);
		book.setName(name);
		book.setAuthor(author);
		book.setPrice(price);
	}

	@Override
	public void deleteBook(String isbn) {
		dbBook.remove(isbn);
	}
	

}
