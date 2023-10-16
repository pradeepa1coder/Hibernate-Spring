package SingleLevelInheritence;

class Child extends Parent 
{
	void booksProperty()
	{
		System.out.println("child books ");
	}

	public static void main(String[] args)
	{
		System.out.println(Parent.n);//5
		
		Child c = new Child();
		c.booksProperty();
		
//		Parent p=new Parent(); //no need to create an object for parent class 
//		bcoz we are extends the parent class
//		p.homeProperty();
		
		c.homeProperty();// through child object also we can access parent properties
	}
}

class Child2 extends Parent
{
	public static void main(String[] args)
	{
		Child2 c=new Child2();
		c.homeProperty();
	}
}
