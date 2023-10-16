package org.pradeep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployees {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
	Employees e=context.getBean(Employees.class);
	System.out.println("IDs : "+e.getIds());
	
}
}
