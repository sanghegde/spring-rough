package com.cg.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.employee.pojo.Customer;
import com.cg.employee.service.EmployeeServiceImpl;



@SpringBootApplication
public class App {
	 public static void main( String[] args )
	    {
	    	SpringApplication.run(App .class, args);
	    }

	 @Bean
	 public CommandLineRunner loadInitialData(EmployeeServiceImpl service)
	 {
		 return (args)->{
			 service.addTopic(new Customer("123", "abc", "def", "xyz", "cde", "defg"));
			 service.addTopic(new Customer("124", "abc", "def", "xyz", "cde", "defg"));
			 service.addTopic(new Customer("125", "abc", "def", "xyz", "cde", "defg"));
			 service.addTopic(new Customer("126", "abc", "def", "xyz", "cde", "defg"));
			 service.addTopic(new Customer("127", "abc", "def", "xyz", "cde", "defg"));
			 service.addTopic(new Customer("128", "abc", "def", "xyz", "cde", "defg"));
			 service.addTopic(new Customer("129", "abc", "def", "xyz", "cde", "defg"));
			 service.addTopic(new Customer("1245", "abc", "def", "xyz", "cde", "defg"));


		 };
		 }
	 }
	 
	 

