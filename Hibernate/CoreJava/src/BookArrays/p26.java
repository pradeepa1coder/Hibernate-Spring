package BookArrays;

import java.util.Arrays;

public class p26 {
public static void main(String[] args) {
	int ar1[]= {10,20,30,40};
	int ar2[]= {100,200,20,30,40};
	int[] nar=isZigzag(ar1,ar2);
	System.out.println(Arrays.toString(nar));
	
}

private static int[] isZigzag(int[] ar1, int[] ar2) {

	int[] nar=new int[ar1.length+ar2.length];
	
	int x=0;int i=0;
	for(;i<ar1.length&&i<ar2.length;i++) {
		nar[x]=ar1[i];
		x++;
		nar[x]=ar2[i];
		x++;
	}
	for(;i<ar1.length;i++) {
		nar[x]=ar1[i];
		x++;
	}
	for(;i<ar2.length;i++) {
		nar[x]=ar2[i];
		x++;
	}
	
	
	
	return nar;
}

}
