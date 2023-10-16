package Arrays;

import java.util.Arrays;

public class BruteForceSort {
public static void main(String[] args) {
	int [] ar= {2,1,0,4,6,4,5};
	System.out.println(Arrays.toString(ar));
	
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
	System.out.println(Arrays.toString(ar));
}
}
