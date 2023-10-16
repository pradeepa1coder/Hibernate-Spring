package BookArrays;

public class p16 {
public static void main(String[] args) {
	int ar[]= {50,28,1,1000,153,125,137};
	
	int c=countEvens(ar);
	System.out.println("Upto 1000 total Evens are : "+c);
	
}
public static int countEvens(int[] ar) {
	int count=0;
	for(int i:ar)
	{
		if(i<=1000)
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

