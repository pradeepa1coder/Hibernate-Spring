package InterviewQuestions;

public class Outer {
	private int a = 10;

	class Inner {
		public void m1() {
			System.out.println("inner class method");
			System.out.println(a);
		}
	}

	public static void main(String[] args) {

		new Outer().new Inner().m1();
	}
}
