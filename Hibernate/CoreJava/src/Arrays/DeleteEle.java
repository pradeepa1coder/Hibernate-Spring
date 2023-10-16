package Arrays;

import java.util.Arrays;

public class DeleteEle {
public static void main(String[] args) {
	int[] ar= {10,20,30,40,50,60};
	int[] arr=new int[ar.length-1];
	int j=0,ind=2;
	for(int i=0;i<arr.length;i++) {
		if(i<ind) 
		{
			arr[j]=ar[i];
			j++;
		}
		else 
		{
			arr[j]=ar[i+1];
			j++;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
