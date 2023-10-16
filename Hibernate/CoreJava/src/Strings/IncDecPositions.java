package Strings;

public class IncDecPositions {
	public static void main(String[] args) {
		String str = "aeiou           zAEIOUAZ0599";// bdjnvyBDJNVZA4
		String temp = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z') {
				if (i % 2 == 0) 
				{
					if (ch[i] == 'Z') 
					{
						temp = temp + ('A');
					} 
					else if (ch[i] == 'z') 
					{
						temp = temp + ('a');
					}
					else if (ch[i] == '9') {
						temp = temp + ('9');
					}
					else
						temp = temp + (++ch[i]);
					
				}
				else {
					if (ch[i] == 'A') {
						temp = temp + ('Z');
					} else if (ch[i] == 'a') {
						temp = temp + ('z');
					}
					else if (ch[i] == '0') {
						temp = temp + ('0');
					}
					else
						temp = temp + (--ch[i]);
				}
			}
			else
				temp=temp+ch[i];
		}
		System.out.println(temp);// BDFA
	}
}
