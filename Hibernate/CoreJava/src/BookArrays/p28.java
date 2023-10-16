package BookArrays;


public class p28 {
	public static void main(String[] args) {
		int ar1[] = { 9,10, 2, 10, 3, 40, 2, 50 };
		int ar2[] = { 9, 10, 2, 3, 40, 50, 10 ,100,200};

		isCommonEle(ar1, ar2);

	}

	private static void isCommonEle(int[] ar1, int[] ar2) {

		boolean[] br = new boolean[ar1.length];

		for (int i = 0; i < ar1.length; i++)// int ar1[]= {10,2,10,3,40,50};
		{
			for (int j = i + 1; j < ar1.length; j++) {
				if (br[i] == false) 
				{
					if (ar1[i] == ar1[j]) {
						br[j] = true;
					}
				}
			}
		}

		for (int i = 0; i < ar1.length; i++) 
		{
			for (int j = 0; j < ar2.length; j++)
			{

				if (br[i] == false) {
					if (ar1[i] == ar2[j]) {
						System.out.print(ar1[i] + " ");
						break;
					}
				}
			}
		}

	}
}
