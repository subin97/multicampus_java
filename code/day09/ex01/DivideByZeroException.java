package ex01;

class DivideByZeroException extends ArithmeticException{
	public DivideByZeroException() {
		super("0으로 나눌 수는 없음");
	}
}

