package Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadObjFscanner {
public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the objects/if you want to exit give the exit");
	while(true) {
		Object input=sc.next();
		if(((String) input).equalsIgnoreCase("exit"))
			break;
		else
			al.add(input);
	}
	System.out.println(al);
}
}
class Student{
	int age;
	String name;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
}