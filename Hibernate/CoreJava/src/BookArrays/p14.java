package BookArrays;

public class p14 {
public static void main(String[] args) {
	int ar[]= {10,15,99,827,829,997,1231};
	int count=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]<=1000)
		{
			boolean b=isPrime(ar[i]);
			if(b) {
				count++;
			}
		}
	}
	System.out.println("count of prime no's upto 1000 are : "+count);
}
public static boolean isPrime(int n) {
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
			return false;
	}
	return true;
}
}
