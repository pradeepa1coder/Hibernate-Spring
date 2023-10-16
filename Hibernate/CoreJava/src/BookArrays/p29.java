package BookArrays;

public class p29 {
public static void main(String[] args) {
	int ar[]= {64,1234,234,567,226,456};
		isMagic(ar);
}
public static void isMagic(int []ar) 
{
	for(int i=0;i<ar.length;i++)
	{
		
		int	ele=ar[i];
	
		while(ele>9) 
		{
			int sum=0;
			while(ele!=0) 
			{
				int d=ele%10;
				sum=sum+d;
				ele=ele/10;
				
			}
			
			if(sum==1) 
			{
				System.out.println(ar[i]);
			}
			ele=sum;
		}

	}
}
}
