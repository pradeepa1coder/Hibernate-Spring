package Arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int ar[] = { 6, 5, 4, 3, 2, 1 };
		System.out.println("before sorting : " + Arrays.toString(ar));

		for (int i = 0; i < ar.length-1; i++) 
		{
			for (int j = 0; j < ar.length - 1-i; j++)
			{
				if (ar[j] > ar[j + 1]) 
				{
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		System.out.println("after sorting : " + Arrays.toString(ar));

	}

}
