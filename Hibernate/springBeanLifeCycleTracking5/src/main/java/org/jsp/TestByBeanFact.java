package org.jsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestByBeanFact 
{
public static void main(String[] args) {
	Resource r=new ClassPathResource("spring.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	System.out.println(factory);
}

}
