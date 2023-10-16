package DependencyInj;

public class Driver {
	public static void main(String[] args) {
		Ride r = new Ride();
		r.setV(new Car());
		r.startRide();
	}

}
