package YPatterns1;

public class x$n_j {
public static void main(String[] args) {
	int n=8;
	for(int i=1;i<=n;i++) {
		int x=i;
		for(int j=1;j<=i;j++) {
			System.out.print(x+" ");
			x=x+n-j;
		}
		System.out.println();
		
	}
}
}
