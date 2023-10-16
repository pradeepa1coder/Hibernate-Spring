package Strings;

public class CountConsVowel
{
public static void main(String[] args) {
	String str="I am a good Boy";
	 check(str);
}
public static void check(String str) 
{
	char ch[]=str.toCharArray();
	int cv=0,cc=0;
	for(int i=0;i<ch.length;i++)
	{
		 if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&& ch[i]<='z')
		{
			if(ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U' )
				cv++;
			else if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' )
				cv++;
			else
				cc++;
		}
			
	}
	System.out.println("vowels are "+cv);
	System.out.println("consonants "+cc);
	
}
}
