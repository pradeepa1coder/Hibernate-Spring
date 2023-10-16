package BookStrings;

public class SumoftheNumbers {
public static void main(String[] args) {
	String str="pradeep420macha520";
	char ch[]=str.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
		String num="";
		while(i<ch.length&&ch[i]>='0'&&ch[i]<='9')
		{
			num=num+ch[i];//420
			i++;
		}
		int x=0;
		for(int j=0;j<num.length();j++)
		{
			char d=num.charAt(j);
			x=x*10+(d-48);
			
		}
	 sum=sum+x;
	}
	System.out.println(sum);
}
}
