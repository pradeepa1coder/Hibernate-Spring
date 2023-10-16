package org.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Person p = new Person();
		p.setAge(1003);
		p.setName("Pradeep");
		p.setPhone(99863934l);
		m.persist(p);
		t.begin();
		t.commit();
		System.out.println("Person succesfully saved with ID : " + p.getId());

	}
}
