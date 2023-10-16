package org.jsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestEmployee {
public static void main(String[] args) {
	Resource r=new ClassPathResource("mySpringConf.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	Employee e=factory.getBean("empid",Employee.class);
	System.out.println("desination is : "+e.getDesg());
	System.out.println("salary is : "+e.getSalary());
	
			
}
}
