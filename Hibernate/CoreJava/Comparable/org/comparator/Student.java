package org.comparator;

public class Student {

	String name;
	int age;

	public Student() {
	}

	public Student(String nm, int age) {
		this.name = nm;
		this.age = age;
	}

	public String toString()
	{
		return this.name + "," + this.age;
	}

}
