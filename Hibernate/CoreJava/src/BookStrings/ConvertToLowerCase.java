package BookStrings;

public class ConvertToLowerCase {
	public static void main(String[] args) {
		String str = "BAngALoRE";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z')
			{
				ch[i] = (char) (ch[i] + 32);
			}

		}
		String nstr = new String(ch);
		System.out.println(nstr);//bangalore
	}
}
