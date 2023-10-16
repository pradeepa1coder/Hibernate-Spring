package BookArrays;

import java.util.Arrays;

public class p25 {
	public static void main(String[] args) {
		int ar1[]= {10,20,30,40};
		int ar2[]= {100,200};
		int ind=2;
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		int[] nar=isInserArray(ar1,ar2,ind);
		System.out.println(Arrays.toString(nar));
		
	}
	public static int[] isInserArray(int[] ar1,int[] ar2,int ind) {
		int nar[]=new int[ar1.length+ar2.length];
		int tempind=ind;
		System.out.println(ar2.length+"<--->");
		for(int i=0;i<ar2.length;i++) {
			nar[ind]=ar2[i];
			ind++;
		}

		for(int i=0;i<ar1.length;i++) 
		{
			if(i<tempind)
				nar[i]=ar1[i];
			else
				nar[ar2.length+i]=ar1[i];
		}
		return nar;
	}

}
