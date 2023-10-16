package DependencyInj;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car has been started");
	}

}
