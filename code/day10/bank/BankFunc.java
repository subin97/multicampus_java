package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankFunc {
	// private Account[] count = new Account[100];
	// private int accountCount = 0;
	List <Account> accountList = new ArrayList<>();
	// 가변길이 배열 사용
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
				interestFunc();
				break;
			case 6:
				showAll();
				break;
			case 0:
				break;
			}
		}
	}

	private void interestFunc() {
		System.out.print("계좌번호를 입력하세요: ");
		String id = s.nextLine();
		Account acc = new Account();
		acc = searchAccount(id);
		try {
			new Thread(new InterestThread(acc)).start();
		} catch(NullPointerException e) {
			e.printStackTrace();
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
		Account account = new Account(id, owner, balance);
		accountList.add(account);
		// count[accountCount] = new Account();
		// count[accountCount].setId(id);
		// count[accountCount].setOwner(owner);
		// count[accountCount].setBalance(balance);
		// accountCount++;
	}

	private void deposit() {
		// 입금
		System.out.print("입금할 계좌번호를 입력하세요: ");
		String id = s.nextLine();
		System.out.print("입금할 금액를 입력하세요: ");
		int money = Integer.parseInt(s.nextLine());
		Account a = new Account();
		a = searchAccount(id);
		try {
			if (a != null) {
				a.setBalance(a.getBalance() + money);
				System.out.println("현재 계좌의 잔액: " + a.getBalance());
				System.out.println("성공적으로 입금되었습니다.");
			} else
				throw new NoAccountException();
		} catch (NoAccountException e) {
			e.printStackTrace();
		}
	}

	private void withdraw() {
		// 출금
		System.out.print("출금할 계좌번호를 입력하세요: ");
		String id = s.nextLine();
		System.out.print("출금할 금액를 입력하세요: ");
		int money = Integer.parseInt(s.nextLine());
		Account a = new Account();
		a = searchAccount(id);
		try {
			if (a != null) {
				try {
					if (money < a.getBalance()) {
						a.setBalance(a.getBalance() - money);
						System.out.println("현재 계좌의 잔액: " + a.getBalance());
						System.out.println("성공적으로 출금되었습니다.");
					} else
						throw new NoMoneyException();
				} catch (NoMoneyException m) {
					m.printStackTrace();
				}
			} else
				throw new NoAccountException();
		} catch (NoAccountException e) {
			e.printStackTrace();
		}

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
		try {
			if (a != null && b != null) {
				try {
					if (a.getBalance() > money) {
						a.setBalance(a.getBalance() - money);
						b.setBalance(b.getBalance() + money);
						System.out.println("성공적으로 이체가 되었습니다.");
					} else
						throw new NoMoneyException();
				} catch (NoMoneyException m) {
					m.printStackTrace();// throw
					System.out.println("출금계좌에 잔액이 부족합니다.");
					// catch
				}
			} else
				throw new NoAccountException();
		} catch (NoAccountException e) {
			e.printStackTrace();
		}
	}

	private void showMenu() {
		System.out.println("1. 계좌 생성");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 이체");
		System.out.println("5. 이자");
		System.out.println("6. 전체 계좌 출력");
		System.out.println("0. 종료");
		menu = Integer.parseInt(s.nextLine());
	}

	private void showAll() {
		for (int i = 0; i < accountList.size(); i++)
			System.out.println(accountList.get(i));
	}

	private Account searchAccount(String id) {
		// 계좌 탐색 함수
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getId().equals(id))
				return accountList.get(i);
		}
		return null;
	}
}
