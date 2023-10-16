package Strings;

public class FrequencyOfEachCharacter26 {
	public static void main(String[] args) {
		String str = "Anitha  is a1 Good girl ";
		frequency(str);
	}

	public static void frequency(String str) 
	{
		int count[]=new int[26];
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				count[ch[i]-65]++;
			else if(ch[i]>='a'&&ch[i]<='z')
				count[ch[i]-97]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			System.out.println((char)(i+97)+"-->"+count[i]);
		}
	}
}
