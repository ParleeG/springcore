package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		Student s= context.getBean("obj",Student.class);
		System.out.println(s);

	}

}
