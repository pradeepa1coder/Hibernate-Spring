package BookStrings;

public class CountCapLetters$SpCharacters {
	public static void main(String[] args) {
		String str = "GaJend#Rag&(DA)";
		int cletters = 0, spcharcters = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				cletters++;
			else if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')
				continue;
			else
				spcharcters++;

		}
		System.out.println("Total capital letters are : " + cletters);
		System.out.println("Total Special Characters are : " + spcharcters);
	}
}
