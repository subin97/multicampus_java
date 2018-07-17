package ex04;

public class Counting extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
