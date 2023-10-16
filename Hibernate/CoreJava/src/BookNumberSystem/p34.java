package BookNumberSystem;

public class p34 {
	public static void main(String[] args) {
//	1234

		int n = 1234;
		int ends = 0, mids = 0;
		int d = n % 10;
		ends = ends + d;
		n = n / 10;

		while (n != 0)
		{
			int sd = n % 10;
			if (n > 9) {
				mids = mids + sd;
			} 
			else {
				ends = ends + sd;
			}

			n = n / 10;

		}

if(ends==mids)
	System.out.println("its a xylem no");
else
	System.out.println("its a phloem no");
	}
}
