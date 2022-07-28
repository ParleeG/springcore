package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireAnnotation_config.xml");
		Student s= context.getBean("student",Student.class);
		System.out.println(s);
	}

}
