package YPatterns;

public class p20 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int s=1;s<=i-1;s++)
		{
			System.out.print(" ");
		}
		int var=1;
		for(int j=n;j>=i;j--) {
			System.out.print(var++);
		}
		System.out.println();
	}
}
}
