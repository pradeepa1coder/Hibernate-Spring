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

		Hospital hospital = new Hospital();
		hospital.setName("Apollo");
		hospital.setFounder("Ram Charan");

		Branch b1 = new Branch();
		b1.setName("Apollo B");
		b1.setPhone(777);
		b1.setEmail("ab@gmail.com");

		Branch b2 = new Branch();
		b2.setName("Apollo M");
		b2.setPhone(888);
		b2.setEmail("am@gmail.com");

		Branch b3 = new Branch();
		b3.setName("Apollo C");
		b3.setPhone(999);
		b3.setEmail("ac@gmail.com");
		
		List<Branch> allBranches = new ArrayList<Branch>(Arrays.asList(b1, b2, b3));
		hospital.setBranches(allBranches);
		
		m.persist(hospital);
		m.persist(b1);
		m.persist(b2);
		m.persist(b3);
		t.begin();
		t.commit();

	}
}
