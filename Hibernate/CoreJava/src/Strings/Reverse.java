package Strings;

public class Reverse {
public static void main(String[] args) {
	String str="ABCD  EFGH";
	String ste="";
	System.out.println(str);
	char ch[]=str.toCharArray();
	
	for(int i=ch.length-1;i>=0;i--) {
		ste=ste+ch[i];
	}
	System.out.println(ste);
}
}
