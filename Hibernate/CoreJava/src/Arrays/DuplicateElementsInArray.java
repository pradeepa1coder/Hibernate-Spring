package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		int[] ar = { 1,2,3,1};
		duplicateElements(ar);
	}

	static void duplicateElements(int[] ar) {
		int count = 0;
		Set<Integer> set = new HashSet();
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					set.add(ar[i]);
					count++;
				}
			}
		}
		if(count>0)
			System.out.println(set);
		else
			System.out.println("-1");
	}
}
