package BookStrings;

public class EWLCintoCap_RemainSmall {
public static void main(String[] args) {
	String str="Rama IS a GooD Boy";
	char ch[]=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		if(i==ch.length-1&&ch[i]!=' '|| ch[i]!=' '&&ch[i+1]==' ')
		{
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		}
		else if(ch[i]>='A'&&ch[i]<='Z')
		{
			ch[i]=(char)(ch[i]+32);
		}
	}
	str=new String(ch);
	System.out.println(str);
}
}
