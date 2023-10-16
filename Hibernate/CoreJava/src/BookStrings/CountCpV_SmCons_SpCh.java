package BookStrings;

public class CountCpV_SmCons_SpCh {
	public static void main(String[] args) {
		String str = "sha$HApUrA@%";
		int capVow = 0, smconsonants = 0, spcharctrs = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				capVow++;
			else if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					continue;
				else
					smconsonants++;
			} else if (ch >= '0' && ch <= '9')
				continue;
			else

				spcharctrs++;

		}
		System.out.println("Total Capital vowel letters are : " + capVow);
		System.out.println("Total small consonants are : " + smconsonants);
		System.out.println("Total special characters are : " + spcharctrs);
	}
}
