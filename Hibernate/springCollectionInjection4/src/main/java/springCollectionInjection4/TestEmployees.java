package springCollectionInjection4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEmployees {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mySpring.xml");
		Employees e = context.getBean("emps", Employees.class);
		System.out.println(e.getIds());
		System.out.println(e.getNames());
		System.out.println(e.getDetails());
	}

}
