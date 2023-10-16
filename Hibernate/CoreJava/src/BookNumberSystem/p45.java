package BookNumberSystem;

public class p45 {
public static void main(String[] args) {
	int n=4;
	int p=3;
	isPower(n,p);
}
public static void isPower(int n,int p)
{
	int pow=1;
	for(int i=1;i<=p;i++) 
	{
		pow=pow*n;
	}
	System.out.println("Power of "+n+" with "+p+" is : "+pow);
	
}
}
