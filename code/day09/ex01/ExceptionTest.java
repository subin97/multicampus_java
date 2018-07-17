package ex01;

public class ExceptionTest {
	public static void main(String[] args) {
		double result;
		try {
			result=quotient(1,0);
		}
		catch(DivideByZeroException e){
			System.out.println(e.toString());
		}
	}
	public static double quotient(int n, int d) throws DivideByZeroException {
		if(d==0)
			throw new DivideByZeroException();
		return (double) n/d;
	}
}
