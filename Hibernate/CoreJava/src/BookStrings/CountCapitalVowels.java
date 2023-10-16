package BookStrings;

public class CountCapitalVowels {
	public static void main(String[] args) {
		String str = "prOgrammIng";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				count++;
		}
		System.out.println("total capital counts are : " + count);
	}
}
