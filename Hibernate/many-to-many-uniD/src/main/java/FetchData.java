import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Course c1 = m.find(Course.class, 100);
		Course c2 = m.find(Course.class, 200);
		
		courseDetails(c1);
		courseDetails(c2);

		Student s1 = m.find(Student.class, 1);
		studentDetails(s1);
		t.begin();
		t.commit();
	}

	public static void courseDetails(Course d) {
		System.out.println(d.getId());
		System.out.println(d.getSubject());
		System.out.println(d.getDuration());
		System.out.println("---------");
	}

	public static void studentDetails(Student s) {
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getPhone());
		System.out.println(s.getPerc());
		System.out.println("-----");
	}
}