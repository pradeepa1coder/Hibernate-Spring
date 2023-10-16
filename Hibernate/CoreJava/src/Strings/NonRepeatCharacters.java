package Strings;

public class NonRepeatCharacters {
public static void main(String[] args) {
	String str="ABCDA";
	char[] ch=str.toCharArray();
	ferquencyOf(ch);
}

private static void ferquencyOf(char[] ch) {
	int[] count=new int[128];
	for(int i=0;i<ch.length;i++) {
		count[ch[i]]++;
	}
	for(int i=0;i<count.length;i++) {
		if(count[i]==1)
		System.out.println((char)i);
	}
	
}
}
