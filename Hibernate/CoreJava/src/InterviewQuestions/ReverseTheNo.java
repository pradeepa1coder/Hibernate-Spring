package InterviewQuestions;

public class ReverseTheNo {
	public static void main(String[] args) {
		int n = 921;
		System.out.println(n);//921

		int pal = 0, rev = 0;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;

		}
		System.out.println(n);//0
		System.out.println(rev);//129

	}
}
