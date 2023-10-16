package BookStrings;

public class CountSmVowels_CpCons_SpChar {
	public static void main(String[] args) {
		String str = "SHa$HA#pUrA@%";
		int smvowels = 0, cpconsonants = 0, spchar = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					smvowels++;
			} else if (ch >= 'A' && ch <= 'Z') {
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
					continue;
				else
					cpconsonants++;
			} else if (ch >= '0' && ch <= '9')
				continue;
			else
				spchar++;
		}
		System.out.println("Total small vowels are : " + smvowels);
		System.out.println("Total capital consonants are : " + cpconsonants);
		System.out.println("Total characters are : " + spchar);
	}
}
