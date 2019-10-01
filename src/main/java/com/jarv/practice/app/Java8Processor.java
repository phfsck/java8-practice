package com.jarv.practice.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.jarv.practice.process.impl.LambdaTest;
import com.jarv.practice.process.impl.OptionalTest;
import com.jarv.practice.process.impl.StreamsTest;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class Java8Processor {
	
	@Value("${app.config.name}")
	private String envName;
	
	@Autowired
	LambdaTest lambdaTest;
	
	@Autowired
	StreamsTest streamsTest;
	
	@Autowired
	OptionalTest optionalTest;
	
	public void execute() {
		
		log.info("Start Java8Processor.execute() - ENVIRONMENT: " + envName);
		
		lambdaTest.run();
		streamsTest.run();
		optionalTest.run();
		
		log.info("End Java8Processor.execute()...");
	}

}
