package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingApplicationContextContainer {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("mySpringConf.xml");//it is a 2 nd spring container
	Person p=context.getBean("myperson",Person.class);
	System.out.println("Name : "+p.getName());
	System.out.println("Age : "+p.getAge());
}
}
