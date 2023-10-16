package BookStrings;
//	WJPT convert all vowels into small remaining all capital
public class ConverAllVowelsintoSmallRemainCaps 
{
	public static void main(String[] args) 
	{
		String str = "aEIOuxYZ";
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{
		  if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
			{
				ch[i] = (char) (ch[i] + 32);
			}
		  else if(ch[i]>='a'&ch[i]<='z')
		  {
			  if(ch[i] == 'a'|| ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
				  	continue;
			  else
				  ch[i]=(char)(ch[i]-32);
				  
		  }
			
		}
		str = new String(ch);
		System.out.println(str);
	}
}
