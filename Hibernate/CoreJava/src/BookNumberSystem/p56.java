package BookNumberSystem;

public class p56 {
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
public static void main(String[] args) 
{
	int n1=10,n2=50;int sum=0;
	for(int i=n1;i<=n2;i++) {
		boolean rs=isPrime(i);
		
		if(rs) {
			System.out.println(i);
			sum=sum+i;
		}
	}
	System.out.println("sum of prime no's is : "+sum);
}

}
