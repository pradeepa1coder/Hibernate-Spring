package YPatterns1;

public class NameInc {
public static void main(String[] args) {
	String str="NIKESH";
	char[]ch=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(ch[j]+" ");
		}
		System.out.println();
	}
}
}
