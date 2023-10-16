package Strings;

public class ToUpperCase {
public static void main(String[] args) {
	String str="am I Good Person";
	converting(str);
}
public static void converting(String str)
{
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='a'&&ch[i]<='z')
		{
			ch[i]=(char)(ch[i]-32);
		}
	}
	System.out.println("before converting : "+str);//am I Good Person
	String ms=new String(ch);
	System.out.println("after converting : "+ms);//AM I GOOD PERSON
}
}
