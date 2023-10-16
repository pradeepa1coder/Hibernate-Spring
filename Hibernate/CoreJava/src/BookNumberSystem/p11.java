package BookNumberSystem;

import java.util.Scanner;

public class p11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the weight kgs");
	double weight=sc.nextDouble();
	System.out.println("Enter the height in meters");
	double height=sc.nextDouble();
	
	System.out.println("BMI of person is : "+(weight/(height*height)));
	
}
}
