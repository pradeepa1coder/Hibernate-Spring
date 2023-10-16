package BookNumberSystem;

import java.util.Scanner;

public class p20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the how many no's  you want to print");
	int n=sc.nextInt();
	int n1=1,n2=2,n3=0;
	
	for(int i=0;i<n;i++) 
	{
		//if(n1<=100) {
			
		System.out.println(n1);
		n3=n1+n2;
		n1=n2;
		n2=n3;
		//}
	}
}
}
