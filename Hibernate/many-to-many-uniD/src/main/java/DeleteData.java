import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();

		Course c = m.find(Course.class, 100);
		if (c != null) {
			m.remove(c);
			t.begin();
			t.commit();
			System.out.println("Course Data is deleted");
		}
		else
			System.out.println("Your ID is not present");
		Student s = m.find(Student.class, 1);
		if (s != null) {
			m.remove(s);
			t.begin();
			t.commit();
			System.out.println("Student Data is deleted");

		}
		else
			System.out.println("Your ID is not present");
		
	}
}