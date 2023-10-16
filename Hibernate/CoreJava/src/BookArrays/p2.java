package BookArrays;

import java.util.Arrays;
import java.util.Scanner;

public class p2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size=sc.nextInt();
	int ar[]=new int[size];
	System.out.println("Enter the "+size+" Elements");
	int sum=0;
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
		sum=sum+ar[i];
	}
	System.out.println("Array is : "+Arrays.toString(ar));
	System.out.println("Sum of elemnts is : "+sum);

	
}
}
