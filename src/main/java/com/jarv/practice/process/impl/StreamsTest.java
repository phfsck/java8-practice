package com.jarv.practice.process.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.jarv.practice.enums.BookCopyType;
import com.jarv.practice.pojo.Book;
import com.jarv.practice.predicate.BookPredicates;
import com.jarv.practice.process.TestInf;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class StreamsTest implements TestInf{
	
	@Override
	public void run() {
		
		log.info("Start StreamsTest.run()...");
		long lStartTime = System.currentTimeMillis();
		
		test1();
		
		long lEndTime = System.currentTimeMillis();
		float sec = (lEndTime - lStartTime) / 1000F;
		log.info("End StreamsTest.run() ELAPSED TIME: {}", sec);
		
	}
	
	private int test1() {
		
		List<Book> books = new ArrayList<>();
		
		Book book1 = new Book(BookCopyType.HARD, 30.00f);
		Book book2 = new Book(BookCopyType.HARD, 55.50f);
		Book book3 = new Book(BookCopyType.SOFT, 40.25f);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		log.info("PREDICATES!");
		log.info(books.stream().filter(BookPredicates.isBookCopySoft())
				.collect(Collectors.toList()));
		
		return 1;
	}

}
