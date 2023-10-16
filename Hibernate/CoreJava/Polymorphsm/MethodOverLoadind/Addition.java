package MethodOverLoadind;

public class Addition {
	public void isAdd(int a, int b) 
	{
		int ans = a + b;
		System.out.println(ans);
	}

	public void isAdd(int a, int b, int c) {
		int ans = a + b + c;
		System.out.println(ans);
	}

	public void isAdd(int a, int b, int c, int d) {
		int ans = a + b + c + d;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Addition a = new Addition();
		a.isAdd(10, 20, 30);
		a.isAdd(100, 20);
	}
}
// having a same method name but different arguments 