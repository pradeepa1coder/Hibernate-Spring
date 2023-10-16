package BookNumberSystem;

import java.util.Scanner;

public class p55 {
	static int count;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first sub mark's");
	Double a=sc.nextDouble();
	count++;
	System.out.println("Enter the second sub mark's");
	Double b=sc.nextDouble();
	count++;
	System.out.println("Enter the third sub mark's");
	Double c=sc.nextDouble();
	count++;
	System.out.println("Enter the fourth sub mark's");
	Double d=sc.nextDouble();
	count++;
	
	double avg=(a+b+c+d)/count;
	System.out.println("avg of total marks is :"+avg+" %");
}
}
