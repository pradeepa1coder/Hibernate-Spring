package BookNumberSystem;

import java.util.Scanner;

public class p5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the pipe interms of centimeters");
	int cm=sc.nextInt();
	System.out.println("In meters : "+cm/100);
	System.out.println("In Foot : "+cm/30.48);
}
}
