package List;

import java.util.*;

public class LinkedlistPrac {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		ll.add(10);
		ll.add(10);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);

		System.out.println(" by using Normal  printing stmt");
		System.out.println(ll);// [10, 10, 30, 40, 50, 60]

		ll.removeFirst();
		ll.removeLast();
		ll.remove(3);
		ll.addFirst("pradeep");
		ll.addLast("vennela");

		System.out.println("after adding first and last");
		System.out.println(ll);// [pradeep, 10, 10, 30, 40, 50, 60, vennela]

		System.out.println("/n by using for loop stmt");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("/n by using forEach loop stmt");

		for (Object i : ll) {
			System.out.println(i);
		}
		System.out.println("/n by using Iterator stmt");

		Iterator it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(" by using ListIterator stmt");

		ArrayList al = new ArrayList<>(ll);
		ListIterator lit = al.listIterator(al.size());//*************

		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

		System.out.println("/n by using while stmt");
		int i = 0;
		while (ll.size() > i) {
			System.out.println(ll.get(i));
			i++;

		}
		System.out.println("rev printing by using for loop");
		for (int j = ll.size() - 1; j >= 0; j--) {
			System.out.println(ll.get(j));
		}

		System.out.println("rev printing by using while loop");

		int k = ll.size() - 1;
		while (k >= 0) {
			System.out.println(ll.get(k));
			k--;
		}

		
		
		
	}

}
