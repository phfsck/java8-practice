package com.jarv.practice.predicate;

import java.util.function.Predicate;

import com.jarv.practice.pojo.Book;
import com.jarv.practice.enums.BookCopyType;

public class BookPredicates {
	
	public static Predicate<Book> isBookCopySoft() {
		return book -> book.getBookCopyType().equals(BookCopyType.SOFT);
	}

}
