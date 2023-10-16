package BookStrings;

public class CountSmVo_SmCons_SpChar {
	public static void main(String[] args) {
		String str = "baNg!A#LUru@%";
		int smvowels = 0, smconsonants = 0, spchar = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					smvowels++;
				else
					smconsonants++;
			} else if (ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')
				continue;
			else
				spchar++;
		}
		System.out.println("Total small vowels are : " + smvowels);
		System.out.println("Total small consonants are : " + smconsonants);
		System.out.println("Total special characters are  : " + spchar);

	}
}
