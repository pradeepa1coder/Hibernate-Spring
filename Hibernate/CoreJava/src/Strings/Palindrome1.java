package Strings;

public class Palindrome1 {
public static void main(String[] args) {
	String str="malayalam";
	isPalindrome(str);
}
public static void isPalindrome(String str)
{
	char ch[]=str.toCharArray();
	String rev="";
	for(int i=0;i<ch.length;i++)
	{
		rev=ch[i]+rev;
	}
	if(rev.equals(str))
		System.out.println("its a palindrome");
	else
		System.out.println("its not a palindrome");
}
}

