package ex01;

public class CheckingExceptionTest {
	public static void main(String[] args) {
		for(int i=10;i>0;i--) {
			try {
				Thread.sleep(1000);
				// 1000ms=1s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==3)
				System.out.println(i);
		}
	}
	public static void doSomething() {
		
	}
}
