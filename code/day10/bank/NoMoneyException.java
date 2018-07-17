package bank;

public class NoMoneyException extends Exception{
	public NoMoneyException() {
		System.out.println("잔액이 부족합니다.");
	}
}
