package Strings;

public class SumOfDigits {
public static void main(String[] args) {
	String str="shakila01432@gmail.com";
	isSum(str);
}
public  static void isSum(String str)
{
	char ch[]=str.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='0'&&ch[i]<='9')
		{
			sum=sum+(ch[i]-48);
		}
	}
	System.out.println("sum of the digits is : "+sum);
}
}
