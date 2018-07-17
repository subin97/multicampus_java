package ex04;

public class TestThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable("First Thread"));
		Thread t2 = new Thread(new MyRunnable("Second Thread"));
		t1.start();
		t2.start();
	}
}
