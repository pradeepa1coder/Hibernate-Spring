package org.pradeep;

public class Driver {
	private Vehicle p;
	
	void startDrive()
	{
		p.start();
	}

	public Vehicle getV() {
		return p;
	}

	public void setV(Vehicle v) {
		this.p = v;
	}

	

}
