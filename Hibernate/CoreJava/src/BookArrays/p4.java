package BookArrays;

public class p4 {
public static void main(String[] args) {
	int ar[]= {5,4,6,9,14,2};
	int s=getBiggest(ar);
	System.out.println("The biggest element is :"+s);
}
public static int getBiggest(int[] ar) {
	int big=ar[0];
	for(int i=1;i<ar.length;i++) 
	{
		if(ar[i]>big)
		big=ar[i];
	}
	return big;
}
}