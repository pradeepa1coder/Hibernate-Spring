package Strings;

import java.util.Arrays;

public class BubbleSortArray {
	public static void main(String[] args) {
		int ar[] = { 5, 2, 1, 0, 4, 9, 8, 0 };
		System.out.println("before sorting : " + Arrays.toString(ar));
		
		
		for (int i = 0; i < ar.length - 1; i++)
		{
			for (int j = 0; j < ar.length - 1-i; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j + 1];
					ar[j + 1] = ar[j];
					ar[j] = temp;

				}
			}
		}
		System.out.println("after sorting : " + Arrays.toString(ar));

	}
}
