package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPrac {
	public static void main(String[] args) {
		Set s = new HashSet<>();
		s.add(10);
		s.add("saroja");
		s.add('A');
		s.add(0.8);
		s.add(10);
		System.out.println("\n printing by normal statement");
		System.out.println(s);// [A, 0.8, 10, saroja]

		System.out.println("\n printing by iterator statement");

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("\n printing by forEach loop");
		for(Object o:s) {
			System.out.println(o);
		}
		
		HashSet<String> hs1=new HashSet<>();
		hs1.add("Abc");
		hs1.add("Rocky");
		hs1.add("Bunny");
		hs1.add(null);
		hs1.add("pradeep");
		System.out.println(hs1);

		

		
		
		
		
		
		
		
		
		
		
		
		

	}
}
