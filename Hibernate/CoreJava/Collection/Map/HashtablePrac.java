package Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtablePrac {
public static void main(String[] args) {
	Hashtable ht=new Hashtable();
	ht.put(10, "jspiders");
	ht.put(20, "qspiders");
	ht.put(30, "pyspiders");
//	ht.put(40, null);//"main" java.lang.NullPointerException
	System.out.println(" \n printing by using normal statement ");
	System.out.println(ht);

// Note:- Through for Loop we cant iterate Map Obj
	System.out.println("\n printing by using for each");
	for(Object o:ht.entrySet()) {
		System.out.println(o);
	}
	
	System.out.println("\nprinting by using Enumreation");
	
	Enumeration e=ht.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	
	//*******************************
	
	Hashtable<String, Integer> ht1=new Hashtable();
	ht1.put("shakila", 121);
	ht1.put("sheela", 131);
	ht1.put("maala", 141);
	ht1.put("Laila", 151);
	
	System.out.println(ht1);
	
	System.out.println("\n some important methods");
	System.out.println(ht1.containsKey("maala"));
	System.out.println(ht1.containsKey("Maala"));
	System.out.println(ht.containsValue(151));
	
	System.out.println("\n cloning the Hashtable");
	Hashtable ht2=(Hashtable)ht1.clone();
	System.out.println(ht2);
	
	
	
	
	
	
	
	
	
	
}
}
