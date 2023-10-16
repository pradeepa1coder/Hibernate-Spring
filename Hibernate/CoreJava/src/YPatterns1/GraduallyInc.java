package YPatterns1;

public class GraduallyInc {
public static void main(String[] args) {
	int n=5;	int x=n;
	for(int i=1;i<=n;i++) {
		int count=1;
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
			count++;
		}
		for(int j=1;j<=i;j++) {
			System.out.print(count);
			count++;
		}
		System.out.println();
	}
}
}
