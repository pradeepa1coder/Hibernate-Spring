package YPatterns1;

public class M {
public static void main(String[] args) {
	int n=9;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1||j==n||i==j&&i<=n/2+1||i+j==n+1&&j>=n/2+1)
			System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
