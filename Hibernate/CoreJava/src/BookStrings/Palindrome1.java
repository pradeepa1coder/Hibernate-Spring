package BookStrings;

public class Palindrome1 {
public static void main(String[] args) {
	String str="malayalam";
	String ns="";
	for(int i=str.length()-1;i>=0;i--)
	{
		char ch=str.charAt(i);
		 ns=ns+ch;
	}
	if(str.equals(ns))
		System.out.println("its a palindrome");
	else
		System.out.println("its not a palindrome");
}
}
