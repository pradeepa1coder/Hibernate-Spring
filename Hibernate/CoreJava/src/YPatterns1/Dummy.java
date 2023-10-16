package YPatterns1;

public class Dummy {
	public static void main(String[] args)
	{
	int n=5;char ch='A';
	int sp=0,st=n;
	for(int i=1; i<=n; i++)
	{
	for(int j=1; j<=sp; j++)
	{
	System.out.print("  ");
	}
	char x=ch;
	for(int j=1; j<=st; j++)
	{
	System.out.print(x+" ");
	x++;
	}
	if(i<=n/2)
	{
		ch++;
	sp++;
	st=st-2;
	}
	else
	{
	sp--;
	st=st+2;
	ch--;
	}
	System.out.println(" ");
	}
	}


}
