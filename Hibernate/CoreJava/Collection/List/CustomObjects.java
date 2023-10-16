package List;

import java.util.ArrayList;

public class CustomObjects {
	public static void main(String[] args) {
		Student s1 = new Student("pradeep", 20);
		Student s2 = new Student("vennela", 16);

		Student s3 = new Student();
		s3.name = "shakila";
		s3.age = 22;

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		for (Student i : al)
		{
			System.out.println(i);
		}
	}

}

class Student {
	String name;
	int age;

	public Student() 
	{
	}

	public Student(String nm, int age) {
		this.name = nm;
		this.age = age;

	}

	public String toString() {
		return this.name + " ," + this.age;

	}
}