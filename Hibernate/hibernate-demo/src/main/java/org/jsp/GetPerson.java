package org.jsp;
// code for fetching the single record from database by using find () method
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetPerson {
public static void main(String[] args) {
	Configuration cfg=new Configuration().configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Person p=session.find(Person.class, 1);
	if(p!=null)
	{
		System.out.println("ID:"+p.getId());
		System.out.println("name:"+p.getName());
		System.out.println("place:"+p.getPlace());
		System.out.println("state:"+p.getState());
		
	}
	else
		System.err.println("RECORD NOT FOUND");
	// by writing if-else condition we are avoiding exception while record is not present 
}
}
