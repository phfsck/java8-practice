package com.jarv.practice.process.impl;

import org.springframework.stereotype.Component;

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
		return 1;
	}

}
