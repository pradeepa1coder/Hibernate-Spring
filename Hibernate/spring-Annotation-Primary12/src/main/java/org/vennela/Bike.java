package org.vennela;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle {

	public void start()
	{
		System.out.println("Bike has been started");
	}

}
