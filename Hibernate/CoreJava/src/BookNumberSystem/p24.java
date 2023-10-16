package BookNumberSystem;

import java.util.Scanner;

public class p24 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter a number to check no is Armstrong or not");
	int no=sc.nextInt();
	boolean rs=isArmstrong(no);//153
	if(rs==true)
		System.out.println("Yes it's Armstrong");
	else
		System.out.println("not an Armstrong");
}

public static boolean isArmstrong(int n)
{
	int temp=n;
	int sum=0;
	int count=isCount(n);
	while(n!=0)
	{
		int d=n%10;
		int p=isPower(d,count);
		sum=sum+p;
		n=n/10;
	}
	if(sum==temp)
		return true;
	else
		return false;
}

public static int isCount(int n) 
{
	int count=0;
	while(n!=0)
	{
		int d=n%10;
		count++;
		n=n/10;
	}
	return count;
}
public static int isPower(int d,int count) {
	int pow=1;
	for(int i=1;i<=count;i++)
	{
		pow=pow*d;
	}
	return pow;
}
}













