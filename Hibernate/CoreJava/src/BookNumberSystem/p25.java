package BookNumberSystem;

import java.util.Scanner;

public class p25 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int no=sc.nextInt();
	
	if(no%3==0&&no%5==0)
		System.out.println("Sanju weds Geetha");
	else if(no%3==0)
		System.out.println("Sanju");
	else if(no%5==0)
		System.out.println("Geetha");
	else
		System.out.println("Let's Breakup");
		
}
}
