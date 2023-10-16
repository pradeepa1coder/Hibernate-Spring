import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospital {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		

		Hospital h = new Hospital();
		h.setName("Apollo");
		h.setFounder("Ram Charan");

		Branch b1 = new Branch();
		b1.setName("Apollo B");
		b1.setPhone(777);
		b1.setEmail("ab@gmail.com");
		b1.setHospital(h);

		Branch b2 = new Branch();
		b2.setName("Apollo M");
		b2.setPhone(888);
		b2.setEmail("am@gmail.com");
		b2.setHospital(h);

		Branch b3 = new Branch();
		b3.setName("Apollo C");
		b3.setPhone(999);
		b3.setEmail("ac@gmail.com");
		b3.setHospital(h);

		m.persist(h);
		m.persist(b1);
		m.persist(b2);
		m.persist(b3);
		t.begin();
		t.commit();


	}
}

