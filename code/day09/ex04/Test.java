package ex04;

public class Test {
	public static void main(String[] args) {
		Thread t = new Counting();
		t.start();
		// start() : Thread 클래스에서 정의된 method
		// start()함수에서 run() 호출
		Thread t1 = new Counting();
		t1.start();
	}
}
