package BookNumberSystem;

import java.util.Scanner;

public class p35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no for checking the square root");
		int n = sc.nextInt();
		int count=0;
		for (int i = 0; i <= n; i++) 
		{
			if (n == (i * i)) 
			{
				System.out.println(i + " is square root for given " + n);
				count++;
			}
		}
		if(count==0)
			System.out.println("For this "+n+" There is square root");
	}
}
