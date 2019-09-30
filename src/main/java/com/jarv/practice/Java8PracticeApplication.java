package com.jarv.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jarv.practice.app.Java8Processor;

@SpringBootApplication
public class Java8PracticeApplication implements CommandLineRunner {
	
	@Autowired
	Java8Processor j8Proc;

	public static void main(String[] args) {
		SpringApplication.run(Java8PracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		j8Proc.execute();
	}

}
