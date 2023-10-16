package BookNumberSystem;

import java.util.Scanner;

public class p39 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no");
	int n=sc.nextInt();//345
	int even=0,odd=0;
	
	while(n!=0) 
	{
		int d=n%10;
		if(d%2==0) 
		{
			even=even+d;
		}
		else
		{
			odd=odd+d;
		}
		n=n/10;
	}
	int diff=even-odd;
	System.out.println("sum of evendig - sum of odddig is : "+diff);
	
}
}
