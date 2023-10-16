package BookStrings;

public class SwapFirstCharWithLastCharInEVeryWord {
public static void main(String[] args) {
	String str="Bangalore Jspiders btm";
	char ch[]=str.toCharArray();
	int t=0;
	for(int i=0;i<str.length();i++)
	{
		if(i==0&&ch[i]!=' ' || ch[i]!=' '&&ch[i-1]==' ')
		{
			 t=i;
		}
		else if(i==str.length()-1&&ch[i]!=' ' || ch[i]!=' '&&ch[i+1]==' ')
		{
			char temp=ch[t];
			ch[t]=ch[i];
			ch[i]=temp;
		}
	}
	
	str=new String(ch);
	System.out.println(str);
}
}
