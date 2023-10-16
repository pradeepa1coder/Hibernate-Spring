package BookNumberSystem;

import java.util.Scanner;

public class p9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 values");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 > n2)
			System.out.println("Biggest no is : " + n1);
		else
			System.out.println("Biggest no is : " + n2);
	}
}
