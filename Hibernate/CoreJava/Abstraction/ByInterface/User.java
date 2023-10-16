package ByInterface;

public class User implements Fan
{
	public void switchOn() 
	{
		System.out.println("user turn on the switch");
	}

	void switchOff() 
	{
		System.out.println("user turn off the switch");
	}

	void concreteMethod()
	{
		System.out.println(" it's a parent class overriden method");
	}

	public static void main(String[] args)
	{

		User u = new User();
		// Fan f=new Fan(); we can't create an object for interface
		u.switchOn();
		u.concreteMethod();
	}

	@Override
	public void swotchOff() {
		// TODO Auto-generated method stub
		
	}
}
