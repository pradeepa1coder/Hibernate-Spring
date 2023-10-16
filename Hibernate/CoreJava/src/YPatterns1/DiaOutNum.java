package YPatterns1;

public class DiaOutNum {
public static void main(String[] args) {
	int n=9;
	int sp=n/2,st=1,num=1;
	for(int i=1;i<=n;i++) 
	{
		for(int j=1;j<=sp;j++) 
		{
			System.out.print(" ");
		}
		for(int j=1;j<=st;j++) 
		{
			System.out.print(num%2);
			num++;
		}
		if(i<=n/2) {
			st=st+2;
			sp=sp-1;
		}
		else {
			st=st-2;
			sp=sp+1;
		}
		System.out.println();
	}
}
}
