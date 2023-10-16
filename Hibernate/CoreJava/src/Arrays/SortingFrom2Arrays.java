package Arrays;

import java.util.Arrays;

public class SortingFrom2Arrays {
	public static void main(String[] args) {
		int [] ar1= {2,4,5,8};
		int [] ar2= {0,1,2,3,4};
		int [] ar3=new int[ar1.length+ar2.length];
		
		for(int i=0;i<ar1.length;i++)
		{
			ar3[i]=ar1[i];
		}
		
		for(int i=0;i<ar2.length;i++)
		{
			ar3[ar1.length+i]=ar2[i];
		}
		
	Arrays.sort(ar3);
	System.out.println(ar3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<ar3.length;i++)
//		{
//			while(j<ar1.length)
//			{
//				ar3[i]=ar1[j];
//				i++;j++;
//			}
//			while(k<ar1.length)
//			{
//				
//			}
//		}
		System.out.println(Arrays.toString(ar3));
	}

}
