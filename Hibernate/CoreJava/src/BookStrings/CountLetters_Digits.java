package BookStrings;

public class CountLetters_Digits {
	public static void main(String[] args) {
		String str = "ba6n5gaL7o4r2e9";
		int letters = 0, digits = 0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z')
				letters++;
			else if (ch[i] >= '0' && ch[i] <= '9')
				digits++;
		}
		System.out.println("Total letters are : " + letters);
		System.out.println("Total digits are : " + digits);
	}
}
