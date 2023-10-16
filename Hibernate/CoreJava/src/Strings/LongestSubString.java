package Strings;

import java.util.HashSet;

// to find substring without repetition
public class LongestSubString {

	public static void main(String[] args) {
		
		String str="abcdabefghi";
//		String str="dvdf ";
		
		
		String longestSubString = longestSubString(str);
		System.out.println("String:"+longestSubString);

	}

	private static String longestSubString(String str) {
		
		HashSet<Character> set = new HashSet<>();
		
		String finalSubString="";
		String tempSubString="";
		int j=0;
		for(int i=0;i<str.length();i++) {
			System.out.println("i:"+i);
			
			char c=str.charAt(i);
			
			if(set.contains(c)) {
				tempSubString="";
				set.clear();
				j++;
				i=j-1;
				continue;
			}
			set.add(c);
			//System.out.println("set:"+c);
			tempSubString+=c;
			//System.out.println("current:"+tempSubString);
			
			if(tempSubString.length()>finalSubString.length()) {
				
				finalSubString=tempSubString;
			}
			
			
		}
		
		return finalSubString;
		
		
	}

}
