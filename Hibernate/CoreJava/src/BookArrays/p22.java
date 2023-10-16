package BookArrays;

import java.util.Arrays;

public class p22 {
public static void main(String[] args) {
	int ar1[]= {1,2,3,4,5};
	int ar2[]= {10,20,30,40,50};
	
	int[] nar=isCombine(ar1,ar2);
	System.out.println(Arrays.toString(nar));
}
public static int[] isCombine(int[] ar1,int[] ar2)
{
	int[] nar= new int[ar1.length+ar2.length];
	int j=0;
	for(int i=0;i<ar1.length;i++) 
	{
				nar[j++]=ar1[i];
	}
	
	for(int i=0;i<ar2.length;i++) {
				nar[j]=ar2[i];
				j++;
	}
	return nar;
	
}
}
