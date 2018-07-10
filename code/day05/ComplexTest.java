package day05;

public class ComplexTest {
	public static void main(String[] args) {
		Complex num1 = new Complex(4.4,1.0);
		Complex num2 = new Complex(5.0,-5.0);
		System.out.println(num1.plus(num2).toString());
		num1.setComplex(4.4,1.0);
		num2.setComplex(5.0,-5.0);
		System.out.println(num1.minus(num2).toString());
		num1.setComplex(4.4,1.0);
		num2.setComplex(5.0,-5.0);
		System.out.println(num1.multiple(num2).toString());
		num1.setComplex(4.4,1.0);
		num2.setComplex(5.0,-5.0);
		System.out.println(num1.division(num2).toString());

	}
}
