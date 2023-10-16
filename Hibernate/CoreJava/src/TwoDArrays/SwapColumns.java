/**
 * 
 */
package TwoDArrays;

/**
 * @author DELL
 *
 */
public class SwapColumns {

	/**
	 * @param args
	 */
	public static void printArray(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();

		}
	}

	public static void swap(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				int temp = ar[i][j];
				ar[i][j] = ar[i][ar[i].length - 1];
				ar[i][ar[i].length - 1] = temp;
				break;

			}

		}
		printArray(ar);
	}

	public static void main(String[] args) {
		int[][] ar = { { 9, 3, 5, 2 }, { 8, 4, 2, 3 }, { 7, 5, 6, 4 }, { 6, 4, 3, 5 } };
		printArray(ar);
		System.out.println("......................");
		swap(ar);

	}

}
