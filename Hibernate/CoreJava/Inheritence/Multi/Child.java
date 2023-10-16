package Multi;

public class Child extends Parent
{
	void drink() {
		System.out.println("Child taking soft drinks");
	}
public static void main(String[] args)
{
	Child c=new Child();
		c.drink();// this class method
		c.carProperty();// parent class method
		
}
}
