package org.jsp;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchEmployeeByDesignation {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	String qry="select e from Employee e where e.designation=?12";
	Query q=m.createQuery(qry);
	q.setParameter(12, "cleaner");
	List<Employee> es=q.getResultList();
	for (Employee e : es) {
		System.out.println("id : "+e.getId());
		System.out.println("name : "+e.getName());
		System.out.println("designation : "+e.getDesignation());
		System.out.println("salary : "+e.getSalary());
		System.out.println("-----------");
	}
	
}
}
