package ex02;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			methodf();
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void methodf() throws MyException{
		throw new MyException();
	}
}
