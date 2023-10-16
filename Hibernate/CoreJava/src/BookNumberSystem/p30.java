package BookNumberSystem;

import java.util.Scanner;

public class p30 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num to check Strong no or not");
	int n=sc.nextInt();
	boolean rs=isStrong(n);
	System.out.println(rs?"Strong":"Not Strong");
}
public static boolean isStrong(int n) {
	int temp=n;
	int sum=0;
	while(n!=0)
	{
		int d=n%10;
		int f=getFactorial(d);
		sum=sum+f;
		n=n/10;
	}
	if(sum==temp)
		return true;
	else
		return false;
}
private static int getFactorial(int d)
{
	int fact=1;//d=5->5*4*3*2*1
	for(int i=d;i>=1;i--) 
	{
		fact=fact*i;
	}
	return fact;
}
}
