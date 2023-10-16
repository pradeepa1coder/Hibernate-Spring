package Multi;

public class GrandChild extends Child
{
void study()
{
	System.out.println("Grand child is studying");
}
public static void main(String[] args) {
	GrandChild g=new GrandChild();
		g.study();// this class method
		g.drink();// super class method
		g.carProperty();// most super class method
}
}
