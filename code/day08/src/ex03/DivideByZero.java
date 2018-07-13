package ex03;

public class DivideByZero {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		try {
			int result = x / y;
			System.out.println("예외가 발생하면 바로 catch로");
			// 실행되지 않음
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램은 계속 진행됩니다.");
	}
}
