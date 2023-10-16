package BookStrings;

public class CountSmallVowels {
public static void main(String[] args) {
	String str="havEri";
	int vowels=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z')//for small letters
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowels++;
			
		}
	}
	System.out.println("total vowels of given string : "+vowels);
}
}
