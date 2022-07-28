package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(Javaconfig.class);
		Student s= context.getBean("s",Student.class);
		System.out.println(s);

	}

}
