package YPatterns;

public class p10 {
	public static void main(String[] args) {
		int n = 5;
		int var = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(var);
			}
			var--;
			System.out.println();
		}
	}
}
