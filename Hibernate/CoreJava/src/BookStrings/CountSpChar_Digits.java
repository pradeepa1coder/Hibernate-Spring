package BookStrings;

public class CountSpChar_Digits {
	public static void main(String[] args) {
		String str = "@123#9%3!";
		int digits = 0, spcharacters = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9')
				digits++;
			else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
				continue;
			else
				spcharacters++;
		}
		System.out.println("Total special characters are :" + spcharacters);
		System.out.println("Total digits are " + digits);
	}
}
