package BookStrings;

public class Palindrome2 {

	public static void main(String[] args) {
		String str = "never odd or even";
		String ns = "";
		
		str=str.replaceAll(" " , "");//***********//
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			ns=ns+ch;
		}
		
		if (str.equals(ns))
			System.out.println("its a palindrome");
		else
			System.out.println("its not a palindrome");

	}
}