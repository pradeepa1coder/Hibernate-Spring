package BookStrings;

public class CountCaptalVowels_SmallVowels {
public static void main(String[] args) {
	String str="chikkAmangLUru";
	int smvowels=0,cpvowels=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			smvowels++;
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			cpvowels++;
	}
	System.out.println("Total capital vowels are : "+cpvowels);
	System.out.println("Total small vowels are : "+smvowels);
}
}
