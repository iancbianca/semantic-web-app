package com.vanilla;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support. ClassPathXmlApplicationContext;

public class HelloWorldApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloworld = (HelloWorld) context.getBean("HelloWorld");
		helloworld.display();
	
		User user = (User) context.getBean("user");
		System.out.println("Following is the output from a setter based injection");
		System.out.println(user);
		
		User2 user2 = (User2) context.getBean("user2"); 
		
		System.out.println("====================================");
		System.out.println("Following is the output from a constructor based injection");
		System.out.println(user2);
		
	}

}
