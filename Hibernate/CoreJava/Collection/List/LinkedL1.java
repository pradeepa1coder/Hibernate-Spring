package List;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedL1 {
public static void main(String[] args) {
	LinkedList ll = new LinkedList<>();
	ll.add("A");
	ll.add("B");
	ll.add("chilaka");
	ll.add("c");
	ll.add("d");
	ll.add("e");
	/////////////||||\\\\ll.size()
	ListIterator litir=ll.listIterator();
	while(litir.hasNext()) {
		System.out.println(litir.next());
	}
	System.out.println();
	while(litir.hasPrevious()) {
		System.out.println(litir.previous());
	}
	System.out.println();
	
	
	
}}
