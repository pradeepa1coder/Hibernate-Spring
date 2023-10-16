package BookNumberSystem;

import java.util.Scanner;

public class p40 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting table no");
		int st=sc.nextInt();
		System.out.println("Enter ending table no");
		int et=sc.nextInt();
		
		for(int i=st;i<=et;i++) 
		{
			isTable(i);
			System.out.println("---------");
		}
		
		
	}

	public static void isTable(int n)
	{
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(n + "*" + i + "=" + n * i);
		}
	}
}
