package org.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortComparableCustomObj 
{
public static void main(String[] args) {
	
	Employee e1=new Employee();
	e1.name="sheela";
	e1.age=24;

	Employee e2=new Employee();
	e2.name="laila";
	e2.age=16;

	Employee e3=new Employee();
	e3.name="pradee";
	e3.age=20;
	
	ArrayList<Employee> al=new ArrayList<>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	System.out.println("Before sorting..");
	for(Employee i:al) 
	{
		System.out.println(i);
	}
	
	// in Object ArrayList Collections.sort() method will not work ,
	// we should take help from *comparable or comparator* of sort () method
	//Collections.sort(); ->Directly it will not work
	
	
	Collections.sort(al);//***calling sort
	System.out.println(" After  sorting..");
	for(Employee i:al) 
	{
		System.out.println(i);
	}
	
}
}
class Employee implements Comparable<Employee>{
	String name;
	int age;
	
	public Employee() {}
	
	public Employee(String n,int a) {
		this.name=n;
		this.age=a;
	}
	
	public String toString() {
		return this.name+" "+this.age;
		
	}

	
	
	// for ascending
	@Override
	public int compareTo(Employee o) {
		return this.age-o.age;
	}
	
	
	
	// for descending
//	@Override
//	public int compareTo(Employee o) {
//		return o.age-this.age;
//	}
	
	
	
}