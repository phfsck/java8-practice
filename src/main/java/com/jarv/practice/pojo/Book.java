package com.jarv.practice.pojo;

import com.jarv.practice.enums.BookCopyType;

import lombok.Data;

@Data
public class Book {
	
	private BookCopyType bookCopyType;
	private float weight;
	
	public Book() {}
	
	public Book(BookCopyType bookCopyType, float weight) {
		setBookCopyType(bookCopyType);
		setWeight(weight);
	}
	
}