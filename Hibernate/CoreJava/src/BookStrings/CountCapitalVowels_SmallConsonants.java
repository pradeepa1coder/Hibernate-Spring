package BookStrings;

public class CountCapitalVowels_SmallConsonants {
public static void main(String[] args) {
	String str="HArIhaRa";
	int cpvowels=0,smconsonents=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			cpvowels++;
		else if(ch>='a'&&ch<='z')
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				continue;
			else
				smconsonents++;
		}
	}
	System.out.println("Total Capital vowels are : "+cpvowels);
	System.out.println("Total small consonants are : "+smconsonents);
}
}
