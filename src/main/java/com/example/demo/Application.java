package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		
		System.out.println("impclass :: " + repository.getClass().getName());
		
		Employee e = new Employee();
		e.setEmpid(102);
		e.setEmpname("jany");
		e.setEmpsal(4000.0);
		
		repository.save(e);
		
		
		
		
	}

}
