import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindBranchesByHname {
	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hospital Name to find branches ");
	String hn = sc.nextLine();
		Query q = m.createQuery("select b from Branch b where b.h.name=?1");
		q.setParameter(1, hn);
		List<Branch> branches = q.getResultList();
		
		for (Branch b : branches) {
			System.out.println("ID : " + b.getId());
			System.out.println("Name : " + b.getName());
			System.out.println("Email : " + b.getEmail());
			System.out.println("Phone : " + b.getPhone());
			System.out.println("------------");
		}
	}
}
