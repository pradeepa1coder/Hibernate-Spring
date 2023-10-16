package BookArrays;

import java.util.Arrays;

public class p32 {
public static void main(String[] args) {
	int ar[] = { 10, 2, 10, 30, 40, 2, 50 };
		int[] nar=	aseOrder(ar);
		System.out.println(Arrays.toString(nar));
}

private static int[] aseOrder(int[] ar) {
	for(int i=0;i<ar.length;i++) 
	{
		for(int j=i+1;j<ar.length;j++) 
		{
			if(ar[i]>ar[j])
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	return ar;
}
}
