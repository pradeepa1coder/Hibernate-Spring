package NumberSystem;

import java.util.Scanner;

public class LargeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 3 numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c)
			System.out.println(a + " is large number");
		else if (b > c)
			System.out.println(b + " is large number");
		else
			System.out.println(c + " is large number");
	}
}
