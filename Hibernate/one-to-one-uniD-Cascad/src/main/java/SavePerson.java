import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setPhone(123);
		p.setPlace("bangalore");

		PanCard pc = new PanCard();
		pc.setNumber("12A2");
		pc.setDob(LocalDate.parse("1997-05-06"));
		pc.setCountry("INDIA");
		p.setPan(pc);

		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.persist(p);
		//m.persist(pc);
		t.begin();
		t.commit();
	}
}
