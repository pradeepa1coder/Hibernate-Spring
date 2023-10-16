package BookNumberSystem;

import java.util.Scanner;

public class p28 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check Atomorphic or not");
	int n=sc.nextInt();
	boolean rs=isAtomorphic(n);
	System.out.println(rs?"its automorphic":"its not a automorphic");

}

private static boolean isAtomorphic(int n)
{
	 //n=5
	//sq=25
	int sq=n*n;
	while(n!=0)
	{
		if(n%10 !=sq%10)
		{
			return false;
		}
		n=n/10;
		sq=sq/10;
	}
	return true;
}
}
