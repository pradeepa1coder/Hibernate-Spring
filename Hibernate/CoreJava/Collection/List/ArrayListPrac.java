package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPrac {
	public static void main(String[] args) {

// creating an ArrayList obj
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
// printing by using sysout statement
		System.out.println(al);// [10, 20, 30, 30]

// printing by using for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
//	10
//	20
//	30
//	30

		// creating an ArrayList obj with Generics

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(3);
		al1.add(13);
		al1.add(32);
		al1.add(33);

		// printing by using for loop
		for (int i = 0; i < al1.size(); i++) {
			System.out.println(al1.get(i));
		}
//	3
//	13
//	32
//	33

		// printing by using foreach loop
		for (Integer i : al1) {
			System.out.println(i);
		}
//3
//13
//32
//33

//printing by using Iterator
		Iterator it = al1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("printing by using ListIterator in reverse order");

		ListIterator lit = al1.listIterator(al1.size());

		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

		System.out.println("******************");

// creating an custom obj ArrayList

		Employee e1 = new Employee(10, "sarala", 1000);
		Employee e2 = new Employee(11, "srivalli", 1000);
		Employee e3 = new Employee(12, "paaru", 1000);

		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e1);
		al2.add(e2);
		al2.add(e3);

// iterating by using for loop
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}

		System.out.println("******************");

//iterating by using forEach loop
		for (Employee e : al2) {
			System.out.println(e);
		}

		System.out.println("******************");
		System.out.println("******************");

// checking some remaining other methods
		ArrayList ar1 = new ArrayList<>();
		ar1.add("Hi");
		ar1.add(12);
		ar1.add(7.5);

		ArrayList ar2 = new ArrayList<>();
		ar2.add("Hello");
		ar2.add(12);
		ar2.add(0.5);
		System.out.println(ar2.size());
		System.out.println(ar2.get(0));

//System.out.println(ar2.get(10));
//java.lang.IndexOutOfBoundsException:

//System.out.println(ar1.retainAll(ar2));

		ar2.addAll(ar1);
		System.out.println(ar2);

		System.out.println("******************");
		System.out.println("******************");

		ArrayList a = new ArrayList<>();
		a.add("Hi");
		a.add(12);
		a.add(7.5);

		ArrayList b = new ArrayList<>();
		b.add("Hello");
		b.add("Hello");
		b.add("Hello");
		b.add("Hello");
		b.add("Hello");
		b.add("Hello");
		b.add(12);
		b.add(5);

		b.remove(1);
		System.out.println(b);
		System.out.println(a.contains(0.5));
		;
		;
		;
		;
		;
		;
		;// false

		System.out.println("******************");
		System.out.println("******************");
		System.out.println("******************");

//elements iterating by using while loop
		int i = 0;
		while (b.size() > i) {
			System.out.println(b.get(i));
			i++;
		}

//************************************
		System.out.println("converting array to arraylist");

		String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

//Conversion of array to ArrayList
//using Arrays.asList
		List l = Arrays.asList(geeks);

		System.out.println(l);

		// ************************************

		System.out.println("converting arraylist to array");

		ArrayList ar3 = new ArrayList<>();
		ar3.add("Hi");
		ar3.add(12);
		ar3.add(7.5);

		Object[] arr = ar3.toArray();
		for (Object o : arr) {
			System.out.println(o);
		}

	}

}

class Employee {
	int id;
	String name;
	long sal;

	Employee(int id, String name, long sal) {
		this.id = id;
		this.sal = sal;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}
