package org.raju;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity// creating table automatically
public class Raju {
	@Id
	private int id;

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pradeep");// creating table automatically
		EntityManager m = emf.createEntityManager();

		Raju r = new Raju();

	}
}
