package InterviewQuestions;

public class StrNoToInt {
public static void main(String[] args) {
	String str="520";
	char[] ch=str.toCharArray();
	int rev=0;
	for(int i=0;i<ch.length;i++) {
		
		rev=rev*10+ch[i]-48;
	}
	System.out.println(rev);
	System.out.println(rev+10);
}
}
