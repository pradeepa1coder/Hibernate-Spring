package YPatterns1;

public class Vfib {
	public static void main(String[] args) {
		int n1=1,n2=2,n3=0;int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
					System.out.print(n1);
					n3=n1+n2;
					n1=n2;
					n2=n3;
				}else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
