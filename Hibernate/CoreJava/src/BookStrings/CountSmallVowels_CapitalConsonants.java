package BookStrings;

public class CountSmallVowels_CapitalConsonants {
public static void main(String[] args) {
	String str="ShiVaMOGhA";
	int svowels=0,cpconsonants=0;
	for(int i=0;i<str.length();i++) 
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			svowels++;
		if(ch>='A'&&ch<='Z')
		{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				continue;
			else
				cpconsonants++;
		}
	}
	System.out.println("Total small vowels are : "+svowels);
	System.out.println("Total Capital Consonants are : "+cpconsonants);
}
}
