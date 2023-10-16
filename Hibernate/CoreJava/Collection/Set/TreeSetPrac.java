package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPrac {
	public static void main(String[] args) {
//	TreeSet t=new TreeSet<>();
//	t.add("abc");
//	t.add(30);
//	t.add(10);
//	t.add('A');
//	t.add(20);
//	t.add(30);
//	t.add("gjpo");
//	System.out.println(t);//java.lang.ClassCastException

		TreeSet t = new TreeSet<>();
		
		
		t.add(20);
		t.add(30);
		t.add(25);
		t.add(19);
		System.out.println(t);// [19, 20, 25, 30]

		System.out.println("pirnting by using FOrEach loop");
		for (Object i : t) {
			System.out.println(i);
		}

		System.out.println("printinng by using iterator");
		Iterator i = t.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("printing in descending order by using iterator");

		Iterator dtr = t.descendingIterator();//************imp************
		while (dtr.hasNext()) {
			System.out.println(dtr.next());
		}

		// it will after the completion of soring function
		System.out.println("\n some methods");
		System.out.println(t.pollFirst());// 19
		System.out.println(t.pollLast());// 30

	}
}
