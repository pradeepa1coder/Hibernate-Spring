package BookStrings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args)

	{
		String str1 = "amma";
		String str2 = "mama";
		int[] ct1 = getCount(str1);
		int[] ct2 = getCount(str2);
		for(int i=0;i<128;i++)
		{
			if(ct1[i]!=ct2[i])
			{
				System.out.println("Given strings are not anagram");
				return;
			}
		}
			System.out.println("Given strings are anagram");
		
	}

	// first way
	public static int[] countFreq(String str) {
		char ch[] = str.toCharArray();
		int count[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				count[ch[i] - 97]++;
			else if (ch[i] >= 'A' && ch[i] <= 'Z')
				count[ch[i] - 65]++;
		}
		System.out.println(Arrays.toString(count));
		return count;
	}
	// second way

	public static int[] getCount(String str) {
		char[] ch=str.toCharArray();
		int[] count=new int[128];
		for(int i=0;i<ch.length;i++) {
			count[(int)ch[i]]++;
		}
		return count;
	}
}

















