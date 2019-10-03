package com.jarv.practice.process.impl;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jarv.practice.dao.impl.BookDaoImpl;
import com.jarv.practice.enums.BookCopyType;
import com.jarv.practice.pojo.Book;
import com.jarv.practice.process.TestInf;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class StreamsTest implements TestInf {
	
	@Autowired
	BookDaoImpl bookDaoImpl;
	
	@Override
	public void run() {
		
		log.info("Start StreamsTest.run()...");
		long lStartTime = System.currentTimeMillis();
		
		test1();
		test2();
		
		long lEndTime = System.currentTimeMillis();
		float sec = (lEndTime - lStartTime) / 1000F;
		log.info("End StreamsTest.run() ELAPSED TIME: {}", sec);
		
	}
	
	private int test1() {
		
//		List<Book> books = new ArrayList<>();
//		
//		Book book1 = new Book("978-3-16-148410-0", BookCopyType.HARD, 30.00f);
//		Book book2 = new Book("978-3-16-148410-1", BookCopyType.HARD, 55.50f);
//		Book book3 = new Book("978-3-16-148410-2", BookCopyType.SOFT, 40.25f);
//		
//		books.add(book1);
//		books.add(book2);
//		books.add(book3);
		
//		log.info("PREDICATES!");
//		log.info(books.stream().filter(BookPredicates.isBookCopySoft())
//				.collect(Collectors.toList()));
		
		// OR
//		log.info(books.stream().filter(book -> {
//			return book.getBookCopyType().equals(BookCopyType.SOFT);
//		})
//		.collect(Collectors.toList()));
		
		Book book1 = new Book("978-3-16-148410-2", BookCopyType.SOFT, 40.25f);
		Optional<Book> result = bookDaoImpl.get(book1);
		log.info("StreamsTest.test1() hey: " + result.get());
		
		return 1;
	}
	
	private int test2() {
		
		Stream.of("1", "2", "3", "4", "5")
		.filter(s -> s.startsWith("1"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		return 1;
	}

}
