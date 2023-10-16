package org.jsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestPerson {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("mySpringConf.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Person p=factory.getBean(Person.class);
		//Person p=(Person)factory.getBean("myperson");
		//Person p = factory.getBean("myperson", Person.class);
		
		System.out.println("Name : " + p.getName());
		System.out.println("Age : " + p.getAge());
	}
}
