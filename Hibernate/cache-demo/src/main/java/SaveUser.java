import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		User u = new User();
		u.setName("Bunny");
		u.setPhone(156234598642L);
		u.setEmail("bunny123@gmail.com");
		m.persist(u);
		t.begin();
		t.commit();
	}
}
