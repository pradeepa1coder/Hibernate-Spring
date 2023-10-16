import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();

		Student s1 = new Student();
		s1.setName("A");
		s1.setPhone(555);
		s1.setPerc(60);

		Student s2 = new Student();
		s2.setName("B");
		s2.setPhone(666);
		s2.setPerc(65);

		Student s3 = new Student();
		s3.setName("C");
		s3.setPhone(777);
		s3.setPerc(80);

		Course c1 = new Course();
		c1.setSubject("Java");
		c1.setDuration(60);

		Course c2 = new Course();
		c2.setSubject("J2EE");
		c2.setDuration(40);

		Course c3 = new Course();
		c3.setSubject("Hibernate");
		c3.setDuration(50);
		ArrayList<Course> forS1 = new ArrayList<Course>(Arrays.asList(c1, c2, c3));
		ArrayList<Course> forS2 = new ArrayList<Course>(Arrays.asList(c1, c2, c3));
		ArrayList<Course> forS3 = new ArrayList<Course>(Arrays.asList(c2, c3));

		s1.setCourses(forS1);
		s2.setCourses(forS2);
		s3.setCourses(forS3);

		m.persist(s1);
		m.persist(s2);
		m.persist(s3);
		m.persist(c1);
		m.persist(c2);
		m.persist(c3);

		t.begin();
		t.commit();

	}
}
