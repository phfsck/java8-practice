package com.jarv.practice.pojo;

import com.jarv.practice.enums.BookCopyType;

import lombok.Data;

@Data
public class Book {
	
	private String isbn;
	private BookCopyType bookCopyType;
	private float weight;
	
	public Book() {}
	
	public Book(String isbn, BookCopyType bookCopyType, float weight) {
		setIsbn(isbn);
		setBookCopyType(bookCopyType);
		setWeight(weight);
	}
	
}