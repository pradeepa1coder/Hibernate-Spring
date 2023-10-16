package org.jsp;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUser {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	User u=new User();
	u.setId(1);
	u.setName("AB");
	u.setPhone(8766);
	u.setPassword("1231");
	m.persist(u);
	t.begin();
	t.commit();
}
}
