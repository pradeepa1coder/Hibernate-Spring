package org.pavani;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Value(value = "BMW")
	private String brand;
	
	private String color;
	private double price;

	@Value(value = "White")
	public void setColor(String color) {
		this.color = color;
	}

	public Car(@Value(value = "2500000.00") double price) {
		this.price = price;
	}
	public void display() {
		System.out.println("Brand : " + brand);
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);
	}

}
