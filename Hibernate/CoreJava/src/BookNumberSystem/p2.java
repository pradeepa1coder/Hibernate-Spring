package BookNumberSystem;

import java.util.Scanner;

public class p2 {
	/*
	 * area of the circle=> 3.14*(radius*radius) 
	 * circumference is => 2*3.14*radius
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double r = sc.nextDouble();
		System.out.println("area is : " + 3.14 * r * r);
		System.out.println("circumference is : " + 2 * 3.14 * r);

	}
}
