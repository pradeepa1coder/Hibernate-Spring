package BookNumberSystem;

import java.util.Scanner;

public class p37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int a = sc.nextInt();
		System.out.println("Enter the second no");
		int b = sc.nextInt();
		System.out.println("Enter the third no");
		int c = sc.nextInt();

		int small = (a < b && a < c) ? a : (b < a && b < c) ? b : c;
		System.out.println("The smallest no is " + small);
	}
}
