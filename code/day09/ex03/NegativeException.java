package ex03;

public class NegativeException extends RuntimeException{
	public NegativeException() {
		super("음수입니다");
	}
}
