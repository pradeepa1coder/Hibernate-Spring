package Arrays;

public class LengthyName {
public static void main(String[] args) {
	String[] ar= {"bat","ab","pradeep","bare"};
	String big=ar[0];
	for(int i=1;i<ar.length;i++) {
		if(ar[i].length()>big.length()) {
			big=ar[i];
		}
	}
	System.out.println("biggest name is : "+big);
}
}
