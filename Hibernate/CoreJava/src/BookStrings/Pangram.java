package BookStrings;

public class Pangram {
	public static void main(String[] args) 
	{
		String str = "AadBCFeGHIJKLMNOPQRSTUVWXYZ";

		char ch[] = str.toCharArray();
		int count[] = new int[26];
		
		for (int i = 0; i < str.length(); i++) 
		{
			if (ch[i] >= 'A' && ch[i] <= 'Z')
				count[ch[i] - 65]++;
			else if (ch[i] >= 'a' && ch[i] <= 'z')
				count[ch[i] - 97]++;
		}
		int ct=0;
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
				ct++;
		}
		if(ct>0)
			System.out.println("Its not a Pangram");
		else
			System.out.println("its a Pangram");
	}
}











