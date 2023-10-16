package BookStrings;

public class ConvertToUpperCase {
	public static void main(String[] args) {
		String str = "rama is a good Boy";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		str = new String(ch);
		System.out.println(str);
	}
}
