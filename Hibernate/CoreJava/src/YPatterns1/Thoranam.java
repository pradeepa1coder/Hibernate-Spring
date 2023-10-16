package YPatterns1;

public class Thoranam {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >=1; i--) 
		{
			int x = 1;
			for (int j = 1; j <=2 * n-1; j++) 
			{
				if (x <= i)
					System.out.print(x);
				else
					System.out.print(" ");
				
				if (j < n)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}

}
