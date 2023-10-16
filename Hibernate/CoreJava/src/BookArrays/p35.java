package BookArrays;

public class p35 {
public static void main(String[] args) {
	int ar[] = { 10, 2, 10, 30, 60, 2,0, 50 };
		int[] nar=	aseOrder(ar);
		System.out.println("smallest element of an array is : " +nar[0]);
		System.out.println("Biggest element of an array is : "+nar[nar.length-1]);
		
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
