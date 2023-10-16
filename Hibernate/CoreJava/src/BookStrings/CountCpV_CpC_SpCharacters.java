package BookStrings;

public class CountCpV_CpC_SpCharacters {
	public static void main(String[] args) {
		String str = "BEnG^AL*URu&#@";
		int capVowels = 0, capConsonants = 0, spchar = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') 
			{
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
					capVowels++;
				else
					capConsonants++;
			}
			else if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')
				continue;
			else
				spchar++;
		}
		System.out.println("Total Capital vowels  are : " + capVowels);
		System.out.println("Total Capital consonants are : " + capConsonants);
		System.out.println("Total sp characters are : " + spchar);

	}

}
