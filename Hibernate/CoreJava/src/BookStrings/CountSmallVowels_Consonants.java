package BookStrings;

public class CountSmallVowels_Consonants {
public static void main(String[] args) {
	String str="DavAnAgerE";
	int vowels=0,consonants=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowels++;
			else
				consonants++;
		}
	}
	System.out.println("Total vowels are : "+vowels);
	System.out.println("Total consonants are : "+consonants);
}
}
