package BookNumberSystem;

import java.util.Scanner;

public class p23 
{
	public static int isFactorial(int n) 
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to find the factorial");
	int n=sc.nextInt();
	int rs=isFactorial(n);
	
	System.out.println(n+" Factorial is : "+rs);
}


}
