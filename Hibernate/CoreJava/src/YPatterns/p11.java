package YPatterns;

public class p11 {
public static void main(String[] args) {
	int n=5;
	
	for(int i=1;i<=n;i++) {
		int var=1;
		for(int j=n;j>=i;j--) {
			System.out.print(var);
			var++;
		}
		
		System.out.println();
	}
}
}
