package Employeee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpManager {
	Scanner sc = new Scanner(System.in);
	List<Employee> EmpList = new ArrayList<>();

	public void register(String name, int age, int sal) {
		Employee emp = new Employee(name, age, sal);
		EmpList.add(emp);
	}

	public Employee highSal() {
		// highSal
		Employee high = new Employee();
		for (int i = 0; i < EmpList.size(); i++) {
			if (high.getSalary() < EmpList.get(i).getSalary()) {
				high = EmpList.get(i);
			}
		}
		return high;
	}
	public int avgSal() {
		int avgSal = 0;
		for (int i = 0; i < EmpList.size(); i++) {
			avgSal += EmpList.get(i).getSalary();
		}
		avgSal /= EmpList.size();
		return avgSal;
	}
}
