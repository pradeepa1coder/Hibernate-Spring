import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindBranchesByHospitalId1 {

	public static void main(String[] args) {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hospital ID to find all branches ");
		int hid = sc.nextInt();

		Hospital hospital = m.find(Hospital.class, hid);
		List<Branch> branches = hospital.getBranches();// List from util package

		for (Branch b : branches) {
			System.out.println("ID : " + b.getId());
			System.out.println("Name : " + b.getName());
			System.out.println("Email : " + b.getEmail());
			System.out.println("Phone : " + b.getPhone());
			System.out.println("------------");
		}

	}

}
