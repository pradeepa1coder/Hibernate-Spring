package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPrac {
	public static void main(String[] args) {

		System.out.println("\n TreeMap obj without Generics");
		Map m1 = new TreeMap();
		m1.put(10, "abc");
		m1.put(10, "abc");
		m1.put(10, "abc");
		System.out.println("\n Printing in Normal way");
		System.out.println(m1);// {10=abc}

		TreeMap tm = new TreeMap<>();

		tm.put(15, "Kannada");
//		tm.put("a", "Telugu");
//		 System.out.println(tm);// java.lang.ClassCastException:

		System.out.println("\n TreeMap obj without Generics");
		TreeMap tm1 = new TreeMap<>();

		tm1.put(10, "Kannada");
		tm1.put(10, "Telugu");
		tm1.put(10, "Tamil");
		System.out.println("\n Printing in Normal way");

		System.out.println(tm1);// {10=Tamil}
		System.out.println("\n after applaying putAll method");
		tm1.putAll(tm);
		System.out.println(tm1);

		// it will not works
		// int i=0;
		// while(tm1.size()>i) {
		// System.out.println(tm1.get(i));
		// i++;
		// }

		System.out.println("\n--------------------------");
		TreeMap tm2 = new TreeMap<>();

		tm2.put(11, "Anushka");
		tm2.put(12, "sruthi");
		tm2.put(10, "hebba");
		System.out.println(tm2);

		System.out.println("\n printing by using forEach method");
		for (Object o : tm2.entrySet()) {
			System.out.println(o);

		}

		System.out.println("\n some methods operation");
		System.out.println(tm2.firstKey());// 10
		System.out.println(tm2.firstEntry());// 10=hebba
		System.out.println(tm2.get(12));// sruthi
		System.out.println(tm2.hashCode());// 24404217

//		System.out.println("\n we are clearing entire TreeMap");
//		tm2.clear();
//		System.out.println(tm2);

	}
}
