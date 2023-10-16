package Strings;

public class ReverseOnlyNumbers {
public static void main(String[] args) {
	String str="abc123def456ghi420";
	System.out.println(str);
	String temp1="";String st="";
	char[] ch=str.toCharArray();

	for(int i=0;i<ch.length;i++)
	{
		
		if(ch[i]>='0'&&ch[i]<='9')
		{
			while(i<ch.length&&ch[i]>='0'&&ch[i]<='9') 
			{
				st=ch[i]+st;
				i++;
			}
			
				temp1=temp1+st;
				st="";
				i--;
		}
		else 
		{
			temp1=temp1+ch[i];
		}
		
		
	}
	System.out.println(temp1);
}
}
