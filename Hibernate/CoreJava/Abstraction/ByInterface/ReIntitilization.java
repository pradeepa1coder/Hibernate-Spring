package ByInterface;

interface Foo {
	int x = 10;
//	x=20;
}

public class ReIntitilization {
	public static void main(String[] args) {
		Foo.x = 30;
		System.out.println(Foo.x);
	}
}
