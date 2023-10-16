package org.vennela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ride 
{
	@Autowired
private	Vehicle v;

	public void startRide() 
	{
		v.start();
	}
	
	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	

}
