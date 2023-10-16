package BookNumberSystem;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String nm = sc.next();
		System.out.println("Enter the mobile no");
		long mn = sc.nextLong();
		System.out.println("Enter 10 th CGPA");
		double ssc = sc.nextDouble();
		System.out.println("Enter  12 th CGPA");
		double inter = sc.nextDouble();
		System.out.println("Enter Degree CGPA ");
		double degree = sc.nextDouble();
		
		System.out.println("Name : "+nm);
		System.out.println("Mobile Number : "+mn);
		System.out.println("10th : "+ssc);
		System.out.println("12th : "+inter);
		System.out.println("Degree : "+degree);
	}
}
