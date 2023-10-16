package org.jsp.user_App.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.user_App.dto.Hospital;

@SuppressWarnings("all")
public class UserDao {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m = f.createEntityManager();
	EntityTransaction t = m.getTransaction();

	public Hospital saveUser(Hospital data)
	{
		m.persist(data);
		t.begin();
		t.commit();

		return data;
	}

	public Hospital updateUser(Hospital data)
	{
		m.merge(data);
		t.begin();
		t.commit();
		return data;
	}

	public boolean deleteUser(int id)
	{
		Hospital u = m.find(Hospital.class, id);
		if (u != null) {
			m.remove(u);
			t.begin();
			t.commit();
			return true;
		}
		return false;

	}

	
	
	public Hospital findUserById(int id)
	{
		return m.find(Hospital.class, id);
	}

	
	
	
	public List<Hospital> findAllUsers()
	{
		Query q = m.createQuery("select d from User d");
		return q.getResultList();

	}

	
	public Hospital verifyUser(long phone, String password)
	{
		Query q = m.createQuery("select d from User d where d.phone=?1 and d.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		List<Hospital> users = q.getResultList();
		if (users.size() > 0) 
		{
			return users.get(0);
		}
		return null;
	}

}
