package BookStrings;

public class CountSmallLetters$SpecialCharacters {
public static void main(String[] args) {
	String str="Shi@/vaMo!gG%A";
	int sletters=0,spcharcaters=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z')
			sletters++;
		else if(ch>='A'&&ch<='Z')
			continue;
		else if(ch>='0'&&ch<='9')
			continue;
		else
			spcharcaters++;
	}
	System.out.println("Total small letters are : "+sletters);
	System.out.println("Total Special characters are : "+spcharcaters);
}
}
