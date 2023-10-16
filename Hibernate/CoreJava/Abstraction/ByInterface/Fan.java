package ByInterface;

public interface Fan {

	int a = 10;// automatically public static final

	void switchOn();

	void swotchOff();

	static void concreteMethod() 
	{
		System.out.println("we can write concrete methods also but it should be static or default");
		System.out.println(a);
	}
}
