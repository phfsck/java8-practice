package com.jarv.practice.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jarv.practice.dao.BookDaoInf;
import com.jarv.practice.dao.DaoInf;
import com.jarv.practice.enums.BookCopyType;
import com.jarv.practice.pojo.Book;


@Repository
public class BookDaoImpl implements BookDaoInf {
	
	private List<Book> books = new ArrayList<Book>();
	
	public BookDaoImpl() {
		temporarilyPopulateList();
	}
	
	@Override
	public Optional<Book> get(Book book) {
		
		Optional<Book> input = Optional.ofNullable(
				books.stream()
				.filter(mybook -> book.equals(mybook))
				.findAny()
				.orElse(null)
				);
		return input;
		
	}
	
	@Override
	public Book getByIsbn(String isbn) {

		Optional<Book> input = Optional.ofNullable(
				books.stream()
				.filter(mybook -> isbn.equals(mybook.getIsbn()))
				.findAny()
				.orElse(null)
				);
		return input.get();
		
	}
	
	@Override
	public List<Book> getAll() {
		return books;
	}
	
	@Override
	public void save(Book book) {
		books.add(book);
	}
	
	@Override
	public void update(Book book, String... params) {
		
	}
	
	@Override
	public void delete(Book book) {
		books.remove(book);
	}
	
	/*
	 * Temporary record of books.
	 */
	private void temporarilyPopulateList() {
		
		Book book1 = new Book("978-3-16-148410-0", BookCopyType.HARD, 30.00f);
		Book book2 = new Book("978-3-16-148410-1", BookCopyType.HARD, 55.50f);
		Book book3 = new Book("978-3-16-148410-2", BookCopyType.SOFT, 40.25f);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
	}
	
}