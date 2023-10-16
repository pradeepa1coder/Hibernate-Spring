package org.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {

		Student s1=new Student();
		s1.name="pradeep";
		s1.age=20;
		
		Student s2=new Student();
		s2.name="sheela";
		s2.age=18;
		
		Student s3=new Student();
		s3.name="leela";
		s3.age=22;
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
//		for(Object o: list)
//			System.out.println(o);
	// Before sorting
		System.out.println("\nBefore sorting :");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
// After sorting
System.out.println("\nAfter sorting based on age : ");
		Collections.sort(list,new AgeComparing());
				 
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}

			
			
			
			
			
			
			
			
			
			
System.out.println("\nAfter sorting based on name : ");
			
	Collections.sort(list,new NameComparing());
					 
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
			
			

	}
}
