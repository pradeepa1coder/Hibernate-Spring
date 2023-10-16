package org.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class BasicArrayListSort {
public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	al.add(10);
	al.add(5);
	al.add(60);
	al.add(55);
	al.add(50);
	al.add(52);
	
	
	System.out.println("Before sorting");
	for(Object i:al)
		
	{
		System.out.println(i);
	}
	System.out.println("Ascending sorting");
	Collections.sort(al);//**
	for(Object i:al)
	{
		System.out.println(i);
	}
	
	Collections.sort(al,Collections.reverseOrder());//**
	System.out.println("Descending sorting");
	for(Object i:al)
	{
		System.out.println(i);
	}
}
}
