package BookStrings;

public class CountTheWords {
public static void main(String[] args) {
	String str="shakila is a good girl";
	char ch[]=str.toCharArray();
	int count=0;
	for(int i=0;i<str.length();i++) 
	{
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
		{
			count++;
		}
		
	}
	System.out.println("Total words are : "+count);
}
}
