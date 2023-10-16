package BookArrays;

public class p20 {
public static void main(String[] args) {
	int ar[]= {21,55,77,121,122,727};
	int count=0;
	for(int i:ar) {
		if(i>=100&&i<=1000) {
		boolean rs=isPalindrome(i);
		if(rs)
			count++;
		}
	}
	System.out.println("no.of palindromes between 100-1000 are : "+count);
}
public static boolean isPalindrome(int n) {
	int rev=0; int temp=n;
	while(n!=0)
	{
		int d=n%10;
		rev=rev*10+d;
		n=n/10;
		
	}
	if(temp==rev)
		return true;
	else
		return false;
}
}
