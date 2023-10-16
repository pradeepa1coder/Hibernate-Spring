package Arrays;

public class AndOr {
public static void main(String[] args) {
	int[] ar = { 1,2,13,1000,5,8,21,3};
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>9&&ar[i]<100) {
			System.out.print(ar[i]+" ");
		}
	}
	

}
}
