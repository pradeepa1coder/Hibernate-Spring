import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SuppressWarnings("all")

public class FetchUser {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");

		EntityManager m1 = f.createEntityManager();// first level cache -EM1
		User u1 = m1.find(User.class, 1);
		User u2 = m1.find(User.class, 1);

		System.out.println(u1.getId());
		System.out.println(u1.getName());
		System.out.println(u2.getId());
		System.out.println(u2.getName());

		EntityManager m2 = f.createEntityManager();// first level cache -EM2
		User u3 = m2.find(User.class, 1);
		User u4 = m2.find(User.class, 1);

	}
}
