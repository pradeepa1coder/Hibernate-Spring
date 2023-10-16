package Strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String str = "programming";
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			int indx = str.indexOf(ch, i + 1);
			if (indx == -1) 
			{
				System.out.print(ch);
			}
		}
		System.out.println("----*----");
		
		
		
		
		
		// second way
		Set<Character> s = new HashSet<>();
		char ch[]=str.toCharArray();
		for(char c:ch) {
			s.add(c);
		}
		System.out.println(s);
	}
}
