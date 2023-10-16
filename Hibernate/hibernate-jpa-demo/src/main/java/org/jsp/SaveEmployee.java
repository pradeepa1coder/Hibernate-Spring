package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Employee e = new Employee();
		e.setId(4);
		e.setName("sadivelu");
		e.setDesignation("cleaner");
		e.setSalary(850000);
		e.setPassword("123123");
		manager.persist(e);
		transaction.begin();
		transaction.commit();
	}
}
