package BookStrings;

public class ReverseTheString {
public static void main(String[] args) {
	String str="ABCDEFG";
	for(int i=str.length()-1;i>=0;i--)
	{
		char ch=str.charAt(i);
		System.out.print(ch);
	}
}
}
