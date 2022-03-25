package com.bookapp.model.service;
import java.util.List;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.BookDaoImpl;

public class BookServiceImpl{

	private BookDao bookDao;

	public BookServiceImpl() {
		bookDao=new BookDaoImpl();//bad code
	}

	public List<Book> getAll() {
		return bookDao.getAll();
	}

	public void addBook(Book b) {
		bookDao.addBook(b);
	}

}

