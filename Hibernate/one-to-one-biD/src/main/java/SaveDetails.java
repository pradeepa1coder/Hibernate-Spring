import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDetails {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Raju");
		p.setPhone(123456789l);
		p.setPlace("Mangalore");

		PanCard pc = new PanCard();
		pc.setNumber("jkv123");
		pc.setDob(LocalDate.parse("2002-05-16"));
		pc.setCountry("INDIA");
		p.setPan(pc);
		pc.setPerson(p);

		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.persist(p);
		m.persist(pc);
		t.begin();
		t.commit();
	}
}
