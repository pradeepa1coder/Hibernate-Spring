package ValuesIntitialization;

public class Bike 
{

	String name;
	int price;
	String color;

	Bike() 
	{

	}

	Bike(String n, int p, String c)
	{
		this.name = n;
		this.price = p;
		this.color = c;
	}

	Bike(String c, int p) 
	{
		this.color = c;
		this.price = p;
	}

	Bike(int p) 
	{
		this.price = p;
	}
	void dis() 
	{
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.color);
	}

public static void main(String[] args)
{
	Bike b1=new Bike("Honda",5000000,"Black");
	Bike b2=new Bike("color",400000);
	Bike b3=new Bike(600000);
	Bike b4=new Bike();
	b1.dis();
	b2.dis();
	b3.dis();
	b4.dis();
	System.out.println("===============");
}


}


class JCB
{
	public static void main(String[] args) {
		System.out.println("hii");
	}
}
