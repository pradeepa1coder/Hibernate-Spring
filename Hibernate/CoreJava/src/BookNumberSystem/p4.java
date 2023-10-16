package BookNumberSystem;

import java.util.Scanner;

public class p4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the side of the square");
	int s=sc.nextInt();
	System.out.println("Area : "+s*s);
	System.out.println("Perimeter : "+4*s);
}
}
