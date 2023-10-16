package BookStrings;

public class CountVowels_Consonants {
public static void main(String[] args) {
	String str="Programming";
	int vowels=0,consonants=0;
	for(int i=0;i<str.length();i++) 
	{
		char ch=str.charAt(i);
		
		if(ch>='a'&&ch<='z')//for small letters
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowels++;
			else
				consonants++;
		}
		
		if(ch>='A'&&ch<='Z')// for capital letters
		{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vowels++;
			else
				consonants++;
		}
	}
	System.out.println("Total vowels are : "+vowels);
	System.out.println("Total consonants are : "+consonants);

}
}
