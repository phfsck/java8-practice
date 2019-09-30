package com.jarv.practice.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jarv.practice.process.LambdaTest;

@Component
public class Java8Processor {
	
	@Autowired
	LambdaTest lambdaTest;
	
	public void execute() {
		lambdaTest.run();
	}

}
