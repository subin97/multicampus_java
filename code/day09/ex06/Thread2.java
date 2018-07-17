package ex06;

public class Thread2 extends Thread{
	public void run() {
		try{
			Thread.sleep(5000);
			func1();
			}
		catch(Exception e) {
		}
		try{
			Thread.sleep(4000);
			func2();
			}
		catch(Exception e) {
		}
	}
	public synchronized void func1() {
		System.out.println("연료통 분리");
	}
	public synchronized void func2() {
		System.out.println("발사");	
	}
}
