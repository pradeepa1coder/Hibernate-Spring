package BookNumberSystem;

import java.util.Scanner;

public class p13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the 2 digit no only");
	int no=sc.nextInt();
	int d1=no/10;
	int d2=no%10;
if(no==d1+d2 + d1*d2)
	System.out.println("Its a special 2 digit number");
else
	System.out.println("Its not a special 2 digit number");
}
}
