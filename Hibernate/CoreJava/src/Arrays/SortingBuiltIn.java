package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingBuiltIn {
public static void main(String[] args) {
	Integer a[]= {2,1,6,5,4,3,8,7,9};
	System.out.println("Before Sorting=>"+Arrays.toString(a));//[2, 1, 6, 5, 4, 3, 8, 7, 9]
	
	Arrays.sort(a);
	System.out.println("Ascending Sorting=>"+Arrays.toString(a));//[1, 2, 3, 4, 5, 6, 7, 8, 9]
	
	//we have to convert int to Integer**imp
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println("Descending Sorting=>"+Arrays.toString(a));//[9, 8, 7, 6, 5, 4, 3, 2, 1]
}
}
