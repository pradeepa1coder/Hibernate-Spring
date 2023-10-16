package BookNumberSystem;

import java.util.Scanner;

public class p29 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no to check its Emirp no or not");
	int n=sc.nextInt();
	isEmrip(n);
}
public static void isEmrip(int n) {
	boolean rs=isPrime(n);
	if(rs==true)
	{
		boolean rev=isRevPrime(n);
		if(rev) 
		{
			System.out.println("emrip");
		}
	}
	else
		System.out.println("not emrip");
}
public static boolean isPrime(int n) {
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
			return false;
		
	}
	return true;
}
public static boolean isRevPrime(int n) 
{
	int temp=n;
	int rev=0;
	
	while(n!=0) 
	{
		int d=n%10;
		rev=rev*10+d;
		n=n/10;
	}
	boolean rs=isPrime(rev);
	if(rs)
		return true;
	else
		return false;
}
}
