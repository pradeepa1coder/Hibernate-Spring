import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Course c = m.find(Course.class, 2);
		Student s = m.find(Student.class, 1);
		s.setName("Balayya");
		c.setSubject("DataStructures");
		t.begin();
		t.commit();
	}
}
