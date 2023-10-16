package BookStrings;

import java.util.Arrays;

public class ReverseTheWords 
{
	public static void main(String[] args) 
	{
		String str = "pradeep is a good boy";
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		String rev = "";
		for(int i=words.length-1;i>=0;i--)
		{
			rev=rev+words[i]+" ";
		}
		System.out.println(rev);
		rev=rev.trim();
		System.out.println(rev);
	}
}
