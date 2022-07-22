package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collections_config.xml");
		Student student=(Student)context.getBean("student1");
		System.out.println(student.getName());
		System.out.println(student.getAddresess());
		System.out.println(student.getMobileNumber());
		System.out.println(student.getCourses());

	}

}
