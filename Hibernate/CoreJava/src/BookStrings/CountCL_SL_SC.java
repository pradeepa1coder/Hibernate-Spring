package BookStrings;

public class CountCL_SL_SC {
	public static void main(String[] args) {
		String str = "Bag@LAk+oT%e";
		int capletters = 0, smaletters = 0, spcharcters = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				capletters++;
			else if (ch >= 'a' && ch <= 'z')
				smaletters++;
			else if (ch >= '0' && ch <= '9')
				continue;
			else
				spcharcters++;

		}
		System.out.println("Total capital letters are : " + capletters);
		System.out.println("Total small letters are : " + smaletters);
		System.out.println("Total special charactres are : " + spcharcters);
	}
}
