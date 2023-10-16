package BookNumberSystem;

import java.util.Scanner;

/* Area =length*breath
 * Perimeter=2(length+breath)
 */
public class p3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of the rectangle");
	double l=sc.nextDouble();
	System.out.println("enter the breath of the rectangle");
	double b=sc.nextDouble();
	System.out.println("Area : "+l*b);
	System.out.println("Perimeter : "+(l+b)*2);
}
}
