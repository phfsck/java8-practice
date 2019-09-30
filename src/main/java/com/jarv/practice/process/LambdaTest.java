package com.jarv.practice.process;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LambdaTest {
	
	private static final Logger logger = LogManager.getLogger(LambdaTest.class);
	
	public void run() {
		
		logger.info("Start LambdaTest.run()...");
		long lStartTime = System.currentTimeMillis();
		
		long lEndTime = System.currentTimeMillis();
		float sec = (lEndTime - lStartTime) / 1000F;
		logger.info("End LambdaTest.run() ELAPSED TIME: {}", sec);
		
	}
	
}
