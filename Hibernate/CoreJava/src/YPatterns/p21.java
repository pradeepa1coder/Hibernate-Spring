package YPatterns;

public class p21 {
	public static void main(String[] args) {
		int n=5;int var=5;
		for(int i=1;i<=n;i++) {
			
			for(int s=1;s<=i-1;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=n;j>=i;j--) {
				System.out.print(var);
			}
			var--;
			System.out.println();
		}
	}
}
