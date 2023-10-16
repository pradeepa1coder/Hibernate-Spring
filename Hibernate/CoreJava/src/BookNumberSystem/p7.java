package BookNumberSystem;

import java.util.Scanner;

public class p7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no");
	int no=sc.nextInt();
	if(no>0)
		System.out.println("Positive no");
	else if(no<0)
		System.out.println("Negative no");
	else
		System.out.println("it's Zero no");
}
}
