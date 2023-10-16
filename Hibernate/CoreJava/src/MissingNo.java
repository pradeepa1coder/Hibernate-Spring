import java.util.HashSet;
import java.util.Set;

public class MissingNo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 10 };

		Set<Integer> set = new HashSet();
		for (int r : a) {
			if (set.add(r))
				;
		}
		System.out.println("set => " + set);
		System.out.println(set.size());
		for (int i = 1; i < set.size(); i++) {
			if (!set.contains(i)) {
				System.out.println("Missing number => " + i);
			} // if
		}

	}
}