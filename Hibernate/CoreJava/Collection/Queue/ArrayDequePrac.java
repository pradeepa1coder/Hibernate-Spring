package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequePrac {
public static void main(String[] args) {
	ArrayDeque ad=new ArrayDeque<>();
	ad.add("first");
	ad.add("second");
	ad.add("third");
	ad.add("fourth");
	ad.offer("Balayya");

	System.out.println(ad);
	
	ad.offerFirst("Bangalore");
	ad.offerLast("chennai");//v.imp *******
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Iterator itr=ad.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
}
}
