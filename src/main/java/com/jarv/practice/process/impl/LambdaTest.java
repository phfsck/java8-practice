package com.jarv.practice.process.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jarv.practice.process.TestInf;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class LambdaTest implements TestInf {
	
	@Override
	public void run() {

		log.info("Start LambdaTest.run()...");
		long lStartTime = System.currentTimeMillis();
		
		test1();
		test2();
		
		long lEndTime = System.currentTimeMillis();
		float sec = (lEndTime - lStartTime) / 1000F;
		log.info("End LambdaTest.run() ELAPSED TIME: {}", sec);
		
	}
	
	private int test1() {
		
		List<String> myStr = Arrays.asList("J", "A", "R", "V", "Y");
		myStr.forEach(x -> log.info(x));
		
		Collections.sort(Arrays.asList(3, 2, 1), (a1, a2) -> a1.compareTo(a2));
		
		myStr.forEach(System.out::println);
		
		return 1;
		
	}
	
	private int test2() {
		
		List<String> list = Arrays.asList("A", "B", "C");
		list.forEach(this::printLowerCase);
		list.forEach(LambdaTest::printUpperCase);
		list.forEach(String::toLowerCase);
		list.forEach(String::new);
		
		return 1;
		
	}
	
	public void printLowerCase(String s) {
		log.info(s.toLowerCase());
	}
	
	public static void printUpperCase(String s) {
		log.info(s.toUpperCase());
	}
	
}
