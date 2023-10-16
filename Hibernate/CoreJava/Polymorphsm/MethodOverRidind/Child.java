package MethodOverRidind;

public class Child extends Parent {
	/**
	 *  this y variable is for this class only ,
	 *  there is no any relation to Parent class
	 */
	static int y = 600;

// we cant re-initialze the static variables	
//	y=10;
	@Override
	void drink() {
		System.out.println("cool drink-child");
	}

//	@Override ,we can't override the static methods
	// its became a new method
	static void car() {
		System.out.println("static override method");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.drink();// cool drink-child
		System.out.println(c.x);// 100
		System.out.println(c.y);// 600

		Parent p1 = new Parent();
		p1.drink();// cool drink child-->alchol
		System.out.println(p1.y);// 600->500

		Parent p2 = new Child();//upcasting***
		p2.drink();// cool drink-child
		// method hiding
		c.car();// static override method
		p1.car();// white color car
		p2.car();// white color car

	}

}
