package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		Test t= context.getBean("t",Test.class);
		System.out.println(t);

	}

}
