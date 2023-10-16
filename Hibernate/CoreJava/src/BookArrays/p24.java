package BookArrays;

import java.util.Arrays;

public class p24 {
public static void main(String[] args) {
	int ar[]= {10,20,30,40,50};
	int ind=2;
	System.out.println("Before Deleting "+Arrays.toString(ar));
	int[] nar=isDelete(ar,ind);
	System.out.println("After Deleting "+Arrays.toString(nar));
	
}
public static int[] isDelete(int[]ar,int ind) {
	int[] nar=new int[ar.length-1];
	
	for(int i=0;i<nar.length;i++) {
		if(i<ind)
			nar[i]=ar[i];
		else
			nar[i]=ar[i+1];
	}
	return nar;
}
}
