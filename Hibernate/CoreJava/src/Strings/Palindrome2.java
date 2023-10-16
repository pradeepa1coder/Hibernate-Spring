package Strings;


public class Palindrome2 {
public static void main(String[] args) {
	String str="never odd or even";
	isPalindrome(str);
}
public static void isPalindrome(String str)//never odd or even
{
	String rev="";
	
	char ch[]=str.toCharArray();//{n e v e r  o d d   o r  e v e n}
	
	
	for(int i=0;i<ch.length;i++)
	{
		rev=ch[i]+rev;
	}
	System.out.println(rev);//neve ro ddo reven
	str=str.replaceAll(" ","");//neveroddoreven
	rev=rev.replaceAll(" ", "");//neveroddoreven

	
	if(str.equals(rev))
		System.out.println("its a palindrome ");
	else
		System.out.println("its not a palindrome ");
	

	
	
}
}


