package NumberSystem;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

//	if(n%2==0) 
//		System.out.println("even no");
//	else
//		System.out.println("odd no");

//	if(n/2*2==n)
//		System.out.println("even no");
//	else
//		System.out.println("odd no");

//	String s=(n%2==0)?"even":"odd";
//	System.out.println(n+" is "+s);

//	String[] str={"even","odd"};
//	System.out.println(n+" is "+str[n%2]);

		switch (n % 2)
		{
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		}
	}
}
