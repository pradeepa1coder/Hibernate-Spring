package BookNumberSystem;

import java.util.Scanner;

public class p14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Total Amount");
	double a=sc.nextDouble();
	System.out.println("Enter the intrest rate");
	double i=sc.nextDouble();
	System.out.println("Enter the Time period in terms of Years");
	double t=sc.nextDouble();
	
	System.out.println("S.I is : "+(a*t*i)/100);
}
}
