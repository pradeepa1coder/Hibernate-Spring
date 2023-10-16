package BookNumberSystem;

import java.util.Scanner;

public class p33 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		String num = sc.next();//	1204

		char ch[] = num.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[0] == '0') {
				System.out.println("Its not a Duck no");
				return;
			}
			else {
				if (ch[i] == '0')
					count++;
			}
		}
		if (count > 0)
			System.out.println("its a Duck");
		else
			System.out.println("its not a Duck");

	}
}
