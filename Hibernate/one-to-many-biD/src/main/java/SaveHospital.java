import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospital {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();

		Hospital hr = new Hospital();
		hr.setName("Apollo");
		hr.setFounder("Upasana");
		hr.setGst("25");
		hr.setPhone(9989398349l);

		Branch b1, b2, b3;

		b1 = new Branch();
		b1.setName("A1");
		b1.setPhone(777);
		b1.setEmail("A1@gmail.com");

		b2 = new Branch();
		b2.setName("A2");
		b2.setPhone(888);
		b2.setEmail("A2@gmail.com");

		b3 = new Branch();
		b3.setName("A3");
		b3.setPhone(999);
		b3.setEmail("A3@gmail.com");

		List<Branch> allBranches = new ArrayList<Branch>(Arrays.asList(b1, b2, b3));
		hr.setBranches(allBranches);

		// hospital.setBranches(new ArrayList<Branch>(Arrays.asList(b1, b2, b3)));
		b1.setH(hr);
		b2.setH(hr);
		b3.setH(hr);

		m.persist(hr);
		m.persist(b1);
		m.persist(b2);
		m.persist(b3);
		t.begin();
		t.commit();

	}
}
