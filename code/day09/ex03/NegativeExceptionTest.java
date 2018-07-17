package ex03;

import java.util.Scanner;

public class NegativeExceptionTest {
	public static void main(String[] args) {
		try {
			getNumber();
		}
		catch(NegativeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void getNumber() throws NegativeException{
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int n = sc.nextInt();
		if(n < 0)
			throw new NegativeException();
	}
}
