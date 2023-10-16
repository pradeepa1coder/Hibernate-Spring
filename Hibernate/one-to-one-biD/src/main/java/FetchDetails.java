import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDetails {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Query q = m.createQuery("select p from Person p where p.pan.id=?100");
		q.setParameter(100, 1);
		Person p = (Person) q.getSingleResult();
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPhone());

	}
}
