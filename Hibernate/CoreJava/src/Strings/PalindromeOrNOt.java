package Strings;

public class PalindromeOrNOt {
public static void main(String[] args) {
	String str="mala yalaM";
	String rev="";
	char ch[]=str.toCharArray();
	
	for(int i=str.length()-1;i>=0;i--) 
	{
		rev=rev+ch[i];
	}
	str=str.replaceAll(" ","");
	rev=rev.replaceAll(" ", "");
	
	System.out.println(str);
	System.out.println(rev);
	System.out.println("====================");
	
	if(str.equalsIgnoreCase(rev)){
		System.out.println("palindrome");
	}
	else
		System.out.println("not a palindrome");
}
}
