package YPatterns1;

public class Incriments {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			int x = i - 1;
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("0 ");
				} else {

					System.out.print(x++ + " ");
				}
			}
			System.out.println();
		}
	}
}
