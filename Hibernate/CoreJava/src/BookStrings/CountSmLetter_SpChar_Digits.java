package BookStrings;

public class CountSmLetter_SpChar_Digits {
	public static void main(String[] args) {
		String str = "g2a^jen5d%ra8g#ad6a@";

		int smalls = 0, digits = 0, spchar = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				smalls++;
			else if (ch >= '0' && ch <= '9')
				digits++;
			else if (ch >= 'A' && ch <= 'Z')
				continue;
			else
				spchar++;
		}
		System.out.println("Total smalls are : " + smalls);
		System.out.println("total special characters are : " + spchar);
		System.out.println("Total digits are : " + digits);

	}

}
