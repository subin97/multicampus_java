package Employeee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpManager {
	Scanner sc = new Scanner(System.in);
	List<Employee> EmpList;

	public EmpManager() {
		EmpList = new ArrayList<>();
		load();
	}
	public void save() {

		ObjectOutputStream oo = null;
		try {
			oo = new ObjectOutputStream(
					new FileOutputStream("mydata.dat"));

			oo.writeObject(EmpList);
			oo.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if( oo != null)
					oo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void load() {
		ObjectInputStream oi = null;
		try {
			oi = new ObjectInputStream(new FileInputStream("mydata.dat"));
			EmpList = (ArrayList<Employee>)oi.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
			EmpList = new ArrayList<>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(oi != null)
					oi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

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
