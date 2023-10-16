package Arrays;

import java.util.Arrays;

public class SumOfEle {
public static void main(String[] args) {
	int[] ar= {1,22,30,26,50,60};
	for(int i=0;i<ar.length;i++) {
		int ele=ar[i];
		int sum=0;
		if(ele>9) 
		{
			while(ele!=0) {
				int d=ele%10;
				 sum=sum+d;
				ele=ele/10;
			}
			ar[i]=sum;

		}
		else {
			ar[i]=ele;
		}
	}
	System.out.println(Arrays.toString(ar));


}
}
