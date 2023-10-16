package org.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser {
	public static void main(String[] args) {
		User u = new User();
		u.setId(9);
		u.setName("pushpa");
		u.setPassword("123");
		u.setPhone(888);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(u);
		t.commit();

	}

}
