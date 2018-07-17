package ex04;

public class MyRunnable implements Runnable{
	String myName;
	public MyRunnable(String name) {
		myName=name;
	}
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(myName+i);
	}
}
