package BookArrays;

import java.util.Arrays;

public class p8 {
	public static void main(String[] args) {
		int ar[]= {1,20,3,5,10};
		System.out.println(Arrays.toString(ar));
		int count=countOdds(ar);
		System.out.println("The no.of odd no are : "+count);
	}
	public static int countOdds(int[] ar) {
		int count=0;
		for(int i:ar) 
		{
			boolean b=isOdd(i);
			if(b)
				count++;
		}
		return count;
	}
	public static boolean isOdd(int n) {
		if(n%2!=0)
			return true;
		else
			return false;
	}
}
