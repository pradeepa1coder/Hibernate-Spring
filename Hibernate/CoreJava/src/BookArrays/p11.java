package BookArrays;

public class p11 {
public static void main(String[] args) {
	int ar[]= {50,28,1,100,153,125,137};
	
	int c=countEvens(ar);
	System.out.println("Upto 100 total Evens are : "+c);
	
}
public static int countEvens(int[] ar) {
	int count=0;
	for(int i:ar)
	{
		if(i<=100)
		{
			boolean b=isEven(i);
			if(b)
				count++;
		}
	}
	return count;
	
}
private static boolean isEven(int n) 
{
	if(n%2==0)
		return true;
	else
		return false;
			
}
}
