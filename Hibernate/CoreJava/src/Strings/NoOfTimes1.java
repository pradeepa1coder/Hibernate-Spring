package Strings;

public class NoOfTimes1 {
public static void main(String[] args) {
	String str="aaaabccccd";
	char[] ch=str.toCharArray();
	int[] count=new int[128];
	for(int i=0;i<ch.length;i++) {
		count[ch[i]]++;
	}
	for(int i=0;i<count.length;i++) {
		if(count[i]>0) {
			System.out.print(count[i]+""+(char)i);
		}
	}
}
}
