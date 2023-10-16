package BookStrings;

import java.util.Arrays;

public class FrequencyOfEachCharacter128 {
public static void main(String[] args) {
	String str="AAngalore is a big cityy #software";
	int count[]=new int[128];
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++) 
	{
		count[ch[i]]++;
	}
	for(int i=0;i<count.length;i++)
	{
		if(count[i]!=0)
		System.out.println((char)i+"-->"+count[i]);
	}
	

	
	
}
}
