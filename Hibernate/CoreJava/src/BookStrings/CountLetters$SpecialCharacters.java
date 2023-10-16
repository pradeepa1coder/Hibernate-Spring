package BookStrings;

public class CountLetters$SpecialCharacters {
public static void main(String[] args) {
	String str="agiv>va<#mo$gga@";
	int letters=0,spcharcters=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z' ||ch>='A'&&ch<='Z')
			letters++;
		else if(ch>='0'&&ch<='9')
			continue;
		else
			spcharcters++;
	}
	System.out.println("Total Letters are : "+letters);
	System.out.println("Total Specail Characters are  : "+spcharcters);
}
}
