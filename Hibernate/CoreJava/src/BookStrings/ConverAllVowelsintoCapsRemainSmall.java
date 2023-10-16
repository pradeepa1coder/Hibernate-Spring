package BookStrings;

public class ConverAllVowelsintoCapsRemainSmall
{
	public static void main(String[] args) 
	{
		String str = "aeiou XYZ";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				ch[i] = (char) (ch[i] - 32);
			} 
			else if (ch[i] >= 'A' && ch[i] <= 'Z') 
			{
				if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
					continue;
				else
					ch[i] = (char) (ch[i] + 32);
			}
		}
		str = new String(ch);
		System.out.println(str);
	}
}
