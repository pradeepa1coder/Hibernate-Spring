package BookArrays;

public class p5 {
public static void main(String[] args) {
	int ar[]= {2,3,5,10};
	
	int count=0,sum=0;
	for(int i:ar) {
		sum=sum+i;
		count++;
	}
	int avg=sum/count;
	System.out.println("Avg of elements is : "+avg);
	
}
}
