
class A {
	public static void main(String[] args) {
		String str = "J$SPIDE#R 123";

		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				System.out.print((int) ch[i] - 64);
			} else {
				System.out.print(ch[i]);
			}

		}

	}

}

class B {
	public static void main(String[] args) {
		String str = "minimum";
		char[] ch = str.toCharArray();
		char c = ch[0];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == c) {
				count++;
				System.out.print(count);
			} else {
				System.out.print(ch[i]);
			}

		}
	}
}

public class SaiProj {
	public static void main(String[] args) {
	int start='b'-'a';	//1
	int end=('d'*'d')-('d'*'Z');//1000
	String str="aaaaaaaaaa";//10
	for(int i= start;i<=(str.length()*str.length()*str.length());i++) {
		System.out.println(i);
	}
	}
}
