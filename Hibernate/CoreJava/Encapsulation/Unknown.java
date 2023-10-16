
public class Unknown   {
	public static void main(String[] args)
	{
		Parent p=new Parent();
		
		System.out.println(p.getMobile());// with the help of getter methods we can access other class private properties also
		p.setMobile("Iphone");
		System.out.println(p.getMobile());// we can also set the values for other class private variables
	}
	// without inheritence concept we can access our super class private properties

}
