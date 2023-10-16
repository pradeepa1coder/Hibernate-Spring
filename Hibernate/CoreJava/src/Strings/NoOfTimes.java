package Strings;

public class NoOfTimes {
	public static void main(String[] args)
	{
	String str="2a3b4c";
	char ch[]=str.toCharArray();
	for (int i = 0; i < ch.length; i++)
	{
	if(ch[i]>='0' && ch[i]<='9')
	{
	int n=ch[i]-48;
	for (int j = 0; j <n; j++)
	{
	System.out.print(ch[i+1]+"");
	}
}
}
	}

}
