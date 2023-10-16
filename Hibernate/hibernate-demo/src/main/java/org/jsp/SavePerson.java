package org.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SavePerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setId(6);
		p.setName("vennela");
		p.setPlace("Tumkur");
		p.setState("karnataka");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(p);
		t.commit();
//Note** while doing ORM we should  create the *Database aswell as *Table
	}

}
