package Employeee;

import java.util.Scanner;

public class EmpUI {
	private EmpManager em;
	static Scanner sc = new Scanner(System.in);
	public EmpUI() {
		em = new EmpManager();
	}
	public void start() {
		int menu = -1;
		while (menu != 0) {
			printMenu();
			menu = Integer.parseInt(sc.nextLine());
			menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				Employee emp = new Employee();
				emp = addEmp();
				em.register(emp.getName(), emp.getAge(), emp.getSalary());
			}
			else if (menu == 2) {
				printEmp(em.highSal());
			}
			else if (menu == 3) {
				System.out.println("평균급여: "+em.avgSal());
			}
			else
				break;
		}
	}
	public void printMenu() {
			System.out.println("1. 직원등록");
			System.out.println("2. 급여가 제일 많은 직원 출력");
			System.out.println("3. 전체 직원 평균 급여 출력");
			System.out.println("종료하려면 아무 키나 입력하세요");
	}
	public Employee addEmp() {
		System.out.print("직원 이름: ");
		String name = sc.nextLine();
		System.out.print("직원 나이: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("직원 급여: ");
		int sal = Integer.parseInt(sc.nextLine());
		Employee emp = new Employee(name, age, sal);
		return emp;
	}
	public void printEmp(Employee E) {
		System.out.println(E);
	}
}
