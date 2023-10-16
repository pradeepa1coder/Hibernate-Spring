package Strings;

public class PalindromeNew {
public static void main(String[] args) {
	String str1="never odd or even";
	String str2="";
	str1=str1.replaceAll(" ", "");
	char ch[]=str1.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		str2=str2+ch[i];
	}
	System.out.println(str1);
	System.out.println(str2);
	if(str1.equals(str2))
		System.out.println("it's a palindrome");
	else
		System.out.println("it's not a palindrome");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String str1="madam";
//	String str2="";
//	char[] ch=str1.toCharArray();
//	for(int i=ch.length-1;i>=0;i--) {
//		str2=str2+ch[i];
//	}
//	System.out.println(str1);
//	System.out.println(str2);

}
}
