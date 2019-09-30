package com.jarv.practice.process;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class LambdaTest {
	
	public void run() {

		log.info("Start LambdaTest.run()...");
		long lStartTime = System.currentTimeMillis();
		
		long lEndTime = System.currentTimeMillis();
		float sec = (lEndTime - lStartTime) / 1000F;
		log.info("End LambdaTest.run() ELAPSED TIME: {}", sec);
		
	}
	
}
