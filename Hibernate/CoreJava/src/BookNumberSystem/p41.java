package BookNumberSystem;

import java.util.Scanner;

public class p41 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	int n=sc.nextInt();
	int sum=0,count=0;
	while(n!=0) 
	{
		int d=n%10;
		count++;
		sum=sum+d;
		n=n/10;
	}
	
	int avg=sum/count;
	System.out.println("avg is : "+avg);
}
}
