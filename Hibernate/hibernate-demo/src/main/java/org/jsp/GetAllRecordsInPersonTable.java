package org.jsp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("all") // for removing all warnings in our program
public class GetAllRecordsInPersonTable {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		// Here we are not utilizing the references again and again, so we directly assigning to session
		
		String hql = "select p from Person p";
		Query<Person> q = session.createQuery(hql);
		List<Person> ps = q.getResultList();
		for (Person p : ps) 
		{
			System.out.println("ID = " + p.getId());
			System.out.println("name = " + p.getName());
			System.out.println("place = " + p.getPlace());
			System.out.println("State = " + p.getState());
			System.out.println("--------------");

		}
	}
}
