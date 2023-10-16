package BookStrings;

public class CountCapitals_Smalls {
	public static void main(String[] args) {
		String str = "BanGaLore";
		int small = 0, capital = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				small++;
			else if (ch >= 'A' && ch <= 'Z')
				capital++;
		}
		System.out.println("Total Captials are : " + capital);
		System.out.println("Total smalls are : " + small);
	}
}
