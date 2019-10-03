package com.jarv.practice.dao;

import com.jarv.practice.pojo.Book;

public interface BookDaoInf extends DaoInf<Book> {
	
	/*
	 * Let us create a specific retrieval method for books!
	 */
	Book getByIsbn(String isbn);

}
