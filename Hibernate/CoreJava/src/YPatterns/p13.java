package YPatterns;

public class p13 {
public static void main(String[] args) {
	int n=5; 
	for(int i=1;i<=n;i++) {
		char ch='A';
		for(int j=n;j>=i;j--) {
			System.out.print(ch++ +" ");
		}
		System.out.println();
	}
}
}
