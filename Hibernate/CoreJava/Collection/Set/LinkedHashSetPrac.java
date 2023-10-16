package Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetPrac {
public static void main(String[] args) {
	LinkedHashSet l=new LinkedHashSet<>();
	l.add("abc");
	l.add(30);
	l.add(10);
	l.add('A');
	l.add(20);
	l.add(30);
	l.add("gjpo");
	System.out.println(l);

	LinkedHashSet l1=new LinkedHashSet<>();
	l1.add("dbd");
	l1.add("bdf");
	l1.add("qbkh");
	
	l1.addAll(l);
	System.out.println(l1);
	
	
	System.out.println(l1.remove("dbd"));//true
	System.out.println(l1.isEmpty());//false
	
	System.out.println("**creating ArrayList**");
	ArrayList al=new ArrayList<>();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	System.out.println(al);//[100, 200, 300, 400]

	
	System.out.println("**creating Empty LinkedHasMap from ArrayList ");
	
	
	LinkedHashSet h=new LinkedHashSet<>(al);
	System.out.println(h);//[100, 200, 300, 400]
	
	LinkedHashSet hs=new LinkedHashSet<>();
	System.out.println(hs.size());;//0
	System.out.println(hs.isEmpty());//true

	
	LinkedHashSet hs1=new LinkedHashSet<>(325);
	hs1.add(101);
	hs1.add(102);
	hs1.add(11);
	hs1.add( 01);
	hs1.add(1051);
	hs1.add(1015 );
	hs1.add(1016);
	hs1.add(10551);
	hs1.add(1601);
	hs1.add(1051);
	hs1.add(1012);
	hs1.add(6101);
	hs1.add(1901);
	hs1.add(1051);

	System.out.println(hs1.size());;//12
	
	

	
	

	
	
}
}
