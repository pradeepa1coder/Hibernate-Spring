package org.vennela;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Car implements Vehicle {

	public void start() {
		System.out.println("Car has been started");
	}

}
