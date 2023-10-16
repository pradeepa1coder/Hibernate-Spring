package Arrays;

public class FreqOfNumArray {
public static void main(String[] args) {
	int[] ar = { 1,2,3,1,5,8,2,3};
	int count[]=new int[128];
	for(int i=0;i<ar.length;i++) {
		count[ar[i]]++;
	}
	for(int i=0;i<count.length;i++) {
		if(count[i]!=0)
		System.out.println(i+" ---> "+count[i]);
	}

}
}
