package TwoDArrays;

public class SwapRows {
	public static void printArray(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		int[][] ar = { { 9, 3, 5, 2 }, { 8, 4, 2, 3 }, { 7, 5, 6, 4 }, { 6, 4, 3, 5 } };
		printArray(ar);
		System.out.println("......................");
		swap(ar);
	}

	private static void swap(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			int[] temp = ar[i];
			ar[i] = ar[ar.length - 1];
			ar[ar.length - 1] = temp;
			break;

		}
		printArray(ar);

	}
}
