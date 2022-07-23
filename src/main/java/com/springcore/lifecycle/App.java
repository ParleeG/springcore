package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AbstractAbstractApplicationContext is the parent interface of Applicationcontext
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle_config.xml");
		Samosa s= (Samosa)context.getBean("samosa1");
		//registerShutdownHook is the method calling during bean destroying
		context.registerShutdownHook();
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
	}

}
