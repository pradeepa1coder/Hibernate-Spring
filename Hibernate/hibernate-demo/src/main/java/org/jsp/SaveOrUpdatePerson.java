package org.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdatePerson {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Person p = new Person();
		p.setId(1);
		p.setName("Adheera");
		p.setPlace("Dharwada");
		p.setState("Karnataka");
		session.saveOrUpdate(p);
		transaction.commit();
	}
}
