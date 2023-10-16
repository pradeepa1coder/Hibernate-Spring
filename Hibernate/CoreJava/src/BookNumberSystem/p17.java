package BookNumberSystem;

import java.util.Scanner;

public class p17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month no to check for the days");
		int m = sc.nextInt();
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			System.out.println(m + " month have 31 days");
		else if (m == 4 || m == 6 || m == 9 || m == 11)
			System.out.println(m + " month have 30 days");
		else if (m == 2)
			System.out.println(m + " month may have 28 or 29 days");
		else
			System.out.println("Enter valid month no");

	}
}
