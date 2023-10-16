package org.jsp;

public class Employee
{
	private String desg;
	private double salary;
	public Employee(String desg, double salary) 
	{
		super();
		this.desg = desg;
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
