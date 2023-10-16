import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindBranchesByHospitalId2JPQL {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hospital ID to find branches ");
		int hid = sc.nextInt();
		Query q = m.createQuery("select d from Branch d where d.h.id=?1");
		q.setParameter(1, hid);
//
//		//if we want to fetch all records (or) all branches for particular Hospital
//		
//		List<Branch> branches = q.getResultList();
//		for (Branch b : branches)
//		{
//			System.out.println("ID : " + b.getId());
//			System.out.println("Name : " + b.getName());
//			System.out.println("Email : " + b.getEmail());
//			System.out.println("Phone : " + b.getPhone());
//			System.out.println("------------");
//		}

		// if we want to fech only first record ,then dont go for , List&for-each
		
		Branch b = (Branch)q.getSingleResult();
		
		System.out.println("ID : " + b.getId());
		System.out.println("Name : " + b.getName());
		System.out.println("Email : " + b.getEmail());
		System.out.println("Phone : " + b.getPhone());
		System.out.println("------------");

	}
}