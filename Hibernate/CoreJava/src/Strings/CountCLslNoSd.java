package Strings;

public class CountCLslNoSd {
public static void main(String[] args) {
	String str=new String("Sunny143@gmail.com");
	count(str);
}
public static void count(String str)
{
	char ch[]=str.toCharArray();
	int cl=0,sl=0,ds=0,sc=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
			cl++;
		else if(ch[i]>='a'&&ch[i]<='z')
			sl++;
		else if(ch[i]>='0'&&ch[i]<='9')
			ds++;
		else
			sc++;
		
	}
	System.out.println("no.of capitals are "+cl);
	System.out.println("no.of smalls are "+sl);
	System.out.println("no.of digits are "+ds);
	System.out.println("no.of special characters are "+ sc);
}
}
