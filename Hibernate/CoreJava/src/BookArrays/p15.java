package BookArrays;

public class p15 {
public static void main(String[] args) {
	int ar[]= {29,1,107,153,125,137};
	
	int c=countOdds(ar);
	System.out.println("Upto 1000 total odds are : "+c);
	
}
public static int countOdds(int[] ar) {
	int count=0;
	for(int i:ar)
	{
		if(i<=1000)
		{
			boolean b=isOdd(i);
			if(b)
				count++;
		}
	}
	return count;
	
}
private static boolean isOdd(int n) 
{
	if(n%2==0) 
		return false;
	else
	return true;
			
}
}

