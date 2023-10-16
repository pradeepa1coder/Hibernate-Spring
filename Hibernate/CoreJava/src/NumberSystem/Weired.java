package NumberSystem;

import java.util.Scanner;

public class Weired {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%2==0) 
	{
		if(n>20)
			System.out.println("Not weired");
		else if(n>=6&&n<=20)
			System.out.println("weired");
		else if(n>=2&&n<=5)
			System.out.println(" weired");
		
	}
	else
		System.out.println("weired");

}
}
