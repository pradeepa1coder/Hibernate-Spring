package org.vennela;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.vennela");
		Ride r = context.getBean(Ride.class);
		r.startRide();
	}
}
