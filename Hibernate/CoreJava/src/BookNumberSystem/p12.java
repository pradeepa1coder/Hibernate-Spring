package BookNumberSystem;

import java.util.Scanner;

public class p12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no for checking even or odd");
	int no=sc.nextInt();
	
//	if(no%2==0)
//		System.out.println("its even no");
//	else
//		System.out.println("its odd no");
	
//	String a=(no%2==0)?"even":"odd";
//	System.out.println(a);
	
	
	String ar[]= {"Even","odd"};
	System.out.println(ar[no%2]);
	
	

}
}