package com.jarv.practice.process.impl;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.jarv.practice.process.TestInf;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class OptionalTest implements TestInf {
	
	@Override
	public void run() {
		
		log.info("Start OptionalTest.run()...");
		long lStartTime = System.currentTimeMillis();
		
		test1();
		
		long lEndTime = System.currentTimeMillis();
		float sec = (lEndTime - lStartTime) / 1000F;
		log.info("End OptionalTest.run() ELAPSED TIME: {}", sec);
		
	}
	
	private int test1() {
		
		Address mngrAddress = new Address("California", "LA", "United States");
		Employee manager = new Employee("001", "Billy", Optional.of(mngrAddress));
		
		Address empAddress = new Address("New York", "NY", "United States");
//		Employee emp = new Employee("002", "Bill", Optional.of(empAddress));
		// OR if address of an employee is null
		Address nullAddress = new Address();
		Employee emp = new Employee("002", "Bill", Optional.of(nullAddress));

		Project proj = new Project("001", "Microservices Development for StripleA company.", Optional.of(manager));
		
		String empWithNoAddress = proj.getManager().flatMap(Employee::getAddress)
									.map(Address::toString)
									.orElse("No address specified");
		log.info("OptionalTest: " + empWithNoAddress);
		
		return 1;
	}
	
	@Data
	private class Project {
		private String id;
		private String name;
		private Optional<Employee> manager = Optional.empty();
		public Project() {}
		public Project(String id, String name, Optional<Employee> manager) {
			setId(id);
			setName(name);
			setManager(manager);
		}
	}
	
	@Data
	private class Employee {
		private String id;
		private String name;
		private Optional<Address> address = Optional.empty();
		public Employee() {}
		public Employee(String id, String name, Optional<Address> address) {
			setId(id);
			setName(name);
			setAddress(address);
		}
	}
	
	@Data
	private class Address {
		private String city;
		private String state;
		private String country;
		public Address() {}
		public Address(String city, String state, String country) {
			setCity(city);
			setState(state);
			setCountry(country);
		}
	}

}
