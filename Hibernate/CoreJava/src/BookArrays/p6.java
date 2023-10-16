package BookArrays;import java.lang.reflect.Array;
import java.util.Arrays;

public class p6 {
public static void main(String[] args) {
	int ar[]= {20,3,5,10};
	System.out.println(Arrays.toString(ar));
	int rs=countPrimes(ar);
	System.out.println(rs+" : prime numbers are present in geven array");
}
public static int countPrimes(int[]ar) {
	int count=0;
	for(int i=0;i<ar.length;i++) {
		boolean r=isPrime(ar[i]);
		if(r==true)
			count++;
	}
	return count;
}
private static boolean isPrime(int n) {
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
			return false;
	}
	return true;
}
}
