package BookArrays;

import java.util.Arrays;

public class p21 {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(ar));
		int rev[] = isReverse(ar);// 1st way
		int rev1[] = isRevMethod(ar);// 2nd way
		System.out.println(Arrays.toString(rev));
		System.out.println(Arrays.toString(rev1));
	}

	public static int[] isReverse(int[] ar) 
	{
		int nar[] = new int[ar.length];
		int j=0;
			for (int i = ar.length - 1; i >= 0; i--)
			{
				nar[j] = ar[i];
				j++;
			}
		return nar;
	}
	
	public static int[] isRevMethod(int ar[]) {
		int i=0;
		int j=ar.length-1;
		
		while(i<j) 
		{
		int	temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
			
		}
		return ar;
		
	}
	
}
//[10, 20, 30, 40, 50]
//[50, 40, 30, 20, 10]

