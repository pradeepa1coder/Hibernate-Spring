package BookArrays;

import java.util.Arrays;

public class p27 {
public static void main(String[] args) {
	int ar1[]= {10,2,5,20};
	int ar2[]= {25,10,20};
	
	int[] nar=sortedMerge(ar1,ar2);
	System.out.println(Arrays.toString(nar));
}
public static int[] sortedMerge(int[] ar1,int[] ar2) {
	int mar[]=merging(ar1,ar2);
	int[] sar=isSort(mar);
	return sar;
}

public static int[] merging(int[] ar1,int[] ar2) {
	int[] nar=new int[ar1.length+ar2.length];
	for(int i=0;i<ar1.length;i++) {
		nar[i]=ar1[i];
	}
	for(int i=0;i<ar2.length;i++) {
		nar[ar1.length+i]=ar2[i];
	}
	return nar;
}
private static int[] isSort(int[] ar) 
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]>ar[j]) 
			{
				int	temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	
	return ar;
}
}
