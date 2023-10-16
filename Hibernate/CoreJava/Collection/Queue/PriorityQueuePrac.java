package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuePrac {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		System.out.println(pq);//[10, 20, 30, 40, 50]


		
		System.out.println(pq.element());//10
		System.out.println(pq.peek());//10
		System.out.println(pq);// [20, 40, 30, 50]
		System.out.println(pq.remove());//10
		
System.out.println("----------------------");
		Iterator itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
