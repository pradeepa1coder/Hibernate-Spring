package Strings;

public class ToLowerCase {
public static void main(String[] args) {
	String str="Am I Good Person";
	converting(str);
	
}
public static void converting(String str) 
{
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z') 
		{
			ch[i]=(char)(ch[i]+32);
		}
	}
	System.out.println("before converting : "+str);//Am I Good Person
	String m=new String(ch);//converting from char array to string
	System.out.println("after converting : "+m);//am i good person
}
}
