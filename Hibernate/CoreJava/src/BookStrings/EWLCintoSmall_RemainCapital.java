package BookStrings;
// covert every word last letter into small,remaining are capital
public class EWLCintoSmall_RemainCapital {
	public static void main(String[] args) {
		String str = "PRADEEP is a GOOD Boy";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (i == ch.length-1 && ch[i] != ' '||ch[i] != ' ' && ch[i + 1] == ' ' )
			{
				if (ch[i] >= 'A' && ch[i] <= 'Z')
					ch[i] = (char) (ch[i] + 32);
			}
			else 
			{
				if (ch[i] >= 'a' && ch[i] <= 'z')
					ch[i] = (char) (ch[i] - 32);

			}
		}
		str = new String(ch);
		System.out.println(str);
	}
}
