package day06;

// Manager의 super class
public class Employee{
	public String name;
	private int RRN;
	protected int salary;
	protected int getSalary() {
		return salary;
	}
	protected void setSalary() {
		this.salary=salary;
	}
}
