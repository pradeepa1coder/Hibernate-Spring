
package org.pavani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String... args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.pavani");
		Car c1 = context.getBean(Car.class);
		c1.display();
	}
}
