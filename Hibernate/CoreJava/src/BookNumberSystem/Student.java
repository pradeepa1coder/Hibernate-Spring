package BookNumberSystem;

public class Student 
{
	String name;
	int id;
	String stream;
	static String location="india";
	
	public Student(String name,int id,String stream) 
	{
		this.name=name;
		this.id=id;
		this.stream=stream;
		
	}
	public String toString() 
	{
		return name+" "+id+" "+stream+" "+location;
	}
	
public static void main(String[] args) {
	
	Student s1=new Student("pradeep",11,"Engineering");
	Student s2=new Student("vennela",12,"mbbs");
	Student s3=new Student("pavani",13,"pharmacy");
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
}
}
