package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//config.xml-should be inside src/main/java************
public class Main {
	public static void main(String[] args) {
//	Bike b=new Bike();
//	b.start();
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Bike b = context.getBean("b1", Bike.class);
		b.start();
	}
}
