package BookStrings;

public class EWFLintoSmall_RemainCaps 
{
public static void main(String[] args)
{
	String str="Rama Have TWO wifes";
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++) 
	{
		if(i==0&&ch[i]!=' ' || ch[i]!=' '&&ch[i-1]==' ')
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		else if(ch[i]>='a'&&ch[i]<='z')
			ch[i]=(char)(ch[i]-32);
	}
	str=new String(ch);
	System.out.println(str);
}
}
