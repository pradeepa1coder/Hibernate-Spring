package BookNumberSystem;

public class p44 {
	public static void main(String[] args) {
//	n=13->1^2+3^2=10->1^2+0^2=1

		int n = 13;//10
		int sum=0;
		while (n > 9) 
		{
			while(n!=0) 
			{
				int d=n%10;
				sum=sum+(d*d);
				n=n/10;
			}
			n=sum;
			sum=0;
			
		}
		
		if (n == 1)
			System.out.println("its a happy no");
		else
			System.out.println(" its not a happy no");
	}
}