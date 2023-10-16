package YPatterns1;

public class Tuff {
public static void main(String[] args) {
	int n=7,sp=n/2,st=1,temp=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print("  ");
		}
		int x=temp;
		for(int j=1;j<=st;j++) {
			System.out.print(x+" ");
			if(j<=st/2)
				x--;
			else
				x++;
		}
		if(i<=n/2) {
			temp++;
			st=st+2;
			sp--;
		}
		else {
			temp--;
			st=st-2;
			sp++;
		}
		System.out.println();
	}
}
}
