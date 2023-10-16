package Strings;

import java.util.Arrays;

public class FrequencyOfEachCharacter128 {
	public static void main(String[] args) {
		String str="AAAShakila is a Good girl ";
		frequency(str);
	}
public static void frequency(String str)
{
	char ch[]=str.toCharArray();
	System.out.println(Arrays.toString(ch));//[A, A, A, S, h, a, k, i, l, a,  , i, s,  , a,  , G, o, o, d,  , g, i, r, l,  ]
	int count[]=new int[128];
	System.out.println(Arrays.toString(count));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	for(int i=0;i<ch.length;i++)
	{

		count[(int)ch[i]]++;
	}
	
	
	for(int i=0;i<count.length;i++)
	{
		if(count[i]!=0)
		System.out.println((char)i+"-->"+count[i]);
	}
}
}
