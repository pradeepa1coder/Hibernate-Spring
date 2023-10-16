import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



@SuppressWarnings("all")
public class HospitalDao {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m = f.createEntityManager();
	EntityTransaction t = m.getTransaction();

	public Hospital saveHospital(Hospital data) {
		m.persist(data);
		t.begin();
		t.commit();
		return data;

	}

	public Hospital updateHospital(Hospital data) {
		m.merge(data);
		t.begin();
		t.commit();
		return data;

	}

	public boolean deleteUser(int id) {
		Hospital u = m.find(Hospital.class, id);
		if (u != null) {
			m.remove(u);
			t.begin();
			t.commit();
			System.out.println("succesfully deleted with id : " + id);
			return true;
		}
		return false;
	}

	public Hospital findHospitalById(int id) {
		return m.find(Hospital.class, id);

	}

	
	public List findAllHospitals() {
		Query q=m.createQuery("select d from Hospital d");
		return null;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
