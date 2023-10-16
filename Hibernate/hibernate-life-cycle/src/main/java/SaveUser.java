import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		
		User u = new User();// Transient state
		
//		u.setName("Rocky"); 		//for saving the record
//		u.setPhone(6305786429L);
//		u.setEmail("Rocky@gmail.com");
//		
//		m.persist(u);	// persistence state***
//		t.begin();
//		t.commit();
			

		
//		u.setId(2); 	// for updating the record Id is mandatory***
//		u.setName("pradeep");
//		u.setPhone(88893983422L);
//		u.setEmail("pradeep@gmail.com");
//		m.merge(u);// persistence state
//		t.begin();
//		t.commit();
		


		//m.detach(u);//***detached state***
		u.setId(1); 	// for updating the record Id is mandatory***
		u.setName("chiru");
		u.setPhone(8546195652L);
		u.setEmail("chiru@gmail.com");
		t.begin();
		t.commit();
		
//		u = m.find(User.class, 1);//persistence state
//		m.remove(u);//removed state
//		t.begin();
//		t.commit();

	}
}
