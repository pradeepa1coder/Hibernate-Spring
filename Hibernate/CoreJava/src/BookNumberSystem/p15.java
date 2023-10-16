package BookNumberSystem;

import java.util.Scanner;

public class p15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 integers to find biggest number");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	
	if(n1>n2&&n1>n3)
		System.out.println("Biggest no is "+n1);
	else if(n2>n1&&n2>n3)
		System.out.println("Biggest no is "+n2);
	else
		System.out.println("Biggest no is "+n3);
}
}
