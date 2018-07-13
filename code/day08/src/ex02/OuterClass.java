package ex02;

public class OuterClass {
	private String secret = "Time is money";
	
	public OuterClass() {
		InnerClass obj=new InnerClass();
		obj.method();
	}
	private class InnerClass{
		public InnerClass() {
			System.out.println("내부 클래스 생성자입니다.");
		}
		public void method() {
			System.out.println(secret);
		}
	}
}
