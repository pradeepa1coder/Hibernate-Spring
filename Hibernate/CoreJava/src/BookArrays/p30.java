package BookArrays;

public class p30 {
	public static void main(String[] args) {
		int ar[] = { 10, 2, 10, 30, 40, 2, 50 };
		boolean br[] = new boolean[ar.length];

		for (int i = 0; i < ar.length; i++) {
			if (br[i] == false) {
				int count = 1;
				for (int j = i + 1; j < ar.length; j++) {
					if (ar[i] == ar[j]) {
						count++;
						br[j]=true;
					}
				}
				System.out.println(ar[i] + "-->" + count);
			}
		}
	}
}
