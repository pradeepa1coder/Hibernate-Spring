package DependencyInj;

public class Ride {
	Vehicle v ;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public void startRide() 
	{
		v.start();
	}

}
