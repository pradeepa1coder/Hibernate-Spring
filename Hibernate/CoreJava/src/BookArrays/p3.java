package BookArrays;

public class p3 {
public static void main(String[] args) {
	int ar[]= {5,4,6,9,14,2};
	int s=getSmallest(ar);
	System.out.println("The smallest elements is :"+s);
}
public static int getSmallest(int[] ar) {
	int small=ar[0];
	for(int i=1;i<ar.length;i++) 
	{
		if(ar[i]<small)
		small=ar[i];
	}
	return small;
}
}
