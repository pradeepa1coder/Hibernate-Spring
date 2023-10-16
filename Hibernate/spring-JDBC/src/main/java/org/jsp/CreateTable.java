package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		template.execute("create table person(id int not null,name varchar(50) null,phone bigint(20),primary key (id))");
		System.out.println("Table is created");
	}
}
