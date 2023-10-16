package BookArrays;

public class p10 {
public static void main(String[] args) {
	int ar[]= {50,29,1,100,153,125,137};
	
	int c=countOdds(ar);
	System.out.println("Upto 100 total odds are : "+c);
	
}
public static int countOdds(int[] ar) {
	int count=0;
	for(int i:ar)
	{
		if(i<=100)
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
