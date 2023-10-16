package ByInterface;

public class Imp implements DefInt {

	@Override
	public void m2() {
System.out.println("overriden m2");		
	}
	public  void m1() {
		System.out.println("overriden default methods");
	}
	public static void main(String[] args) {
		Imp i=new Imp();
		i.m1();
		i.m2();
//		i.main(args);
	}

}
