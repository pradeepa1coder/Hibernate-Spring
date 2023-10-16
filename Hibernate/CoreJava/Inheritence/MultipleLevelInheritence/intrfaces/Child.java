package MultipleLevelInheritence.intrfaces;

public class Child implements Parent1,Parent2 
{

	@Override
	public void care() 
	{
		System.out.println(" both parents are caring to child");
		
	}

	@Override
	public void fun() {
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.care();
	}

}
// there is no super constructors in interfaces
// there is no diamond problem in interfaces
