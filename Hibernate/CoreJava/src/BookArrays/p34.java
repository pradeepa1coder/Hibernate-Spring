package BookArrays;


public class p34 {
	public static void main(String[] args) {
		int ar[] = { 10, 2, 10, 30, 40, 2, 50 };
		removeDuplicates(ar);
	}

	private static void removeDuplicates(int[] ar) {
		boolean []br=new boolean[ar.length];
		for(int i=0;i<ar.length;i++) 
		{
			for(int j=i+1;j<ar.length;j++) 
			{
				if(ar[i]==ar[j])
				{
					br[j]=true;
				}
			}
			
		}
		for(int i=0;i<ar.length;i++)
		{
			if(br[i]==false) 
			{
				System.out.print(ar[i]+" ");
				
			}
		}
	}
}
