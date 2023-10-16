package YPatterns1;

public class OutOfMemo {
	
public static void main(String[] args) {
	int sze=1;
	for(int i=1;i<Integer.MAX_VALUE;i++) {
		int[] ar=new int[sze];
		sze*=5;
	}
}
}
