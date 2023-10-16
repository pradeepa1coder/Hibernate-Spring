package Arrays;

import java.util.Arrays;

public class RotatingArray {
public static void main(String[] args) {
	int[] ar= {10,20,30,40,50};
	int noOftimes=2;
	
	
//	frotateArray(ar,noOftimes);
	brotateArray(ar,noOftimes);


	
}



private static void frotateArray(int[] ar, int n) {
	
	for(int i=1;i<=n;i++)
	{
		int temp=ar[0];
		for(int j=1;j<ar.length;j++) {
			ar[j-1]=ar[j];
		}
		ar[ar.length-1]=temp;
		
	}
	System.out.println(Arrays.toString(ar));
	
}
private static void brotateArray(int[] ar, int n) {
	for(int j=1;j<=n;j++) {
		int temp=ar[ar.length-1];//10,20,30,40,50
		for(int i=ar.length-2;i>=0;i--) {
			ar[i+1]=ar[i];
		}
		ar[0]=temp;
		
	}
	
	System.out.println(Arrays.toString(ar));

	
}
}
