package BookArrays;

import java.util.Arrays;

public class p7 {
public static void main(String[] args) {
	int ar[]= {20,3,5,10};
	System.out.println(Arrays.toString(ar));
	int count=countEvens(ar);
	System.out.println("The no.of even no are : "+count);
}
public static int countEvens(int[] ar) {
	int count=0;
	for(int i:ar) 
	{
		boolean b=isEven(i);
		if(b)
			count++;
	}
	return count;
}
public static boolean isEven(int n) {
	if(n%2==0)
		return true;
	else
		return false;
}
}
