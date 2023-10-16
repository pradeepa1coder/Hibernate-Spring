package org.jsp;

import java.util.List;

public class SmartPhone {
private int id;
private String brand;
public List<SimCard> getSims() {
	return sims;
}
public void setSims(List<SimCard> sims) {
	this.sims = sims;
}
private int sal;
private List<SimCard> sims;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
}
