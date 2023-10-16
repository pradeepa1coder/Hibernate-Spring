package BookStrings;

public class CountCpL_SpChar_Digits {
	public static void main(String[] args) {
		String str = "B3A@N6G$A7LO%R9E";
		int caps = 0, digits = 0, spchar = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				caps++;
			else if (ch >= '0' && ch <= '9')
				digits++;
			else if (ch >= 'a' && ch <= 'z')
				continue;
			else
				spchar++;
		}
		System.out.println("Total capitals are : " + caps);
		System.out.println("total special characters are : " + spchar);
		System.out.println("Total digits are : " + digits);
	}
}
