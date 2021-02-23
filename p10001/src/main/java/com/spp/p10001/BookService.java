package com.spp.p10001;

import java.util.ArrayList;

public class BookService implements IBookService{
	
	BookDao bookDao; 
	
	public BookService() {
		bookDao = new BookDao();
	}
	
	@Override
	public void registerBook(String name, String author, String isbn, String price) {
		bookDao.insertBook(name, author, isbn, price);
	}

	@Override
	public ArrayList<Book> readBooks() {
		return bookDao.readBooks();
	}
	
	@Override
	public Book readBook(String isbn) {
		return bookDao.readBook(isbn);
	}
	
	@Override
	public void modifyBook(String name, String author, String isbn, String price) {
		bookDao.updateBook(name, author, isbn, price);
	}
	
	@Override
	public void deleteBook(String isbn) {
		bookDao.deleteBook(isbn);
	}
	
	
}
