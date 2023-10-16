package TwoDArrays;

import java.util.Arrays;

public class RowWiseBig 
{
public static void main(String[] args) {
	int[][]ar= {{-1,-2,-3},{4,5,6},{7,8,9}};
	int[] ar1=rowWisebig(ar);
	System.out.println(Arrays.toString(ar1));

}

private static int[] rowWisebig(int[][] ar) {
	int[] big=new int[ar.length];
	for(int i=0;i<ar.length;i++) 
	{
		for(int j=0;j<ar[i].length;j++) 
		{
			if(ar[j][i]>big[i]) 
			{
				big[i]=ar[i][j];
			}
		}
	}
	return big;
}


}
