package bank;

import java.util.Scanner;

public class BankFunc {
	private Account[] count = new Account[100]; // 기억용
	private int accountCount = 0;
	private Scanner s = new Scanner(System.in);
	private int menu = -1;
	public void run() {
		while (menu != 0) {
			showMenu();
			switch (menu) {
			case 1:
				create();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				transfer();
				break;
			case 5:
				showAll();
				break;
			}
		}
	}
	private void create() {
		// 계좌 생성 함수
		System.out.print("계좌번호를 입력하세요: ");
		String id = s.nextLine();
		System.out.print("이름를 입력하세요: ");
		String owner = s.nextLine();
		System.out.print("금액를 입력하세요: ");
		int balance = Integer.parseInt(s.nextLine());
		count[accountCount] = new Account();
		count[accountCount].setId(id);
		count[accountCount].setOwner(owner);
		count[accountCount].setBalance(balance);
		accountCount++;
	}
	private void deposit() {
		// 입금
		System.out.print("입금할 계좌번호를 입력하세요: ");
		String id = s.nextLine();
		System.out.print("입금할 금액를 입력하세요: ");
		int money = Integer.parseInt(s.nextLine());
		Account a = new Account();
		a = searchAccount(id);
		if (a != null) {
			a.setBalance(a.getBalance() + money);
			System.out.println("현재 계좌의 잔액: " + a.getBalance());
			System.out.println("성공적으로 입금되었습니다.");
		}
		else
			System.out.println("계좌번호가 존재하지 않습니다.");
	}
	private void withdraw() {
		// 출금
		System.out.print("출금할 계좌번호를 입력하세요: ");
		String id = s.nextLine();
		System.out.print("출금할 금액를 입력하세요: ");
		int money = Integer.parseInt(s.nextLine());
		Account a = new Account();
		a = searchAccount(id);
		if (a != null) {
			if (money < a.getBalance()) {
				a.setBalance(a.getBalance() - money);
				System.out.println("현재 계좌의 잔액: " + a.getBalance());
				System.out.println("성공적으로 출금되었습니다.");
			}
			else
				System.out.println("잔액이 부족합니다.");
		}
		else
			System.out.println("계좌번호가 존재하지 않습니다.");
	}
	private void transfer() {
		System.out.print("출금번호를 입력하세요: ");
		String id = s.nextLine();
		System.out.print("입금번호를 입력하세요: ");
		String id2 = s.nextLine();
		System.out.print("이체할 금액을 입력하세요: ");
		int money = Integer.parseInt(s.nextLine());
		Account a = new Account();
		Account b = new Account();
		a = searchAccount(id);
		b = searchAccount(id2);
		// 입금계좌
		if (a != null && b != null) {
			if (a.getBalance() > money) {
				a.setBalance(a.getBalance() - money);
				b.setBalance(b.getBalance() + money);
				System.out.println("성공적으로 이체가 되었습니다.");
			} else
				System.out.println("출금계좌에 잔액이 부족합니다.");
		}
		else {
			if (a == null) {
				System.out.println("출금번호가 존재하지 않습니다.");
			}
			if (b == null) {
				System.out.println("입금번호가 존재하지 않습니다.");
			}
		}
	}
	private void showMenu() {
		System.out.println("1. 계좌 생성");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 이체");
		System.out.println("5. 전체 계좌 출력");
		System.out.println("0. 종료");
		menu = Integer.parseInt(s.nextLine());
	}
	private void showAll() {
		 for (int i = 0; i < accountCount; i++)
		     System.out.println(count[i]);
	}
	private Account searchAccount(String id) {
		// 계좌 탐색 함수
		for (int i = 0; i < accountCount; i++) {
			if (id.equals(count[i].getId()))
				return count[i];
		}
		return null;
	}
}
