package InterviewQuestions;

public class Dummy1 extends Dummy {
	static int x=1;
	public  void method() {
		final int x=2;

		System.out.println(x);//2
		Dummy1 dd=new Dummy1();
		System.out.println(dd.x);//1
		System.out.println(this.x);//1
		System.out.println(super.x);//10
		
		super.m1();//we are calling the parent class methods&variables without creating the object for parent class  
	}
	public static void main(String[] args) {
		new Dummy1().method();
		
	}
}
