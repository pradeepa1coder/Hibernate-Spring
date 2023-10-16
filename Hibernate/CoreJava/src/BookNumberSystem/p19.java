package BookNumberSystem;

import java.util.Scanner;

public class p19 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 ineger values to know the distinct no");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	if(a>b&&a<c||a>c&&a<b)
		System.out.println(a+" Is Distinct no");
	else if(b>a&&b<c|| b>c&&b<a)
		System.out.println(b+" Is Distinct no");
	else
		System.out.println(c+" Is Distinct no");
}
}
