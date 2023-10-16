package NumberSystem;

public class ReverseTheNo {
public static void main(String[] args) {
	int no=127;int rev=0;
	System.out.println(no);
	while(no!=0) {
		int d=no%10;
		rev=rev*10+d;
		no=no/10;
		
	}
	System.out.println(rev);
}
}
