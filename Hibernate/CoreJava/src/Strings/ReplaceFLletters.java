package Strings;

import java.util.Scanner;

public class ReplaceFLletters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
			isReplace(str);
	
}

private static void isReplace(String str) {
	char ch[]=str.toCharArray();
	int f=0;
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]!=' '&&ch[i-1]==' '|| i==0&&ch[i]!=' ') 
		{
			char temp1=ch[i];
		}
		else if(ch[i]!=' '&&ch[i+1]==' ' || i==ch.length-1&&ch[i]!=' ') {
			char temp=ch[i];
			ch[i]=ch[f];
			ch[f]=temp;
		}
		
	}
	 str=new String(ch);
	System.out.println(str);
}
}
+