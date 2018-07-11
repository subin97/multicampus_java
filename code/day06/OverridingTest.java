package day06;

class Parent{
	int data=100;
	public Parent() {
		System.out.println("나는 Parent 생성자");
	}
	public Parent(String msg) {
		System.out.println(msg+"를 출력하는 생성자");
	}
	public void print() {
		System.out.println("Parent의 data: "+data);
	}
}
class Child extends Parent {
	int data=200;
	public Child() {
		super("Hello");
		System.out.println("나는 Child의 생성자");
	}
	public void print() {
		int data=300;
		System.out.println("Child의 data: "+data);		//300
		System.out.println("this.data: "+this.data);	//200
		System.out.println("super.data: "+super.data);	//100
	}
}
public class OverridingTest {
	public static void main(String[] args) {
		Child c = new Child();
		//c.data = 10;
		c.print();
	}
}
