package day04;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] empArr = new Employee[3];
		for (int i = 0; i < empArr.length; i++) {
			empArr[i] = new Employee();
			System.out.print("직원" + (i + 1) + "의 이름 : ");
			empArr[i].setName(sc.nextLine());
			System.out.print("직원" + (i + 1) + "의 연봉 : ");
			empArr[i].setSalary(sc.nextInt());
			sc.nextLine();
			System.out.print("직원" + (i + 1) + "의 직급 : ");
			empArr[i].setPosition(sc.nextLine());
			System.out.println();
		}
		// 직원 입력

		int menu=0;
		while (menu != 4) {
			System.out.println("1. 급여 총합");
			System.out.println("2. 모두 보기");
			System.out.println("3. 이름이 K로 시작하는 사람");
			System.out.println("4. 종료");
			menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				int sum = 0;
				for (int i = 0; i < empArr.length; i++) {
					sum += empArr[i].getSalary();
				}
				System.out.println(sum);
				break;
			case 2:
				for (int i = 0; i < empArr.length; i++) {
					System.out.println("직원" + (i + 1) + "의 이름 : "+empArr[i].getName());
					System.out.println("직원" + (i + 1) + "의 연봉 : "+empArr[i].getSalary());
					System.out.println("직원" + (i + 1) + "의 직급 : "+empArr[i].getPosition());
					System.out.println();
				}
				break;
			case 3:
				for (int i = 0; i < empArr.length; i++) {
					if (empArr[i].getName().substring(0,1).equals("K")) {
						System.out.println("직원" + (i + 1) + "의 이름 : "+empArr[i].getName());
						System.out.println("직원" + (i + 1) + "의 연봉 : "+empArr[i].getSalary());
						System.out.println("직원" + (i + 1) + "의 직급 : "+empArr[i].getPosition());
						System.out.println();
					}
				}
				break;
			default:
				break;
			}
		}
	}
}
