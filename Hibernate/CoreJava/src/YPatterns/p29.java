package YPatterns;

public class p29 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=i-1;s++) {
				System.out.print(" ");
			}
			char ch='A';
			for(int j=n;j>=i;j--) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}
