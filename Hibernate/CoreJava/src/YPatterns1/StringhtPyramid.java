package YPatterns1;

public class StringhtPyramid {
	public static void main(String[] args) {
		int n = 7;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			if (i < n / 2 + 1) {
				st++;
			} else {
				st--;
			}
			System.out.println();
		}
	}
}
