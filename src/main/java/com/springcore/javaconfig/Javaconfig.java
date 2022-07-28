package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	@Bean(name="ad")
	public Address getAddress() {
		return new Address();
	}
	@Bean(name = "s")
	public Student getstudent() {
		return new Student();
	}

}
