package BookArrays;

import java.util.Arrays;

public class p1 {
public static void main(String[] args) {
	double ar[]= {78.05 ,65.05,45.02,76.06,98.65};
	System.out.println(Arrays.toString(ar));
	
	double big=ar[0];
	for(int i=1;i<ar.length;i++)
	{
		if(ar[i]>big)
			big=ar[i];
	}
	System.out.println("Hihest pers is : "+big);
}
}
