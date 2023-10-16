package BookNumberSystem;

import java.util.Scanner;

public class p22 
{
	public static boolean isPalindrome(int n) {
		int temp=n;//545
		int rev=0;
		while(n!=0) 
		{
			 int d=n%10;
			 rev=rev*10+d;
			 n=n/10;
		}
		
		if(temp==rev)
			return true;
		else 
			return false;
		
		
		
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check no is palindrome or not");
	int n=sc.nextInt();
	 boolean rs=isPalindrome(n);
	 if(rs==true)
		 System.out.println(n+" is a palindrome no");
	 else
		 System.out.println(n+" is not a palindrome no");
}

}
