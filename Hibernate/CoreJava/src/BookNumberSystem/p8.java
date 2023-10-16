package BookNumberSystem;

import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		int fno = sc.nextInt();
		System.out.println("Eneter the second number");
		int sno = sc.nextInt();
		if (fno == sno)
			System.out.println("These 2 values are equal");
		else
			System.out.println("These 2 values are not equal");
	}
}
