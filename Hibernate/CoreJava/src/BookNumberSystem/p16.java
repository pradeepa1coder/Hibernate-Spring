package BookNumberSystem;

import java.util.Scanner;

public class p16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day no to know the day name");
		int d = sc.nextInt();
		switch (d) {
		case 1:
			System.out.println("Its Monday");
			break;
		case 2:
			System.out.println("Its Tuesday");
			break;
		case 3:
			System.out.println("Its Wednesday");
			break;
		case 4:
			System.out.println("Its Thursday");
			break;
		case 5:
			System.out.println("Its Friday");
			break;
		case 6:
			System.out.println("Its Saturday");
			break;
		case 7:
			System.out.println("Its Sunday");
			break;
		default:
			System.err.println("please enter valid number ");

		}
	}
}
