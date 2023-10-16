package YPatterns;

public class p17 {
public static void main(String[] args) {
	int n=5;
	
	for(int i=1;i<=n;i++) {
		for(int s=1;s<=n-i;s++) {
			System.out.print(" ");
		}
		int var=5;
		for(int j=1;j<=i;j++) {
			System.out.print(var--);
		}
		System.out.println();
	}
}
}
