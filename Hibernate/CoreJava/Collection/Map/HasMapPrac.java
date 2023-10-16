package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Note :- HashMap is Not synchronized thats why performance is Excellent
and at a time many Threads can access single object but
some times we may get " ConcurentModificationException " 
due to Non sysnchronized & we may get  Fail Fast Sysem error ,
it's opposite to Fail Safe


Note :- In Map usually for get() method we have to pass key not the 
index value
that's why for loop & while loops are not works in Map objects



*/

public class HasMapPrac {
	public static void main(String[] args) {
		Map m = new HashMap<>();
		m.put(10, "pradeep");
		m.put("vennela", 20);
		m.put("pavani", 30);

		System.out.println("printing in normal");
		System.out.println(m);

		HashMap<Integer, String> m1 = new HashMap();

		m1.put(10, "pavagada");
		m1.put(11, null);
		m1.put(11, null);// it will replace not give any CTE
		m1.put(null, null);
		m1.put(null, null);// it will replace
		System.out.println(m1);// {null=null, 10=pavagada, 11=null}

		System.out.println("//***************");
		Map m2 = new HashMap<>();
		m2.put(10, "pradeep");
		m2.put(20, "vennela");
		m2.put(30, "pavani");

// Note:- Through for Loop we cant iterate Map Obj
		System.out.println("\n printing by using forEach loop");
		for (Object entry : m2.entrySet()) {

			System.out.println(entry);

		}

		System.out.println("\n printing by using iterator");

		Iterator it = m2.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		System.out.println("\n by using set and entryset");
		Set s = m2.entrySet();
		System.out.println(s);

	}
}
