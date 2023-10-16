package BookNumberSystem;

import java.util.Scanner;

public class p10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 integers for checking biggest no");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	if(n1>n2&&n1>n3)
		System.out.println("Biggest no is "+n1);
	if(n2>n1&&n2>n3)
		System.out.println("Biggest no is "+n2);
	else
		System.out.println("Biggest no is "+n3);
}
}
