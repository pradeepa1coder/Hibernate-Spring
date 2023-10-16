package NumberSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kodn {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int ar[]=new int[5];
	int j=0;
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			ar[j]=i;
			j++;
			
		}
		
	}
	
	for(int i=0;i<ar.length;i++) {
		if(ar[i]!=0)
		System.out.println(ar[i]);
	}
//Object []arr= {1,2,'d',"kkdjvnk"};	
//
//System.out.println(Arrays.toString(arr));
}
}
