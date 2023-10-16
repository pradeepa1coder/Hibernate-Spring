package springDependencyInjectionPack;

public class Car 
{
	private Engine e;
	
	public Car(Engine e)
	{
		this.e = e;
	}
	
	public void startCar()
	{
		e.start();
	}
	
	
}
