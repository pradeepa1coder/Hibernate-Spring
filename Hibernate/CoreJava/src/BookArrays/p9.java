package BookArrays;

public class p9 {
public static void main(String[] args) {
	int ar[]= {5,29,1,100,153,125,137};
	
	int c=isCountPrimes(ar);
	System.out.println("Upto 100 total primes are : "+c);
	
}
public static int isCountPrimes(int[] ar) {
	int count=0;
	for(int i:ar)
	{
		if(i<=100)
		{
			boolean b=isPrime(i);
			if(b)
				count++;
		}
	}
	return count;
	
}
private static boolean isPrime(int n) 
{
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
			return false;
	}
	return true;
}
}
