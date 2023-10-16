package YPatterns;

public class p12 {
public static void main(String[] args) {
	int n=4;int var=1;
	for(int i=1;i<=n;i++) {
		for(int j=n;j>=i;j--) {
			System.out.print(var++ +" ");
		}
		System.out.println();
	}
}
}
