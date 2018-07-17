package bank;

public class NoAccountException extends Exception{
	public NoAccountException() {
		System.out.println("잘못된 계좌입니다.");
	}
}
