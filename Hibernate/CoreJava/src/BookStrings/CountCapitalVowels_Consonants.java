package BookStrings;

public class CountCapitalVowels_Consonants {
public static void main(String[] args) {
	String str="cHiTrAdURGa";
	int vowels=0;int consonants=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='A'&&ch<='Z')// for capital letters
		{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vowels++;
			else
				consonants++;
		}
	}
	System.out.println("Total Capital vowels are : "+vowels);
	System.out.println("Total Capital Consonants are : "+consonants);
}
}
