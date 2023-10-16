package BookNumberSystem;

import java.util.Scanner;

public class p21 {
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end range of prime numbers");
		int en = sc.nextInt();

		for (int i = 1; i <= en; i++) 
		{
			boolean rs = isPrime(i);

			if (rs == true)
				System.out.println(i);
//			else
//				en++;

		}

	}
}
