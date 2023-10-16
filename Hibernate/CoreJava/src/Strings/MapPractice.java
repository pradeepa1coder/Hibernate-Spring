package Strings;

import java.util.*;
import java.util.Map.Entry;

class MapPractice{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> h=new TreeMap();
		h.put(1, "pradeep");
		h.put(2, "andhra");
		h.put(2, "pradeep");
		h.put(4, "andhra");
		h.put(6,null);
		
//		 for (Map.Entry<Integer,String> entry : h.entrySet())
//		   {
//		    System.out.println(entry.getKey() + "=>" + entry.getValue());
//		   }
		for(Map.Entry<Integer, String> e:h.entrySet()){
			System.out.println(e.getKey()+" , "+e.getValue());
			
		}
	
		System.out.println(h.get(5));
		 
//			Iterator it=h.entrySet().iterator();
//			while(it.hasNext()) {
//				System.out.println(it.next());
//			}

		 
}
//			1=>pradeep
//			2=>pradeep
//			4=>andhra
	
	
	
	
	
	
	
	
	
	
	


}	

////import java.util.*;  
//public class Practice {  
//  public static void main(String args[]){  
//   // Create a tree map
//   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
//  // Put elements to the map 
//  tree_map.put(1, "Red");
//  tree_map.put(2, "Green");
//  tree_map.put(30, "Black");
//  tree_map.put(4, "White");
//  tree_map.put(5, "Blue");
//    
//   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
//   {
//    System.out.println(entry.getKey() + "=>" + entry.getValue());
//   }
// }
////  	      1=>Red
////		  2=>Green
////		  4=>White
////		  5=>Blue
////		  30=>Black
//
//}
