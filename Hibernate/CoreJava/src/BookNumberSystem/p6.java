package BookNumberSystem;

import java.util.Scanner;

public class p6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int f=sc.nextInt();
	System.out.println("Enter second number");
	int s=sc.nextInt();
	System.out.println("Addition is : "+(f+s));
	System.out.println("Subtraction is : "+(f-s));
	System.out.println("Multiplication  is : "+(f*s));
	System.out.println("Division is : "+(f/s));
}
}
