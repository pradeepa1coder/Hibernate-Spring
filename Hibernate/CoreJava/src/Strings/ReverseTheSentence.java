package Strings;

public class ReverseTheSentence {
public static void main(String[] args) 
{
	String str="Rama is a good boy";
	reverseTheSentence(str);
}

private static void reverseTheSentence(String str) {
	String temp="";
	for(int i=str.length()-1;i>=0;i--) {
		char ch=str.charAt(i);
		if(ch !=' ') {
			temp=ch+temp;
		}
		else 
		{
			System.out.print(temp+" ");
			temp="";
		}
	}
	System.out.println(temp);
}
}
