package BookArrays;

import java.util.Arrays;

public class p23 {
public static void main(String[] args) {
	int ar[]= {10,20,30,40,50};
	int ind=2;
	int ele=100;
	System.out.println("before inserting "+Arrays.toString(ar));
	int nar[]=isInsert(ar,ind,ele);
	System.out.println("After inserting "+Arrays.toString(nar));
}
public static int[] isInsert(int[] ar,int ind,int ele) {
	int[] nar=new int[ar.length+1];
	
	nar[ind]=ele;
	for (int i = 0; i < ar.length; i++) {
		if(i<ind)
			nar[i]=ar[i];
		else
			nar[i+1]=ar[i];
	}
	return nar;
	
}
}
