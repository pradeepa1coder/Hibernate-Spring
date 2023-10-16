package BookNumberSystem;

import java.util.Scanner;

public class p54 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the price");
	int p=sc.nextInt();
	System.out.println("Enter the discount");
	int d=sc.nextInt();
	
	int payA=p-d;
	System.out.println("payble amount is : "+payA);
}
}
