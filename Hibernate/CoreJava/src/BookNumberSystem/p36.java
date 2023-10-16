package BookNumberSystem;

import java.util.Scanner;

public class p36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		int f = sc.nextInt();
		System.out.println("Enter the second no");
		int s = sc.nextInt();

		int bf = 1;
		for (int i = 1; i <= f; i++) 
		{
			if (f % i == 0 && s % i == 0) 
			{
				bf = i;
			}

		}
		System.out.println("The highest common divisor is : " + bf);
	}
}
