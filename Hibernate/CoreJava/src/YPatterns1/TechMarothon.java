package YPatterns1;

public class TechMarothon {
	
	public static void main(String[] args) {
		int ch=65;
		int n=4;int no=1;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
			
					System.out.print((char)ch++);
				
			}
			System.out.println();
		}
	}
}
